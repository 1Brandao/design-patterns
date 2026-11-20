public abstract class ExpenseApprover {
    private final String role;
    private final int limitInCents;
    private ExpenseApprover next;

    protected ExpenseApprover(String role, int limitInCents) {
        this.role = role;
        this.limitInCents = limitInCents;
    }

    public void setNext(ExpenseApprover next) {
        this.next = next;
    }

    public void approve(ExpenseRequest request) {
        if (request.getAmountInCents() <= limitInCents) {
            System.out.println(role + " approved: " + request.getDescription());
        } else if (next != null) {
            next.approve(request);
        } else {
            System.out.println("No approver available: " + request.getDescription());
        }
    }
}
