package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hvo0 {

    /* JADX INFO: renamed from: a */
    public final String f95756a;

    /* JADX INFO: renamed from: b */
    public final String f95757b;

    /* JADX INFO: renamed from: c */
    public final boolean f95758c;

    /* JADX INFO: renamed from: d */
    public final boolean f95759d;

    public hvo0(String str, boolean z, String str2, boolean z2) {
        this.f95756a = str;
        this.f95757b = str2;
        this.f95758c = z;
        this.f95759d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvo0)) {
            return false;
        }
        hvo0 hvo0Var = (hvo0) obj;
        return wj50.m88271j(this.f95756a, hvo0Var.f95756a) && wj50.m88271j(this.f95757b, hvo0Var.f95757b) && this.f95758c == hvo0Var.f95758c && this.f95759d == hvo0Var.f95759d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95759d) + s571.m77245d(s571.m77243b(this.f95756a.hashCode() * 31, 31, this.f95757b), 31, this.f95758c);
    }
}
