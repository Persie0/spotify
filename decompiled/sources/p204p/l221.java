package p204p;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes5.dex */
public final class l221 {

    /* JADX INFO: renamed from: a */
    public final Context f128897a;

    /* JADX INFO: renamed from: b */
    public final TelephonyManager f128898b;

    /* JADX INFO: renamed from: c */
    public final WifiManager f128899c;

    /* JADX INFO: renamed from: d */
    public zm31 f128900d;

    /* JADX INFO: renamed from: e */
    public final k221 f128901e;

    public l221(Context context) {
        this.f128897a = context;
        this.f128898b = (TelephonyManager) context.getSystemService("phone");
        Context applicationContext = context.getApplicationContext();
        this.f128899c = (WifiManager) (applicationContext != null ? applicationContext.getSystemService("wifi") : null);
        this.f128901e = new k221(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m57893a() {
        this.f128898b.registerTelephonyCallback(this.f128897a.getMainExecutor(), this.f128901e);
    }

    /* JADX INFO: renamed from: b */
    public final void m57894b() {
        this.f128898b.unregisterTelephonyCallback(this.f128901e);
    }
}
