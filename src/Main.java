import java.time.LocalDate;
import java.util.*;

public class Main {
    static Set<Product> products = new HashSet<>();
    static Set<Recipe> recipes = new HashSet<>();
    static Set<Sponsor> sponsors = new HashSet<>();
    static Set<Mechanic> mechanics = new HashSet<>();

    static Set<Passport> passports = new HashSet<>();

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(20);

        Random randоm = new Random();
        for(int i= 0 ; i <=20;i++) {
            numbers.add(Math.abs(randоm.nextInt(1000)));
        }
        System.out.println(numbers);

        numbers.removeIf(i -> i % 2 != 0);
        System.out.println(numbers);

        Product banana = new Product("банан", 7, 1);
        Product apple = new Product("яблоко", 4, 1);
        Product pears = new Product("груша", 6, 2);
        Product peach = new Product("персик", 5, 3);
        Product apricot = new Product("абрикос", 6, 3);
        Product strawberry = new Product("клубника", 5, 4);

        Recipe soup = new Recipe(List.of(banana, apple, pears), 3, "суп");
        Recipe salad = new Recipe(List.of(apple, pears, apricot), 2, "салат");

        Sponsor artem = new Sponsor("Артем", 1200);
        Sponsor grigory = new Sponsor("Григорий", 1000);
        Sponsor dmitry = new Sponsor("Дмитрий", 1500);

        Mechanic andrey = new Mechanic("Андрей", "Андреев", "Компания");
        Mechanic alex = new Mechanic("Алексей", "Алексеев", "Компания2");
        Mechanic anton = new Mechanic("Антон", "Антонов", "Компания3");


        products.add(banana);
        products.add(apple);
        products.add(pears);
        products.add(peach);
        products.add(apricot);

        System.out.println(Arrays.toString(products.toArray()));

        addProduct(strawberry);

        System.out.println(Arrays.toString(products.toArray()));

        sponsors.add(artem);
        sponsors.add(dmitry);
        sponsors.add(grigory);

        System.out.println(Arrays.toString(sponsors.toArray()));

        addSponsor(dmitry);
        System.out.println(Arrays.toString(sponsors.toArray()));

        mechanics.add(alex);
        mechanics.add(anton);
        mechanics.add(andrey);

        System.out.println(Arrays.toString(mechanics.toArray()));
        addMechanic(andrey);

        List<Integer> multiplicationNumbers = new ArrayList<>();
        multiplicationNumbers.add(2);
        multiplicationNumbers.add(3);
        multiplicationNumbers.add(4);
        multiplicationNumbers.add(5);
        multiplicationNumbers.add(6);
        multiplicationNumbers.add(7);
        multiplicationNumbers.add(8);
        multiplicationNumbers.add(9);

        List<MultiplicationTask> allTasks = new ArrayList<>(15);
        for (int firstNumber = 2; firstNumber <= 9; firstNumber++)
        {
            for (int secondNumber = firstNumber; secondNumber <= 9; secondNumber++)
            {
                allTasks.add(new MultiplicationTask(firstNumber, secondNumber));
            }
        }
        Collections.shuffle(allTasks);
        List<MultiplicationTask> chosenTasks = allTasks.subList(0, 15);

        System.out.println(chosenTasks);

        Passport ruslan = new Passport("222333", "Русланов", "Руслан", "Русланович", LocalDate.of(1985, 12, 3));
        Passport timofey = new Passport("112233", "Тимофеев", "Тимофей", "Тимофеевич",  LocalDate.of(1993, 5, 18));
        Passport leonid = new Passport("131313", "Леонидов", "Леонид", "Леонидович", LocalDate.of(1997, 1, 14));

        passports.add(ruslan);
        passports.add(timofey);
        passports.add(leonid);
        System.out.println(Arrays.toString(passports.toArray()));
    }

    public static void addProduct(Product product){
        if(products.contains(product)){
            throw new RuntimeException("Нельзя добавлять одинаковые элементы");
        } else {
            products.add(product);
        }
    }

    public static void addRecipe(Recipe recipe){
        if(recipes.contains(recipe)){
            throw new RuntimeException("Нельзя добавлять одинаковые рецепты");
        } else {
            recipes.add(recipe);
        }
    }

    public static void removeProduct(Product product){
        products.remove(product);
    }

    public static void addSponsor(Sponsor sponsor){
        if (!sponsors.contains(sponsor)){
            sponsors.add(sponsor);
        } else {
            System.out.println(Arrays.toString(sponsors.toArray()));
        }
    }

    public static void addMechanic(Mechanic mechanic){
        if (!mechanics.contains(mechanic)){
            mechanics.add(mechanic);
        } else {
            System.out.println(Arrays.toString(mechanics.toArray()));
        }

    }

    public static void addPassport(Passport passport){
        if (!passports.contains(passport)){
            passports.add(passport);
            System.out.println(Arrays.toString(passports.toArray()));
        } else {
            System.out.println(Arrays.toString(passports.toArray()));
        }
    }

}