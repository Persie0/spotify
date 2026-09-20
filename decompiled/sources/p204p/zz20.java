package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zz20 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f287869a;

    /* JADX INFO: renamed from: b */
    public final boolean f287870b;

    /* JADX INFO: renamed from: c */
    public final boolean f287871c;

    /* JADX INFO: renamed from: d */
    public final boolean f287872d;

    public zz20(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f287869a = z;
        this.f287870b = z2;
        this.f287871c = z3;
        this.f287872d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz20)) {
            return false;
        }
        zz20 zz20Var = (zz20) obj;
        return this.f287869a == zz20Var.f287869a && this.f287870b == zz20Var.f287870b && this.f287871c == zz20Var.f287871c && this.f287872d == zz20Var.f287872d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287872d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f287869a) * 31, 31, this.f287870b), 31, this.f287871c);
    }
}
