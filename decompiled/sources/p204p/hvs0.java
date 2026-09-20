package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hvs0 {

    /* JADX INFO: renamed from: a */
    public final vco f95789a;

    /* JADX INFO: renamed from: b */
    public final boolean f95790b;

    public hvs0(vco vcoVar, boolean z) {
        this.f95789a = vcoVar;
        this.f95790b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvs0)) {
            return false;
        }
        hvs0 hvs0Var = (hvs0) obj;
        return wj50.m88271j(this.f95789a, hvs0Var.f95789a) && this.f95790b == hvs0Var.f95790b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95790b) + (this.f95789a.hashCode() * 31);
    }
}
