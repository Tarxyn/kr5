package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter: FCs, number, faculty, birth, phone:");
        System.out.print("FCs: ");
        String fcs = scanner.nextLine();
        System.out.println();
        System.out.print("number: ");
        int number = scanner1.nextInt();
        System.out.println();
        System.out.print("faculty: ");
        String faculty = scanner.nextLine();
        System.out.println();
        System.out.print("birth: ");
        String birth = scanner.nextLine();
        System.out.println();
        System.out.print("phone: ");
        String phone = scanner.nextLine();
        System.out.println();
        Reader reader = new Reader(fcs, number, faculty, birth, phone);

        System.out.println("Enter book: name, author: ");
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("author: ");
        String author = scanner.nextLine();
        System.out.println();
        Book book = new Book(name, author);
        Book book1 = new Book("Hotel", "Arthur Hailey");
        Book[] books = {book, book1};

        String[] books_string = {"1984", "Harry Potter"};

        reader.takeBook(3);
        reader.takeBook(books_string);
        reader.takeBook(books);

        reader.returnBook(3);
        reader.returnBook(books_string);
        reader.returnBook(books);
    }
}
