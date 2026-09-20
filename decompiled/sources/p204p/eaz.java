package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class eaz extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f57752b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Context f57753a;

    public eaz(Context context) {
        this.f57753a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m38325a(Context context) {
        AtomicReference atomicReference = f57752b;
        if (atomicReference.get() == null) {
            eaz eazVar = new eaz(context);
            while (!atomicReference.compareAndSet(null, eazVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(eazVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (faz.f67663k) {
            try {
                Iterator it = ((rj5) faz.f67664l.values()).iterator();
                while (it.hasNext()) {
                    ((faz) it.next()).m41200e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f57753a.unregisterReceiver(this);
    }
}
