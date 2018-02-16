package ninja.irvyne.iima2gr1application

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val text = intent.extras.getString(ARG_TEXT)

        detailsText.text = text
    }

    companion object {
        const val ARG_TEXT = "text"
    }
}
