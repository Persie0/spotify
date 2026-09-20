package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ivn0 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f106245a;

    /* JADX INFO: renamed from: b */
    public final boolean f106246b;

    /* JADX INFO: renamed from: c */
    public final boolean f106247c;

    public ivn0(ebf0 ebf0Var, boolean z, boolean z2) {
        this.f106245a = ebf0Var;
        this.f106246b = z;
        this.f106247c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivn0)) {
            return false;
        }
        ivn0 ivn0Var = (ivn0) obj;
        return wj50.m88271j(this.f106245a, ivn0Var.f106245a) && this.f106246b == ivn0Var.f106246b && this.f106247c == ivn0Var.f106247c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106247c) + s571.m77245d(this.f106245a.f57921a.hashCode() * 31, 31, this.f106246b);
    }
}
