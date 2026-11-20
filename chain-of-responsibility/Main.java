import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExpenseApprover leader = new TeamLeaderApprover();
        ExpenseApprover manager = new ManagerApprover();
        ExpenseApprover director = new DirectorApprover();
        leader.setNext(manager);
        manager.setNext(director);

        List<ExpenseRequest> requests = List.of(
                new ExpenseRequest("Office supplies (R$ 300,00)", 30_000),
                new ExpenseRequest("Training (R$ 1.500,00)", 150_000),
                new ExpenseRequest("Equipment (R$ 8.000,00)", 800_000),
                new ExpenseRequest("Office renovation (R$ 15.000,00)", 1_500_000),
                new ExpenseRequest("Leader limit (R$ 500,00)", 50_000),
                new ExpenseRequest("Manager limit (R$ 2.000,00)", 200_000),
                new ExpenseRequest("Director limit (R$ 10.000,00)", 1_000_000));

        System.out.println("Original chain:");
        requests.forEach(leader::approve);

        System.out.println("With president:");
        director.setNext(new PresidentApprover());
        requests.forEach(leader::approve);
        leader.approve(new ExpenseRequest("President limit (R$ 50.000,00)", 5_000_000));
        leader.approve(new ExpenseRequest("Above president limit (R$ 50.000,01)", 5_000_001));
    }
}
