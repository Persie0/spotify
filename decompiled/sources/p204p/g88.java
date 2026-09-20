package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f77433a;

    /* JADX INFO: renamed from: b */
    public final boolean f77434b;

    public g88(int i, boolean z) {
        this.f77433a = i;
        this.f77434b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g88)) {
            return false;
        }
        g88 g88Var = (g88) obj;
        return this.f77433a == g88Var.f77433a && this.f77434b == g88Var.f77434b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77434b) + (Integer.hashCode(this.f77433a) * 31);
    }
}
