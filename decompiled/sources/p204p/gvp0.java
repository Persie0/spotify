package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gvp0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final iup0 f84797d = new iup0(22);

    /* JADX INFO: renamed from: a */
    public final mec0 f84798a;

    /* JADX INFO: renamed from: b */
    public final String f84799b;

    /* JADX INFO: renamed from: c */
    public final String f84800c;

    public gvp0(mec0 mec0Var, String str, String str2) {
        this.f84798a = mec0Var;
        this.f84799b = str;
        this.f84800c = str2;
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
        if (!(obj instanceof gvp0)) {
            return false;
        }
        gvp0 gvp0Var = (gvp0) obj;
        return this.f84798a.equals(gvp0Var.f84798a) && wj50.m88271j(this.f84799b, gvp0Var.f84799b) && wj50.m88271j(this.f84800c, gvp0Var.f84800c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f84797d;
    }

    public final int hashCode() {
        int iHashCode = this.f84798a.hashCode() * 31;
        String str = this.f84799b;
        return this.f84800c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
