package p204p;

import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class j1m0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k1m0 f107804a;

    public j1m0(k1m0 k1m0Var) {
        this.f107804a = k1m0Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m52166a(j1m0 j1m0Var) {
        sxj sxjVar = vb91.f239444a;
        k1m0 k1m0Var = j1m0Var.f107804a;
        if (!k1m0Var.m55115a()) {
            return false;
        }
        k1m0Var.f118392d = sxjVar;
        j6f.m52571c0(k1m0Var.f118390b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m52167b(j1m0 j1m0Var) {
        sxj sxjVar = vb91.f239444a;
        k1m0 k1m0Var = j1m0Var.f107804a;
        k1m0Var.f118392d = sxjVar;
        gb31 gb31Var = k1m0Var.f118390b;
        gb31Var.size();
        gb31Var.clear();
    }

    /* JADX INFO: renamed from: c */
    public static void m52168c(j1m0 j1m0Var, o1m0 o1m0Var) {
        sxj sxjVar = vb91.f239444a;
        k1m0 k1m0Var = j1m0Var.f107804a;
        k1m0Var.f118392d = sxjVar;
        i1m0 i1m0Var = new i1m0(UUID.randomUUID(), o1m0Var);
        gb31 gb31Var = k1m0Var.f118390b;
        if (gb31Var.isEmpty()) {
            gb31Var.add(i1m0Var);
        } else {
            gb31Var.set(h6f.m46714K(gb31Var), i1m0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m52169d(j1m0 j1m0Var, Parcelable parcelable) {
        sxj sxjVar = vb91.f239444a;
        k1m0 k1m0Var = j1m0Var.f107804a;
        k1m0Var.f118392d = sxjVar;
        k1m0Var.f118390b.add(new i1m0(UUID.randomUUID(), parcelable));
    }
}
