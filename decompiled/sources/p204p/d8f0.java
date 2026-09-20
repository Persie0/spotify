package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d8f0 implements e8f0 {

    /* JADX INFO: renamed from: a */
    public final int f46440a;

    /* JADX INFO: renamed from: b */
    public final boolean f46441b;

    public d8f0(int i, boolean z) {
        this.f46440a = i;
        this.f46441b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8f0)) {
            return false;
        }
        d8f0 d8f0Var = (d8f0) obj;
        return this.f46440a == d8f0Var.f46440a && this.f46441b == d8f0Var.f46441b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46441b) + (Integer.hashCode(this.f46440a) * 31);
    }
}
