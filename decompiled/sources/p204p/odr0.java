package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class odr0 implements pdr0 {

    /* JADX INFO: renamed from: a */
    public final String f164238a;

    /* JADX INFO: renamed from: b */
    public final String f164239b;

    public odr0(String str, String str2) {
        this.f164238a = str;
        this.f164239b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odr0)) {
            return false;
        }
        odr0 odr0Var = (odr0) obj;
        return wj50.m88271j(this.f164238a, odr0Var.f164238a) && wj50.m88271j(this.f164239b, odr0Var.f164239b);
    }

    public final int hashCode() {
        return this.f164239b.hashCode() + (this.f164238a.hashCode() * 31);
    }
}
