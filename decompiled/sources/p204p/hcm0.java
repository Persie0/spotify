package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hcm0 {

    /* JADX INFO: renamed from: a */
    public final i7o0 f89837a;

    /* JADX INFO: renamed from: b */
    public final ir91 f89838b;

    /* JADX INFO: renamed from: c */
    public final gh00 f89839c;

    /* JADX INFO: renamed from: d */
    public final boolean f89840d;

    /* JADX INFO: renamed from: e */
    public final rw71 f89841e;

    /* JADX INFO: renamed from: f */
    public final rw71 f89842f;

    /* JADX INFO: renamed from: g */
    public final boolean f89843g;

    public hcm0(i7o0 i7o0Var, ir91 ir91Var, gh00 gh00Var, boolean z, boolean z2, int i) {
        i7o0Var = (i & 1) != 0 ? null : i7o0Var;
        ir91Var = (i & 2) != 0 ? null : ir91Var;
        gh00Var = (i & 4) != 0 ? null : gh00Var;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        this.f89837a = i7o0Var;
        this.f89838b = ir91Var;
        this.f89839c = gh00Var;
        this.f89840d = z;
        this.f89841e = null;
        this.f89842f = null;
        this.f89843g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcm0)) {
            return false;
        }
        hcm0 hcm0Var = (hcm0) obj;
        return wj50.m88271j(this.f89837a, hcm0Var.f89837a) && wj50.m88271j(this.f89838b, hcm0Var.f89838b) && wj50.m88271j(this.f89839c, hcm0Var.f89839c) && this.f89840d == hcm0Var.f89840d && wj50.m88271j(this.f89841e, hcm0Var.f89841e) && wj50.m88271j(this.f89842f, hcm0Var.f89842f) && this.f89843g == hcm0Var.f89843g;
    }

    public final int hashCode() {
        i7o0 i7o0Var = this.f89837a;
        int iHashCode = (i7o0Var == null ? 0 : i7o0Var.hashCode()) * 31;
        ir91 ir91Var = this.f89838b;
        int iHashCode2 = (iHashCode + (ir91Var == null ? 0 : ir91Var.hashCode())) * 31;
        gh00 gh00Var = this.f89839c;
        int iM77245d = s571.m77245d((iHashCode2 + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31, 31, this.f89840d);
        rw71 rw71Var = this.f89841e;
        int iHashCode3 = (iM77245d + (rw71Var == null ? 0 : rw71Var.hashCode())) * 31;
        rw71 rw71Var2 = this.f89842f;
        return Boolean.hashCode(this.f89843g) + ((iHashCode3 + (rw71Var2 != null ? rw71Var2.hashCode() : 0)) * 31);
    }
}
