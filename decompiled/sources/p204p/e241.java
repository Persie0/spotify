package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e241 {

    /* JADX INFO: renamed from: a */
    public final boolean f55343a;

    /* JADX INFO: renamed from: b */
    public final boolean f55344b;

    public e241(boolean z, boolean z2) {
        this.f55343a = z;
        this.f55344b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e241)) {
            return false;
        }
        e241 e241Var = (e241) obj;
        return this.f55343a == e241Var.f55343a && this.f55344b == e241Var.f55344b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55344b) + (Boolean.hashCode(this.f55343a) * 31);
    }
}
