package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class fd41 extends top {

    /* JADX INFO: renamed from: s */
    public final t9d0 f68318s;

    /* JADX INFO: renamed from: t */
    public final owo f68319t;

    /* JADX INFO: renamed from: u */
    public boolean f68320u;

    /* JADX INFO: renamed from: v */
    public boolean f68321v;

    /* JADX INFO: renamed from: w */
    public int f68322w;

    public fd41(t9d0 t9d0Var) {
        owo owoVar = new owo();
        int iM80278b = t9d0Var.m80278b();
        int iM80278b2 = t9d0Var.m80278b();
        int iM80277a = t9d0Var.m80277a();
        int iM80277a2 = t9d0Var.m80277a();
        int i = t9d0Var.f218266p;
        int i2 = t9d0Var.f218269s;
        super(owoVar, iM80278b, iM80278b2, iM80277a, iM80277a2, i, i, i2, i2, t9d0Var.f218258h);
        this.f68318s = t9d0Var;
        this.f68319t = owoVar;
        this.f68321v = true;
        this.f68322w = 13107200;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: a */
    public final boolean mo41356a(i0a0 i0a0Var) {
        int i;
        long jM46295W;
        long jM46295W2;
        boolean z;
        t9d0 t9d0Var = this.f68318s;
        long j = i0a0Var.f97186e;
        long j2 = i0a0Var.f97185d;
        float f = i0a0Var.f97187f;
        owo owoVar = this.f68319t;
        synchronized (owoVar) {
            i = owoVar.f170744c * owoVar.f170742a;
        }
        boolean z2 = i >= this.f68322w;
        if ((t9d0Var.f218251a instanceof mgy) && t9d0Var.f218261k && j2 > h0b1.m46295W(t9d0Var.f218262l)) {
            t9d0Var.f218265o = false;
        }
        if (this.f68321v) {
            jM46295W = h0b1.m46295W(t9d0Var.m80278b());
        } else {
            jM46295W = h0b1.m46295W(t9d0Var.f218265o ? t9d0Var.f218253c : 420000);
        }
        if (this.f68321v) {
            jM46295W2 = h0b1.m46295W(t9d0Var.m80277a());
        } else {
            jM46295W2 = h0b1.m46295W(t9d0Var.f218265o ? t9d0Var.f218253c : 900000);
        }
        if (t9d0Var.f218267q && j2 < h0b1.m46295W(t9d0Var.f218256f)) {
            jM46295W = h0b1.m46295W(t9d0Var.f218255e);
            jM46295W2 = jM46295W;
        }
        if (f > 1.0f) {
            jM46295W = (long) Math.min(h0b1.m46280H(jM46295W, f), jM46295W2);
        }
        if (j < Math.max(jM46295W, 500000L)) {
            if (z2) {
                z = false;
            } else {
                z = true;
            }
        } else if (j >= jM46295W2 || z2) {
            z = false;
        } else {
            z = this.f68320u;
        }
        this.f68320u = z;
        if (!z && j < 500000) {
            Logger.m3973i("Target buffer size reached with less than 500ms of buffered media data.", new Object[0]);
        }
        return this.f68320u;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: b */
    public final void mo41357b(w9p0 w9p0Var) {
        super.mo41357b(w9p0Var);
        this.f68322w = 13107200;
        this.f68320u = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: d */
    public final void mo41358d(w9p0 w9p0Var) {
        super.mo41358d(w9p0Var);
        this.f68322w = 13107200;
        this.f68320u = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: e */
    public final void mo41359e(w9p0 w9p0Var) {
        m81206j(w9p0Var);
        this.f68322w = 13107200;
        this.f68320u = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: f */
    public final void mo41360f(i0a0 i0a0Var, lf81 lf81Var, xjx[] xjxVarArr) {
        kf81 kf81VarMo34618n;
        if (this.f68318s.f218263m) {
            this.f68322w = m81204h(i0a0Var, xjxVarArr);
            boolean z = false;
            for (xjx xjxVar : xjxVarArr) {
                if (xjxVar != null && (kf81VarMo34618n = xjxVar.mo34618n()) != null && kf81VarMo34618n.f122101c == 2) {
                    z = true;
                    break;
                }
            }
            this.f68321v = z;
        }
        super.mo41360f(i0a0Var, lf81Var, xjxVarArr);
    }
}
