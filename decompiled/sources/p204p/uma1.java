package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uma1 implements xma1 {

    /* JADX INFO: renamed from: a */
    public final long f231787a;

    /* JADX INFO: renamed from: b */
    public final String f231788b;

    /* JADX INFO: renamed from: c */
    public final oma1 f231789c;

    /* JADX INFO: renamed from: d */
    public final boolean f231790d;

    public uma1(long j, String str, oma1 oma1Var, boolean z) {
        this.f231787a = j;
        this.f231788b = str;
        this.f231789c = oma1Var;
        this.f231790d = z;
    }

    @Override // p204p.xma1
    /* JADX INFO: renamed from: a */
    public final oma1 mo83428a() {
        return this.f231789c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uma1)) {
            return false;
        }
        uma1 uma1Var = (uma1) obj;
        return this.f231787a == uma1Var.f231787a && wj50.m88271j(this.f231788b, uma1Var.f231788b) && wj50.m88271j(this.f231789c, uma1Var.f231789c) && this.f231790d == uma1Var.f231790d;
    }

    @Override // p204p.xma1
    public final String getEntityUri() {
        return this.f231788b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231790d) + ((this.f231789c.hashCode() + s571.m77243b(Long.hashCode(this.f231787a) * 31, 31, this.f231788b)) * 31);
    }
}
