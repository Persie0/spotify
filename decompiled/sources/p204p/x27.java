package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x27 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f257370d = new ak0(4);

    /* JADX INFO: renamed from: a */
    public final mec0 f257371a;

    /* JADX INFO: renamed from: b */
    public final String f257372b;

    /* JADX INFO: renamed from: c */
    public final String f257373c;

    public x27(mec0 mec0Var, String str, String str2) {
        this.f257371a = mec0Var;
        this.f257372b = str;
        this.f257373c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27Var = (x27) obj;
        return this.f257371a.equals(x27Var.f257371a) && wj50.m88271j(this.f257372b, x27Var.f257372b) && wj50.m88271j(this.f257373c, x27Var.f257373c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f257370d;
    }

    public final int hashCode() {
        int iHashCode = this.f257371a.hashCode() * 31;
        String str = this.f257372b;
        return this.f257373c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
