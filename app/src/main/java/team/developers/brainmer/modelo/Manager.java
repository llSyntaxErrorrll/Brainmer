package team.developers.brainmer.modelo;

import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Manager {

    //declaracion de variables
    private FirebaseDatabase db;
    private DatabaseReference dbRefe;

    public Manager(Context context){
        //esto es para la db
        FirebaseApp.initializeApp(context);
        db = FirebaseDatabase.getInstance();
        dbRefe = db.getReference();
    }

}
