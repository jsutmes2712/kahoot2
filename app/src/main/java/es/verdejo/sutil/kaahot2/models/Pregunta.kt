package es.verdejo.sutil.kaahot2.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Pregunta")
data class Pregunta (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id : Int = 0,
    @ColumnInfo(name = "pregunta") val pregunta : String,
    val opciones: List<Opcion>
)