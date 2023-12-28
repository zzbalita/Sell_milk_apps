package phcom.phlynk.sell_milk.authorization.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import phcom.phlynk.sell_milk.R;
import phcom.phlynk.sell_milk.authorization.data.model.User;
import phcom.phlynk.sell_milk.databinding.ActivitySignInBinding;
import phcom.phlynk.sell_milk.home.ui.HomeActivity;

public class SignInActivity extends AppCompatActivity {
    private ActivitySignInBinding binding;
    private static final String TAG = "SignInActivity";

    public static final ArrayList<User> fakeUsers() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(132, "hieu", "108 doi can"));
        return list;
    }
    @Override
    public void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_sign_in);
        fakeUsers();
        Button btnSend = (Button) findViewById(R.id.btn_send_phone);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }





}
