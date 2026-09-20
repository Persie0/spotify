package p204p;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class bq10 {

    /* JADX INFO: renamed from: b */
    public static final boolean f29642b;

    /* JADX INFO: renamed from: a */
    public final csy f29643a;

    static {
        f29642b = w4u0.f247891b.mo84662b() <= 1.0E-4d;
    }

    public bq10(Context context) {
        this.f29643a = new csy(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m30171a(String str, Bundle bundle) {
        if (f29642b && wl51.m88496t0(str, "gps", false)) {
            this.f29643a.m33793J(str, bundle);
        }
    }
}
