package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ax00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f20742d = new ak0(27);

    /* JADX INFO: renamed from: a */
    public final mec0 f20743a;

    /* JADX INFO: renamed from: b */
    public final String f20744b;

    /* JADX INFO: renamed from: c */
    public final String f20745c;

    public ax00(mec0 mec0Var, String str, String str2) {
        this.f20743a = mec0Var;
        this.f20744b = str;
        this.f20745c = str2;
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
        if (!(obj instanceof ax00)) {
            return false;
        }
        ax00 ax00Var = (ax00) obj;
        return this.f20743a.equals(ax00Var.f20743a) && wj50.m88271j(this.f20744b, ax00Var.f20744b) && wj50.m88271j(this.f20745c, ax00Var.f20745c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f20742d;
    }

    public final int hashCode() {
        int iHashCode = this.f20743a.hashCode() * 31;
        String str = this.f20744b;
        return this.f20745c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
