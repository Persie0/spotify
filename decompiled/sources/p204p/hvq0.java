package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f95771a;

    /* JADX INFO: renamed from: b */
    public final boolean f95772b;

    public hvq0(String str, boolean z) {
        this.f95771a = str;
        this.f95772b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvq0)) {
            return false;
        }
        hvq0 hvq0Var = (hvq0) obj;
        return wj50.m88271j(this.f95771a, hvq0Var.f95771a) && this.f95772b == hvq0Var.f95772b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95772b) + (this.f95771a.hashCode() * 31);
    }
}
