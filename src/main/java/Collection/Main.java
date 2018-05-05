package Collection;

        import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }


    public static void printInstruction() {
        System.out.print("\nPress");
        System.out.print("\n0 - To print choice option.");
        System.out.print("\n1 - To print the list of grocery items.");
        System.out.print("\n2 - To add an item to the list.");
        System.out.print("\n3 - To modify an item in the list.");
        System.out.print("\n4 - To remove an item from the list.");
        System.out.print("\n5 - To search for an item in the list.");
        System.out.print("\n6 - To quit the application.");

    }

    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item :");
        groceryList.addGroceryItem(scanner.nextLine());
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem()
    {
        System.out.print("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchItem(){
        System.out.print("Item to search for :");
        String searchItem=scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null)
        {
            System.out.print("Found "+ searchItem +" in our grocery list");
        }else
        {
            System.out.print(searchItem+" is not in the shopping list");
        }
    }



}