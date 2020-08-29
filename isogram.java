public class isogram {
    public static boolean  isIsogram(String str) {
            str = str.toLowerCase();
            boolean flag = true;
            for(int i = 0; i < str.length(); i++){
                if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
}