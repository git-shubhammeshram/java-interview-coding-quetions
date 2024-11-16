package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BookReview {
    private String bookId;
    private double rating;
    private String comment;

    public BookReview(String bookId, double rating, String comment) {
        this.bookId = bookId;
        this.rating = rating;
        this.comment = comment;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "BookReview{" +
                "bookId='" + bookId + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<BookReview> list = Arrays.asList(
                new BookReview ("book1", 4.5, "Great book!"),
                new BookReview ("book1", 3.8, "Good read."),
                new BookReview ("book2", 2.5, "Not my favorite."),
                new BookReview ("book2", 3.0, "It was okay."),
                new BookReview ("book3", 5.0, "Excellent."),
                new BookReview ("book3", 4.8, "Amazing read."),
                new BookReview ("book3", 4.2, "Very informative.")
        );

        Map<String, List<BookReview>> bookReviewMap = list.stream().filter(x -> x.getRating() >= 3.0)
                .collect(Collectors.groupingBy(BookReview::getBookId));

        bookReviewMap.forEach((bookId, bookReviews)->{

            double reviewAvg = bookReviews.stream().mapToDouble(BookReview::getRating).average().orElse(0.0);
            int size = bookReviews.size();

            System.out.println("Book Id "+bookId+" "+" Average Rating  "+reviewAvg+" Review Count "+size);
        });


    }
}
