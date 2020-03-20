package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField ulaznoPolje;
    public TextField izlaznoPolje;

    public int sumaCifara(int a){
        int s=0;
        while(a!=0){
            s=s+a%10;
            a=a/10;
        }
        return s;
    }


    public void djeljiviSaSumom(ActionEvent actionEvent) {
        String str = "";
        int n= Integer.parseInt(ulaznoPolje.getText());
        for(int i=1; i<=n; i++) {
            if(i % sumaCifara(i)==0){
                if(i==n || i==n-1) str+=i+". ";
                str+=i+", ";
            }

        }
        izlaznoPolje.setText(str);
    }


}
