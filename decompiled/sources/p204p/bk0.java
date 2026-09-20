package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bk0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f27795d = new ak0(0);

    /* JADX INFO: renamed from: a */
    public final mec0 f27796a;

    /* JADX INFO: renamed from: b */
    public final String f27797b;

    /* JADX INFO: renamed from: c */
    public final String f27798c;

    public bk0(mec0 mec0Var, String str, String str2) {
        this.f27796a = mec0Var;
        this.f27797b = str;
        this.f27798c = str2;
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
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return this.f27796a.equals(bk0Var.f27796a) && wj50.m88271j(this.f27797b, bk0Var.f27797b) && wj50.m88271j(this.f27798c, bk0Var.f27798c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f27795d;
    }

    public final int hashCode() {
        int iHashCode = this.f27796a.hashCode() * 31;
        String str = this.f27797b;
        return this.f27798c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
