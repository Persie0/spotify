package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ytp0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f276191d = new dx00(22);

    /* JADX INFO: renamed from: a */
    public final mec0 f276192a;

    /* JADX INFO: renamed from: b */
    public final String f276193b;

    /* JADX INFO: renamed from: c */
    public final String f276194c;

    public ytp0(mec0 mec0Var, String str, String str2) {
        this.f276192a = mec0Var;
        this.f276193b = str;
        this.f276194c = str2;
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
        if (!(obj instanceof ytp0)) {
            return false;
        }
        ytp0 ytp0Var = (ytp0) obj;
        return this.f276192a.equals(ytp0Var.f276192a) && wj50.m88271j(this.f276193b, ytp0Var.f276193b) && wj50.m88271j(this.f276194c, ytp0Var.f276194c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f276191d;
    }

    public final int hashCode() {
        int iHashCode = this.f276192a.hashCode() * 31;
        String str = this.f276193b;
        return this.f276194c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
