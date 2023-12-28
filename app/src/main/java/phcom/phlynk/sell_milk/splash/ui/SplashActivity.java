package phcom.phlynk.sell_milk.splash.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import phcom.phlynk.sell_milk.R;
import phcom.phlynk.sell_milk.authorization.ui.SignInActivity;

public class SplashActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle saveInstantState) {

        super.onCreate(saveInstantState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();

    }


}

