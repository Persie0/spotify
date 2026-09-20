package p204p;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m7d1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f140768a = 0;

    static {
        gaz.m44194g("WakeLocks");
    }

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m61061a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (n7d1.f151138a) {
        }
        return wakeLockNewWakeLock;
    }
}
