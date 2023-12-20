package es.verdejo.sutil.kaahot2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import es.verdejo.sutil.kaahot2.ui.Juego
import es.verdejo.sutil.kaahot2.ui.NuevaPregunta

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //Damos funcionalidad a las opciones
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.NuevaPregunta -> {
                val intentNuevoAlumno = Intent(this, NuevaPregunta::class.java)
                startActivity(intentNuevoAlumno)
                return true
            }
            R.id.Jugar -> {
                val intentModificarAlumno = Intent(this, Juego::class.java)
                startActivity(intentModificarAlumno)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}