package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sw80 extends AbstractC2601y5 {

    /* JADX INFO: renamed from: a */
    public final pw80 f214619a = new pw80();

    /* JADX INFO: renamed from: b */
    public final int f214620b;

    /* JADX INFO: renamed from: c */
    public boolean f214621c;

    public sw80(int i) {
        this.f214620b = i;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: c */
    public final boolean mo49421c(gq9 gq9Var) {
        if (!this.f214621c) {
            return true;
        }
        return true;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: f */
    public final gq9 mo30336f() {
        return this.f214619a;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: h */
    public final boolean mo49422h() {
        return true;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: j */
    public final lwe mo30337j(m1s m1sVar) {
        if (m1sVar.f139071i) {
            if (this.f214619a.f190233b == null) {
                return null;
            }
            gq9 gq9VarMo30336f = m1sVar.m60544g().mo30336f();
            this.f214621c = (gq9VarMo30336f instanceof lsm0) || (gq9VarMo30336f instanceof pw80);
            return lwe.m60120a(m1sVar.f139068f);
        }
        int i = m1sVar.f139070h;
        int i2 = this.f214620b;
        if (i >= i2) {
            return new lwe(-1, m1sVar.f139066d + i2, false);
        }
        return null;
    }
}
