package jaira.cabarrubias.com.spotify.user.myspotifymediaplayer

import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import jaira.cabarrubias.com.spotify.user.myspotifymediaplayer.Adapter.SongAdapter
import jaira.cabarrubias.com.spotify.user.myspotifymediaplayer.Model.SongModel
import java.util.*

class MainActivity : AppCompatActivity() {

    var songModel: ArrayList<SongModel> = ArrayList()
    var songAdapter:SongAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var songCursor: Cursor? = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                null,null,null,null)

        while (songCursor != null && songCursor.moveToNext()){
            var songName = songCursor.getString(songCursor.getColumnIndex(MediaStore.Audio.Media.TITLE))
            var songDuration = songCursor.getString(songCursor.getColumnIndex(MediaStore.Audio.Media.DURATION))


        }
    }
}
