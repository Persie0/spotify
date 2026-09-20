package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wma1 implements xma1 {

    /* JADX INFO: renamed from: a */
    public final long f252765a;

    /* JADX INFO: renamed from: b */
    public final String f252766b;

    /* JADX INFO: renamed from: c */
    public final oma1 f252767c;

    /* JADX INFO: renamed from: d */
    public final boolean f252768d;

    public wma1(long j, String str, oma1 oma1Var, boolean z) {
        this.f252765a = j;
        this.f252766b = str;
        this.f252767c = oma1Var;
        this.f252768d = z;
    }

    /* JADX INFO: renamed from: b */
    public static wma1 m88543b(wma1 wma1Var, nma1 nma1Var) {
        long j = wma1Var.f252765a;
        String str = wma1Var.f252766b;
        boolean z = wma1Var.f252768d;
        wma1Var.getClass();
        return new wma1(j, str, nma1Var, z);
    }

    @Override // p204p.xma1
    /* JADX INFO: renamed from: a */
    public final oma1 mo83428a() {
        return this.f252767c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wma1)) {
            return false;
        }
        wma1 wma1Var = (wma1) obj;
        return this.f252765a == wma1Var.f252765a && wj50.m88271j(this.f252766b, wma1Var.f252766b) && wj50.m88271j(this.f252767c, wma1Var.f252767c) && this.f252768d == wma1Var.f252768d;
    }

    @Override // p204p.xma1
    public final String getEntityUri() {
        return this.f252766b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252768d) + ((this.f252767c.hashCode() + s571.m77243b(Long.hashCode(this.f252765a) * 31, 31, this.f252766b)) * 31);
    }
}
