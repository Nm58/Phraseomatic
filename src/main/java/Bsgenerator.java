public class Bsgenerator {
        public static void main(String[] args) {
            String[] wordListOne = {"drill down","take a step back", };

            String[] wordListTwo = {"look at the big picture", "raise the bar", "take a step forward"};

            String[] wordListThree = {"and", "in order to"};


            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListOne[rand1] + " " + wordListThree[rand3] + " " + wordListTwo[rand2];

            System.out.println("we need to " + phrase);
        }
}
