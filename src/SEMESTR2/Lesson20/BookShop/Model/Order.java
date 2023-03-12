package SEMESTR2.Lesson20.BookShop.Model;

public class Order {
   private long unNumber_Or;
   private int numberEmp;
   private int numberCus;
   private long[] soldBooks;

   public Order(long unNumber_Or, int numberEmp, int numberCus, long[] soldBooks) {
      this.unNumber_Or = unNumber_Or;
      this.numberEmp = numberEmp;
      this.numberCus = numberCus;
      this.soldBooks = soldBooks;
   }

   public long getUnNumber_Or() {
      return unNumber_Or;
   }

   public void setUnNumber_Or(long unNumber_Or) {
      this.unNumber_Or = unNumber_Or;
   }

   public int getNumberEmp() {
      return numberEmp;
   }

   public void setNumberEmp(int numberEmp) {
      this.numberEmp = numberEmp;
   }

   public int getNumberCus() {
      return numberCus;
   }

   public void setNumberCus(int numberCus) {
      this.numberCus = numberCus;
   }

   public long[] getSoldBooks() {
      return soldBooks;
   }

   public void setSoldBooks(long[] soldBooks) {
      this.soldBooks = soldBooks;
   }
}
