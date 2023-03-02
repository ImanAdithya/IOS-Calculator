import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MainFormController {
    public Label lblDisplay;
    public Label lblvalue;

    private  String firstNumber="";
    private  String currentNumber="";
    private String calculateType;

    public void onActionMulti(ActionEvent actionEvent) {
        calculateSetup("*");
    }

    public void onActionSubs(ActionEvent actionEvent) {
        calculateSetup("-");
    }
    public void onActionAddition(ActionEvent actionEvent) {
        calculateSetup("+");
    }
    public void onActionModules(ActionEvent actionEvent) {
        calculateSetup("%");
    }
    public void onActionDevide(ActionEvent actionEvent) {
        calculateSetup("/");
    }

    public void calculateSetup(String calculateType){
        this.calculateType=calculateType;
        firstNumber=currentNumber;
        currentNumber="";
        lblDisplay.setText(firstNumber);

    }
    public void onActionC(ActionEvent actionEvent) {
        currentNumber="";
        lblDisplay.setText("");
        lblvalue.setText("");

    }

    public void onAction7(ActionEvent actionEvent) {
        addNumber("7");
    }

    public void onAction8(ActionEvent actionEvent) {
        addNumber("8");
    }

    public void onAction9(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void onAction4(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void onAction5(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void onAction6(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void onAction1(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void onAction2(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void onAction3(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void onAction0(ActionEvent actionEvent) {
        addNumber("0");
    }

    public void onActionDot(ActionEvent actionEvent) {
    }

    public void onActionEqual(ActionEvent actionEvent) {
        int firstNum= Integer.parseInt(firstNumber);
        int secondNum= Integer.parseInt(currentNumber);

        switch (calculateType){
            case "+":
                int calculatedNumber1=firstNum+secondNum;
                //lblvalue.setText(firstNumber+" + "+secondNum+" "+calculatedNumber1);
                lblDisplay.setText(String.valueOf(calculatedNumber1));
                currentNumber= String.valueOf(secondNum);
                break;

            case "-":
                int calculatedNumber2=firstNum-secondNum;
                //lblDisplay.setText(firstNumber+" + "+secondNum+" = "+calculatedNumber2);
                lblDisplay.setText(String.valueOf(calculatedNumber2));
                currentNumber= String.valueOf(secondNum);
                break;

            case "*":
                int calculatedNumber3=firstNum*secondNum;
                //lblDisplay.setText(firstNumber+" + "+secondNum+" = "+calculatedNumber3);
                lblDisplay.setText(String.valueOf(calculatedNumber3));
                currentNumber= String.valueOf(secondNum);
                break;

            case "/":
                int calculatedNumber4=firstNum/secondNum;
                //lblDisplay.setText(firstNumber+" + "+secondNum+" = "+calculatedNumber4);
                lblDisplay.setText(String.valueOf(calculatedNumber4));
                currentNumber= String.valueOf(secondNum);
                break;

            case "%":
                int calculatedNumber5=firstNum%secondNum;
               // lblDisplay.setText(firstNumber+" + "+secondNum+" = "+calculatedNumber5);
                lblDisplay.setText(String.valueOf(calculatedNumber5));
                currentNumber= String.valueOf(secondNum);
                break;
            default:
                System.out.println("nothing");
                break;
        }
    }

    public void addNumber(String number){
        currentNumber +=number;
        updateTextFeild();
    }

    private void updateTextFeild() {
        lblDisplay.setText(currentNumber);
    }

}
