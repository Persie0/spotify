package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s0k {

    /* JADX INFO: renamed from: a */
    public final boolean f204424a;

    /* JADX INFO: renamed from: b */
    public final boolean f204425b;

    /* JADX INFO: renamed from: c */
    public final boolean f204426c;

    /* JADX INFO: renamed from: d */
    public final String f204427d;

    /* JADX INFO: renamed from: e */
    public final boolean f204428e;

    public s0k(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f204424a = z;
        this.f204425b = z2;
        this.f204426c = z3;
        this.f204427d = str;
        this.f204428e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0k)) {
            return false;
        }
        s0k s0kVar = (s0k) obj;
        return this.f204424a == s0kVar.f204424a && this.f204425b == s0kVar.f204425b && this.f204426c == s0kVar.f204426c && wj50.m88271j(this.f204427d, s0kVar.f204427d) && this.f204428e == s0kVar.f204428e;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f204424a) * 31, 31, this.f204425b), 31, this.f204426c);
        String str = this.f204427d;
        return Boolean.hashCode(this.f204428e) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
