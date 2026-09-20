package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jxx extends kxx {

    /* JADX INFO: renamed from: a */
    public final String f117240a;

    /* JADX INFO: renamed from: b */
    public final String f117241b;

    /* JADX INFO: renamed from: c */
    public final String f117242c;

    /* JADX INFO: renamed from: d */
    public final int f117243d;

    public jxx(String str, String str2, int i, String str3) {
        this.f117240a = str;
        this.f117241b = str2;
        this.f117242c = str3;
        this.f117243d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxx)) {
            return false;
        }
        jxx jxxVar = (jxx) obj;
        return wj50.m88271j(this.f117240a, jxxVar.f117240a) && wj50.m88271j(this.f117241b, jxxVar.f117241b) && wj50.m88271j(this.f117242c, jxxVar.f117242c) && this.f117243d == jxxVar.f117243d;
    }

    public final int hashCode() {
        int iHashCode = this.f117240a.hashCode() * 31;
        String str = this.f117241b;
        return Integer.hashCode(this.f117243d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117242c);
    }
}
