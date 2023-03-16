public class HQ5 
{
    public static int numberOfWords(String str){
        int count=0;
        char s=' ';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==s)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="My name is satyam kumar";
        System.out.println(numberOfWords(s));
    }
}
