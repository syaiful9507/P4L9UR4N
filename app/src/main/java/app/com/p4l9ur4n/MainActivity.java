package app.com.p4l9ur4n;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

import app.com.p4l9ur4n.view.View1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BoomMenuButton bmb1 = (BoomMenuButton) findViewById(R.id.bmb1);
        String[] tittle2 = new String[] {"SURAH", "JUZ", "PENANDA", "WAKTU SHOLAT", "TERAKHIR DIBACA", "TRANSLATE", "SETTINGS", "PERSEMBAHAN", "PENGGAGAS"};

        int[] image = new int[] {R.drawable.hadist, R.drawable.juz, R.drawable.bookmark, R.drawable.pray_times, R.drawable.last_read, R.drawable.translate, R.drawable.settings, R.drawable.persembahan, R.drawable.penggagas};
        for (int i = 0; i < bmb1.getPiecePlaceEnum().pieceNumber(); i++) {
            TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                    .normalImageDrawable(getResources().getDrawable(image[i]))
                    .normalText(tittle2[i])
                    //.subNormalText(sub[i])
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            // When the boom-button corresponding this builder is clicked.
                            switch (index){
                                case 0:
                                    Intent intentA = new Intent(MainActivity.this, View1.class);
                                    startActivity(intentA);
                            }
                        }
                    });
            bmb1.addBuilder(builder);
        }


        BoomMenuButton bmb2 = (BoomMenuButton) findViewById(R.id.bmb2);




        for (int i = 0; i < bmb2.getPiecePlaceEnum().pieceNumber(); i++) {
            TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
                    .normalImageDrawable(getResources().getDrawable(image[i]))
                    .normalText(tittle2[i])
                    //.subNormalText(sub[i])
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            // When the boom-button corresponding this builder is clicked.
                            Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();
                            switch (index){
                                case 0:
                                    Intent intentA = new Intent(MainActivity.this, View1.class);
                                    startActivity(intentA);
                            }
                        }
                    });
            bmb2.addBuilder(builder);
        }
    }
}
