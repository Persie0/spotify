package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gs8 {

    /* JADX INFO: renamed from: a */
    public final String f83901a;

    /* JADX INFO: renamed from: b */
    public final String f83902b;

    /* JADX INFO: renamed from: c */
    public final boolean f83903c;

    /* JADX INFO: renamed from: d */
    public final String f83904d;

    public gs8(String str, String str2, boolean z, String str3) {
        this.f83901a = str;
        this.f83902b = str2;
        this.f83903c = z;
        this.f83904d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs8)) {
            return false;
        }
        gs8 gs8Var = (gs8) obj;
        return wj50.m88271j(this.f83901a, gs8Var.f83901a) && wj50.m88271j(this.f83902b, gs8Var.f83902b) && this.f83903c == gs8Var.f83903c && wj50.m88271j(this.f83904d, gs8Var.f83904d);
    }

    public final int hashCode() {
        int iHashCode = this.f83901a.hashCode() * 31;
        String str = this.f83902b;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31, this.f83903c);
        String str2 = this.f83904d;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
