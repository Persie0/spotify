package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yqt0 {

    /* JADX INFO: renamed from: a */
    public final String f275294a;

    /* JADX INFO: renamed from: b */
    public final boolean f275295b;

    /* JADX INFO: renamed from: c */
    public final boolean f275296c;

    public yqt0(String str, boolean z, boolean z2) {
        this.f275294a = str;
        this.f275295b = z;
        this.f275296c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqt0)) {
            return false;
        }
        yqt0 yqt0Var = (yqt0) obj;
        return wj50.m88271j(this.f275294a, yqt0Var.f275294a) && this.f275295b == yqt0Var.f275295b && this.f275296c == yqt0Var.f275296c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275296c) + s571.m77245d(this.f275294a.hashCode() * 31, 31, this.f275295b);
    }
}
