package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sv20 {

    /* JADX INFO: renamed from: a */
    public final rv20 f214298a;

    /* JADX INFO: renamed from: b */
    public final boolean f214299b;

    /* JADX INFO: renamed from: c */
    public final boolean f214300c;

    public sv20(rv20 rv20Var, boolean z, boolean z2) {
        this.f214298a = rv20Var;
        this.f214299b = z;
        this.f214300c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv20)) {
            return false;
        }
        sv20 sv20Var = (sv20) obj;
        return wj50.m88271j(this.f214298a, sv20Var.f214298a) && this.f214299b == sv20Var.f214299b && this.f214300c == sv20Var.f214300c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214300c) + s571.m77245d(this.f214298a.hashCode() * 31, 31, this.f214299b);
    }
}
