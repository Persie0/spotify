package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kh80 {

    /* JADX INFO: renamed from: a */
    public final String f122547a;

    /* JADX INFO: renamed from: b */
    public final String f122548b;

    /* JADX INFO: renamed from: c */
    public final boolean f122549c;

    /* JADX INFO: renamed from: d */
    public final boolean f122550d;

    /* JADX INFO: renamed from: e */
    public final boolean f122551e;

    public kh80(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f122547a = str;
        this.f122548b = str2;
        this.f122549c = z;
        this.f122550d = z2;
        this.f122551e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh80)) {
            return false;
        }
        kh80 kh80Var = (kh80) obj;
        return wj50.m88271j(this.f122547a, kh80Var.f122547a) && wj50.m88271j(this.f122548b, kh80Var.f122548b) && this.f122549c == kh80Var.f122549c && this.f122550d == kh80Var.f122550d && this.f122551e == kh80Var.f122551e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122551e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f122547a.hashCode() * 31, 31, this.f122548b), 31, this.f122549c), 31, this.f122550d);
    }
}
