package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x4i0 {

    /* JADX INFO: renamed from: a */
    public final String f258134a;

    /* JADX INFO: renamed from: b */
    public final String f258135b;

    /* JADX INFO: renamed from: c */
    public final String f258136c;

    public x4i0(String str, String str2, String str3) {
        this.f258134a = str;
        this.f258135b = str2;
        this.f258136c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4i0)) {
            return false;
        }
        x4i0 x4i0Var = (x4i0) obj;
        return wj50.m88271j(this.f258134a, x4i0Var.f258134a) && wj50.m88271j(this.f258135b, x4i0Var.f258135b) && wj50.m88271j(this.f258136c, x4i0Var.f258136c);
    }

    public final int hashCode() {
        return this.f258136c.hashCode() + s571.m77243b(this.f258134a.hashCode() * 31, 31, this.f258135b);
    }
}
