package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y140 extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final List f268173b;

    /* JADX INFO: renamed from: c */
    public static final IntentFilter f268174c;

    /* JADX INFO: renamed from: a */
    public final p200 f268175a;

    static {
        List listM46715L = h6f.m46715L("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f268173b = listM46715L;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listM46715L.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f268174c = intentFilter;
    }

    public y140(p200 p200Var) {
        this.f268175a = p200Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m92612a(Context context) {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean zM72045a = q35.f184794a.m72045a(powerManager);
        if (i >= 33) {
            zM72045a = zM72045a || y35.f268754a.m92727a(powerManager);
        }
        if (zM72045a) {
            this.f268175a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (g6f.m43725i0(f268173b, intent.getAction())) {
            m92612a(context);
        }
    }
}
