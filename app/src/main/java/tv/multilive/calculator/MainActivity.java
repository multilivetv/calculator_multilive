package tv.multilive.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button sum;
    private Button plus;
    private Button min;
    private Button sep;
    private Button div;
    private Button x;
    private Button per;
    private Button pm;
    private Button ac;
    private Button log;
    private Button xmn;
    private Button sqrt;
    private Button x2;
    private Button x3;
    private TextView result;
    float val1, val2;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, mPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("");
                } else {
                    val1 = Float.parseFloat(result.getText() + "");
                    crunchifyAddition = true;
                    result.setText(null);
                }
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                mSubtract = true;
                result.setText(null);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                crunchifyMultiplication = true;
                result.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                crunchifyDivision = true;
                result.setText(null);
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                result.setText((val1 / 100) + "");
            }
        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //val1 = Float.parseFloat(result.getText() + "");
                if (result.length() != 0) {
                    String s = result.getText().toString();
                    char arr[] = s.toCharArray();
                    if (arr[0] == '-')
                        result.setText(s.substring(1, s.length()));
                    else
                        result.setText("-" + s);
                }
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(result.getText() + "");

                if (crunchifyAddition == true) {
                    result.setText(val1 + val2 + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    result.setText(val1 - val2 + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    result.setText(val1 * val2 + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    result.setText(val1 / val2 + "");
                    crunchifyDivision = false;
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

        sep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double val = 1;
                val = Double.parseDouble(result.getText() + "");
                result.setText(Math.log10(val) + "");
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                result.setText(Math.sqrt(val1) + "");
            }
        });

        xmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                int iloczyn = 1;
                for (int i=1; i<=val1; i++) {
                    iloczyn *= i;
                }
                result.setText(iloczyn + "");
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                result.setText(Math.pow(val1, 2) + "");
            }
        });

        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(result.getText() + "");
                result.setText(Math.pow(val1, 3) + "");
            }
        });
    }

    private void setupUIViews(){
        zero = (Button)findViewById(R.id.zeroButton);
        one = (Button)findViewById(R.id.oneButton);
        two = (Button)findViewById(R.id.twoButton);
        three = (Button)findViewById(R.id.threeButton);
        four = (Button)findViewById(R.id.fourButton);
        five = (Button)findViewById(R.id.fiveButton);
        six = (Button)findViewById(R.id.sixButton);
        seven = (Button)findViewById(R.id.sevenButton);
        eight = (Button)findViewById(R.id.eightButton);
        nine = (Button)findViewById(R.id.nineButton);
        sum = (Button)findViewById(R.id.sumButton);
        plus = (Button)findViewById(R.id.pluButton);
        min = (Button)findViewById(R.id.minButton);
        sep = (Button)findViewById(R.id.sepButton);
        div = (Button)findViewById(R.id.divButton);
        x = (Button)findViewById(R.id.xButton);
        per = (Button)findViewById(R.id.perButton);
        pm = (Button)findViewById(R.id.pmButton);
        ac = (Button)findViewById(R.id.acButton);
        log = (Button)findViewById(R.id.logButton);
        xmn = (Button)findViewById(R.id.xmnButton);
        sqrt = (Button)findViewById(R.id.sqrtButton);
        x3 = (Button)findViewById(R.id.x3Button);
        x2 = (Button)findViewById(R.id.x2Button);
        result = (TextView)findViewById(R.id.result);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("result", result.getText() + "");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result.setText(savedInstanceState.getString("result", "0") + "");
    }
}
