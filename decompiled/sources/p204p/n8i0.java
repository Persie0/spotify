package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n8i0 {

    /* JADX INFO: renamed from: a */
    public final String f151541a;

    /* JADX INFO: renamed from: b */
    public final String f151542b;

    /* JADX INFO: renamed from: c */
    public final String f151543c;

    /* JADX INFO: renamed from: d */
    public final String f151544d;

    public n8i0(String str, String str2, String str3, String str4) {
        this.f151541a = str;
        this.f151542b = str2;
        this.f151543c = str3;
        this.f151544d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8i0)) {
            return false;
        }
        n8i0 n8i0Var = (n8i0) obj;
        return wj50.m88271j(this.f151541a, n8i0Var.f151541a) && wj50.m88271j(this.f151542b, n8i0Var.f151542b) && wj50.m88271j(this.f151543c, n8i0Var.f151543c) && wj50.m88271j(this.f151544d, n8i0Var.f151544d);
    }

    public final int hashCode() {
        return this.f151544d.hashCode() + s571.m77243b(s571.m77243b(this.f151541a.hashCode() * 31, 31, this.f151542b), 31, this.f151543c);
    }
}
