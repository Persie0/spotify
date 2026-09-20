package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v5j0 implements gdl0 {

    /* JADX INFO: renamed from: a */
    public final hc80 f237521a;

    /* JADX INFO: renamed from: b */
    public final ox91 f237522b;

    /* JADX INFO: renamed from: c */
    public final phy0 f237523c;

    /* JADX INFO: renamed from: d */
    public e301 f237524d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f237525e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ltx0 f237526f;

    /* JADX INFO: renamed from: g */
    public final v6e f237527g;

    public v5j0(hc80 hc80Var, h9y0 h9y0Var, ox91 ox91Var, phy0 phy0Var) {
        this.f237521a = hc80Var;
        this.f237522b = ox91Var;
        this.f237523c = phy0Var;
        this.f237526f = phy0Var.m70054b(new w0i0(this, 26));
        v6e v6eVar = new v6e(this, 2);
        this.f237527g = v6eVar;
        hc80Var.getLifecycle().mo31986a(v6eVar);
        h9y0Var.getLifecycle().mo31986a(new dz2(this, 14));
    }

    @Override // p204p.gdl0
    /* JADX INFO: renamed from: a */
    public final void mo44428a(e301 e301Var) {
        this.f237524d = e301Var;
        m84730c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84729b() {
        boolean zM41223a = this.f237521a.getLifecycle().mo31987b().m41223a(fb80.f67754e);
        ic41 ic41Var = (ic41) this.f237522b;
        boolean zM31611T = ic41Var.mo15683g0().m31611T();
        e301 e301Var = this.f237524d;
        boolean z = false;
        boolean z2 = e301Var != null && e301Var.f55572b;
        boolean z3 = this.f237523c.m70053a() != null;
        if (zM41223a && !zM31611T && z2 && z3) {
            z = true;
        }
        if (!z) {
            ic41Var.mo15683g0().m31611T();
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m84730c() {
        if (m84729b()) {
            Iterator it = this.f237525e.iterator();
            while (it.hasNext()) {
                ((u5j0) it.next()).mo52457a();
            }
        }
    }
}
