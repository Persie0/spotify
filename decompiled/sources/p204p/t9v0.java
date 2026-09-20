package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t9v0 {

    /* JADX INFO: renamed from: a */
    public final String f218365a;

    /* JADX INFO: renamed from: b */
    public final String f218366b;

    /* JADX INFO: renamed from: c */
    public final String f218367c;

    /* JADX INFO: renamed from: d */
    public final String f218368d;

    public t9v0(String str, String str2, String str3, String str4) {
        this.f218365a = str;
        this.f218366b = str2;
        this.f218367c = str3;
        this.f218368d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9v0)) {
            return false;
        }
        t9v0 t9v0Var = (t9v0) obj;
        return wj50.m88271j(this.f218365a, t9v0Var.f218365a) && wj50.m88271j(this.f218366b, t9v0Var.f218366b) && wj50.m88271j(this.f218367c, t9v0Var.f218367c) && wj50.m88271j(this.f218368d, t9v0Var.f218368d);
    }

    public final int hashCode() {
        return this.f218368d.hashCode() + s571.m77243b(s571.m77243b(this.f218365a.hashCode() * 31, 31, this.f218366b), 31, this.f218367c);
    }
}
