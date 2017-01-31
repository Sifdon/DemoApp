package rathore.gajendra.demoapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText txtEmailAddress;
    EditText txtPassword;
    FirebaseAuth firebaseAuth;
    Button btnLogin;
    TextView txLink;
    Integer a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmailAddress = (EditText)findViewById(R.id.login_email);
        txtPassword = (EditText)findViewById(R.id.login_password);
        firebaseAuth= FirebaseAuth.getInstance();
        btnLogin=(Button)findViewById(R.id.btn_login);
        txLink=(TextView)findViewById(R.id.link_signup);

        txLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer ch=0;
                if (txtEmailAddress.getText().toString().trim().length() == 0){
                    ch=1;
                    Toast.makeText(Login.this,"Please enter your email", Toast.LENGTH_LONG).show();

                }
                if (txtPassword.getText().toString().trim().length() == 0){
                    ch=1;
                    Toast.makeText(Login.this,"Please enter your password", Toast.LENGTH_LONG).show();

                }
                if(ch==0) {
                    final ProgressDialog progressDialog = ProgressDialog.show(Login.this, "Please wait ...", "Processing...", true);
                    (firebaseAuth.signInWithEmailAndPassword(txtEmailAddress.getText().toString(), txtPassword.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();

                            if (task.isSuccessful()) {

                                Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Login.this, Home.class);
                                //intent.putExtra("uId",firebaseAuth.getCurrentUser().getUid());
                                startActivity(intent);

                            } else {
                                Log.e("ERROR", task.getException().toString());
                                Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

    }
}
