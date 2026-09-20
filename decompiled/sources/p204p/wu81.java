package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wu81 {

    /* JADX INFO: renamed from: a */
    public final String f255123a;

    /* JADX INFO: renamed from: b */
    public final String f255124b;

    /* JADX INFO: renamed from: c */
    public final boolean f255125c;

    public wu81(String str, String str2, boolean z) {
        this.f255123a = str;
        this.f255124b = str2;
        this.f255125c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu81)) {
            return false;
        }
        wu81 wu81Var = (wu81) obj;
        return wj50.m88271j(this.f255123a, wu81Var.f255123a) && wj50.m88271j(this.f255124b, wu81Var.f255124b) && this.f255125c == wu81Var.f255125c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255125c) + s571.m77245d(mt60.m62800g(0, s571.m77245d((((this.f255124b.hashCode() + (this.f255123a.hashCode() * 31)) * 31) - 1112885398) * 31, 31, true), 31), 31, false);
    }
}
