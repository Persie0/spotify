package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z7x0 {

    /* JADX INFO: renamed from: a */
    public final String f280291a;

    /* JADX INFO: renamed from: b */
    public final String f280292b;

    /* JADX INFO: renamed from: c */
    public final String f280293c;

    /* JADX INFO: renamed from: d */
    public final boolean f280294d;

    /* JADX INFO: renamed from: e */
    public final boolean f280295e;

    public z7x0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f280291a = str;
        this.f280292b = str2;
        this.f280293c = str3;
        this.f280294d = z;
        this.f280295e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7x0)) {
            return false;
        }
        z7x0 z7x0Var = (z7x0) obj;
        return wj50.m88271j(this.f280291a, z7x0Var.f280291a) && wj50.m88271j(this.f280292b, z7x0Var.f280292b) && wj50.m88271j(this.f280293c, z7x0Var.f280293c) && this.f280294d == z7x0Var.f280294d && this.f280295e == z7x0Var.f280295e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f280291a.hashCode() * 31, 31, this.f280292b);
        String str = this.f280293c;
        return Boolean.hashCode(this.f280295e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f280294d);
    }
}
