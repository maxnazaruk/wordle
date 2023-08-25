package com.example.demowordy;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloApplication extends Application {

    static String placedLetter = "-fx-background-color: MediumSeaGreen;-fx-font-size:20";
    static String presentLetter = "-fx-background-color: Yellow;-fx-font-size:20";
    static String incorrectLetter = "-fx-text-fill: #F0F0F0;-fx-background-color: #C8C8C8;-fx-font-size:20";
    static String defaultButtonStyle = "-fx-background-color: #FFFFFF;-fx-font-size:20";
    static List<Button> letters;
    static String buttonStyle = "-fx-background-color:#E0E0E0;-fx-font-size:17";
    static String buttonStylePresent = "-fx-background-color:Yellow;-fx-font-size:17";
    static String buttonStyleSelected = "-fx-background-color:MediumSeaGreen;-fx-font-size:17";
    static String buttonStyleIncorrect = "-fx-text-fill: #C0C0C0;-fx-background-color:#F0F0F0;-fx-font-size:17";

    static String textFieldStyle = "-fx-background-color: transparent;";
    static int count = 0;
    static StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 800);

        int xStart = 200;
        int yStart = 50;

        int buttonSizeX = 75;
        int buttonSizeY = 75;

        int step = 80;

        int letterX = 150;
        int letterY = 550;

        int letterXSize = 40;
        int letterYSize = 50;

        int letterStep = 50;
        int letterStepY = 60;


        //First letter line
        Button Q = new Button();
        Button W = new Button();
        Button E = new Button();
        Button R = new Button();
        Button T = new Button();
        Button Y = new Button();
        Button U = new Button();
        Button I = new Button();
        Button O = new Button();
        Button P = new Button();

        {
            Q.setText("Q");
            Q.setLayoutX(letterX);
            Q.setLayoutY(letterY);
            Q.setPrefSize(letterXSize, letterYSize);
            Q.setStyle(buttonStyle);

            W.setText("W");
            W.setLayoutX(letterX + letterStep);
            W.setLayoutY(letterY);
            W.setPrefSize(letterXSize, letterYSize);
            W.setStyle(buttonStyle);

            E.setText("E");
            E.setLayoutX(letterX + 2 * letterStep);
            E.setLayoutY(letterY);
            E.setPrefSize(letterXSize, letterYSize);
            E.setStyle(buttonStyle);

            R.setText("R");
            R.setLayoutX(letterX + 3 * letterStep);
            R.setLayoutY(letterY);
            R.setPrefSize(letterXSize, letterYSize);
            R.setStyle(buttonStyle);

            T.setText("T");
            T.setLayoutX(letterX + 4 * letterStep);
            T.setLayoutY(letterY);
            T.setPrefSize(letterXSize, letterYSize);
            T.setStyle(buttonStyle);

            Y.setText("Y");
            Y.setLayoutX(letterX + 5 * letterStep);
            Y.setLayoutY(letterY);
            Y.setPrefSize(letterXSize, letterYSize);
            Y.setStyle(buttonStyle);

            U.setText("U");
            U.setLayoutX(letterX + 6 * letterStep);
            U.setLayoutY(letterY);
            U.setPrefSize(letterXSize, letterYSize);
            U.setStyle(buttonStyle);

            I.setText("I");
            I.setLayoutX(letterX + 7 * letterStep);
            I.setLayoutY(letterY);
            I.setPrefSize(letterXSize, letterYSize);
            I.setStyle(buttonStyle);

            O.setText("O");
            O.setLayoutX(letterX + 8 * letterStep);
            O.setLayoutY(letterY);
            O.setPrefSize(letterXSize, letterYSize);
            O.setStyle(buttonStyle);

            P.setText("P");
            P.setLayoutX(letterX + 9 * letterStep);
            P.setLayoutY(letterY);
            P.setPrefSize(letterXSize, letterYSize);
            P.setStyle(buttonStyle);
        }

        //Second letter line
        Button A = new Button();
        Button S = new Button();
        Button D = new Button();
        Button F = new Button();
        Button G = new Button();
        Button H = new Button();
        Button J = new Button();
        Button K = new Button();
        Button L = new Button();
        {
            A.setText("A");
            A.setLayoutX(letterX + 20);
            A.setLayoutY(letterY + letterStepY);
            A.setPrefSize(letterXSize, letterYSize);
            A.setStyle(buttonStyle);

            S.setText("S");
            S.setLayoutX(letterX + letterStep + 20);
            S.setLayoutY(letterY + letterStepY);
            S.setPrefSize(letterXSize, letterYSize);
            S.setStyle(buttonStyle);

            D.setText("D");
            D.setLayoutX(letterX + 2 * letterStep + 20);
            D.setLayoutY(letterY + letterStepY);
            D.setPrefSize(letterXSize, letterYSize);
            D.setStyle(buttonStyle);

            F.setText("F");
            F.setLayoutX(letterX + 3 * letterStep + 20);
            F.setLayoutY(letterY + letterStepY);
            F.setPrefSize(letterXSize, letterYSize);
            F.setStyle(buttonStyle);

            G.setText("G");
            G.setLayoutX(letterX + 4 * letterStep + 20);
            G.setLayoutY(letterY + letterStepY);
            G.setPrefSize(letterXSize, letterYSize);
            G.setStyle(buttonStyle);

            H.setText("H");
            H.setLayoutX(letterX + 5 * letterStep + 20);
            H.setLayoutY(letterY + letterStepY);
            H.setPrefSize(letterXSize, letterYSize);
            H.setStyle(buttonStyle);

            J.setText("J");
            J.setLayoutX(letterX + 6 * letterStep + 20);
            J.setLayoutY(letterY + letterStepY);
            J.setPrefSize(letterXSize, letterYSize);
            J.setStyle(buttonStyle);

            K.setText("K");
            K.setLayoutX(letterX + 7 * letterStep + 20);
            K.setLayoutY(letterY + letterStepY);
            K.setPrefSize(letterXSize, letterYSize);
            K.setStyle(buttonStyle);

            L.setText("L");
            L.setLayoutX(letterX + 8 * letterStep + 20);
            L.setLayoutY(letterY + letterStepY);
            L.setPrefSize(letterXSize, letterYSize);
            L.setStyle(buttonStyle);
        }

        int correction = 25;

        //Third letter line
        Button entr = new Button();
        Button Z = new Button();
        Button X = new Button();
        Button C = new Button();
        Button V = new Button();
        Button B = new Button();
        Button N = new Button();
        Button M = new Button();
        Button erase = new Button();
        {
            entr.setText("Entr");
            entr.setLayoutX(letterX - correction);
            entr.setLayoutY(letterY + 2 * letterStepY);
            entr.setPrefSize(letterXSize + 50, letterYSize);
            entr.setStyle(buttonStyle);

            Z.setText("Z");
            Z.setLayoutX(letterX + letterStep + correction);
            Z.setLayoutY(letterY + 2 * letterStepY);
            Z.setPrefSize(letterXSize, letterYSize);
            Z.setStyle(buttonStyle);

            X.setText("X");
            X.setLayoutX(letterX + 2 * letterStep + correction);
            X.setLayoutY(letterY + 2 * letterStepY);
            X.setPrefSize(letterXSize, letterYSize);
            X.setStyle(buttonStyle);

            C.setText("C");
            C.setLayoutX(letterX + 3 * letterStep + correction);
            C.setLayoutY(letterY + 2 * letterStepY);
            C.setPrefSize(letterXSize, letterYSize);
            C.setStyle(buttonStyle);

            V.setText("V");
            V.setLayoutX(letterX + 4 * letterStep + correction);
            V.setLayoutY(letterY + 2 * letterStepY);
            V.setPrefSize(letterXSize, letterYSize);
            V.setStyle(buttonStyle);

            B.setText("B");
            B.setLayoutX(letterX + 5 * letterStep + correction);
            B.setLayoutY(letterY + 2 * letterStepY);
            B.setPrefSize(letterXSize, letterYSize);
            B.setStyle(buttonStyle);

            N.setText("N");
            N.setLayoutX(letterX + 6 * letterStep + correction);
            N.setLayoutY(letterY + 2 * letterStepY);
            N.setPrefSize(letterXSize, letterYSize);
            N.setStyle(buttonStyle);

            M.setText("M");
            M.setLayoutX(letterX + 7 * letterStep + correction);
            M.setLayoutY(letterY + 2 * letterStepY);
            M.setPrefSize(letterXSize, letterYSize);
            M.setStyle(buttonStyle);

            erase.setText("Erase");
            erase.setLayoutX(letterX + 8 * letterStep + correction);
            erase.setLayoutY(letterY + 2 * letterStepY);
            erase.setPrefSize(letterXSize + 50, letterYSize);
            erase.setStyle(buttonStyle);
        }

        letters = Arrays.asList(Q, W, E, R, T, Y, U, I, O, P, A, S, D, F, G, H, J, K, L, entr, erase, Z, X, C, V, B, N, M);

        Button firstRow[] = new Button[5];
        Button secondRow[] = new Button[5];
        Button thirdRow[] = new Button[5];
        Button fourthRow[] = new Button[5];
        Button fifthRow[] = new Button[5];
        Button sixthRow[] = new Button[5];
        {
            firstRow[0] = new Button();
            firstRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            firstRow[0].setLayoutX(xStart);
            firstRow[0].setLayoutY(yStart);
            firstRow[0].setText("");
            firstRow[0].setStyle(defaultButtonStyle);

            firstRow[1] = new Button();
            firstRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            firstRow[1].setLayoutX(xStart + step);
            firstRow[1].setLayoutY(yStart);
            firstRow[1].setText("");
            firstRow[1].setStyle(defaultButtonStyle);

            firstRow[2] = new Button();
            firstRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            firstRow[2].setLayoutX(xStart + 2 * step);
            firstRow[2].setLayoutY(yStart);
            firstRow[2].setText("");
            firstRow[2].setStyle(defaultButtonStyle);

            firstRow[3] = new Button();
            firstRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            firstRow[3].setLayoutX(xStart + 3 * step);
            firstRow[3].setLayoutY(yStart);
            firstRow[3].setText("");
            firstRow[3].setStyle(defaultButtonStyle);

            firstRow[4] = new Button();
            firstRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            firstRow[4].setLayoutX(xStart + 4 * step);
            firstRow[4].setLayoutY(yStart);
            firstRow[4].setText("");
            firstRow[4].setStyle(defaultButtonStyle);

            secondRow[0] = new Button();
            secondRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            secondRow[0].setLayoutX(xStart);
            secondRow[0].setLayoutY(yStart + step);
            secondRow[0].setText("");
            secondRow[0].setStyle(defaultButtonStyle);

            secondRow[1] = new Button();
            secondRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            secondRow[1].setLayoutX(xStart + step);
            secondRow[1].setLayoutY(yStart + step);
            secondRow[1].setText("");
            secondRow[1].setStyle(defaultButtonStyle);

            secondRow[2] = new Button();
            secondRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            secondRow[2].setLayoutX(xStart + 2 * step);
            secondRow[2].setLayoutY(yStart + step);
            secondRow[2].setText("");
            secondRow[2].setStyle(defaultButtonStyle);

            secondRow[3] = new Button();
            secondRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            secondRow[3].setLayoutX(xStart + 3 * step);
            secondRow[3].setLayoutY(yStart + step);
            secondRow[3].setText("");
            secondRow[3].setStyle(defaultButtonStyle);

            secondRow[4] = new Button();
            secondRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            secondRow[4].setLayoutX(xStart + 4 * step);
            secondRow[4].setLayoutY(yStart + step);
            secondRow[4].setText("");
            secondRow[4].setStyle(defaultButtonStyle);

            thirdRow[0] = new Button();
            thirdRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            thirdRow[0].setLayoutX(xStart);
            thirdRow[0].setLayoutY(yStart + 2 * step);
            thirdRow[0].setText("");
            thirdRow[0].setStyle(defaultButtonStyle);

            thirdRow[1] = new Button();
            thirdRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            thirdRow[1].setLayoutX(xStart + step);
            thirdRow[1].setLayoutY(yStart + 2 * step);
            thirdRow[1].setText("");
            thirdRow[1].setStyle(defaultButtonStyle);

            thirdRow[2] = new Button();
            thirdRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            thirdRow[2].setLayoutX(xStart + 2 * step);
            thirdRow[2].setLayoutY(yStart + 2 * step);
            thirdRow[2].setText("");
            thirdRow[2].setStyle(defaultButtonStyle);

            thirdRow[3] = new Button();
            thirdRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            thirdRow[3].setLayoutX(xStart + 3 * step);
            thirdRow[3].setLayoutY(yStart + 2 * step);
            thirdRow[3].setText("");
            thirdRow[3].setStyle(defaultButtonStyle);

            thirdRow[4] = new Button();
            thirdRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            thirdRow[4].setLayoutX(xStart + 4 * step);
            thirdRow[4].setLayoutY(yStart + 2 * step);
            thirdRow[4].setText("");
            thirdRow[4].setStyle(defaultButtonStyle);

            fourthRow[0] = new Button();
            fourthRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            fourthRow[0].setLayoutX(xStart);
            fourthRow[0].setLayoutY(yStart + 3 * step);
            fourthRow[0].setText("");
            fourthRow[0].setStyle(defaultButtonStyle);

            fourthRow[1] = new Button();
            fourthRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            fourthRow[1].setLayoutX(xStart + step);
            fourthRow[1].setLayoutY(yStart + 3 * step);
            fourthRow[1].setText("");
            fourthRow[1].setStyle(defaultButtonStyle);

            fourthRow[2] = new Button();
            fourthRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            fourthRow[2].setLayoutX(xStart + 2 * step);
            fourthRow[2].setLayoutY(yStart + 3 * step);
            fourthRow[2].setText("");
            fourthRow[2].setStyle(defaultButtonStyle);

            fourthRow[3] = new Button();
            fourthRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            fourthRow[3].setLayoutX(xStart + 3 * step);
            fourthRow[3].setLayoutY(yStart + 3 * step);
            fourthRow[3].setText("");
            fourthRow[3].setStyle(defaultButtonStyle);

            fourthRow[4] = new Button();
            fourthRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            fourthRow[4].setLayoutX(xStart + 4 * step);
            fourthRow[4].setLayoutY(yStart + 3 * step);
            fourthRow[4].setText("");
            fourthRow[4].setStyle(defaultButtonStyle);

            fifthRow[0] = new Button();
            fifthRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            fifthRow[0].setLayoutX(xStart);
            fifthRow[0].setLayoutY(yStart + 4 * step);
            fifthRow[0].setText("");
            fifthRow[0].setStyle(defaultButtonStyle);

            fifthRow[1] = new Button();
            fifthRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            fifthRow[1].setLayoutX(xStart + step);
            fifthRow[1].setLayoutY(yStart + 4 * step);
            fifthRow[1].setText("");
            fifthRow[1].setStyle(defaultButtonStyle);

            fifthRow[2] = new Button();
            fifthRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            fifthRow[2].setLayoutX(xStart + 2 * step);
            fifthRow[2].setLayoutY(yStart + 4 * step);
            fifthRow[2].setText("");
            fifthRow[2].setStyle(defaultButtonStyle);

            fifthRow[3] = new Button();
            fifthRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            fifthRow[3].setLayoutX(xStart + 3 * step);
            fifthRow[3].setLayoutY(yStart + 4 * step);
            fifthRow[3].setText("");
            fifthRow[3].setStyle(defaultButtonStyle);

            fifthRow[4] = new Button();
            fifthRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            fifthRow[4].setLayoutX(xStart + 4 * step);
            fifthRow[4].setLayoutY(yStart + 4 * step);
            fifthRow[4].setText("");
            fifthRow[4].setStyle(defaultButtonStyle);

            sixthRow[0] = new Button();
            sixthRow[0].setPrefSize(buttonSizeX, buttonSizeY);
            sixthRow[0].setLayoutX(xStart);
            sixthRow[0].setLayoutY(yStart + 5 * step);
            sixthRow[0].setText("");
            sixthRow[0].setStyle(defaultButtonStyle);

            sixthRow[1] = new Button();
            sixthRow[1].setPrefSize(buttonSizeX, buttonSizeY);
            sixthRow[1].setLayoutX(xStart + step);
            sixthRow[1].setLayoutY(yStart + 5 * step);
            sixthRow[1].setText("");
            sixthRow[1].setStyle(defaultButtonStyle);

            sixthRow[2] = new Button();
            sixthRow[2].setPrefSize(buttonSizeX, buttonSizeY);
            sixthRow[2].setLayoutX(xStart + 2 * step);
            sixthRow[2].setLayoutY(yStart + 5 * step);
            sixthRow[2].setText("");
            sixthRow[2].setStyle(defaultButtonStyle);

            sixthRow[3] = new Button();
            sixthRow[3].setPrefSize(buttonSizeX, buttonSizeY);
            sixthRow[3].setLayoutX(xStart + 3 * step);
            sixthRow[3].setLayoutY(yStart + 5 * step);
            sixthRow[3].setText("");
            sixthRow[3].setStyle(defaultButtonStyle);

            sixthRow[4] = new Button();
            sixthRow[4].setPrefSize(buttonSizeX, buttonSizeY);
            sixthRow[4].setLayoutX(xStart + 4 * step);
            sixthRow[4].setLayoutY(yStart + 5 * step);
            sixthRow[4].setText("");
            sixthRow[4].setStyle(defaultButtonStyle);
        }
        //int count = 0;

        Text popUpNote = new Text();
        popUpNote.setText("Correct!");
        popUpNote.setLayoutX(50);
        popUpNote.setLayoutY(30);

        String word = GUIElements.getRandomWord();

        Text showWord = new Text();
        showWord.setText(word);
        showWord.setLayoutX(300);
        showWord.setLayoutY(40);

        Text noWord = new Text();
        noWord.setText("No such word exists");
        noWord.setLayoutX(25);
        noWord.setLayoutY(100);
        noWord.setStyle("-fx-background-color:#FFFFFF;-fx-text-fill: #DA002B;-fx-font-size:17");

        TextField textField = new TextField();
        textField.setLayoutX(200);
        textField.setLayoutY(22);
        textField.setStyle(textFieldStyle);

        Button allRows[][] = {firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow};


        for (Button button : letters) {
            button.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    if (button.getText().equals("Entr")) {
                        if(textField.getText().equalsIgnoreCase("showme")){
                            textField.setText("");
                            root.getChildren().addAll(showWord);
                        }else {
                            stringBuilder = new StringBuilder();
                            for (Button selected : allRows[count]) {
                                stringBuilder.append(selected.getText());
                            }
                            if (GUIElements.isWordExists(stringBuilder.toString())) {
                                isSelectedLettersPresent(root, stringBuilder, allRows[count], word);
                                for (Button letter : letters) {
                                    root.getChildren().set(root.getChildren().indexOf(letter), letter);
                                }
                                if (wordVerification(stringBuilder, word)) {
                                    root.getChildren().add(popUpNote);
                                } else {
                                    count++;
                                }
                            } else {
                                clearButtons(allRows[count], root);
                                Stage popup = new Stage();
                                PauseTransition delay = new PauseTransition(Duration.seconds(2));
                                delay.setOnFinished(e -> popup.hide());

                                Pane rootPop = new Pane();
                                Scene scenePop = new Scene(rootPop, 200, 200);


                                rootPop.getChildren().add(noWord);
                                popup.setScene(scenePop);
                                popup.show();
                                delay.play();
                            }
                        }
                    } else if (button.getText().equals("Erase")) {
                        try {
                            Button activeButton = getLastFilledButton(allRows, count);
                            activeButton.setText("");
                            activeButton.setStyle(defaultButtonStyle);
                            root.getChildren().set(root.getChildren().indexOf(activeButton), activeButton);
                        } catch (NullPointerException ex) {

                        }
                    } else {
                        try {
                            Button activeButton = getFirstEmptyIndex(allRows, count);
                            activeButton.setText(button.getText());
                            root.getChildren().set(root.getChildren().indexOf(activeButton), activeButton);
                        } catch (NullPointerException ex) {

                        }
                    }
                }
            });
        }

        root.getChildren().addAll(letters);
        root.getChildren().addAll(textField);
        root.getChildren().addAll(allRows[0]);
        root.getChildren().addAll(allRows[1]);
        root.getChildren().addAll(allRows[2]);
        root.getChildren().addAll(allRows[3]);
        root.getChildren().addAll(allRows[4]);
        root.getChildren().addAll(allRows[5]);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void clearButtons(Button[] buttons, Pane pane){
        for (Button button : buttons){
            button.setText("");
            button.setStyle(defaultButtonStyle);
            pane.getChildren().set(pane.getChildren().indexOf(button), button);
        }
    }

    public static Button getFirstEmptyIndex(Button[][] buttons, int row) {
        for (int i = 0; i < buttons[row].length; i++) {
            if (buttons[row][i].getText().equals("")) {
                return buttons[row][i];
            }
        }
        return null;
    }

    public static Button getLastFilledButton(Button[][] buttons, int row) {
        for (int i = buttons[row].length - 1; i >= 0; i--) {
            if (!buttons[row][i].getText().equals("")) {
                return buttons[row][i];
            }
        }
        return null;
    }

    public static boolean wordVerification(StringBuilder stringBuilder, String word) {
        return stringBuilder.toString().equalsIgnoreCase(word);
    }

    public static void isSelectedLettersPresent(Pane pane, StringBuilder stringBuilder, Button[] buttons, String word) {
        String[] splitted = word.split("");
        String[] selected = stringBuilder.toString().split("");

        for (int i = 0; i < splitted.length; i++) {
            if (!splitted[i].equalsIgnoreCase(selected[i]) && Arrays.stream(splitted).toList().contains(selected[i].toLowerCase())) {
                Button button = buttons[i];
                if (button.getText().equalsIgnoreCase(selected[i])) {
                    button.setStyle(presentLetter);
                    pane.getChildren().set(pane.getChildren().indexOf(button), button);
                    for (Button letter : letters){
                        if(button.getText().equalsIgnoreCase(letter.getText())){
                            letter.setStyle(buttonStylePresent);
                        }
                    }
                }
            }

            if (splitted[i].equalsIgnoreCase(selected[i])) {
                for (Button button : buttons) {
                    if (button.getText().equalsIgnoreCase(selected[i])) {
                        button.setStyle(placedLetter);
                        pane.getChildren().set(pane.getChildren().indexOf(button), button);
                    }
                    for (Button letter : letters){
                        if(selected[i].equalsIgnoreCase(letter.getText())){
                            letter.setStyle(buttonStyleSelected);
                        }
                    }
                }
            }

            if (!Arrays.stream(splitted).toList().contains(selected[i].toLowerCase())) {
                buttons[i].setStyle(incorrectLetter);
                for (Button letter : letters){
                    if(selected[i].equalsIgnoreCase(letter.getText())){
                        letter.setStyle(buttonStyleIncorrect);
                    }
                }
            }
        }
    }
}