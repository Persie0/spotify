package p204p;

import com.spotify.base.java.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class pa41 extends top {

    /* JADX INFO: renamed from: A */
    public boolean f175389A;

    /* JADX INFO: renamed from: B */
    public boolean f175390B;

    /* JADX INFO: renamed from: C */
    public int f175391C;

    /* JADX INFO: renamed from: s */
    public final t9d0 f175392s;

    /* JADX INFO: renamed from: t */
    public final qa41 f175393t;

    /* JADX INFO: renamed from: u */
    public final owo f175394u;

    /* JADX INFO: renamed from: v */
    public final long f175395v;

    /* JADX INFO: renamed from: w */
    public final long f175396w;

    /* JADX INFO: renamed from: x */
    public final long f175397x;

    /* JADX INFO: renamed from: y */
    public final long f175398y;

    /* JADX INFO: renamed from: z */
    public final long f175399z;

    public pa41(t9d0 t9d0Var, qa41 qa41Var) {
        int i = t9d0Var.f218253c;
        owo owoVar = new owo();
        int iM80278b = t9d0Var.m80278b();
        int iM80278b2 = t9d0Var.m80278b();
        int iM80277a = t9d0Var.m80277a();
        int iM80277a2 = t9d0Var.m80277a();
        int i2 = t9d0Var.f218266p;
        int i3 = t9d0Var.f218269s;
        super(owoVar, iM80278b, iM80278b2, iM80277a, iM80277a2, i2, i2, i3, i3, t9d0Var.f218258h);
        this.f175392s = t9d0Var;
        this.f175393t = qa41Var;
        this.f175394u = owoVar;
        this.f175395v = h0b1.m46295W(t9d0Var.m80278b());
        this.f175396w = h0b1.m46295W(t9d0Var.m80277a());
        this.f175397x = h0b1.m46295W(t9d0Var.f218265o ? i : 420000);
        this.f175398y = h0b1.m46295W(t9d0Var.f218265o ? i : 900000);
        this.f175399z = h0b1.m46295W(t9d0Var.f218269s);
        this.f175390B = true;
        this.f175391C = 13107200;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: a */
    public final boolean mo41356a(i0a0 i0a0Var) {
        int i;
        boolean z;
        t9d0 t9d0Var = this.f175392s;
        long j = i0a0Var.f97186e;
        long j2 = i0a0Var.f97185d;
        float f = i0a0Var.f97187f;
        owo owoVar = this.f175394u;
        synchronized (owoVar) {
            i = owoVar.f170744c * owoVar.f170742a;
        }
        boolean z2 = i >= this.f175391C;
        boolean z3 = this.f175390B;
        long jMin = z3 ? this.f175395v : this.f175397x;
        long j3 = z3 ? this.f175396w : this.f175398y;
        if (t9d0Var.f218267q && j2 < h0b1.m46295W(t9d0Var.f218256f)) {
            jMin = h0b1.m46295W(t9d0Var.f218255e);
            j3 = jMin;
        }
        if (f > 1.0f) {
            jMin = (long) Math.min(h0b1.m46280H(jMin, f), j3);
        }
        if (j < Math.max(jMin, 500000L)) {
            if (z2) {
                z = false;
            } else {
                z = true;
            }
        } else if (j >= j3 || z2) {
            z = false;
        } else {
            z = this.f175389A;
        }
        this.f175389A = z;
        if (!z && j < 500000) {
            Logger.m3973i("Target buffer size reached with less than 500ms of buffered media data.", new Object[0]);
        }
        return this.f175389A;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: b */
    public final void mo41357b(w9p0 w9p0Var) {
        super.mo41357b(w9p0Var);
        this.f175391C = 13107200;
        this.f175389A = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: c */
    public final boolean mo52041c(i0a0 i0a0Var) {
        int i;
        long jMin;
        long jM46282J = h0b1.m46282J(i0a0Var.f97186e, i0a0Var.f97187f);
        if (i0a0Var.f97188g) {
            jMin = this.f175399z;
        } else {
            qa41 qa41Var = this.f175393t;
            qa41Var.m72416a();
            int i2 = qa41Var.f186747f;
            n89 n89VarM66420a = qa41Var.f186743b.m66420a();
            int iM38547C = edb.m38547C(i2);
            if (iM38547C == 0) {
                i = n89VarM66420a.f151437Z0;
            } else if (iM38547C == 1) {
                i = n89VarM66420a.f151439a1;
            } else if (iM38547C == 2) {
                i = n89VarM66420a.f151441b1;
            } else {
                if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = n89VarM66420a.f151443c1;
            }
            jMin = ((long) i) * 1000;
        }
        long j = i0a0Var.f97189h;
        if (j != -9223372036854775807L) {
            jMin = (long) Math.min(j / ((long) 2), jMin);
        }
        return jMin <= 0 || jM46282J >= jMin;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: d */
    public final void mo41358d(w9p0 w9p0Var) {
        super.mo41358d(w9p0Var);
        this.f175391C = 13107200;
        this.f175389A = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: e */
    public final void mo41359e(w9p0 w9p0Var) {
        m81206j(w9p0Var);
        this.f175391C = 13107200;
        this.f175389A = false;
    }

    @Override // p204p.top, p204p.j0a0
    /* JADX INFO: renamed from: f */
    public final void mo41360f(i0a0 i0a0Var, lf81 lf81Var, xjx[] xjxVarArr) {
        kf81 kf81VarMo34618n;
        if (this.f175392s.f218263m) {
            this.f175391C = m81204h(i0a0Var, xjxVarArr);
            boolean z = false;
            for (xjx xjxVar : xjxVarArr) {
                if (xjxVar != null && (kf81VarMo34618n = xjxVar.mo34618n()) != null && kf81VarMo34618n.f122101c == 2) {
                    z = true;
                    break;
                }
            }
            this.f175390B = z;
        }
        super.mo41360f(i0a0Var, lf81Var, xjxVarArr);
    }
}
