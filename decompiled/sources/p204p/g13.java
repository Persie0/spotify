package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g13 {

    /* JADX INFO: renamed from: a */
    public final hz80 f75518a;

    /* JADX INFO: renamed from: b */
    public final boolean f75519b;

    public g13(hz80 hz80Var, boolean z) {
        this.f75518a = hz80Var;
        this.f75519b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return wj50.m88271j(this.f75518a, g13Var.f75518a) && this.f75519b == g13Var.f75519b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75519b) + (this.f75518a.hashCode() * 31);
    }
}
