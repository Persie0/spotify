package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class im40 {

    /* JADX INFO: renamed from: a */
    public final scy0 f103588a;

    /* JADX INFO: renamed from: b */
    public final boolean f103589b;

    public im40(scy0 scy0Var, boolean z) {
        this.f103588a = scy0Var;
        this.f103589b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im40)) {
            return false;
        }
        im40 im40Var = (im40) obj;
        return wj50.m88271j(this.f103588a, im40Var.f103588a) && this.f103589b == im40Var.f103589b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103589b) + (this.f103588a.hashCode() * 31);
    }
}
