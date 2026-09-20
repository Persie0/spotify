package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class spy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f212967a;

    /* JADX INFO: renamed from: b */
    public final boolean f212968b;

    public spy0(boolean z, boolean z2) {
        this.f212967a = z;
        this.f212968b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spy0)) {
            return false;
        }
        spy0 spy0Var = (spy0) obj;
        return this.f212967a == spy0Var.f212967a && this.f212968b == spy0Var.f212968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212968b) + (Boolean.hashCode(this.f212967a) * 31);
    }
}
