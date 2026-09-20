package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rfn0 {

    /* JADX INFO: renamed from: a */
    public final String f198697a;

    /* JADX INFO: renamed from: b */
    public final String f198698b;

    /* JADX INFO: renamed from: c */
    public final b5q0 f198699c;

    public rfn0(String str, String str2, b5q0 b5q0Var) {
        this.f198697a = str;
        this.f198698b = str2;
        this.f198699c = b5q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfn0)) {
            return false;
        }
        rfn0 rfn0Var = (rfn0) obj;
        return wj50.m88271j(this.f198697a, rfn0Var.f198697a) && wj50.m88271j(this.f198698b, rfn0Var.f198698b) && wj50.m88271j(this.f198699c, rfn0Var.f198699c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f198697a.hashCode() * 31, 31, this.f198698b);
        b5q0 b5q0Var = this.f198699c;
        return iM77243b + (b5q0Var == null ? 0 : b5q0Var.hashCode());
    }
}
