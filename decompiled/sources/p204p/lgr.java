package p204p;

import android.app.ActivityManager;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lgr implements k2l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133272a;

    /* JADX INFO: renamed from: b */
    public final Serializable f133273b;

    public lgr() {
        this.f133272a = 0;
        this.f133273b = kgr.f122439a.toString();
    }

    @Override // p204p.k2l
    /* JADX INFO: renamed from: a */
    public final List mo29350a() {
        Object c6x0Var;
        int i = this.f133272a;
        Serializable serializable = this.f133273b;
        switch (i) {
            case 0:
                return Collections.singletonList(new n0l((String) serializable));
            default:
                try {
                    c6x0Var = (tge0) ((uqd0) serializable).invoke();
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = null;
                }
                tge0 tge0Var = (tge0) c6x0Var;
                return tge0Var == null ? lau.f131415a : h6f.m46715L(new u0l(tge0Var.f220176a), new k1l(tge0Var.f220177b), new e2l(tge0Var.f220178c));
        }
    }

    public lgr(ActivityManager activityManager) {
        this.f133272a = 1;
        this.f133273b = new uqd0(activityManager, 13);
    }
}
