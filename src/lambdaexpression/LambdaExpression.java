/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.stream.IntStream;
/**
 *
 * @author esraa
 */

public abstract class LambdaExpression implements Lambda {
    
    
    public static void main(String[] args) {
        Lambda l1=()->9.8;
        System.err.println(l1.myMethod());
        Lambda2 l2=(x)->(1.0/x);
        System.err.println(l2.myMethod(5));
        Lambda3 l3=(x,y)->x==y;
        System.err.println(l3.myMethod(5,6));
        int[]x={1,2,3,4,0};
        IntStream.of(x).forEach(y->System.out.println(y));
        IntStream.of(x).filter(y->y%2==0).sorted().forEach(y->System.out.println(y));
}
}
