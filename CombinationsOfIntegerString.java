public class CombinationsOfIntegerString {
    static void strNum(String s,String []kepad,String r){
        if(s.length()==0){
            System.out.print(r+" ");
            return;
        }
        int idx=s.charAt(0)-'0';
        String currAns=kepad[idx];
        for(int i=0;i<currAns.length();i++){
            strNum(s.substring(1), kepad,r+currAns.charAt(i));
        }
    }
    public static void main(String[] args) {
        String kepad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        strNum("23",kepad,"");
        
    }
}
