package autosizingtextviews.patel.priyank.autosizingtextviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mGranularity, mPresetSizes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGranularity = (Button) findViewById(R.id.button_granularity);
        mGranularity.setOnClickListener(this);
        mPresetSizes = (Button) findViewById(R.id.button_preset_size);
        mPresetSizes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button_granularity:
                Intent granularityIntent = new Intent(MainActivity.this, GranularityActivity.class);
                startActivity(granularityIntent);
            break;

            case R.id.button_preset_size:
                Intent presetSizesIntent = new Intent(MainActivity.this, PresetSizesActivity.class);
                startActivity(presetSizesIntent);
            break;

        }
    }
}
