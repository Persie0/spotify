package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pr2 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f180476d = new ak0(2);

    /* JADX INFO: renamed from: a */
    public final mec0 f180477a;

    /* JADX INFO: renamed from: b */
    public final String f180478b;

    /* JADX INFO: renamed from: c */
    public final String f180479c;

    public pr2(mec0 mec0Var, String str, String str2) {
        this.f180477a = mec0Var;
        this.f180478b = str;
        this.f180479c = str2;
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
        if (!(obj instanceof pr2)) {
            return false;
        }
        pr2 pr2Var = (pr2) obj;
        return this.f180477a.equals(pr2Var.f180477a) && wj50.m88271j(this.f180478b, pr2Var.f180478b) && wj50.m88271j(this.f180479c, pr2Var.f180479c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f180476d;
    }

    public final int hashCode() {
        int iHashCode = this.f180477a.hashCode() * 31;
        String str = this.f180478b;
        return this.f180479c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
