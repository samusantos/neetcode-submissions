class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, List<Character>> columnMap = new HashMap();
        HashMap<String, List<Character>> miniSquare = new HashMap();

        for(int j = 0; j < board.length; j++) {
            HashMap<Character, Character> rowMap = new HashMap();
            for(int i = 0; i < board[j].length; i++) {
                if(board[j][i] == '.') continue;

                if(rowMap.containsKey(board[j][i])) return false;
                rowMap.put(board[j][i], board[j][i]);
                
                if(columnMap.containsKey(i)) {
                    if(columnMap.get(i).contains(board[j][i])) return false;
                    columnMap.get(i).add(board[j][i]);
                }

                if(!columnMap.containsKey(i)) {
                    List<Character> column = new ArrayList();
                    column.add(board[j][i]);
                    columnMap.put(i, column);
                }

                int lat = j / 3;
                int longt = i / 3;
                String index = lat + "," + longt;
                System.out.println(index);

                if(miniSquare.containsKey(index)) {
                    if(miniSquare.get(index).contains(board[j][i])) return false;
                }

                if(!miniSquare.containsKey(index)) {
                    List<Character> chars = new ArrayList();
                    chars.add(board[j][i]);
                    miniSquare.put(index, chars);
                    continue;
                }

                miniSquare.get(index).add(board[j][i]);
            }
        }
        
        return true;
    }
}
