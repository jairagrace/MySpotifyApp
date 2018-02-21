package jaira.cabarrubias.com.spotify.user.myspotifymediaplayer.Adapter

import android.content.ClipData
import android.content.Context
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import jaira.cabarrubias.com.spotify.user.myspotifymediaplayer.Model.SongModel
import jaira.cabarrubias.com.spotify.user.myspotifymediaplayer.R
import java.util.*

/**
 * Created by user on 04/02/2018.
 */
class SongAdapter(SongModel: ArrayList<SongModel>, context: Context) : RecyclerView.Adapter<SongAdapter.SongListViewHolder>() {

    var mSongModel = SongModel

    override fun onBindViewHolder(holder: SongListViewHolder?, position: Int) {
        var model = mSongModel[position]
            var songName = model.mSongName
            var songSinger = model.mSongSinger
            holder!!.nameTV.text = songName
            holder!!.singerTV.text = songSinger


    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SongListViewHolder {
        var view = LayoutInflater.from(parent!! . context).inflate(R.layout.songlist,parent,false)
        return SongListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mSongModel.size
    }

    class SongListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var nameTV: TextView
        var singerTV: TextView


        init {
            nameTV = itemView.findViewById(R.id.tvNameHolder)
            singerTV = itemView.findViewById(R.id.tvSingerHolder)
        }

        }


}