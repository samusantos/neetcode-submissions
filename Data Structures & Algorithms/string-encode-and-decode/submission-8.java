class Solution {

    static String delimeter = "#";

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String str: strs) {
            encoded.append(str.length() + delimeter + str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new LinkedList<>();

        while(str.length() > 0) {
            int i = 0;
            
            while(str.charAt(i) != '#') {
                i++;
            }

            System.out.println(str.substring(0, i));
            int strLength = Integer.valueOf(str.substring(0, i));
            list.add(str.substring(i + 1, strLength + i + 1));
            str = str.substring(i + 1 + strLength, str.length());
            i = 0;
        }

        return list;
    }
}
