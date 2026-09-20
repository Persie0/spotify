package p204p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class mew0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f142877a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b */
    public IBinder f142878b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.f142877a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f142878b = iBinder;
        this.f142877a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
