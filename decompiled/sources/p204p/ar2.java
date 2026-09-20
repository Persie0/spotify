package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ar2 {

    /* JADX INFO: renamed from: a */
    public final kv91 f18908a;

    /* JADX INFO: renamed from: b */
    public final i8g0 f18909b;

    /* JADX INFO: renamed from: c */
    public final mp2 f18910c;

    public ar2(i4t0 i4t0Var, i4t0 i4t0Var2, er2 er2Var, kv91 kv91Var) {
        mp2 lh51Var;
        this.f18908a = kv91Var;
        st91 st91Var = st91.f213865b;
        this.f18909b = new i8g0(5, (byte) 0);
        int i = 12;
        if (er2Var instanceof dr2) {
            lh51Var = new r0e1(i, ((dr2) er2Var).f52151a, (ean) i4t0Var.get());
        } else {
            if (!(er2Var instanceof cr2)) {
                throw new NoWhenBranchMatchedException();
            }
            lh51Var = new lh51(i, ((cr2) er2Var).f41159a, (tqn) i4t0Var2.get());
        }
        this.f18910c = lh51Var;
    }

    /* JADX INFO: renamed from: a */
    public void m26911a(yq2 yq2Var, xq00 xq00Var) {
        xq00Var.m91771i0(1468530194);
        m26912b(yq2Var, xq00Var, 48);
        xq00Var.m91788r(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m26912b(yq2 yq2Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1808227509);
        int i2 = (xq00Var.m91766g(yq2Var) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(this) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            y0v.m92603a(2, rkk.m75772x(-44262335, new C2359s1(this, yq2Var), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2314qu(this, yq2Var, i);
        }
    }
}
