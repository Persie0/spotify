package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class unm0 implements xka {

    /* JADX INFO: renamed from: b */
    public final xom0 f232192b;

    /* JADX INFO: renamed from: c */
    public final xka f232193c;

    /* JADX INFO: renamed from: d */
    public final ko70 f232194d;

    public unm0(xom0 xom0Var, xka xkaVar, ko70 ko70Var) {
        this.f232192b = xom0Var;
        this.f232193c = xkaVar;
        this.f232194d = ko70Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // p204p.xka
    /* JADX INFO: renamed from: a */
    public final float mo83568a(float f, float f2, float f3) {
        int iM91557o;
        int iM91557o2;
        int iM91557o3;
        float fMo83568a = this.f232193c.mo83568a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            tiv0 tiv0Var = iqc1.f104728a;
            if (f4 <= 1) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fMo83568a);
        ko70 ko70Var = ko70.f124557b;
        vvl0 vvl0Var = vvl0.f245249b;
        ko70 ko70Var2 = this.f232194d;
        xom0 xom0Var = this.f232192b;
        if (fAbs != 0.0f && z) {
            if (ko70Var2 == ko70Var && xom0Var.m91555l().f135463e == vvl0Var) {
                iM91557o3 = xom0Var.m91557o() + (-xom0Var.f264317f);
            } else {
                iM91557o3 = xom0Var.f264317f;
            }
            float fM91557o = iM91557o3 * (-1);
            while (fMo83568a > 0.0f && fM91557o < fMo83568a) {
                fM91557o += xom0Var.m91557o();
            }
            while (fMo83568a < 0.0f && fM91557o > fMo83568a) {
                fM91557o -= xom0Var.m91557o();
            }
            return fM91557o;
        }
        if (Math.abs(xom0Var.f264317f) < 1.0E-6d) {
            return 0.0f;
        }
        if (ko70Var2 == ko70Var && xom0Var.m91555l().f135463e == vvl0Var) {
            iM91557o = xom0Var.m91557o() + (-xom0Var.f264317f);
        } else {
            iM91557o = xom0Var.f264317f;
        }
        float f5 = iM91557o * (-1.0f);
        if (ko70Var2 == ko70Var && xom0Var.m91555l().f135463e == vvl0Var) {
            if (!xom0Var.m91554k()) {
                iM91557o2 = xom0Var.m91557o();
                f5 += iM91557o2;
            }
        } else if (xom0Var.m91554k()) {
            iM91557o2 = xom0Var.m91557o();
            f5 += iM91557o2;
        }
        return n0e1.m63436m(f5, -f3, f3);
    }
}
