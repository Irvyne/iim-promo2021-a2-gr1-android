package ninja.irvyne.iima2gr1application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            val bundle = Bundle()

            bundle.putString("ABC", editText.text.toString())
            intent.putExtras(bundle)

            startActivity(intent)
        }
    }
}
