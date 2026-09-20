package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class asb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f19383a;

    /* JADX INFO: renamed from: b */
    public final boolean f19384b;

    public asb1(boolean z, boolean z2) {
        this.f19383a = z;
        this.f19384b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asb1)) {
            return false;
        }
        asb1 asb1Var = (asb1) obj;
        return this.f19383a == asb1Var.f19383a && this.f19384b == asb1Var.f19384b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19384b) + (Boolean.hashCode(this.f19383a) * 31);
    }
}
