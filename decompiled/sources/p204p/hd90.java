package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hd90 implements ld90 {

    /* JADX INFO: renamed from: a */
    public final String f90078a;

    /* JADX INFO: renamed from: b */
    public final String f90079b;

    /* JADX INFO: renamed from: c */
    public final boolean f90080c;

    /* JADX INFO: renamed from: d */
    public final String f90081d;

    public hd90(String str, String str2, boolean z, String str3) {
        this.f90078a = str;
        this.f90079b = str2;
        this.f90080c = z;
        this.f90081d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd90)) {
            return false;
        }
        hd90 hd90Var = (hd90) obj;
        return wj50.m88271j(this.f90078a, hd90Var.f90078a) && wj50.m88271j(this.f90079b, hd90Var.f90079b) && this.f90080c == hd90Var.f90080c && wj50.m88271j(this.f90081d, hd90Var.f90081d);
    }

    public final int hashCode() {
        String str = this.f90078a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90079b;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f90080c);
        String str3 = this.f90081d;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
