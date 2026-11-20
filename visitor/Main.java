import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(new Book("Design Patterns", 10_000),
                new Electronics("Headphones", 20_000));
        List<Product> empty = List.of();
        ProductVisitor report = new ProductReportVisitor();
        ProductVisitor promotion = new PromotionalPriceVisitor();

        System.out.println("Original prices:");
        visitAll(products, report);
        System.out.println("Promotional prices:");
        visitAll(products, promotion);
        System.out.println("Original prices after promotion:");
        visitAll(products, report);
        System.out.println("Empty catalog report (no product rows):");
        visitAll(empty, report);
        System.out.println("Promotion with a fraction of a cent:");
        visitAll(List.of(new Book("Short Stories", 999)), promotion);

        TotalPriceVisitor total = new TotalPriceVisitor();
        visitAll(products, total);
        System.out.println("Catalog total in cents: " + total.getTotalInCents());

        TotalPriceVisitor emptyTotal = new TotalPriceVisitor();
        visitAll(empty, emptyTotal);
        System.out.println("Empty catalog total in cents: " + emptyTotal.getTotalInCents());
    }

    private static void visitAll(List<Product> products, ProductVisitor visitor) {
        for (Product product : products) {
            product.accept(visitor);
        }
    }
}
