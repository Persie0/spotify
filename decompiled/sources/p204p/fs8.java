package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fs8 implements mzs0 {

    /* JADX INFO: renamed from: a */
    public final String f72798a;

    /* JADX INFO: renamed from: b */
    public final String f72799b;

    /* JADX INFO: renamed from: c */
    public final String f72800c;

    /* JADX INFO: renamed from: d */
    public final boolean f72801d;

    public fs8(String str, String str2, int i, String str3) {
        str2 = (i & 2) != 0 ? null : str2;
        boolean z = (i & 16) == 0;
        this.f72798a = str;
        this.f72799b = str2;
        this.f72800c = str3;
        this.f72801d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs8)) {
            return false;
        }
        fs8 fs8Var = (fs8) obj;
        return wj50.m88271j(this.f72798a, fs8Var.f72798a) && wj50.m88271j(this.f72799b, fs8Var.f72799b) && wj50.m88271j(this.f72800c, fs8Var.f72800c) && this.f72801d == fs8Var.f72801d;
    }

    public final int hashCode() {
        String str = this.f72798a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72799b;
        return Boolean.hashCode(this.f72801d) + s571.m77245d(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f72800c), 31, true);
    }
}
