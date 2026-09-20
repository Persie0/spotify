package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tif0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f220674a;

    /* JADX INFO: renamed from: b */
    public final String f220675b;

    /* JADX INFO: renamed from: c */
    public final String f220676c;

    /* JADX INFO: renamed from: d */
    public final ggf0 f220677d;

    public tif0(hz80 hz80Var, String str, String str2, ggf0 ggf0Var) {
        this.f220674a = hz80Var;
        this.f220675b = str;
        this.f220676c = str2;
        this.f220677d = ggf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tif0)) {
            return false;
        }
        tif0 tif0Var = (tif0) obj;
        return wj50.m88271j(this.f220674a, tif0Var.f220674a) && wj50.m88271j(this.f220675b, tif0Var.f220675b) && wj50.m88271j(this.f220676c, tif0Var.f220676c) && wj50.m88271j(this.f220677d, tif0Var.f220677d);
    }

    public final int hashCode() {
        int iHashCode = this.f220674a.hashCode() * 31;
        String str = this.f220675b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f220676c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ggf0 ggf0Var = this.f220677d;
        return iHashCode3 + (ggf0Var != null ? Boolean.hashCode(ggf0Var.f79654a) : 0);
    }
}
