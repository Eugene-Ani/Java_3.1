    public class Main {
        public static void main(String[] args) {

            BonusMilesService service = new BonusMilesService();
            int price = 10_000;
            int miles = service.calculate(price);

            System.out.println("Вам положено " + miles + " бонусных миль");
            System.out.println("made by Dad, enjoy!");
        }
    }
