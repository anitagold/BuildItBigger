package hu.bubbanet.displayjokelibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    static private String NEW_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView textView = findViewById(R.id.tv_joke_display);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        textView.setText(joke);
    }

    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, DisplayJokeActivity.class);
        intent.putExtra(NEW_JOKE, joke);
        return intent;
    }
}
