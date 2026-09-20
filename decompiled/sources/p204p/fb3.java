package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fb3 {

    /* JADX INFO: renamed from: a */
    public final String f67693a;

    /* JADX INFO: renamed from: b */
    public final boolean f67694b;

    /* JADX INFO: renamed from: c */
    public final boolean f67695c;

    /* JADX INFO: renamed from: d */
    public final String f67696d;

    /* JADX INFO: renamed from: e */
    public final String f67697e;

    /* JADX INFO: renamed from: f */
    public final boolean f67698f;

    public fb3(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f67693a = str;
        this.f67694b = z;
        this.f67695c = z2;
        this.f67696d = str2;
        this.f67697e = str3;
        this.f67698f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb3)) {
            return false;
        }
        fb3 fb3Var = (fb3) obj;
        return wj50.m88271j(this.f67693a, fb3Var.f67693a) && this.f67694b == fb3Var.f67694b && this.f67695c == fb3Var.f67695c && wj50.m88271j(this.f67696d, fb3Var.f67696d) && wj50.m88271j(this.f67697e, fb3Var.f67697e) && this.f67698f == fb3Var.f67698f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67698f) + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(this.f67693a.hashCode() * 31, 31, this.f67694b), 31, this.f67695c), 31, this.f67696d), 31, this.f67697e);
    }
}
