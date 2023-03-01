package com.example.numerosprimos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        List<Integer> numerosPrimos = new ArrayList<>(2);
        for (int x = 2; numerosPrimos.size() < 9; x++){
            if(isPrime(x)){
                numerosPrimos.add(x);
            }
        }
        System.out.print(numerosPrimos);

    }

    public boolean isPrime(Integer numero){
        boolean primo = true;
        for(int i=2; i<numero; i++)
        {
            if(numero % i ==0)
            {
                primo=false;
                break;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        launch();
    }
}