public class Task1 {
    public static void main(String[] args) {
      //  How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever
        String sentence = "This is the sentence i want to reverse";
        StringBuilder sentence2=new StringBuilder(sentence);
        sentence2.reverse();
        sentence=sentence2.toString();
        System.out.println(sentence);
    }
}
