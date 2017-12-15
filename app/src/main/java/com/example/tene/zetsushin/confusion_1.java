package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class confusion_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confusion_1);

        int a1=0;int a2=0;
        int b1=0;int b2=0;
        int c1=0,c2=0;
        int d1=0,d2=0;
        int e1=0,e2=0;
        int f1=0,f2=0;
        int g1=0,g2=0;
        int h1=0,h2=0;
        int i1=0,i2=0;
        int j1=0,j2=0;
        int k1=0,k2=0;
        int l1=0,l2=0;
        int m1=0,m2=0;
        int n1=0,n2=0;
        int o1=0,o2=0;
        int p1=0,p2=0;
        int q1=0,q2=0;
        int r1=0,r2=0;
        int s1=0,s2=0;
        int t1=0,t2=0;


        Intent intent_test = getIntent();
        Intent intent = getIntent();




        int q1_a = intent.getIntExtra("q1_answer", 0);

        int q1_1_rb_id = intent.getIntExtra("q1_1_setId", 0);
        int q1_2_rb_id = intent.getIntExtra("q1_2_setId", 0);
        int q1_3_rb_id = intent.getIntExtra("q1_3_setId", 0);
        int q1_4_rb_id = intent.getIntExtra("q1_4_setId", 0);
        int q1_5_rb_id = intent.getIntExtra("q1_5_setId", 0);

        int q2_a = intent.getIntExtra("q2_answer", 0);
        int q2_rb1_id = intent.getIntExtra("q2_rb1_setId", 0);
        int q2_rb2_id = intent.getIntExtra("q2_rb2_setId", 0);
        int q2_rb3_id = intent.getIntExtra("q2_rb3_setId", 0);
        int q2_rb4_id = intent.getIntExtra("q2_rb4_setId", 0);
        int q2_rb5_id = intent.getIntExtra("q2_rb5_setId", 0);

        int q3_a = intent.getIntExtra("q3_answer", 0);
        int q3_rb1_id = intent.getIntExtra("q3_rb1_setId", 0);
        int q3_rb2_id = intent.getIntExtra("q3_rb2_setId", 0);
        int q3_rb3_id = intent.getIntExtra("q3_rb3_setId", 0);
        int q3_rb4_id = intent.getIntExtra("q3_rb4_setId", 0);
        int q3_rb5_id = intent.getIntExtra("q3_rb5_setId", 0);

        int q4_a = intent.getIntExtra("q4_answer", 0);
        int q4_rb1_id = intent.getIntExtra("q4_rb1_setId", 0);
        int q4_rb2_id = intent.getIntExtra("q4_rb2_setId", 0);
        int q4_rb3_id = intent.getIntExtra("q4_rb3_setId", 0);
        int q4_rb4_id = intent.getIntExtra("q4_rb4_setId", 0);
        int q4_rb5_id = intent.getIntExtra("q4_rb5_setId", 0);

        int q5_a = intent.getIntExtra("q5_answer", 0);
        int q5_rb1_id = intent.getIntExtra("q5_rb1_setId", 0);
        int q5_rb2_id = intent.getIntExtra("q5_rb2_setId", 0);
        int q5_rb3_id = intent.getIntExtra("q5_rb3_setId", 0);
        int q5_rb4_id = intent.getIntExtra("q5_rb4_setId", 0);
        int q5_rb5_id = intent.getIntExtra("q5_rb5_setId", 0);

        int q6_a = intent.getIntExtra("q6_answer", 0);
        int q6_rb1_id = intent.getIntExtra("q6_rb1_setId", 0);
        int q6_rb2_id = intent.getIntExtra("q6_rb2_setId", 0);
        int q6_rb3_id = intent.getIntExtra("q6_rb3_setId", 0);
        int q6_rb4_id = intent.getIntExtra("q6_rb4_setId", 0);
        int q6_rb5_id = intent.getIntExtra("q6_rb5_setId", 0);

        int q7_a = intent.getIntExtra("q7_answer", 0);
        int q7_rb1_id = intent.getIntExtra("q7_rb1_setId", 0);
        int q7_rb2_id = intent.getIntExtra("q7_rb2_setId", 0);
        int q7_rb3_id = intent.getIntExtra("q7_rb3_setId", 0);
        int q7_rb4_id = intent.getIntExtra("q7_rb4_setId", 0);
        int q7_rb5_id = intent.getIntExtra("q7_rb5_setId", 0);

        int q8_a = intent.getIntExtra("q8_answer", 0);
        int q8_rb1_id = intent.getIntExtra("q8_rb1_setId", 0);
        int q8_rb2_id = intent.getIntExtra("q8_rb2_setId", 0);
        int q8_rb3_id = intent.getIntExtra("q8_rb3_setId", 0);
        int q8_rb4_id = intent.getIntExtra("q8_rb4_setId", 0);
        int q8_rb5_id = intent.getIntExtra("q8_rb5_setId", 0);

        int q9_a = intent.getIntExtra("q9_answer", 0);
        int q9_rb1_id = intent.getIntExtra("q9_rb1_setId", 0);
        int q9_rb2_id = intent.getIntExtra("q9_rb2_setId", 0);
        int q9_rb3_id = intent.getIntExtra("q9_rb3_setId", 0);
        int q9_rb4_id = intent.getIntExtra("q9_rb4_setId", 0);
        int q9_rb5_id = intent.getIntExtra("q9_rb5_setId", 0);

        int q10_a = intent.getIntExtra("q10_answer", 0);
        int q10_rb1_id = intent.getIntExtra("q10_rb1_setId", 0);
        int q10_rb2_id = intent.getIntExtra("q10_rb2_setId", 0);
        int q10_rb3_id = intent.getIntExtra("q10_rb3_setId", 0);
        int q10_rb4_id = intent.getIntExtra("q10_rb4_setId", 0);
        int q10_rb5_id = intent.getIntExtra("q10_rb5_setId", 0);

        int q11_a = intent.getIntExtra("q11_answer", 0);
        int q11_rb1_id = intent.getIntExtra("q11_rb1_setId", 0);
        int q11_rb2_id = intent.getIntExtra("q11_rb2_setId", 0);
        int q11_rb3_id = intent.getIntExtra("q11_rb3_setId", 0);
        int q11_rb4_id = intent.getIntExtra("q11_rb4_setId", 0);
        int q11_rb5_id = intent.getIntExtra("q11_rb5_setId", 0);


        int q12_a = intent.getIntExtra("q12_answer", 0);
        int q12_rb1_id = intent.getIntExtra("q12_rb1_setId", 0);
        int q12_rb2_id = intent.getIntExtra("q12_rb2_setId", 0);
        int q12_rb3_id = intent.getIntExtra("q12_rb3_setId", 0);
        int q12_rb4_id = intent.getIntExtra("q12_rb4_setId", 0);
        int q12_rb5_id = intent.getIntExtra("q12_rb5_setId", 0);

        int q13_a = intent.getIntExtra("q13_answer", 0);
        int q13_rb1_id = intent.getIntExtra("q13_rb1_setId", 0);
        int q13_rb2_id = intent.getIntExtra("q13_rb2_setId", 0);
        int q13_rb3_id = intent.getIntExtra("q13_rb3_setId", 0);
        int q13_rb4_id = intent.getIntExtra("q13_rb4_setId", 0);
        int q13_rb5_id = intent.getIntExtra("q13_rb5_setId", 0);

        int q14_a = intent.getIntExtra("q14_answer", 0);
        int q14_rb1_id = intent.getIntExtra("q14_rb1_setId", 0);
        int q14_rb2_id = intent.getIntExtra("q14_rb2_setId", 0);
        int q14_rb3_id = intent.getIntExtra("q14_rb3_setId", 0);
        int q14_rb4_id = intent.getIntExtra("q14_rb4_setId", 0);
        int q14_rb5_id = intent.getIntExtra("q14_rb5_setId", 0);


        int q15_a = intent.getIntExtra("q15_answer", 0);
        int q15_rb1_id = intent.getIntExtra("q15_rb1_setId", 0);
        int q15_rb2_id = intent.getIntExtra("q15_rb2_setId", 0);
        int q15_rb3_id = intent.getIntExtra("q15_rb3_setId", 0);
        int q15_rb4_id = intent.getIntExtra("q15_rb4_setId", 0);
        int q15_rb5_id = intent.getIntExtra("q15_rb5_setId", 0);

        int q16_a = intent.getIntExtra("q16_answer", 0);
        int q16_rb1_id = intent.getIntExtra("q16_rb1_setId", 0);
        int q16_rb2_id = intent.getIntExtra("q16_rb2_setId", 0);
        int q16_rb3_id = intent.getIntExtra("q16_rb3_setId", 0);
        int q16_rb4_id = intent.getIntExtra("q16_rb4_setId", 0);
        int q16_rb5_id = intent.getIntExtra("q16_rb5_setId", 0);

        int q17_a = intent.getIntExtra("q17_answer", 0);
        int q17_rb1_id = intent.getIntExtra("q17_rb1_setId", 0);
        int q17_rb2_id = intent.getIntExtra("q17_rb2_setId", 0);
        int q17_rb3_id = intent.getIntExtra("q17_rb3_setId", 0);
        int q17_rb4_id = intent.getIntExtra("q17_rb4_setId", 0);
        int q17_rb5_id = intent.getIntExtra("q17_rb5_setId", 0);

        int q18_a = intent.getIntExtra("q18_answer", 0);
        int q18_rb1_id = intent.getIntExtra("q18_rb1_setId", 0);
        int q18_rb2_id = intent.getIntExtra("q18_rb2_setId", 0);
        int q18_rb3_id = intent.getIntExtra("q18_rb3_setId", 0);
        int q18_rb4_id = intent.getIntExtra("q18_rb4_setId", 0);
        int q18_rb5_id = intent.getIntExtra("q18_rb5_setId", 0);

        int q19_a = intent.getIntExtra("q19_answer", 0);
        int q19_rb1_id = intent.getIntExtra("q19_rb1_setId", 0);
        int q19_rb2_id = intent.getIntExtra("q19_rb2_setId", 0);
        int q19_rb3_id = intent.getIntExtra("q19_rb3_setId", 0);
        int q19_rb4_id = intent.getIntExtra("q19_rb4_setId", 0);
        int q19_rb5_id = intent.getIntExtra("q19_rb5_setId", 0);


        int q20_a = intent.getIntExtra("q20_answer", 0);
        int q20_rb1_id = intent.getIntExtra("q20_rb1_setId", 0);
        int q20_rb2_id = intent.getIntExtra("q20_rb2_setId", 0);
        int q20_rb3_id = intent.getIntExtra("q20_rb3_setId", 0);
        int q20_rb4_id = intent.getIntExtra("q20_rb4_setId", 0);
        int q20_rb5_id = intent.getIntExtra("q20_rb5_setId", 0);

