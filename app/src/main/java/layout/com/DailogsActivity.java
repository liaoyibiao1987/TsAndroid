package layout.com;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ppl.ppl.R;

public class DailogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailogs);


    }

    private  void  showProcessDadilog() {
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.show();
        Toast.makeText(this, "测试信息", Toast.LENGTH_SHORT).show();
    }
}