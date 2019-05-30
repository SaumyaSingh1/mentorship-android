package org.systers.mentorship.view.activities

import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*
import org.systers.mentorship.R

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnGit.setOnClickListener {

            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_github))))
        }
        btnSlack.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(R.string.url_slack.toString())))
        }
        btnWebsite.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(R.string.url_website.toString())))
        }
        btnTermsCondition.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_terms))))
        }
        btnprivacypolicy.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_privacy))))
        }
        btncodeofconduct.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(R.string.url_code_of_conduct.toString())))
        }

    }
}