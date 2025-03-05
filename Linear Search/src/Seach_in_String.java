public class Seach_in_String {
    public static void main(String[] args) {
        String name = "Danish Homavazir";
        char target = 'p';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
