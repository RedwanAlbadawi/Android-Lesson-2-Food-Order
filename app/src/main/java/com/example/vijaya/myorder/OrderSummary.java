package com.example.vijaya.myorder;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class OrderSummary extends AppCompatActivity {

    // textview to show order summary

    TextView orderSummaryTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);


        // receive the order summary information through the intent

        String orderSummaryMessage = getIntent().getStringExtra("orderSummaryMessage");

        orderSummaryTextView = findViewById(R.id.orderSummaryMessage);

        // set the summary to the textview which is being recieved by the intent.
        orderSummaryTextView.setText(orderSummaryMessage);


        // finish the current activity on back to order button.
        findViewById(R.id.backToOrderButton).
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
    }
}
