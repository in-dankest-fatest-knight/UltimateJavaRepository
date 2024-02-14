package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {
        for(int i = 0; i >= str.length(); i++){
            if(str.substring(i, i + 3).equals("xyz")){
                if(i > 0 && !str.substring(i - 1, i).equals("xyz")){
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String nstr = "";
        for(int i = 0; i < str.length(); i++){
            nstr += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return nstr;
    }

    public static int countCode(String str) {
        int count = 0;
        for(int i = 0; i <= str.length() - 4; i++){
            if(str.substring(i, i + 1).equals("c") && str.substring(i + 1, i + 2).equals("o") && str.substring(i + 3, i + 4).equals("e")){
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        for(int i = 0; i <= str.length() - 3; i++){
            if(str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")){
                return true;
            }
        }
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        String pre = str.substring(0, n);
        for(int i = 1; i <= str.length() - n; i++){
            if(str.substring(i, i + n).equals(pre)){
                return true;
            }
        }
        return false;
    }

    public static boolean sameStarChar(String str) {
        for(int i = 1; i <= str.length() - 2; i++){
            if(str.substring(i, i + 1).equals("*")){
                if(!(str.substring(i - 1, i).equals(str.substring(i + 1, i + 2)))){
                    return false;
                }
            }
        }
        return true;
    }

    public static String starOut(String str) {
        String nstr = "";
        //handling for short strings
        if(str.length() <= 3){
            if(str.length() == 0){
                return "";
            }
            else if(str.length() == 1){
                if(str.substring(0, 1).equals("*")){
                    nstr = "";
                }
                else{
                    nstr = str;
                }
            }
            else if(str.length() == 2){
                if(str.substring(0, 1).equals("*") || str.substring(1, 2).equals("*")){
                    nstr = "";
                }
                else{
                    nstr = str;
                }
            }
            else if(str.length() == 3){
                if(str.substring(0, 1).equals("*") || str.substring(1, 2).equals("*") || str.substring(2, 3).equals("*")){
                    nstr = "";
                }
                else{
                    nstr = str;
                }
            }
        }
        else{
            for(int i = 0; i < str.length(); i++){
                if(i == 0){
                    if(!str.substring(i, i + 1).equals("*") && !str.substring(i + 1, i + 2).equals("*")){
                        nstr += str.substring(i, i + 1);
                    }
                }
                else if(i == str.length() - 1){
                    if(!str.substring(i - 1, i).equals("*") && !str.substring(i, i + 1).equals("*")){
                        nstr += str.substring(i, i + 1);
                    }
                }
                else{
                    if(!str.substring(i - 1, i).equals("*") && !str.substring(i, i + 1).equals("*") && !str.substring(i + 1, i + 2).equals("*")){
                      nstr += str.substring(i, i + 1);
                    }
                }
            }
        }

        return nstr;
    }

    public static int countHi(String str) {
        int count = 0;
        if(str.length() <= 2){
            if(str.equals("hi")){
                count++;
            }
        }
        else{
            for(int i = 0; i <= str.length() - 2; i++){
                if(str.substring(i, i + 2).equals("hi")){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        if(A.length() > B.length()){
            if(A.substring(A.length() - B.length()).equals(B)){
                return true;
            }
            else{
                return false;
            }
        }
        else if(B.length() > A.length()){
            if(B.substring(B.length() - A.length()).equals(A)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(a.equals(B)){
                return true;
            }
            else{
                return false;

            }
        }
    }

    public static boolean xyBalance(String str) {
        boolean holder = true;
        if(str.length() == 1){
            if(str.equals("x")){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            for(int i = 0; i < str.length(); i++){
                if(str.substring(i, i + 1).equals("x")){
                    holder = false;
                }
                else if(str.substring(i, i + 1).equals("y")){
                    holder = true;
                }
            }
        }
        return holder;
    }

    public static String plusOut(String str, String word) {
        String nstr = "";
        if(str.length() <= word.length()){
            if(str.equals(word)){
                return str;
            }
            else{
                for(int i = 0; i <= str.length(); i++){
                    nstr += "+";
                }
            }
        }
        else{
            for(int i = 0; i < str.length(); i++){
                if(str.length() - i >= word.length()){
                    if(str.substring(i, i + word.length()).equals(word)){
                        nstr += word;
                        i += word.length() - 1;
                    }
                    else{
                        nstr += "+";
                    }
                }
                else{
                    if(str.substring(str.length() - i).equals(word)){
                        nstr += word;
                    }
                    else{
                        for(int c = 0; c < word.length() - 1; c++){
                            nstr += "+";
                        }
                    }
                    break;
                }
            }
        }
        
        return nstr;
    }

    public static boolean catDog(String str) {
        int catcount = 0;
        int dogcount = 0;
        for(int i = 0; i <= str.length() - 3; i++){
            if(str.substring(i, i + 3).equals("cat")){
                catcount++;
            }
            else if(str.substring(i, i + 3).equals("dog")){
                dogcount++;
            }
        }
        if(catcount == dogcount){
            return true;
        }
        else{
        return false;
        }
    }

    public static String mixString(String a, String b) {
        String nstr = "";
        boolean order = true;
        if(a.length() >= b.length()){
            order = true;
        }
        else{
            order = false;
        }

        if(order){
            for(int i = 0; i <= a.length() - 1; i++){
                nstr += a.substring(i, i + 1);

                if(i < b.length()){
                    nstr += b.substring(i, i + 1);
                }
            }
        }
        else{
            for(int i = 0; i <= b.length() - 1; i++){
                if(i < a.length()){
                    nstr += a.substring(i, i + 1);
                }

                nstr += b.substring(i, i + 1);
            }
        }
        return nstr;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String nstr = "";
        for(int i = 0; i < count; i++){
            nstr += word;
            if(i != count - 1){
                nstr += sep;
            }
        }
        return nstr;
    }

    public static void main(String[] args) {
    }
}
