public class PromotionalPriceVisitor implements ProductVisitor {
    @Override
    public void visit(Book book) {
        printPrice(book.getTitle(), book.getPriceInCents(), 90);
    }

    @Override
    public void visit(Electronics electronics) {
        printPrice(electronics.getModel(), electronics.getPriceInCents(), 95);
    }

    private void printPrice(String name, int priceInCents, int percentToPay) {
        long promotionalPrice = (long) priceInCents * percentToPay / 100;
        System.out.println(name + " - promotional cents: " + promotionalPrice);
    }
}
