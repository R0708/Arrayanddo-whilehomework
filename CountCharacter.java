public class CountCharacter {

    //To enter any String and count total number of 'a' in that String

    public static void main(String[] args) {

        String string = "The best of both worlds";
        int count = 0;

        //counts each character except space
        for (int i = 0; i < string.length(); i++)
        {
         if (string.charAt(i) != ' ')
             count++;
        }
        //displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}
