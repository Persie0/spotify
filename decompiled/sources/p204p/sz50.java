package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sz50 implements uz50 {

    /* JADX INFO: renamed from: a */
    public final String f215393a;

    /* JADX INFO: renamed from: b */
    public final String f215394b;

    /* JADX INFO: renamed from: c */
    public final boolean f215395c;

    /* JADX INFO: renamed from: d */
    public final boolean f215396d;

    /* JADX INFO: renamed from: e */
    public final boolean f215397e;

    public sz50(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f215393a = str;
        this.f215394b = str2;
        this.f215395c = z;
        this.f215396d = z2;
        this.f215397e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz50)) {
            return false;
        }
        sz50 sz50Var = (sz50) obj;
        return wj50.m88271j(this.f215393a, sz50Var.f215393a) && wj50.m88271j(this.f215394b, sz50Var.f215394b) && this.f215395c == sz50Var.f215395c && this.f215396d == sz50Var.f215396d && this.f215397e == sz50Var.f215397e;
    }

    public final int hashCode() {
        int iHashCode = this.f215393a.hashCode() * 31;
        String str = this.f215394b;
        return Boolean.hashCode(this.f215397e) + s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f215395c), 31, this.f215396d);
    }
}
