package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class v981 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public w981 f238885a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        w981 w981Var = this.f238885a;
        if (w981Var == null) {
            return;
        }
        if (w981Var.m87487c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            w981 w981Var2 = this.f238885a;
            w981Var2.f249121d.f228101f.schedule(w981Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f238885a = null;
        }
    }
}
