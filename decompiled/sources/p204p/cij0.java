package p204p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes6.dex */
public final class cij0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y0i0 f38365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cij0(y0i0 y0i0Var, int i) {
        super(0);
        this.f38364a = i;
        this.f38365b = y0i0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f38364a) {
            case 0:
                return (ConnectivityManager) ((Context) this.f38365b.f267991d).getApplicationContext().getSystemService(ConnectivityManager.class);
            default:
                Object systemService = ((Context) this.f38365b.f267991d).getApplicationContext().getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    return (TelephonyManager) systemService;
                }
                return null;
        }
    }
}
