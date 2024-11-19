package ir.radindev.dunipool.features.marketActivity

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import ir.radindev.dunipool.R


class SplashMarket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_market)

// انتقال به اکتیویتی اصلی بعد از ۳ ثانیه
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashMarket, MarketActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000) // ۳۰۰۰ میلی‌ثانیه = ۳ ثانیه

    }
}