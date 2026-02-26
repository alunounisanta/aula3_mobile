package br.hokama.apptelas

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)

        val dadosRecebidos = intent.getStringExtra("DADOS")

        val txtLista = findViewById<TextView>(R.id.text_resultado)
        txtLista.text = dadosRecebidos

        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)
        fabVolta.setOnClickListener {
            finish()
        }
    }
}