package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xpx0 implements arx0, nqx0, upx0 {

    /* JADX INFO: renamed from: a */
    public final fq50 f264753a;

    /* JADX INFO: renamed from: b */
    public final boolean f264754b;

    /* JADX INFO: renamed from: c */
    public final String f264755c;

    /* JADX INFO: renamed from: d */
    public final mqx0 f264756d;

    /* JADX INFO: renamed from: e */
    public final int f264757e;

    public xpx0(fq50 fq50Var, boolean z, mqx0 mqx0Var, int i) {
        String str = fq50Var.f72061a;
        this.f264753a = fq50Var;
        this.f264754b = z;
        this.f264755c = str;
        this.f264756d = mqx0Var;
        this.f264757e = i;
    }

    @Override // p204p.upx0
    /* JADX INFO: renamed from: a */
    public final int mo26905a() {
        return this.f264757e;
    }

    @Override // p204p.nqx0
    /* JADX INFO: renamed from: b */
    public final mqx0 mo26906b() {
        return this.f264756d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpx0)) {
            return false;
        }
        xpx0 xpx0Var = (xpx0) obj;
        return this.f264753a.equals(xpx0Var.f264753a) && this.f264754b == xpx0Var.f264754b && wj50.m88271j(this.f264755c, xpx0Var.f264755c) && this.f264756d.equals(xpx0Var.f264756d) && this.f264757e == xpx0Var.f264757e;
    }

    @Override // p204p.arx0
    public final String getId() {
        return this.f264755c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f264757e) + ((this.f264756d.hashCode() + s571.m77243b(s571.m77245d(this.f264753a.hashCode() * 31, 31, this.f264754b), 31, this.f264755c)) * 31);
    }
}
