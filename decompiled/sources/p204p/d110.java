package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d110 {

    /* JADX INFO: renamed from: a */
    public final String f44130a;

    /* JADX INFO: renamed from: b */
    public final String f44131b;

    /* JADX INFO: renamed from: c */
    public final boolean f44132c;

    /* JADX INFO: renamed from: d */
    public final boolean f44133d;

    public d110(String str, boolean z, String str2, boolean z2) {
        this.f44130a = str;
        this.f44131b = str2;
        this.f44132c = z;
        this.f44133d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d110)) {
            return false;
        }
        d110 d110Var = (d110) obj;
        return wj50.m88271j(this.f44130a, d110Var.f44130a) && wj50.m88271j(this.f44131b, d110Var.f44131b) && this.f44132c == d110Var.f44132c && this.f44133d == d110Var.f44133d;
    }

    public final int hashCode() {
        int iHashCode = this.f44130a.hashCode() * 31;
        String str = this.f44131b;
        return Boolean.hashCode(this.f44133d) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44132c);
    }
}
