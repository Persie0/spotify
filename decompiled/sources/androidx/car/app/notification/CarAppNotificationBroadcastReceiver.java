package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IStartCarApp;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IBinder binder;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
        } else {
            binder = null;
        }
        if (binder == null) {
            intent.toString();
            return;
        }
        IStartCarApp iStartCarAppAsInterface = IStartCarApp.Stub.asInterface(binder);
        Objects.requireNonNull(iStartCarAppAsInterface);
        try {
            try {
                Log.isLoggable("CarApp", 3);
                iStartCarAppAsInterface.startCarApp(intent);
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException("Remote startCarApp from notification call failed", e2);
            }
        } catch (RemoteException unused) {
        }
    }
}
