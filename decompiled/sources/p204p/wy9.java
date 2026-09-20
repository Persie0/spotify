package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wy9 {

    /* JADX INFO: renamed from: a */
    public final String f256233a;

    /* JADX INFO: renamed from: b */
    public final String f256234b;

    /* JADX INFO: renamed from: c */
    public final String f256235c;

    public wy9(String str, String str2, String str3) {
        this.f256233a = str;
        this.f256234b = str2;
        this.f256235c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy9)) {
            return false;
        }
        String str = this.f256233a;
        if (str == null ? ((wy9) obj).f256233a != null : !wj50.m88271j(str, ((wy9) obj).f256233a)) {
            return false;
        }
        String str2 = this.f256234b;
        if (str2 == null ? ((wy9) obj).f256234b != null : !wj50.m88271j(str2, ((wy9) obj).f256234b)) {
            return false;
        }
        return wj50.m88271j(this.f256235c, ((wy9) obj).f256235c);
    }

    public final int hashCode() {
        String str = this.f256233a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f256234b;
        return this.f256235c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
