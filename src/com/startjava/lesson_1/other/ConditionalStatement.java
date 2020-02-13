public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println ("You are old!!");
        }
        
        boolean isMale = true;
        if(isMale) {
            System.out.println("Your gender is male!");
        }
        if(!isMale) {
            System.out.println("Your gender is not male");
        }
                
        double height = 1.80;
        if(height < 1.80) {
            System.out.println ("Eat rastishka, bro!");
        } else {
            System.out.println ("Fine. " + "Your height = " + height + "m.");
        } 
        
        String name = "Misha";
        char firstLetterOfName = name.charAt(0);
        if(firstLetterOfName == 'M') {
            System.out.println ("Your name begins with the letter M");
        } else if(firstLetterOfName == 'I') {
            System.out.println ("Your name begins with the letter I");
        } else {
            System.out.println ("Your name begins with the letter " + firstLetterOfName);
        }       
    }
}