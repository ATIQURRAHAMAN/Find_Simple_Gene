public class Part3
{
    public boolean twoOccurrences(String stringa, String stringb){
        int curIndex = 0, count = 0;
        int l = stringa.length();
        curIndex = stringb.indexOf(stringa, curIndex);
        while(true){
            if(curIndex != -1){
                count++;
                if(count == 2){
                    return true;
                }
            }
            else{
                return false;
            }
            curIndex = stringb.indexOf(stringa, curIndex + l);
        }
    }
    public String lastPart(String stringa, String stringb){
        int l = stringb.length();
        int k = stringa.length();
        int curIndex = 0;
        curIndex = stringb.indexOf(stringa, curIndex);
        if(curIndex == -1){
            return stringb;
        }
        String s = stringb.substring(curIndex + k, l);
        return s;
    }
    public void testing(){
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrences(stringa, stringb)){
            System.out.println(twoOccurrences(stringa, stringb));
        }
        else{
            System.out.println(twoOccurrences(stringa, stringb));
        }
        stringa = "atg";
        stringb = "ctgtatgta";
        System.out.println(stringa);
        System.out.println(stringb);
        if(twoOccurrences(stringa, stringb)){
            System.out.println(twoOccurrences(stringa, stringb));
        }
        else{
            System.out.println(twoOccurrences(stringa, stringb));
        }
        stringa = "an";
        stringb = "banana";
        System.out.println(stringa);
        System.out.println(stringb);
        System.out.println(lastPart(stringa, stringb));
        stringa = "zoo";
        stringb = "forest";
        System.out.println(stringa);
        System.out.println(stringb);
        System.out.println(lastPart(stringa, stringb));
    }
}