import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int beginningRange = 100;
        int endRange = 300;
        int amount = service.numberSquares(beginningRange, endRange);
        System.out.println(amount);
    }
}
