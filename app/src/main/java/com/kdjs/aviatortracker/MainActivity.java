
package com.kdjs.aviatortracker;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView statusText;
    private TextView resultsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setPadding(24, 40, 24, 24);
        layout.setBackgroundColor(Color.rgb(18, 22, 32));

        TextView title = new TextView(this);
        title.setText("AVIATOR TRACKER");
        title.setTextColor(Color.WHITE);
        title.setTextSize(26);
        title.setGravity(Gravity.CENTER);
        layout.addView(title, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 100));

        statusText = new TextView(this);
        statusText.setText("Monitoring is stopped");
        statusText.setTextColor(Color.LTGRAY);
        statusText.setTextSize(16);
        statusText.setGravity(Gravity.CENTER);
        layout.addView(statusText, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 80));

        Button startButton = new Button(this);
        startButton.setText("Start monitoring");
        layout.addView(startButton);

        Button stopButton = new Button(this);
        stopButton.setText("Stop monitoring");
        layout.addView(stopButton);

        resultsText = new TextView(this);
        resultsText.setTextColor(Color.WHITE);
        resultsText.setTextSize(16);
        resultsText.setPadding(0, 30, 0, 0);
        resultsText.setText("Recorded results: 0\n\n"
                + "No results recorded yet.");
        layout.addView(resultsText);

        startButton.setOnClickListener(v ->
                statusText.setText(
                        "Ready - screen capture not implemented yet"));

        stopButton.setOnClickListener(v ->
                statusText.setText("Monitoring is stopped"));

        setContentView(layout);
    }
}
