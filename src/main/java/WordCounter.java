public class WordCounter {

    public int countWords(String matchstr, String strToCheck)
    {
        String strArr [];
        int count=0;
        if(matchstr.contains(strToCheck)){
            strArr = matchstr.split(" ");
            for (int i=0;i<strArr.length;i++)
            {
                if(strArr[i].contains(strToCheck))  {
                   count++;
                }
            }
        }
        return count;
    }
}
