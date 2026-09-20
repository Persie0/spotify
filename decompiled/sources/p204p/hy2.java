package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hy2 {

    /* JADX INFO: renamed from: a */
    public final boolean f96432a;

    /* JADX INFO: renamed from: b */
    public final boolean f96433b;

    /* JADX INFO: renamed from: c */
    public final xcw0 f96434c;

    /* JADX INFO: renamed from: d */
    public final sg91 f96435d;

    public hy2(boolean z, boolean z2, xcw0 xcw0Var, sg91 sg91Var) {
        this.f96432a = z;
        this.f96433b = z2;
        this.f96434c = xcw0Var;
        this.f96435d = sg91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy2)) {
            return false;
        }
        hy2 hy2Var = (hy2) obj;
        return this.f96432a == hy2Var.f96432a && this.f96433b == hy2Var.f96433b && wj50.m88271j(this.f96434c, hy2Var.f96434c) && wj50.m88271j(this.f96435d, hy2Var.f96435d);
    }

    public final int hashCode() {
        return this.f96435d.hashCode() + ((this.f96434c.hashCode() + s571.m77245d(Boolean.hashCode(this.f96432a) * 31, 31, this.f96433b)) * 31);
    }
}
