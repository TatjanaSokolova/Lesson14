import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        String[] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol",
                "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis" };
        Scanner scanner = new Scanner(System.in);

        int menu;

        System.out.println("Please choose an action: 1 - First letter, 2 - last letter, 3 - length");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                // 1st task
                System.out.println("please enter a first letter of the city; ");
                char x = scanner.next().charAt(0);

                int counter = 0;
                for (String cityname : cities) if ((x == cityname.charAt(0))) counter += 1;
                System.out.println("There are " + counter  + " cities with first letter " + x);
                break;
            // 2 nd task
            case 2:
                System.out.println("please enter the last letter of the city; ");
                char y = scanner.next().charAt(0);
                System.out.println(y);
                int counter2 = 0;
                for (String cityName : cities) {
                    if ((y == cityName.charAt(cityName.length() - 1))) counter2 += 1;
                }
                System.out.println("There are " + counter2  + " cities with last letter" + y);
                break;
            // 3rd task
            case 3:
                System.out.println("please enter the length of the city; ");
                int z = scanner.nextInt();

                int counter3 = 0;
                for (String name : cities)
                    if (name.length() == z) {
                        counter3 += 1;
                    }
                System.out.println("There are " + counter3  + " cities of length " + z);
                break;
        }

//        int counter = 0;
//        int counter2 = 0;
//        int counter3 = 0;
//        int counter4 = 0;
//        int counter5 = 0;
//        for (String city : cities) {
//            if ((city.charAt(0) == 'C')) {   //Find out how many values are starting with ‘C’
//                counter += 1;
//            }
//            if ((city.charAt(city.length() - 1) == 'i')) {    //Find out how many values are ending with “i”
//                counter2 += 1;
//            }
//            if (city.length() == 5) {                 //Find out how many values are with length 5
//                counter3 += 1;
//            }
//            if (city.contains("e")) {                   //Find out how many values consist of the character “e”
//                counter4 += 1;
//            }
//            if (city.contains("en")) {                  //Find out is there any element which consists of the subString “en”
//                counter5 += 1;
//            }
//        }
//        System.out.println("There are " + counter + " cities starting with ‘C’");
//        System.out.println("There are " + counter2 + " cities ending with ‘i’");
//        System.out.println("There are " + counter3 + " cities with length 5");
//        System.out.println("There are " + counter4 + " cities consist of the character “e”");
//        System.out.println("There are " + counter5 + " cities consist of the character “en”");
        }
    }


