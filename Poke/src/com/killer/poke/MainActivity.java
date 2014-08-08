package com.killer.poke;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	// 声明对象变量
	private ImageView mImageView01;
	private ImageView mImageView02;
	private ImageView mImageView03;
	private Button mButton;
	private TextView mText;
	private int count1, count2;
	/*
	 * 声明长度为3的int数组，并将三张牌的id放入 R.drawable.p01：红心A R.drawable.p02：黑桃2
	 * R.drawable.p03：梅花3 R.drawable.p04：扑克牌背面
	 */
	private static int[] s1 = new int[] { R.drawable.p01, R.drawable.p02,
			R.drawable.p03 };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始化控件
		mText = (TextView) findViewById(R.id.mText);
		mImageView01 = (ImageView) findViewById(R.id.mImage01);
		mImageView02 = (ImageView) findViewById(R.id.mImage02);
		mImageView03 = (ImageView) findViewById(R.id.mImage03);
		mButton = (Button) findViewById(R.id.mButton);
		random();
		/* 替mImageView01加入onClickListener */
		mImageView01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				/* 三张牌同时翻面，并将未选择的两张牌变透明 */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView01.setAlpha(250);
				mImageView02.setAlpha(100);
				mImageView03.setAlpha(100);
				/* 依有没有猜对来决定TextView要显示的讯息 */
				if (s1[0] == R.drawable.p01) {
					mText.setText("哇!你猜对了喔!!拍拍手!");
					mButton.setText("继续猜");

				} else {
					mText.setText("你猜错了喔!!要不要再试一次?");
					mButton.setText("再试一次！");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");

				}
				if (count2 >= 1) {
					mText.setText("你作弊了"+count2+"次");
					mButton.setText("重新开始");
				}
			}
		}); /* 替mImageView02加入onClickListener */
		mImageView02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) { /* 三张牌同时翻面，并将未选择的两张牌变透明 */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView02.setAlpha(250);
				mImageView01.setAlpha(100);
				mImageView03.setAlpha(100);
				/* 依有没有猜对来决定TextView要显示的讯息 */
				if (s1[1] == R.drawable.p01) {
					mText.setText("哇!你猜对了喔!!拍拍手!");
					mButton.setText("继续猜");
				} else {
					mText.setText("你猜错了喔!!要不要再试一次?");
					mButton.setText("再试一次！");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");
				}
				if (count2 >= 1) {
					mText.setText("你作弊了"+count2+"次");
					mButton.setText("重新开始");
				}
			}
		});
		/* 替mImageView03加入onClickListener */
		mImageView03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				/* 三张牌同时翻面，并将未选择的两张牌变透明 */
				mImageView01
						.setImageDrawable(getResources().getDrawable(s1[0]));
				mImageView02
						.setImageDrawable(getResources().getDrawable(s1[1]));
				mImageView03
						.setImageDrawable(getResources().getDrawable(s1[2]));
				mImageView03.setAlpha(250);
				mImageView01.setAlpha(100);
				mImageView02.setAlpha(100);
				/* 依有没有猜对来决定TextView要显示的讯息 */
				if (s1[2] == R.drawable.p01) {
					mText.setText("哇!你猜对了喔!!拍拍手!");
					mButton.setText("继续猜");
				} else {
					mText.setText("你猜错了喔!!要不要再试一次?");
					mButton.setText("再试一次！");
				}
				if (mImageView01.isClickable() || mImageView02.isClickable()
						|| mImageView03.isClickable()) {
					count2 = count1++;
					Log.i("count+++++++++++++++++++", count2 + "");
				}
				if (count2 >= 1) {
					mText.setText("你作弊了"+count2+"次");
					mButton.setText("重新开始");
				}
			}
		});
		/* 替mButton加入onClickListener，使其按下后三张牌都翻为背面且重新洗牌 */
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
					mText.setText("猜猜红心A是哪张?");
				if (s1[1] == R.drawable.p01)
					mText.setText("猜猜看红心A是哪张?");
				if (s1[2] == R.drawable.p01)
					mText.setText("猜猜看红心A是哪一张?");
				//当按钮按下时，初始化count1和count2
				count2=0;
				count1=0;
			}
		});
	}

	/* 重新洗牌的程序 */
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
