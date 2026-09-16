public class myClass {

     }


/*

    // opgave 1 Bank-konto
    double balance = 0;
    String accountName;

    void deposit100() {
        balance+= 100;
    }

    void withdraw50() {
        balance -= 50;
    }

    void printBalance() {
        System.out.println(accountName + " has " + balance + " kr");

    }

    void main()  {
        accountName = "Jakob";
        deposit100();
        deposit100();
        withdraw50();
        printBalance();


    }
     // opgave 2 Karakter-beregner

     int assignementsPoints;
     int examPoints;
     int projectPoints;


     void addAssignementPoints(int points) {
         assignementsPoints+= points;

     }

     void addExamPoints(int points) {
         examPoints+= points;

     }

     void addProjectPoints(int points) {
         projectPoints+= points;

     }

     void printTotal() {
         int total = assignementsPoints + examPoints + projectPoints;
         System.out.println(total);

     }

     // opgave 3: Pris-beregner

     double applyDiscount(double price, double discountPercent) {
         double discountPrice = price / 100 * discountPercent;
         return price - discountPrice;

     }

     double addTax(double price) {
         double tax = price *0.25;
         return price + tax;

     }

     double calculateFinalPrice (double basePrice, double discount) {
         double discountedPrice = applyDiscount(basePrice, discount);
         return addTax(discountedPrice);

     }
     void main () {

         double finalPrice = calculateFinalPrice(500, 20);
         System.out.println("Final Price: " + finalPrice);

     }
     // opgave 4: Statistik-beregner

    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];

        }
        return sum / numbers.length;
    }

    int findMax(int[] numbers) {
        int highestNum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > highestNum) {
                highestNum = numbers[i];
            }

        }
        return highestNum;
    }

    int findMin(int[] numbers) {
        int lowestNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowestNum) {
                lowestNum = numbers[i];
            }

        }
        return lowestNum;
    }

    int countAboveAverage(int[] numbers) {
        double average = calculateAverage(numbers);
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                counter++;
            }

        }
        return counter;
    }

    void main () {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
        int highestNum = findMax(numbers);
        System.out.println("Highest number: " + highestNum);
        int lowestNum = findMin(numbers);
        System.out.println("Lowest number: " + lowestNum);
        int aboveAverage = countAboveAverage(numbers);
        System.out.println("Above average: " + aboveAverage);

     }

 */






}

