package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class z601 {

    /* JADX INFO: renamed from: a */
    public final be01 f279672a;

    /* JADX INFO: renamed from: b */
    public final gn41 f279673b;

    /* JADX INFO: renamed from: c */
    public final vyr0 f279674c;

    public z601(f901 f901Var) {
        be01 be01Var = f901Var.f67140a;
        gn41 gn41Var = f901Var.f67141b;
        vyr0 vyr0Var = f901Var.f67144e;
        this.f279672a = be01Var;
        this.f279673b = gn41Var;
        this.f279674c = vyr0Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m95468a(z601 z601Var, String str, Bundle bundle, boolean z, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        vyr0 vyr0Var = z601Var.f279674c;
        be01 be01Var = z601Var.f279672a;
        String str2 = z601Var.f279673b.f81562b;
        b801 b801Var = new b801(str2, str, bundle, z);
        if (z) {
            lc11 lc11Var = (lc11) ((fj1) vyr0Var.f246314c).f70041b;
            lc11Var.getClass();
            if (lc11Var.m58679a(be01Var.f26239a).mo48713h(ri5.m75538i(str2, str), false)) {
                return false;
            }
        }
        ((yum0) vyr0Var.f246316e).setValue(b801Var);
        return true;
    }
}
