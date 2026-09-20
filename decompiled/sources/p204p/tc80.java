package p204p;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc80 extends Service implements hc80 {

    /* JADX INFO: renamed from: a */
    public final ezw0 f219042a = new ezw0(this);

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f219042a.m40415i();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f219042a.m40420p();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f219042a.m40421q();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f219042a.m40422r();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f219042a.m40423s();
        super.onStart(intent, i);
    }
}
