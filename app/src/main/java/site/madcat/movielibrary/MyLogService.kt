package site.madcat.movielibrary

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.widget.Toast
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class MyLogService : Service() {

    private val binder=MyBinder()
    lateinit var str: String
    override fun onBind(intent: Intent): IBinder {
        val sdf=SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate=sdf.format(Date())
        val extras=intent.extras
        if (extras != null) {
            str=currentDate + " Network Status - " + intent.getSerializableExtra("NetworkStatus") as String + "\n";
            writeLogFiile("log.txt", str)
        }
        return binder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    fun writeLogFiile(fileName: String, textMessage: String) {
        var fos: FileOutputStream?=null
        try {
            fos=openFileOutput(fileName, MODE_APPEND)
            fos.write(textMessage.toByteArray())
        } finally {
            if (fos != null) fos.close()
        }
    }


    class MyBinder : Binder() {
        fun getService()=MyService@ this
    }
}