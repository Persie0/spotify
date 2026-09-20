package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class v1k0 {

    /* JADX INFO: renamed from: a */
    public final l3d0 f236405a;

    /* JADX INFO: renamed from: b */
    public final kv91 f236406b;

    /* JADX INFO: renamed from: c */
    public final bvp f236407c;

    /* JADX INFO: renamed from: d */
    public final oge0 f236408d;

    public v1k0(l3d0 l3d0Var, kv91 kv91Var, bvp bvpVar, oge0 oge0Var) {
        this.f236405a = l3d0Var;
        this.f236406b = kv91Var;
        this.f236407c = bvpVar;
        this.f236408d = oge0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84480a(Context context) {
        return this.f236405a.m57999d(context);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84481b(m500 m500Var, y0k0 y0k0Var, t1k0 t1k0Var) {
        if (this.f236405a.m57999d(m500Var)) {
            if (t1k0Var == null) {
                return false;
            }
            t1k0Var.mo63775e();
            return false;
        }
        ti5.m80903K(m500Var, new kft0(y0k0Var.getTitle(), y0k0Var.m92596c(), y0k0Var.m92598h(), y0k0Var.m92597g()), z0k0.m95079p(y0k0Var.m92599j()), this.f236406b, this.f236407c, t1k0Var, this.f236408d);
        return true;
    }
}
