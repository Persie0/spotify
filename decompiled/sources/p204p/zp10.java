package p204p;

import android.os.Bundle;
import android.p001os.OutcomeReceiver;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zp10 implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284899a;

    public /* synthetic */ zp10(int i) {
        this.f284899a = i;
    }

    public final void onError(Throwable th) {
        bq10 bq10Var;
        bq10 bq10Var2;
        switch (this.f284899a) {
            case 0:
                Exception exc = (Exception) th;
                Set set = p2l.f173365a;
                set.contains(aq10.class);
                if (!set.contains(aq10.class)) {
                    try {
                        bq10Var = aq10.f18055c;
                    } catch (Throwable th2) {
                        p2l.m68953a(aq10.class, th2);
                        bq10Var = null;
                    }
                    break;
                } else {
                    bq10Var = null;
                }
                if (bq10Var == null) {
                    wj50.m88260d0("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", exc.toString());
                bq10Var.m30171a("gps_ara_failed", bundle);
                return;
            default:
                Exception exc2 = (Exception) th;
                Set set2 = p2l.f173365a;
                set2.contains(k2m0.class);
                exc2.toString();
                if (!set2.contains(k2m0.class)) {
                    try {
                        bq10Var2 = k2m0.f118669e;
                    } catch (Throwable th3) {
                        p2l.m68953a(k2m0.class, th3);
                        bq10Var2 = null;
                    }
                    break;
                } else {
                    bq10Var2 = null;
                }
                if (bq10Var2 == null) {
                    wj50.m88260d0("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", exc2.toString());
                bq10Var2.m30171a("gps_pa_failed", bundle2);
                return;
        }
    }

    public final void onResult(Object obj) {
        bq10 bq10Var;
        bq10 bq10Var2;
        switch (this.f284899a) {
            case 0:
                Set set = p2l.f173365a;
                set.contains(aq10.class);
                if (set.contains(aq10.class)) {
                    bq10Var = null;
                } else {
                    try {
                        bq10Var = aq10.f18055c;
                    } catch (Throwable th) {
                        p2l.m68953a(aq10.class, th);
                        bq10Var = null;
                    }
                }
                if (bq10Var != null) {
                    bq10Var.m30171a("gps_ara_succeed", null);
                    return;
                } else {
                    wj50.m88260d0("gpsDebugLogger");
                    throw null;
                }
            default:
                Set set2 = p2l.f173365a;
                set2.contains(k2m0.class);
                if (set2.contains(k2m0.class)) {
                    bq10Var2 = null;
                } else {
                    try {
                        bq10Var2 = k2m0.f118669e;
                    } catch (Throwable th2) {
                        p2l.m68953a(k2m0.class, th2);
                        bq10Var2 = null;
                    }
                }
                if (bq10Var2 != null) {
                    bq10Var2.m30171a("gps_pa_succeed", null);
                    return;
                } else {
                    wj50.m88260d0("gpsDebugLogger");
                    throw null;
                }
        }
    }
}
