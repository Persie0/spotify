package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s78 {

    /* JADX INFO: renamed from: a */
    public final String f206291a;

    /* JADX INFO: renamed from: b */
    public final String f206292b;

    /* JADX INFO: renamed from: c */
    public final xfr f206293c;

    /* JADX INFO: renamed from: d */
    public final boolean f206294d;

    public s78(String str, String str2, xfr xfrVar, boolean z) {
        this.f206291a = str;
        this.f206292b = str2;
        this.f206293c = xfrVar;
        this.f206294d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78Var = (s78) obj;
        return wj50.m88271j(this.f206291a, s78Var.f206291a) && wj50.m88271j(this.f206292b, s78Var.f206292b) && this.f206293c == s78Var.f206293c && this.f206294d == s78Var.f206294d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206294d) + ((this.f206293c.hashCode() + s571.m77243b(this.f206291a.hashCode() * 31, 31, this.f206292b)) * 31);
    }
}
