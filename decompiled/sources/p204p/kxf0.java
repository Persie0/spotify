package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kxf0 implements mxf0 {

    /* JADX INFO: renamed from: a */
    public final long f127481a;

    /* JADX INFO: renamed from: b */
    public final long f127482b;

    /* JADX INFO: renamed from: c */
    public final String f127483c;

    /* JADX INFO: renamed from: d */
    public final boolean f127484d;

    public kxf0(long j, long j2, String str, boolean z) {
        this.f127481a = j;
        this.f127482b = j2;
        this.f127483c = str;
        this.f127484d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxf0)) {
            return false;
        }
        kxf0 kxf0Var = (kxf0) obj;
        return this.f127481a == kxf0Var.f127481a && this.f127482b == kxf0Var.f127482b && wj50.m88271j(this.f127483c, kxf0Var.f127483c) && this.f127484d == kxf0Var.f127484d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127484d) + s571.m77243b(dq60.m36605e(Long.hashCode(this.f127481a) * 31, this.f127482b, 31), 31, this.f127483c);
    }
}
