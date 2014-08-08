package com.killer.poke;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	// �����������
	private ImageView mImageView01;
	private ImageView mImageView02;
	private ImageView mImageView03;
	private Button mButton;
	private TextView mText;
	private int count1, count2;
	/*
	 * ��������Ϊ3��int���飬���������Ƶ�id���� R.drawable.p01������A R.drawable.p02������2
	 * R.drawable.p03��÷��3 R.drawable.p04���˿��Ʊ���
	 */
	private static int[] s1 = new int[] { R.drawable.p01, R.drawable.p02,
			R.drawable.p03 };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ��ʼ���ؼ�
		mText = (TextView) findViewById(R.id.mText);
		mImageView01 = (ImageView) findViewById(R.id.mImage01);
		mImageView02 = (ImageView) findViewById(R.id.mImage02);
		mImageView03 = (ImageView) findViewById(R.id.mImage03);
		mButton = (Button) findViewById(R.id.mButton);
		random();
		/* ��mImageView01����onClickListener */
		mImageView01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				/* ������ͬʱ���棬����δѡ��������Ʊ�͸�� */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView01.setAlpha(250);
				mImageView02.setAlpha(100);
				mImageView03.setAlpha(100);
				/* ����û�в¶�������TextViewҪ��ʾ��ѶϢ */
				if (s1[0] == R.drawable.p01) {
					mText.setText("��!��¶����!!������!");
					mButton.setText("������");

				} else {
					mText.setText("��´����!!Ҫ��Ҫ����һ��?");
					mButton.setText("����һ�Σ�");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");

				}
				if (count2 >= 1) {
					mText.setText("��������"+count2+"��");
					mButton.setText("���¿�ʼ");
				}
			}
		}); /* ��mImageView02����onClickListener */
		mImageView02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) { /* ������ͬʱ���棬����δѡ��������Ʊ�͸�� */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView02.setAlpha(250);
				mImageView01.setAlpha(100);
				mImageView03.setAlpha(100);
				/* ����û�в¶�������TextViewҪ��ʾ��ѶϢ */
				if (s1[1] == R.drawable.p01) {
					mText.setText("��!��¶����!!������!");
					mButton.setText("������");
				} else {
					mText.setText("��´����!!Ҫ��Ҫ����һ��?");
					mButton.setText("����һ�Σ�");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");
				}
				if (count2 >= 1) {
					mText.setText("��������"+count2+"��");
					mButton.setText("���¿�ʼ");
				}
			}
		});
		/* ��mImageView03����onClickListener */
		mImageView03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				/* ������ͬʱ���棬����δѡ��������Ʊ�͸�� */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView03.setAlpha(250);
				mImageView01.setAlpha(100);
				mImageView02.setAlpha(100);
				/* ����û�в¶�������TextViewҪ��ʾ��ѶϢ */
				if (s1[2] == R.drawable.p01) {
					mText.setText("��!��¶����!!������!");
					mButton.setText("������");
				} else {
					mText.setText("��´����!!Ҫ��Ҫ����һ��?");
					mButton.setText("����һ�Σ�");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");
				}
				if (count2 >= 1) {
					mText.setText("��������"+count2+"��");
					mButton.setText("���¿�ʼ");
				}
			}
		});
		/* ��mButton����onClickListener��ʹ�䰴�º������ƶ���Ϊ����������ϴ�� */
		mButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {

				mImageView01.setImageDrawable(getResources().getDrawable(
						R.drawable.p04));
				mImageView02.setImageDrawable(getResources().getDrawable(
						R.drawable.p04));
				mImageView03.setImageDrawable(getResources().getDrawable(
						R.drawable.p04));


				mImageView01.setAlpha(300);
				mImageView02.setAlpha(300);
				mImageView03.setAlpha(300);

				random();
				if (s1[0] == R.drawable.p01)
					mText.setText("�²º���A������?");
				if (s1[1] == R.drawable.p01)
					mText.setText("�²¿�����A������?");
				if (s1[2] == R.drawable.p01)
					mText.setText("�²¿�����A����һ��?");
				//����ť����ʱ����ʼ��count1��count2
				count2=0;
				count1=0;
			}
		});
	}

	/* ����ϴ�Ƶĳ��� */
	private void random() {
		for (int i = 0; i < 3; i++) {
			int tmp = s1[i];
			System.out.println("int" + tmp + "=" + s1[i]);
			int s = (int) (Math.random() * 2);
			s1[i] = s1[s];
			System.out.println(s1[i] + " = " + s1[s]);
			s1[s] = tmp;
			System.out.println(s1[s] + "=" + tmp);
		}
	}

}
