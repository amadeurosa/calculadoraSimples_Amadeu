package org.example.calculadoraamadeu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    String opcao;
    Double n1;
    Double n2;
    double resultado;

    @FXML
    private TextField visor;

    @FXML
    private Button bt7;

    @FXML
    private Button bt8;

    @FXML
    private Button bt9;

    @FXML
    private Button btDivisao;

    @FXML
    private Button bt4;

    @FXML
    private Button bt5;

    @FXML
    private Button bt6;

    @FXML
    private Button btMult;

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button btSub;

    @FXML
    private Button bt0;

    @FXML
    private Button btResult;

    @FXML
    private Button btSoma;

    @FXML
    private Button btClear;


    //Métodos

    public void onBtn7Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"7");
    }

    public void onBtn8Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"8");
    }

    public void onBtn9Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"9");
    }

    public void onBtnDivisaoClick(ActionEvent actionEvent) {

        opcao = "/";
        n1=Double.parseDouble(visor.getText());
        visor.clear();

    }

    public void onBtn4Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"4");
    }

    public void onBtn5Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"5");
    }

    public void onBtn6Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"6");
    }

    public void onBtnMultClick(ActionEvent actionEvent) {
        opcao = "X";
        n1=Double.parseDouble(visor.getText());
        visor.clear();

    }

    public void onBtn1Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"1");
    }

    public void onBtn2Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"2");
    }

    public void onBtn3Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"3");
    }

    public void onBtnSubClick(ActionEvent actionEvent) {
        opcao = "-";
        n1=Double.parseDouble(visor.getText());
        visor.clear();
    }

    public void onBtn0Click(ActionEvent actionEvent) {
        visor.setText(visor.getText()+"0");
    }

    public void onBtnResultClick(ActionEvent actionEvent) {

        switch (opcao){
            case "+":
                n2 = Double.parseDouble(visor.getText());
                visor.clear();
                resultado = n1+n2;
                visor.setText(String.valueOf(resultado));
                break;

            case "-":
                n2 = Double.parseDouble(visor.getText());
                visor.clear();
                resultado = n1-n2;
                visor.setText(String.valueOf(resultado));
                break;

            case "X":
                n2 = Double.parseDouble(visor.getText());
                visor.clear();


                resultado = n1*n2;
                visor.setText(String.valueOf(resultado));
                break;

            case "/":
                n2 = Double.parseDouble(visor.getText());
                visor.clear();
                if(n2 != 0){
                    resultado = n1/n2;
                    visor.setText(String.valueOf(resultado));

                } else{
                    visor.setText("Não existe divisão por zero");
                }
                break;
        }

    }

    public void onBtnSomaClick(ActionEvent actionEvent) {
        opcao = "+";
        n1=Double.parseDouble(visor.getText());
        visor.clear();
    }

    public void onBtnClearClick(ActionEvent actionEvent) {
        visor.clear();
    }
}