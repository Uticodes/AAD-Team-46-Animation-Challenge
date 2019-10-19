package com.example.team46;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// testing comment
public class AboutALCActivity extends AppCompatActivity {
    WebView mWebView;
    Animation mAnimation;
    ImageView imageView;
    TextView mDotOne, mDotTwo, mDotThree;
    LinearLayout mDotLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        mWebView = findViewById(R.id.webview);
        imageView = findViewById(R.id.imageView);
        mDotOne = findViewById(R.id.loading_dot_one);
        mDotTwo = findViewById(R.id.loading_dot_two);
        mDotThree = findViewById(R.id.loading_dot_three);
        mDotLayout = findViewById(R.id.about_loader_layout);

        //Enabling javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://andela.com/alc/");

        blink(imageView);
        blinker(mDotOne, 0);
        blinker(mDotTwo, 50);
        blinker(mDotThree, 100);

        mWebView.setVisibility(View.GONE);

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }

            public void onPageFinished(WebView view, String url) {
                imageView.setVisibility(View.GONE);
                mDotLayout.setVisibility(View.GONE);
                clearAnimation(imageView);
                mWebView.setVisibility(View.VISIBLE);
                fadeSlide(mWebView);
            }
        });
    }

    public void fadeSlide(View view){
        mAnimation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_slide);
        view.startAnimation(mAnimation);
    }

    public void blink(View view){
        mAnimation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        view.startAnimation(mAnimation);
    }

    public void blinker(View v, long delayanime){
        Animation mAnime = AnimationUtils.loadAnimation(this, R.anim.blink);
          mAnime.setStartOffset(delayanime);
            v.startAnimation(mAnime);

    }

    void clearAnimation(View view){
        view.clearAnimation();
        mDotTwo.clearAnimation();
        mDotThree.clearAnimation();
        mDotOne.clearAnimation();
    }
}
