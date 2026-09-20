package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hbd1 {

    /* JADX INFO: renamed from: a */
    public final gbd1 f89500a;

    /* JADX INFO: renamed from: b */
    public final Object f89501b;

    /* JADX INFO: renamed from: c */
    public final boolean f89502c;

    /* JADX INFO: renamed from: d */
    public final String f89503d;

    /* JADX INFO: renamed from: e */
    public final String f89504e;

    public hbd1(gbd1 gbd1Var, un20 un20Var, boolean z, String str, String str2, int i) {
        un20Var = (i & 2) != 0 ? null : un20Var;
        z = (i & 4) != 0 ? false : z;
        str = (i & 8) != 0 ? "" : str;
        this.f89500a = gbd1Var;
        this.f89501b = un20Var;
        this.f89502c = z;
        this.f89503d = str;
        this.f89504e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbd1)) {
            return false;
        }
        hbd1 hbd1Var = (hbd1) obj;
        return wj50.m88271j(this.f89500a, hbd1Var.f89500a) && wj50.m88271j(this.f89501b, hbd1Var.f89501b) && this.f89502c == hbd1Var.f89502c && wj50.m88271j(this.f89503d, hbd1Var.f89503d) && wj50.m88271j(this.f89504e, hbd1Var.f89504e);
    }

    public final int hashCode() {
        int iHashCode = this.f89500a.hashCode() * 31;
        Object obj = this.f89501b;
        return this.f89504e.hashCode() + s571.m77243b(s571.m77245d((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.f89502c), 31, this.f89503d);
    }
}
