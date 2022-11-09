package com.example.group7_mapd711assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()

        if (id == R.id.apple) {
            val bundle = Bundle()
            bundle.putString("PhoneName", "Apple")
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            Toast.makeText(this, "Item One Clicked", Toast.LENGTH_LONG).show()
            return true
        }
        if (id == R.id.oppo) {
            val bundle = Bundle()
            bundle.putString("PhoneName", "Oppo")
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            Toast.makeText(this, "Item Two Clicked", Toast.LENGTH_LONG).show()
            return true
        }
        if (id == R.id.samsung) {
            val bundle = Bundle()
            bundle.putString("PhoneName", "Samsung")
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            Toast.makeText(this, "Item Three Clicked", Toast.LENGTH_LONG).show()
            return true
        }
        if (id == R.id.googlePixel) {
            val bundle = Bundle()
            bundle.putString("PhoneName", "GooglePixel")
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            Toast.makeText(this, "Item Three Clicked", Toast.LENGTH_LONG).show()
            return true
        }

        return super.onOptionsItemSelected(item)

    }
}