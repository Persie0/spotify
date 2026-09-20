package p204p;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fjp implements up20, vp20 {

    /* JADX INFO: renamed from: a */
    public final djp f70330a;

    /* JADX INFO: renamed from: b */
    public final Context f70331b;

    /* JADX INFO: renamed from: c */
    public final j4t0 f70332c;

    /* JADX INFO: renamed from: d */
    public final Set f70333d;

    /* JADX INFO: renamed from: e */
    public final Executor f70334e;

    public fjp(Context context, String str, Set set, j4t0 j4t0Var, Executor executor) {
        this.f70330a = new djp(context, str);
        this.f70333d = set;
        this.f70334e = executor;
        this.f70332c = j4t0Var;
        this.f70331b = context;
    }

    /* JADX INFO: renamed from: a */
    public final y7h1 m41854a() {
        if (!z8g1.m95592l(this.f70331b)) {
            return bga.m29102x("");
        }
        return bga.m29089k(this.f70334e, new ejp(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m41855b() {
        if (this.f70333d.size() <= 0) {
            bga.m29102x(null);
        } else if (!z8g1.m95592l(this.f70331b)) {
            bga.m29102x(null);
        } else {
            bga.m29089k(this.f70334e, new x2l(this, 1));
        }
    }
}
