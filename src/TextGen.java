import java.util.Random;

public class TextGen {
    private final Random random = new Random();
    private final int rows;
    private final int columns;

    public TextGen(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public void printBubbles() {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(generateBubble() + " ");
            }
            System.out.println();
        }
    }


    private String generateBubble(){
        String unmodifiedWord = "";
        String bubble = "";

        switch(random.nextInt(3)){
            case 0: unmodifiedWord = "||pop||";
                break;

            case 1: unmodifiedWord = "||POP||";
                break;

            case 2: unmodifiedWord = "||pop.||";
                break;
        }

        switch(random.nextInt(4)){
            case 0: bubble = Modifiers.addBold(unmodifiedWord);
                break;

            case 1: bubble = Modifiers.addItalics(unmodifiedWord);
                break;

            case 2: bubble = Modifiers.addStrikethrough(unmodifiedWord);
                break;

            case 3: bubble = Modifiers.addUnderline(unmodifiedWord);
                break;
        }

        return bubble;
    }


}
