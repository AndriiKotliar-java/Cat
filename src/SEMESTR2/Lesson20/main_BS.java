package SEMESTR2.Lesson20;

import SEMESTR2.Lesson20.BookShop.Model.*;

import java.util.ArrayList;

public class main_BS {

   static ArrayList<Book> Books = new ArrayList<>();
   static ArrayList<Employee> Employees = new ArrayList<>();
   static ArrayList<Customer> Customers = new ArrayList<>();
   static ArrayList<Order> Orders = new ArrayList<>();

   public static void main(String[] args) {
      initData();
      int a = getCountOfSoldBooks();
      System.out.println("Count Of Sold Books is " + a);

      double b = getPriceOfAllOrders();
      System.out.println("Price Of All Orders is " + b);
   }

   public static void initData(){
      Employees.add(new Employee(1,"Kate",16));
      Employees.add(new Employee(2,"Roma",27));
      Employees.add(new Employee(3,"Anna",21));

      Customers.add(new Customer(4,"Bob",62));
      Customers.add(new Customer(5,"Billy",12));
      Customers.add(new Customer(6,"Vanessa",43));
      Customers.add(new Customer(7,"Mother_Jane",25));
      Customers.add(new Customer(8,"Child_Tom",2));

      Books.add(new Book(10,"House of gnome", "Vanya",500, BookGenre.STORY));
      Books.add(new Book(11,"Horse-Cat", "Caren",150, BookGenre.SCIENCE_PHANTASY));
      Books.add(new Book(12,"War and Water", "Egor",75, BookGenre.STORY));
      Books.add(new Book(13,"Salt Water", "Doctor.T",500, BookGenre.SCIENCE));
      Books.add(new Book(14,"Galaktic Planet", "Dane",450, BookGenre.SCIENCE_PHANTASY));
      Books.add(new Book(15,"Story Ilon Mask", "Ilon Mask",1000, BookGenre.SCIENCE));
      Books.add(new Book(16,"Geografic", "Victor",100, BookGenre.SCIENCE));
      Books.add(new Book(17,"War of Infinity", "",840, BookGenre.SCIENCE_PHANTASY));
      Books.add(new Book(18,"Yammy,Yammy", "Tommy",130, BookGenre.STORY));
      Books.add(new Book(19,"1984", "George Orwell",600, BookGenre.CLASSIC));
      Books.add(new Book(20,"Ulysses", "James Joyce",600, BookGenre.CLASSIC));

      Orders.add(new Order(1,3, 5,new long[]{10,15,20}));
      Orders.add(new Order(2,2, 7,new long[]{16,13,14,12}));
      Orders.add(new Order(3,1, 4,new long[]{18,13,11}));
      Orders.add(new Order(4,2, 6,new long[]{15,20}));
   }
   public static Book getBookById(long id){ //метод, що повертає книгу по її айді
      Book book = null;
      for(Book beBook : Books){
         if (beBook.getUnNumber()==id){
            book = beBook;
         }
      }
      return book;
   }
   public static int getCountOfSoldBooks(){ //метод, що повертає загальну кількість проданих книжок
      int count = 0;
      for (Order order : Orders){
         count += order.getSoldBooks().length;
      }
      return count;
   }
   public static double getPriceOfSoldBooksInOrder(Order order){ //метод, що повертає вартість одного замовлення
      double price = 0;
      for (long bookId : order.getSoldBooks()){
         Book book = getBookById(bookId);
         if (book!=null){
            price += book.getPrice();
         }
      }
      return price;
   }
   public static double getPriceOfAllOrders(){
      double price = 0;
      for (Order orders : Orders){
         if (orders!=null){
            price += getPriceOfSoldBooksInOrder(orders);
      }
   }
      return price;
   }
}