/**/


        int q1_ar = intent.getIntExtra("q1_answer_r", 0);

        int q1_1_rb_idr = intent.getIntExtra("q1_1_setId_r", 0);
        int q1_2_rb_idr = intent.getIntExtra("q1_2_setId_r", 0);
        int q1_3_rb_idr = intent.getIntExtra("q1_3_setId_r", 0);
        int q1_4_rb_idr = intent.getIntExtra("q1_4_setId_r", 0);
        int q1_5_rb_idr = intent.getIntExtra("q1_5_setId_r", 0);

        int q2_ar = intent.getIntExtra("q2_answer_r", 0);
        int q2_rb1_idr = intent.getIntExtra("q2_rb1_setId_r", 0);
        int q2_rb2_idr = intent.getIntExtra("q2_rb2_setId_r", 0);
        int q2_rb3_idr = intent.getIntExtra("q2_rb3_setId_r", 0);
        int q2_rb4_idr = intent.getIntExtra("q2_rb4_setId_r", 0);
        int q2_rb5_idr = intent.getIntExtra("q2_rb5_setId_r", 0);

        int q3_ar = intent.getIntExtra("q3_answer_r", 0);
        int q3_rb1_idr = intent.getIntExtra("q3_rb1_setId_r", 0);
        int q3_rb2_idr = intent.getIntExtra("q3_rb2_setId_r", 0);
        int q3_rb3_idr = intent.getIntExtra("q3_rb3_setId_r", 0);
        int q3_rb4_idr = intent.getIntExtra("q3_rb4_setId_r", 0);
        int q3_rb5_idr = intent.getIntExtra("q3_rb5_setId_r", 0);

        int q4_ar = intent.getIntExtra("q4_answer_r", 0);
        int q4_rb1_idr = intent.getIntExtra("q4_rb1_setId_r", 0);
        int q4_rb2_idr = intent.getIntExtra("q4_rb2_setId_r", 0);
        int q4_rb3_idr = intent.getIntExtra("q4_rb3_setId_r", 0);
        int q4_rb4_idr = intent.getIntExtra("q4_rb4_setId_r", 0);
        int q4_rb5_idr = intent.getIntExtra("q4_rb5_setId_r", 0);

        int q5_ar = intent.getIntExtra("q5_answer_r", 0);
        int q5_rb1_idr = intent.getIntExtra("q5_rb1_setId_r", 0);
        int q5_rb2_idr = intent.getIntExtra("q5_rb2_setId_r", 0);
        int q5_rb3_idr = intent.getIntExtra("q5_rb3_setId_r", 0);
        int q5_rb4_idr = intent.getIntExtra("q5_rb4_setId_r", 0);
        int q5_rb5_idr = intent.getIntExtra("q5_rb5_setId_r", 0);

        int q6_ar = intent.getIntExtra("q6_answer_r", 0);
        int q6_rb1_idr = intent.getIntExtra("q6_rb1_setId_r", 0);
        int q6_rb2_idr = intent.getIntExtra("q6_rb2_setId_r", 0);
        int q6_rb3_idr = intent.getIntExtra("q6_rb3_setId_r", 0);
        int q6_rb4_idr = intent.getIntExtra("q6_rb4_setId_r", 0);
        int q6_rb5_idr = intent.getIntExtra("q6_rb5_setId_r", 0);

        int q7_ar = intent.getIntExtra("q7_answer_r", 0);
        int q7_rb1_idr = intent.getIntExtra("q7_rb1_setId_r", 0);
        int q7_rb2_idr = intent.getIntExtra("q7_rb2_setId_r", 0);
        int q7_rb3_idr = intent.getIntExtra("q7_rb3_setId_r", 0);
        int q7_rb4_idr = intent.getIntExtra("q7_rb4_setId_r", 0);
        int q7_rb5_idr = intent.getIntExtra("q7_rb5_setId_r", 0);

        int q8_ar = intent.getIntExtra("q8_answer_r", 0);
        int q8_rb1_idr = intent.getIntExtra("q8_rb1_setId_r", 0);
        int q8_rb2_idr = intent.getIntExtra("q8_rb2_setId_r", 0);
        int q8_rb3_idr = intent.getIntExtra("q8_rb3_setId_r", 0);
        int q8_rb4_idr = intent.getIntExtra("q8_rb4_setId_r", 0);
        int q8_rb5_idr = intent.getIntExtra("q8_rb5_setId_r", 0);

        int q9_ar = intent.getIntExtra("q9_answer_r", 0);
        int q9_rb1_idr = intent.getIntExtra("q9_rb1_setId_r", 0);
        int q9_rb2_idr = intent.getIntExtra("q9_rb2_setId_r", 0);
        int q9_rb3_idr = intent.getIntExtra("q9_rb3_setId_r", 0);
        int q9_rb4_idr = intent.getIntExtra("q9_rb4_setId_r", 0);
        int q9_rb5_idr = intent.getIntExtra("q9_rb5_setId_r", 0);

        int q10_ar = intent.getIntExtra("q10_answer_r", 0);
        int q10_rb1_idr = intent.getIntExtra("q10_rb1_setId_r", 0);
        int q10_rb2_idr = intent.getIntExtra("q10_rb2_setId_r", 0);
        int q10_rb3_idr = intent.getIntExtra("q10_rb3_setId_r", 0);
        int q10_rb4_idr = intent.getIntExtra("q10_rb4_setId_r", 0);
        int q10_rb5_idr = intent.getIntExtra("q10_rb5_setId_r", 0);

        int q11_ar = intent.getIntExtra("q11_answer_r", 0);
        int q11_rb1_idr = intent.getIntExtra("q11_rb1_setId_r", 0);
        int q11_rb2_idr = intent.getIntExtra("q11_rb2_setId_r", 0);
        int q11_rb3_idr = intent.getIntExtra("q11_rb3_setId_r", 0);
        int q11_rb4_idr = intent.getIntExtra("q11_rb4_setId_r", 0);
        int q11_rb5_idr = intent.getIntExtra("q11_rb5_setId_r", 0);


        int q12_ar = intent.getIntExtra("q12_answer_r", 0);
        int q12_rb1_idr = intent.getIntExtra("q12_rb1_setId_r", 0);
        int q12_rb2_idr = intent.getIntExtra("q12_rb2_setId_r", 0);
        int q12_rb3_idr = intent.getIntExtra("q12_rb3_setId_r", 0);
        int q12_rb4_idr = intent.getIntExtra("q12_rb4_setId_r", 0);
        int q12_rb5_idr = intent.getIntExtra("q12_rb5_setId_r", 0);

        int q13_ar = intent.getIntExtra("q13_answer_r", 0);
        int q13_rb1_idr = intent.getIntExtra("q13_rb1_setId_r", 0);
        int q13_rb2_idr = intent.getIntExtra("q13_rb2_setId_r", 0);
        int q13_rb3_idr = intent.getIntExtra("q13_rb3_setId_r", 0);
        int q13_rb4_idr = intent.getIntExtra("q13_rb4_setId_r", 0);
        int q13_rb5_idr = intent.getIntExtra("q13_rb5_setId_r", 0);

        int q14_ar = intent.getIntExtra("q14_answer_r", 0);
        int q14_rb1_idr = intent.getIntExtra("q14_rb1_setId_r", 0);
        int q14_rb2_idr = intent.getIntExtra("q14_rb2_setId_r", 0);
        int q14_rb3_idr = intent.getIntExtra("q14_rb3_setId_r", 0);
        int q14_rb4_idr = intent.getIntExtra("q14_rb4_setId_r", 0);
        int q14_rb5_idr = intent.getIntExtra("q14_rb5_setId_r", 0);


        int q15_ar = intent.getIntExtra("q15_answer_r", 0);
        int q15_rb1_idr = intent.getIntExtra("q15_rb1_setId_r", 0);
        int q15_rb2_idr = intent.getIntExtra("q15_rb2_setId_r", 0);
        int q15_rb3_idr = intent.getIntExtra("q15_rb3_setId_r", 0);
        int q15_rb4_idr = intent.getIntExtra("q15_rb4_setId_r", 0);
        int q15_rb5_idr = intent.getIntExtra("q15_rb5_setId_r", 0);

        int q16_ar = intent.getIntExtra("q16_answer_r", 0);
        int q16_rb1_idr = intent.getIntExtra("q16_rb1_setId_r", 0);
        int q16_rb2_idr = intent.getIntExtra("q16_rb2_setId_r", 0);
        int q16_rb3_idr = intent.getIntExtra("q16_rb3_setId_r", 0);
        int q16_rb4_idr = intent.getIntExtra("q16_rb4_setId_r", 0);
        int q16_rb5_idr = intent.getIntExtra("q16_rb5_setId_r", 0);

        int q17_ar = intent.getIntExtra("q17_answer_r", 0);
        int q17_rb1_idr = intent.getIntExtra("q17_rb1_setId_r", 0);
        int q17_rb2_idr = intent.getIntExtra("q17_rb2_setId_r", 0);
        int q17_rb3_idr = intent.getIntExtra("q17_rb3_setId_r", 0);
        int q17_rb4_idr = intent.getIntExtra("q17_rb4_setId_r", 0);
        int q17_rb5_idr = intent.getIntExtra("q17_rb5_setId_r", 0);

        int q18_ar = intent.getIntExtra("q18_answer_r", 0);
        int q18_rb1_idr = intent.getIntExtra("q18_rb1_setId_r", 0);
        int q18_rb2_idr = intent.getIntExtra("q18_rb2_setId_r", 0);
        int q18_rb3_idr = intent.getIntExtra("q18_rb3_setId_r", 0);
        int q18_rb4_idr = intent.getIntExtra("q18_rb4_setId_r", 0);
        int q18_rb5_idr = intent.getIntExtra("q18_rb5_setId_r", 0);

        int q19_ar = intent.getIntExtra("q19_answer_r", 0);
        int q19_rb1_idr = intent.getIntExtra("q19_rb1_setId_r", 0);
        int q19_rb2_idr = intent.getIntExtra("q19_rb2_setId_r", 0);
        int q19_rb3_idr = intent.getIntExtra("q19_rb3_setId_r", 0);
        int q19_rb4_idr = intent.getIntExtra("q19_rb4_setId_r", 0);
        int q19_rb5_idr = intent.getIntExtra("q19_rb5_setId_r", 0);


        int q20_ar = intent.getIntExtra("q20_answer_r", 0);
        int q20_rb1_idr = intent.getIntExtra("q20_rb1_setId_r", 0);
        int q20_rb2_idr = intent.getIntExtra("q20_rb2_setId_r", 0);
        int q20_rb3_idr = intent.getIntExtra("q20_rb3_setId_r", 0);
        int q20_rb4_idr = intent.getIntExtra("q20_rb4_setId_r", 0);
        int q20_rb5_idr = intent.getIntExtra("q20_rb5_setId_r", 0);


        if (q1_a == q1_1_rb_id) {
            TextView kai11 = (TextView) findViewById(R.id.kai11);
            kai11.setText("紅舌");
            a1 = 1;
        }else if (q1_a == q1_2_rb_id) {
            TextView kai11 = (TextView) findViewById(R.id.kai11);
            kai11.setText("紫斑舌");
            a1 = 2;
        }else if (q1_a == q1_3_rb_id) {
            TextView kai11 = (TextView) findViewById(R.id.kai11);
            kai11.setText("舌尖紅");
            a1 = 3;
        }else if (q1_a == q1_4_rb_id) {
            TextView kai11 = (TextView) findViewById(R.id.kai11);
            kai11.setText("淡紅");
            a1=4;
        }else if (q1_a == q1_5_rb_id) {
            TextView kai11 = (TextView) findViewById(R.id.kai11);
            kai11.setText("淡白");
            a1=5;
        }
        if (q2_a == q2_rb1_id) {
            TextView kai21 = (TextView) findViewById(R.id.kai21);
            kai21.setText("淡紅");
            b1=4;
        }else if (q2_a == q2_rb2_id) {
            TextView kai21 = (TextView) findViewById(R.id.kai21);
            kai21.setText("舌尖紅");
            b1=3;
        }else if (q2_a == q2_rb3_id) {
            TextView kai21 = (TextView) findViewById(R.id.kai21);
            kai21.setText("紫斑舌");
            b1=2;
        }else if (q2_a == q2_rb4_id) {
            TextView kai21 = (TextView) findViewById(R.id.kai21);
            kai21.setText("淡白");
            b1=5;
        }else if (q2_a == q2_rb5_id) {
            TextView kai21 = (TextView) findViewById(R.id.kai21);
            kai21.setText("紅舌");
            b1=1;
        }
        if (q3_a == q3_rb1_id) {
            TextView kai31 = (TextView) findViewById(R.id.kai31);
            kai31.setText("淡白");
            c1=5;
        }else if (q3_a == q3_rb2_id) {
            TextView kai31 = (TextView) findViewById(R.id.kai31);
            kai31.setText("紅舌");
            c1=1;
        }else if (q3_a == q3_rb3_id) {
            TextView kai31 = (TextView) findViewById(R.id.kai31);
            kai31.setText("淡紅");
            c1=4;
        }else if (q3_a == q3_rb4_id) {
            TextView kai31 = (TextView) findViewById(R.id.kai31);
            kai31.setText("紫斑舌");
            c1=2;
        }else if (q3_a == q3_rb5_id) {
            TextView kai31 = (TextView) findViewById(R.id.kai31);
            kai31.setText("舌尖紅");
            c1=3;
        }if (q4_a == q4_rb1_id) {
            TextView kai41 = (TextView) findViewById(R.id.kai41);
            kai41.setText("紅舌");
            d1=1;
        }else if (q4_a == q4_rb2_id) {
            TextView kai41 = (TextView) findViewById(R.id.kai41);
            kai41.setText("紫斑舌");
            d1=2;
        }else if (q4_a == q4_rb3_id) {
            TextView kai41 = (TextView) findViewById(R.id.kai41);
            kai41.setText("淡紅");
            d1=4;
        }else if (q4_a == q4_rb4_id) {
            TextView kai41 = (TextView) findViewById(R.id.kai41);
            kai41.setText("舌尖紅");
            d1=3;
        }else if (q4_a == q4_rb5_id) {
            TextView kai41 = (TextView) findViewById(R.id.kai41);
            kai41.setText("淡白");
            d1=5;
        }
        if (q5_a == q5_rb1_id) {
            TextView kai51 = (TextView) findViewById(R.id.kai51);
            kai51.setText("紫斑舌");
            e1=2;
        }else if (q5_a == q5_rb2_id) {
            TextView kai51 = (TextView) findViewById(R.id.kai51);
            kai51.setText("舌尖舌");
            e1=3;
        }else if (q5_a == q5_rb3_id) {
            TextView kai51 = (TextView) findViewById(R.id.kai51);
            kai51.setText("紅舌");
            e1=1;
        }else if (q5_a == q5_rb4_id) {
            TextView kai51 = (TextView) findViewById(R.id.kai51);
            kai51.setText("淡紅");
            e1=4;
        }else if (q5_a == q5_rb5_id) {
            TextView kai51 = (TextView) findViewById(R.id.kai51);
            kai51.setText("淡白");
            e1=5;
        }
        if (q6_a == q6_rb1_id) {
            TextView kai61 = (TextView) findViewById(R.id.kai61);
            kai61.setText("淡白");
            f1=5;
        }else if (q6_a == q6_rb2_id) {
            TextView kai61 = (TextView) findViewById(R.id.kai61);
            kai61.setText("淡紅");
            f1=4;
        }else if (q6_a == q6_rb3_id) {
            TextView kai61 = (TextView) findViewById(R.id.kai61);
            kai61.setText("紅舌");
            f1=1;
        }else if (q6_a == q6_rb4_id) {
            TextView kai61 = (TextView) findViewById(R.id.kai61);
            kai61.setText("紫斑舌");
            f1=2;
        }else if (q6_a == q6_rb5_id) {
            TextView kai61 = (TextView) findViewById(R.id.kai61);
            kai61.setText("舌尖紅");
            f1=3;
        }
        if (q7_a == q7_rb1_id) {
            TextView kai71 = (TextView) findViewById(R.id.kai71);
            kai71.setText("淡紅");
            g1=4;
        }else if (q7_a == q7_rb2_id) {
            TextView kai71 = (TextView) findViewById(R.id.kai71);
            kai71.setText("舌尖紅");
            g1=3;
        }else if (q7_a == q7_rb3_id) {
            TextView kai71 = (TextView) findViewById(R.id.kai71);
            kai71.setText("淡白");
            g1=5;
        }else if (q7_a == q7_rb4_id) {
            TextView kai71 = (TextView) findViewById(R.id.kai71);
            kai71.setText("紅舌");
            g1=1;
        }else if (q7_a == q7_rb5_id) {
            TextView kai71 = (TextView) findViewById(R.id.kai71);
            kai71.setText("紫斑舌");
            g1=2;
        }
        if (q8_a == q8_rb1_id) {
            TextView kai81 = (TextView) findViewById(R.id.kai81);
            kai81.setText("紅舌");
            h1=1;
        }else if (q8_a == q8_rb2_id) {
            TextView kai81 = (TextView) findViewById(R.id.kai81);
            kai81.setText("紫斑舌");
            h1=2;
        }else if (q8_a == q8_rb3_id) {
            TextView kai81 = (TextView) findViewById(R.id.kai81);
            kai81.setText("舌尖紅");
            h1=3;
        }else if (q8_a == q8_rb4_id) {
            TextView kai81 = (TextView) findViewById(R.id.kai81);
            kai81.setText("淡紅");
            h1=4;
        }else if (q8_a == q8_rb5_id) {
            TextView kai81 = (TextView) findViewById(R.id.kai81);
            kai81.setText("淡白");
            h1=5;
        }
        if (q9_a == q9_rb1_id) {
            TextView kai91 = (TextView) findViewById(R.id.kai91);
            kai91.setText("舌尖紅");
            i1=3;
        }else if (q9_a == q9_rb2_id) {
            TextView kai91 = (TextView) findViewById(R.id.kai91);
            kai91.setText("紫斑舌");
            i1=2;
        }else if (q9_a == q9_rb3_id) {
            TextView kai91 = (TextView) findViewById(R.id.kai91);
            kai91.setText("淡白");
            i1=5;
        }else if (q9_a == q9_rb4_id) {
            TextView kai91 = (TextView) findViewById(R.id.kai91);
            kai91.setText("紅舌");
            i1=1;
        }else if (q9_a == q9_rb5_id) {
            TextView kai91 = (TextView) findViewById(R.id.kai91);
            kai91.setText("淡紅");
            i1=4;
        }
        if (q10_a == q10_rb1_id) {
            TextView kai101 = (TextView) findViewById(R.id.kai101);
            kai101.setText("紅舌");
            j1=1;
        }else if (q10_a == q10_rb2_id) {
            TextView kai101 = (TextView) findViewById(R.id.kai101);
            kai101.setText("淡紅");
            j1=4;
        }else if (q10_a == q10_rb3_id) {
            TextView kai101 = (TextView) findViewById(R.id.kai101);
            kai101.setText("舌尖紅");
            j1=3;
        }else if (q10_a == q10_rb4_id) {
            TextView kai101 = (TextView) findViewById(R.id.kai101);
            kai101.setText("紫斑舌");
            j1=2;
        }else if (q10_a == q10_rb5_id) {
            TextView kai101 = (TextView) findViewById(R.id.kai101);
            kai101.setText("淡白");
            j1=5;
        }
        if (q11_a == q11_rb1_id) {
            TextView kai111 = (TextView) findViewById(R.id.kai111);
            kai111.setText("淡白");
            k1=5;
        }else if (q11_a == q11_rb2_id) {
            TextView kai111 = (TextView) findViewById(R.id.kai111);
            kai111.setText("紅舌");
            k1=1;
        }else if (q11_a == q11_rb3_id) {
            TextView kai111 = (TextView) findViewById(R.id.kai111);
            kai111.setText("舌尖紅");
            k1=3;
        }else if (q11_a == q11_rb4_id) {
            TextView kai111 = (TextView) findViewById(R.id.kai111);
            kai111.setText("紫斑舌");
            k1=2;
        }else if (q11_a == q11_rb5_id) {
            TextView kai111 = (TextView) findViewById(R.id.kai111);
            kai111.setText("淡紅");
            k1=4;
        }
        if (q12_a == q12_rb1_id) {
            TextView kai121 = (TextView) findViewById(R.id.kai121);
            kai121.setText("舌尖紅");
            l1=3;
        }
        if (q12_a == q12_rb2_id) {
            TextView kai121 = (TextView) findViewById(R.id.kai121);
            kai121.setText("紅舌");
            l1=1;
        }
        if (q12_a == q12_rb3_id) {
            TextView kai121 = (TextView) findViewById(R.id.kai121);
            kai121.setText("紫斑舌");
            l1=2;
        }
        if (q12_a == q12_rb4_id) {
            TextView kai121 = (TextView) findViewById(R.id.kai121);
            kai121.setText("淡白");
            l1=5;
        }
        if (q12_a == q12_rb5_id) {
            TextView kai121 = (TextView) findViewById(R.id.kai121);
            kai121.setText("淡紅");
            l1=4;
        }
        if (q13_a == q13_rb1_id) {
            TextView kai131 = (TextView) findViewById(R.id.kai131);
            kai131.setText("淡紅");
            m1=4;
        }
        if (q13_a == q13_rb2_id) {
            TextView kai131 = (TextView) findViewById(R.id.kai131);
            kai131.setText("紫斑舌");
            m1=2;
        }
        if (q13_a == q13_rb3_id) {
            TextView kai131 = (TextView) findViewById(R.id.kai131);
            kai131.setText("紅舌");
            m1=1;
        }
        if (q13_a == q13_rb4_id) {
            TextView kai131 = (TextView) findViewById(R.id.kai131);
            kai131.setText("淡白");
            m1=5;
        }
        if (q13_a == q13_rb5_id) {
            TextView kai131 = (TextView) findViewById(R.id.kai131);
            kai131.setText("舌尖紅");
            m1=3;
        }
        if (q14_a == q14_rb1_id) {
            TextView kai141 = (TextView) findViewById(R.id.kai141);
            kai141.setText("紅舌");
            n1=1;
        }
        if (q14_a == q14_rb2_id) {
            TextView kai141 = (TextView) findViewById(R.id.kai141);
            kai141.setText("淡白");
            n1=5;
        }
        if (q14_a == q1_3_rb_id) {
            TextView kai141 = (TextView) findViewById(R.id.kai141);
            kai141.setText("紫斑舌");
            n1=2;
        }
        if (q14_a == q14_rb4_id) {
            TextView kai141 = (TextView) findViewById(R.id.kai141);
            kai141.setText("舌尖紅");
            n1=3;
        }
        if (q14_a == q14_rb5_id) {
            TextView kai141 = (TextView) findViewById(R.id.kai141);
            kai141.setText("淡紅");
            n1=4;
        }
        if (q15_a == q15_rb1_id) {
            TextView kai151 = (TextView) findViewById(R.id.kai151);
            kai151.setText("舌尖紅");
            o1=3;
        }
        if (q15_a == q15_rb2_id) {
            TextView kai151 = (TextView) findViewById(R.id.kai151);
            kai151.setText("紅舌");
            o1=1;
        }
        if (q15_a == q15_rb3_id) {
            TextView kai151 = (TextView) findViewById(R.id.kai151);
            kai151.setText("淡白");
            o1=5;
        }
        if (q15_a == q15_rb4_id) {
            TextView kai151 = (TextView) findViewById(R.id.kai151);
            kai151.setText("紫斑舌");
            o1=2;
        }
        if (q15_a == q15_rb5_id) {
            TextView kai151 = (TextView) findViewById(R.id.kai151);
            kai151.setText("淡紅");
            o1=4;
        }
        if (q16_a == q16_rb1_id) {
            TextView kai161 = (TextView) findViewById(R.id.kai161);
            kai161.setText("舌尖紅");
            p1=3;
        }
        if (q16_a == q16_rb2_id) {
            TextView kai161 = (TextView) findViewById(R.id.kai161);
            kai161.setText("紫斑舌");
            p1=2;
        }
        if (q16_a == q16_rb3_id) {
            TextView kai161 = (TextView) findViewById(R.id.kai161);
            kai161.setText("淡紅");
            p1=4;
        }
        if (q16_a == q16_rb4_id) {
            TextView kai161 = (TextView) findViewById(R.id.kai161);
            kai161.setText("淡白");
            p1=5;
        }
        if (q16_a == q16_rb5_id) {
            TextView kai161 = (TextView) findViewById(R.id.kai161);
            kai161.setText("紅舌");
            p1=1;
        }
        if (q17_a == q17_rb1_id) {
            TextView kai171 = (TextView) findViewById(R.id.kai171);
            kai171.setText("淡紅");
            q1=4;
        }
        if (q17_a == q17_rb2_id) {
            TextView kai171 = (TextView) findViewById(R.id.kai171);
            kai171.setText("紅舌");
            q1=1;
        }
        if (q17_a == q17_rb3_id) {
            TextView kai171 = (TextView) findViewById(R.id.kai171);
            kai171.setText("舌尖紅");
            q1=3;
        }
        if (q17_a == q17_rb4_id) {
            TextView kai171 = (TextView) findViewById(R.id.kai171);
            kai171.setText("淡白");
            q1=5;
        }
        if (q17_a == q17_rb5_id) {
            TextView kai171 = (TextView) findViewById(R.id.kai171);
            kai171.setText("紫斑舌");
            q1=2;
        }
        if (q18_a == q18_rb1_id) {
            TextView kai181 = (TextView) findViewById(R.id.kai181);
            kai181.setText("淡紅");
            r1=4;
        }
        if (q18_a == q18_rb2_id) {
            TextView kai181 = (TextView) findViewById(R.id.kai181);
            kai181.setText("舌尖紅");
            r1=3;
        }
        if (q18_a == q18_rb3_id) {
            TextView kai181 = (TextView) findViewById(R.id.kai181);
            kai181.setText("紫斑舌");
            r1=2;
        }
        if (q18_a == q18_rb4_id) {
            TextView kai181 = (TextView) findViewById(R.id.kai181);
            kai181.setText("紅舌");
            r1=1;
        }
        if (q18_a == q18_rb5_id) {
            TextView kai181 = (TextView) findViewById(R.id.kai181);
            kai181.setText("淡白");
            r1=5;
        }
        if (q19_a == q19_rb1_id) {
            TextView kai191 = (TextView) findViewById(R.id.kai191);
            kai191.setText("紫斑舌");
            s1=2;
        }
        if (q19_a == q19_rb2_id) {
            TextView kai191 = (TextView) findViewById(R.id.kai191);
            kai191.setText("紅舌");
            s1=1;
        }
        if (q19_a == q19_rb3_id) {
            TextView kai191 = (TextView) findViewById(R.id.kai191);
            kai191.setText("淡白");
            s1=5;
        }
        if (q19_a == q19_rb4_id) {
            TextView kai191 = (TextView) findViewById(R.id.kai191);
            kai191.setText("淡紅");
            s1=4;
        }
        if (q19_a == q19_rb5_id) {
            TextView kai191 = (TextView) findViewById(R.id.kai191);
            kai191.setText("舌尖紅");
            s1=3;
        }
        if (q20_a == q20_rb1_id) {
            TextView kai201 = (TextView) findViewById(R.id.kai201);
            kai201.setText("淡白");
            t1=5;
        }
        if (q20_a == q20_rb2_id) {
            TextView kai201 = (TextView) findViewById(R.id.kai201);
            kai201.setText("紅舌");
            t1=1;
        }
        if (q20_a == q20_rb3_id) {
            TextView kai201 = (TextView) findViewById(R.id.kai201);
            kai201.setText("淡紅");
            t1=4;
        }
        if (q20_a == q20_rb4_id) {
            TextView kai201 = (TextView) findViewById(R.id.kai201);
            kai201.setText("舌尖紅");
            t1=3;
        }
        if (q20_a == q20_rb5_id) {
            TextView kai201 = (TextView) findViewById(R.id.kai201);
            kai201.setText("紫斑舌");
            t1=2;
        }


        if (q1_ar == q1_1_rb_idr) {
            TextView kai102 = (TextView) findViewById(R.id.kai102);
            kai102.setText("紅舌");
            a2=1;
        }else if (q1_ar == q1_2_rb_idr) {
            TextView kai102 = (TextView) findViewById(R.id.kai102);
            kai102.setText("紫斑舌");
            a2=2;
        }else if (q1_ar == q1_3_rb_idr) {
            TextView kai102 = (TextView) findViewById(R.id.kai102);
            kai102.setText("舌尖紅");
            a2=3;
        }else if (q1_ar == q1_4_rb_idr) {
            TextView kai102 = (TextView) findViewById(R.id.kai102);
            kai102.setText("淡紅");
            a2=4;
        }else if (q1_ar == q1_5_rb_idr) {
            TextView kai102 = (TextView) findViewById(R.id.kai102);
            kai102.setText("淡白");
            a2=5;
        }
        if (q2_ar == q2_rb1_idr) {
            TextView kai122 = (TextView) findViewById(R.id.kai122);
            kai122.setText("淡紅");
            b2=4;
        }else if (q2_ar == q2_rb2_idr) {
            TextView kai122 = (TextView) findViewById(R.id.kai122);
            kai122.setText("舌尖紅");
            b2=3;
        }else if (q2_ar == q2_rb3_idr) {
            TextView kai122 = (TextView) findViewById(R.id.kai122);
            kai122.setText("紫斑舌");
            b2=2;
        }else if (q2_ar == q2_rb4_idr) {
            TextView kai122 = (TextView) findViewById(R.id.kai122);
            kai122.setText("淡白");
            b2=5;
        }else if (q2_ar == q2_rb5_idr) {
            TextView kai122 = (TextView) findViewById(R.id.kai122);
            kai122.setText("紅舌");
            b2=1;
        }
        if (q3_ar == q3_rb1_idr) {
            TextView kai192 = (TextView) findViewById(R.id.kai192);
            kai192.setText("淡白");
            c2=5;
        }else if (q3_ar == q3_rb2_idr) {
            TextView kai192 = (TextView) findViewById(R.id.kai192);
            kai192.setText("紅舌");
            c2=1;
        }else if (q3_ar == q3_rb3_idr) {
            TextView kai192 = (TextView) findViewById(R.id.kai192);
            kai192.setText("淡紅");
            c2=4;
        }else if (q3_ar == q3_rb4_idr) {
            TextView kai192 = (TextView) findViewById(R.id.kai192);
            kai192.setText("紫斑舌");
            c2=2;
        }else if (q3_ar == q3_rb5_idr) {
            TextView kai192 = (TextView) findViewById(R.id.kai192);
            kai192.setText("舌尖紅");
            c2=3;
        }if (q4_ar == q4_rb1_idr) {
            TextView kai32 = (TextView) findViewById(R.id.kai32);
            kai32.setText("紅舌");
            d2=1;
        }else if (q4_ar == q4_rb2_idr) {
            TextView kai32 = (TextView) findViewById(R.id.kai32);
            kai32.setText("紫斑舌");
            d2=2;
        }else if (q4_ar == q4_rb3_idr) {
            TextView kai32 = (TextView) findViewById(R.id.kai32);
            kai32.setText("淡紅");
            d2=4;
        }else if (q4_ar == q4_rb4_idr) {
            TextView kai32 = (TextView) findViewById(R.id.kai32);
            kai32.setText("舌尖紅");
            d2=3;
        }else if (q4_ar == q4_rb5_idr) {
            TextView kai32 = (TextView) findViewById(R.id.kai32);
            kai32.setText("淡白");
            d2=5;
        }
        if (q5_ar == q5_rb1_idr) {
            TextView kai12 = (TextView) findViewById(R.id.kai12);
            kai12.setText("紫斑舌");
            e2=2;
        }else if (q5_ar == q5_rb2_idr) {
            TextView kai12 = (TextView) findViewById(R.id.kai12);
            kai12.setText("舌尖舌");
            e2=3;
        }else if (q5_ar == q5_rb3_idr) {
            TextView kai12 = (TextView) findViewById(R.id.kai12);
            kai12.setText("紅舌");
            e2=1;
        }else if (q5_ar == q5_rb4_idr) {
            TextView kai12 = (TextView) findViewById(R.id.kai12);
            kai12.setText("淡紅");
            e2=4;
        }else if (q5_ar == q5_rb5_idr) {
            TextView kai12 = (TextView) findViewById(R.id.kai12);
            kai12.setText("淡白");
            e2=5;
        }
        if (q6_ar == q6_rb1_idr) {
            TextView kai202 = (TextView) findViewById(R.id.kai202);
            kai202.setText("淡白");
            f2=5;
        }else if (q6_ar == q6_rb2_idr) {
            TextView kai202 = (TextView) findViewById(R.id.kai202);
            kai202.setText("淡紅");
            f2=4;
        }else if (q6_ar == q6_rb3_idr) {
            TextView kai202 = (TextView) findViewById(R.id.kai202);
            kai202.setText("紅舌");
            f2=1;
        }else if (q6_ar == q6_rb4_idr) {
            TextView kai202 = (TextView) findViewById(R.id.kai202);
            kai202.setText("紫斑舌");
            f2=2;
        }else if (q6_ar == q6_rb5_idr) {
            TextView kai202 = (TextView) findViewById(R.id.kai202);
            kai202.setText("舌尖紅");
            f2=3;
        }
        if (q7_ar == q7_rb1_idr) {
            TextView kai142 = (TextView) findViewById(R.id.kai142);
            kai142.setText("淡紅");
            g2=4;
        }else if (q7_ar == q7_rb2_idr) {
            TextView kai142 = (TextView) findViewById(R.id.kai142);
            kai142.setText("舌尖紅");
            g2=3;
        }else if (q7_ar == q7_rb3_idr) {
            TextView kai142 = (TextView) findViewById(R.id.kai142);
            kai142.setText("淡白");
            g2=5;
        }else if (q7_ar == q7_rb4_idr) {
            TextView kai142 = (TextView) findViewById(R.id.kai142);
            kai142.setText("紅舌");
            g2=1;
        }else if (q7_ar == q7_rb5_idr) {
            TextView kai142 = (TextView) findViewById(R.id.kai142);
            kai142.setText("紫斑舌");
            g2=2;
        }
        if (q8_ar == q8_rb1_idr) {
            TextView kai72 = (TextView) findViewById(R.id.kai72);
            kai72.setText("紅舌");
            h2=1;
        }else if (q8_ar == q8_rb2_idr) {
            TextView kai72 = (TextView) findViewById(R.id.kai72);
            kai72.setText("紫斑舌");
            h2=2;
        }else if (q8_ar == q8_rb3_idr) {
            TextView kai72 = (TextView) findViewById(R.id.kai72);
            kai72.setText("舌尖紅");
            h2=3;
        }else if (q8_ar == q8_rb4_idr) {
            TextView kai72 = (TextView) findViewById(R.id.kai72);
            kai72.setText("淡紅");
            h2=4;
        }else if (q8_ar == q8_rb5_idr) {
            TextView kai72 = (TextView) findViewById(R.id.kai72);
            kai72.setText("淡白");
            h2=5;
        }
        if (q9_ar == q9_rb1_idr) {
            TextView kai42 = (TextView) findViewById(R.id.kai42);
            kai42.setText("舌尖紅");
            i2=3;
        }else if (q9_ar == q9_rb2_idr) {
            TextView kai42 = (TextView) findViewById(R.id.kai42);
            kai42.setText("紫斑舌");
            i2=2;
        }else if (q9_ar == q9_rb3_idr) {
            TextView kai42 = (TextView) findViewById(R.id.kai42);
            kai42.setText("淡白");
            i2=5;
        }else if (q9_ar == q9_rb4_idr) {
            TextView kai42 = (TextView) findViewById(R.id.kai42);
            kai42.setText("紅舌");
            i2=1;
        }else if (q9_ar == q9_rb5_idr) {
            TextView kai42 = (TextView) findViewById(R.id.kai42);
            kai42.setText("淡紅");
            i2=4;
        }
        if (q10_ar == q10_rb1_idr) {
            TextView kai112 = (TextView) findViewById(R.id.kai112);
            kai112.setText("紅舌");
            j2=1;
        }else if (q10_ar == q10_rb2_idr) {
            TextView kai112 = (TextView) findViewById(R.id.kai112);
            kai112.setText("淡紅");
            j2=3;
        }else if (q10_ar == q10_rb3_idr) {
            TextView kai112 = (TextView) findViewById(R.id.kai112);
            kai112.setText("舌尖紅");
            j2=2;
        }else if (q10_ar == q10_rb4_idr) {
            TextView kai112 = (TextView) findViewById(R.id.kai112);
            kai112.setText("紫斑舌");
            j2=3;
        }else if (q10_ar == q10_rb5_idr) {
            TextView kai112 = (TextView) findViewById(R.id.kai112);
            kai112.setText("淡白");
            j2=5;
        }
        if (q11_ar == q11_rb1_idr) {
            TextView kai22 = (TextView) findViewById(R.id.kai22);
            kai22.setText("淡白");
            k2=5;
        }else if (q11_ar == q11_rb2_idr) {
            TextView kai22 = (TextView) findViewById(R.id.kai22);
            kai22.setText("紅舌");
            k2=1;
        }else if (q11_ar == q11_rb3_idr) {
            TextView kai22 = (TextView) findViewById(R.id.kai22);
            kai22.setText("舌尖紅");
            k2=3;
        }else if (q11_ar == q11_rb4_idr) {
            TextView kai22 = (TextView) findViewById(R.id.kai22);
            kai22.setText("紫斑舌");
            k2=2;
        }else if (q11_ar == q11_rb5_idr) {
            TextView kai22 = (TextView) findViewById(R.id.kai22);
            kai22.setText("淡紅");
            k2=4;
        }
        if (q12_ar == q12_rb1_idr) {
            TextView kai182 = (TextView) findViewById(R.id.kai182);
            kai182.setText("舌尖紅");
            l2=3;
        }
        if (q12_ar == q12_rb2_idr) {
            TextView kai182 = (TextView) findViewById(R.id.kai182);
            kai182.setText("紅舌");
            l2=1;
        }
        if (q12_ar == q12_rb3_idr) {
            TextView kai182 = (TextView) findViewById(R.id.kai182);
            kai182.setText("紫斑舌");
            l2=2;
        }
        if (q12_ar == q12_rb4_idr) {
            TextView kai182 = (TextView) findViewById(R.id.kai182);
            kai182.setText("淡白");
            l2=5;
        }
        if (q12_ar == q12_rb5_idr) {
            TextView kai182 = (TextView) findViewById(R.id.kai182);
            kai182.setText("淡紅");
            l2=4;
        }
        if (q13_ar == q13_rb1_idr) {
            TextView kai172 = (TextView) findViewById(R.id.kai172);
            kai172.setText("淡紅");
            m2=4;
        }
        if (q13_ar == q13_rb2_idr) {
            TextView kai172 = (TextView) findViewById(R.id.kai172);
            kai172.setText("紫斑舌");
            m2=2;
        }
        if (q13_ar == q13_rb3_idr) {
            TextView kai172 = (TextView) findViewById(R.id.kai172);
            kai172.setText("紅舌");
            m2=1;
        }
        if (q13_ar == q13_rb4_idr) {
            TextView kai172 = (TextView) findViewById(R.id.kai172);
            kai172.setText("淡白");
            m2=5;
        }
        if (q13_ar == q13_rb5_idr) {
            TextView kai172 = (TextView) findViewById(R.id.kai172);
            kai172.setText("舌尖紅");
            m2=3;
        }
        if (q14_ar == q14_rb1_idr) {
            TextView kai152 = (TextView) findViewById(R.id.kai152);
            kai152.setText("紅舌");
            n2=1;
        }
        if (q14_ar == q14_rb2_idr) {
            TextView kai152 = (TextView) findViewById(R.id.kai152);
            kai152.setText("淡白");
            n2=5;
        }
        if (q14_ar == q14_rb3_idr) {
            TextView kai152 = (TextView) findViewById(R.id.kai152);
            kai152.setText("紫斑舌");
            n2=2;
        }
        if (q14_ar == q14_rb4_idr) {
            TextView kai152 = (TextView) findViewById(R.id.kai152);
            kai152.setText("舌尖紅");
            n2=3;
        }
        if (q14_ar == q14_rb5_idr) {
            TextView kai152 = (TextView) findViewById(R.id.kai152);
            kai152.setText("淡紅");
            n2=4;
        }
        if (q15_ar == q15_rb1_idr) {
            TextView kai52 = (TextView) findViewById(R.id.kai52);
            kai52.setText("舌尖紅");
            o2=3;
        }
        if (q15_ar == q15_rb2_idr) {
            TextView kai52 = (TextView) findViewById(R.id.kai52);
            kai52.setText("紅舌");
            o2=1;
        }
        if (q15_ar == q15_rb3_idr) {
            TextView kai52 = (TextView) findViewById(R.id.kai52);
            kai52.setText("淡白");
            o2=5;
        }
        if (q15_ar == q15_rb4_idr) {
            TextView kai52 = (TextView) findViewById(R.id.kai52);
            kai52.setText("紫斑舌");
            o2=2;
        }
        if (q15_ar == q15_rb5_idr) {
            TextView kai52 = (TextView) findViewById(R.id.kai52);
            kai52.setText("淡紅");
            o2=4;
        }
        if (q16_ar == q16_rb1_idr) {
            TextView kai132 = (TextView) findViewById(R.id.kai132);
            kai132.setText("舌尖紅");
            p2=3;
        }
        if (q16_ar == q16_rb2_idr) {
            TextView kai132 = (TextView) findViewById(R.id.kai132);
            kai132.setText("紫斑舌");
            p2=2;
        }
        if (q16_ar == q16_rb3_idr) {
            TextView kai132 = (TextView) findViewById(R.id.kai132);
            kai132.setText("淡紅");
            p2=4;
        }
        if (q16_ar == q16_rb4_idr) {
            TextView kai132 = (TextView) findViewById(R.id.kai132);
            kai132.setText("淡白");
            p2=5;
        }
        if (q16_ar == q16_rb5_idr) {
            TextView kai132 = (TextView) findViewById(R.id.kai132);
            kai132.setText("紅舌");
            p2=1;
        }
        if (q17_ar == q17_rb1_idr) {
            TextView kai82 = (TextView) findViewById(R.id.kai82);
            kai82.setText("淡紅");
            q2=4;
        }
        if (q17_ar == q17_rb2_idr) {
            TextView kai82 = (TextView) findViewById(R.id.kai82);
            kai82.setText("紅舌");
            q2=1;
        }
        if (q17_ar == q17_rb3_idr) {
            TextView kai82 = (TextView) findViewById(R.id.kai82);
            kai82.setText("舌尖紅");
            q2=3;
        }
        if (q17_ar == q17_rb4_idr) {
            TextView kai82 = (TextView) findViewById(R.id.kai82);
            kai82.setText("淡白");
            q2=5;
        }
        if (q17_ar == q17_rb5_idr) {
            TextView kai82 = (TextView) findViewById(R.id.kai82);
            kai82.setText("紫斑舌");
            q2=2;
        }
        if (q18_ar == q18_rb1_idr) {
            TextView kai62 = (TextView) findViewById(R.id.kai62);
            kai62.setText("淡紅");
            r2=4;
        }
        if (q18_ar == q18_rb2_idr) {
            TextView kai62 = (TextView) findViewById(R.id.kai62);
            kai62.setText("舌尖紅");
            r2=3;
        }
        if (q18_ar == q18_rb3_idr) {
            TextView kai62 = (TextView) findViewById(R.id.kai62);
            kai62.setText("紫斑舌");
            r2=2;
        }
        if (q18_ar == q18_rb4_idr) {
            TextView kai62 = (TextView) findViewById(R.id.kai62);
            kai62.setText("紅舌");
            r2=1;
        }
        if (q18_ar == q18_rb5_idr) {
            TextView kai62 = (TextView) findViewById(R.id.kai62);
            kai62.setText("淡白");
            r2=5;
        }
        if (q19_ar == q19_rb1_idr) {
            TextView kai92 = (TextView) findViewById(R.id.kai92);
            kai92.setText("紫斑舌");
            s2=2;
        }
        if (q19_ar == q19_rb2_idr) {
            TextView kai92 = (TextView) findViewById(R.id.kai92);
            kai92.setText("紅舌");
            s2=1;
        }
        if (q19_ar == q19_rb3_idr) {
            TextView kai92 = (TextView) findViewById(R.id.kai92);
            kai92.setText("淡白");
            s2=5;
        }
        if (q19_ar == q19_rb4_idr) {
            TextView kai92 = (TextView) findViewById(R.id.kai92);
            kai92.setText("淡紅");
            s2=4;
        }
        if (q19_ar == q19_rb5_idr) {
            TextView kai92 = (TextView) findViewById(R.id.kai92);
            kai92.setText("舌尖紅");
            s2=3;
        }
        if (q20_ar == q20_rb1_idr) {
            TextView kai162 = (TextView) findViewById(R.id.kai162);
            kai162.setText("淡白");
            t2=5;
        }
        if (q20_ar == q20_rb2_idr) {
            TextView kai162 = (TextView) findViewById(R.id.kai162);
            kai162.setText("紅舌");
            t2=1;
        }
        if (q20_ar == q20_rb3_idr) {
            TextView kai162 = (TextView) findViewById(R.id.kai162);
            kai162.setText("淡紅");
            t2=4;
        }
        if (q20_ar == q20_rb4_idr) {
            TextView kai162 = (TextView) findViewById(R.id.kai162);
            kai162.setText("舌尖紅");
            t2=3;
        }
        if (q20_ar == q20_rb5_idr) {
            TextView kai162 = (TextView) findViewById(R.id.kai162);
            kai162.setText("紫斑舌");
            t2=2;
        }





        if (q1_a != q1_1_rb_id) {
            if (a1==e2) {
                TextView ayamari1 = (TextView) findViewById(R.id.ayamari1);
                ayamari1.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
            }
        } else {
            TextView ayamari1 = (TextView) findViewById(R.id.ayamari1);
            ayamari1.setText("");
        }
        if (q2_a != q2_rb1_id) {
            if (b1==k2) {
                {
                    TextView ayamari2 = (TextView) findViewById(R.id.ayamari2);
                    ayamari2.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari2 = (TextView) findViewById(R.id.ayamari2);
                ayamari2.setText("");
            }}
        if (q3_a != q3_rb4_id) {
            if (c1==d2) {
                {
                    TextView ayamari3 = (TextView) findViewById(R.id.ayamari3);
                    ayamari3.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari3 = (TextView) findViewById(R.id.ayamari3);
                ayamari3.setText("");
            }}
        if (q4_a != q4_rb2_id) {
            if (d1==i2) {
                {
                    TextView ayamari4 = (TextView) findViewById(R.id.ayamari4);
                    ayamari4.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari4 = (TextView) findViewById(R.id.ayamari4);
                ayamari4.setText("");
            }}
        if (q5_a != q5_rb4_id) {
            if (e1==o2) {
                {
                    TextView ayamari5 = (TextView) findViewById(R.id.ayamari5);
                    ayamari5.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari5 = (TextView) findViewById(R.id.ayamari5);
                ayamari5.setText("");
            }}
        if (q6_a != q6_rb5_id) {
            if (f1==r2) {
                {
                    TextView ayamari6 = (TextView) findViewById(R.id.ayamari6);
                    ayamari6.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari6 = (TextView) findViewById(R.id.ayamari6);
                ayamari6.setText("");
            }}
        if (q7_a != q7_rb5_id) {
            if (g1==h2) {
                {
                    TextView ayamari7 = (TextView) findViewById(R.id.ayamari7);
                    ayamari7.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari7 = (TextView) findViewById(R.id.ayamari7);
                ayamari7.setText("");
            }}
        if (q8_a != q8_rb4_id) {
            if (h1==q2) {
                {
                    TextView ayamari8 = (TextView) findViewById(R.id.ayamari8);
                    ayamari8.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari8 = (TextView) findViewById(R.id.ayamari8);
                ayamari8.setText("");
            }}
        if (q9_a != q9_rb5_id) {
            if (i1==s2) {
                {
                    TextView ayamari9 = (TextView) findViewById(R.id.ayamari9);
                    ayamari9.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari9 = (TextView) findViewById(R.id.ayamari9);
                ayamari9.setText("");
            }}
        if (q10_a != q10_rb1_id) {
            if (j1==a2) {
                {
                    TextView ayamari10 = (TextView) findViewById(R.id.ayamari10);
                    ayamari10.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari10 = (TextView) findViewById(R.id.ayamari10);
                ayamari10.setText("");
            }}
        if (q11_a != q11_rb4_id) {
            if (k1==j2) {
                TextView ayamari11 = (TextView) findViewById(R.id.ayamari11);
                ayamari11.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
            }
        } else {
            TextView ayamari11 = (TextView) findViewById(R.id.ayamari11);
            ayamari11.setText("");
        }
        if (q12_a != q12_rb3_id) {
            if (l1==b2) {
                {
                    TextView ayamari12 = (TextView) findViewById(R.id.ayamari12);
                    ayamari12.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari12 = (TextView) findViewById(R.id.ayamari12);
                ayamari12.setText("");
            }}
        if (q13_a != q13_rb1_id) {
            if (m1==p2) {
                {
                    TextView ayamari13 = (TextView) findViewById(R.id.ayamari13);
                    ayamari13.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari13 = (TextView) findViewById(R.id.ayamari13);
                ayamari13.setText("");
            }}
        if (q14_a != q14_rb2_id) {
            if (n1==g2) {
                {
                    TextView ayamari14 = (TextView) findViewById(R.id.ayamari14);
                    ayamari14.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari14 = (TextView) findViewById(R.id.ayamari14);
                ayamari14.setText("");
            }}
        if (q15_a != q15_rb4_id) {
            if (o1==n2) {
                {
                    TextView ayamari15 = (TextView) findViewById(R.id.ayamari15);
                    ayamari15.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari15 = (TextView) findViewById(R.id.ayamari15);
                ayamari15.setText("");
            }}
        if (q16_a != q16_rb3_id) {
            if (p1==t2) {
                {
                    TextView ayamari16 = (TextView) findViewById(R.id.ayamari16);
                    ayamari16.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari16 = (TextView) findViewById(R.id.ayamari16);
                ayamari16.setText("");
            }}
        if (q17_a != q17_rb5_id) {
            if (q1==m2) {
                {
                    TextView ayamari17 = (TextView) findViewById(R.id.ayamari17);
                    ayamari17.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari17 = (TextView) findViewById(R.id.ayamari17);
                ayamari17.setText("");
            }}
        if (q18_a != q18_rb3_id) {
            if (r1==l2) {
                {
                    TextView ayamari18 = (TextView) findViewById(R.id.ayamari18);
                    ayamari18.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari18 = (TextView) findViewById(R.id.ayamari18);
                ayamari18.setText("");
            }}
        if (q19_a != q19_rb2_id) {
            if (s1==c2) {
                {
                    TextView ayamari19 = (TextView) findViewById(R.id.ayamari19);
                    ayamari19.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari19 = (TextView) findViewById(R.id.ayamari19);
                ayamari19.setText("");
            }}
        if (q20_a != q20_rb3_id) {
            if (t1==f2) {
                {
                    TextView ayamari20 = (TextView) findViewById(R.id.ayamari20);
                    ayamari20.setText("同じ誤り方をしています。舌の当該問題画像をしっかりと見直し、正しい知識を身につけましょう。");
                }
            } else {
                TextView ayamari20 = (TextView) findViewById(R.id.ayamari20);
                ayamari20.setText("");
            }}


        }
    }
