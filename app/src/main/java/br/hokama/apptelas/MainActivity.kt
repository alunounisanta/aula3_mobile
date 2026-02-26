package br.hokama.apptelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    var listaLivros = ""
    var contador = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val fabAvanca = findViewById<FloatingActionButton>(R.id.fab_avanca)
        val buttonCriar = findViewById<Button>(R.id.button_criar)
        val inputLivro = findViewById<EditText>(R.id.input_nome_livro)
        val inputAutor = findViewById<EditText>(R.id.input_nome_autor_livro)

        buttonCriar.setOnClickListener {
            val nome = inputLivro.text.toString()
            val autor = inputAutor.text.toString()

            listaLivros += "$contador - $nome ($autor)\n"
            contador++

            inputLivro.setText("")
            inputAutor.setText("")
        }

        fabAvanca.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("DADOS", listaLivros)
            startActivity(intent)
        }
    }
}