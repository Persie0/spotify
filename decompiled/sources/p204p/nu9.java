package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f158538d = new ak0(15);

    /* JADX INFO: renamed from: a */
    public final mec0 f158539a;

    /* JADX INFO: renamed from: b */
    public final String f158540b;

    /* JADX INFO: renamed from: c */
    public final String f158541c;

    public nu9(mec0 mec0Var, String str, String str2) {
        this.f158539a = mec0Var;
        this.f158540b = str;
        this.f158541c = str2;
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
        if (!(obj instanceof nu9)) {
            return false;
        }
        nu9 nu9Var = (nu9) obj;
        return this.f158539a.equals(nu9Var.f158539a) && wj50.m88271j(this.f158540b, nu9Var.f158540b) && wj50.m88271j(this.f158541c, nu9Var.f158541c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f158538d;
    }

    public final int hashCode() {
        int iHashCode = this.f158539a.hashCode() * 31;
        String str = this.f158540b;
        return this.f158541c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
