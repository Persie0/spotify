package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hvp0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final iup0 f95763d = new iup0(23);

    /* JADX INFO: renamed from: a */
    public final mec0 f95764a;

    /* JADX INFO: renamed from: b */
    public final String f95765b;

    /* JADX INFO: renamed from: c */
    public final String f95766c;

    public hvp0(mec0 mec0Var, String str, String str2) {
        this.f95764a = mec0Var;
        this.f95765b = str;
        this.f95766c = str2;
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
        if (!(obj instanceof hvp0)) {
            return false;
        }
        hvp0 hvp0Var = (hvp0) obj;
        return this.f95764a.equals(hvp0Var.f95764a) && wj50.m88271j(this.f95765b, hvp0Var.f95765b) && wj50.m88271j(this.f95766c, hvp0Var.f95766c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f95763d;
    }

    public final int hashCode() {
        int iHashCode = this.f95764a.hashCode() * 31;
        String str = this.f95765b;
        return this.f95766c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
