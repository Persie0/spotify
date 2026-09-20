package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h46 {

    /* JADX INFO: renamed from: a */
    public final String f87439a;

    /* JADX INFO: renamed from: b */
    public final String f87440b;

    /* JADX INFO: renamed from: c */
    public final boolean f87441c;

    public h46(String str, String str2, boolean z) {
        this.f87439a = str;
        this.f87440b = str2;
        this.f87441c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h46)) {
            return false;
        }
        h46 h46Var = (h46) obj;
        return wj50.m88271j(this.f87439a, h46Var.f87439a) && wj50.m88271j(this.f87440b, h46Var.f87440b) && this.f87441c == h46Var.f87441c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87441c) + s571.m77243b(this.f87439a.hashCode() * 31, 31, this.f87440b);
    }
}
