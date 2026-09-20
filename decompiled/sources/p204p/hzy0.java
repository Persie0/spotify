package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hzy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f97061a;

    /* JADX INFO: renamed from: b */
    public final boolean f97062b;

    public hzy0(boolean z, boolean z2) {
        this.f97061a = z;
        this.f97062b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzy0)) {
            return false;
        }
        hzy0 hzy0Var = (hzy0) obj;
        return this.f97061a == hzy0Var.f97061a && this.f97062b == hzy0Var.f97062b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97062b) + (Boolean.hashCode(this.f97061a) * 31);
    }
}
