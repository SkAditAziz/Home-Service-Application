package com.example.serverhomeservice.Model;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class providerResponse extends Service {
    public providerResponse() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"service",Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
