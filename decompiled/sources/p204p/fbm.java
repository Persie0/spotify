package p204p;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class fbm extends mbm {

    /* JADX INFO: renamed from: b */
    public static lbm f67853b;

    /* JADX INFO: renamed from: c */
    public static nbm f67854c;

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f67855d = new ReentrantLock();

    @Override // p204p.mbm
    /* JADX INFO: renamed from: a */
    public final void mo41260a(lbm lbmVar) {
        lbm lbmVar2;
        try {
            ((nu30) lbmVar.f131687a).m65672c2();
        } catch (RemoteException unused) {
        }
        f67853b = lbmVar;
        ReentrantLock reentrantLock = f67855d;
        reentrantLock.lock();
        if (f67854c == null && (lbmVar2 = f67853b) != null) {
            f67854c = lbmVar2.m58671d(null, null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
