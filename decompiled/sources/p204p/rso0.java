package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rso0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f202371d = new dx00(18);

    /* JADX INFO: renamed from: a */
    public final mec0 f202372a;

    /* JADX INFO: renamed from: b */
    public final String f202373b;

    /* JADX INFO: renamed from: c */
    public final String f202374c;

    public rso0(mec0 mec0Var, String str, String str2) {
        this.f202372a = mec0Var;
        this.f202373b = str;
        this.f202374c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rso0)) {
            return false;
        }
        rso0 rso0Var = (rso0) obj;
        return this.f202372a.equals(rso0Var.f202372a) && wj50.m88271j(this.f202373b, rso0Var.f202373b) && wj50.m88271j(this.f202374c, rso0Var.f202374c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f202371d;
    }

    public final int hashCode() {
        int iHashCode = this.f202372a.hashCode() * 31;
        String str = this.f202373b;
        return this.f202374c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
