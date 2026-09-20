package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hzm0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f96979d = new dx00(6);

    /* JADX INFO: renamed from: a */
    public final mec0 f96980a;

    /* JADX INFO: renamed from: b */
    public final String f96981b;

    /* JADX INFO: renamed from: c */
    public final String f96982c;

    public hzm0(mec0 mec0Var, String str, String str2) {
        this.f96980a = mec0Var;
        this.f96981b = str;
        this.f96982c = str2;
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
        if (!(obj instanceof hzm0)) {
            return false;
        }
        hzm0 hzm0Var = (hzm0) obj;
        return this.f96980a.equals(hzm0Var.f96980a) && wj50.m88271j(this.f96981b, hzm0Var.f96981b) && wj50.m88271j(this.f96982c, hzm0Var.f96982c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f96979d;
    }

    public final int hashCode() {
        int iHashCode = this.f96980a.hashCode() * 31;
        String str = this.f96981b;
        return this.f96982c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
