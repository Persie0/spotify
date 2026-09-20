package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y241 {

    /* JADX INFO: renamed from: a */
    public final int f268453a;

    /* JADX INFO: renamed from: b */
    public final boolean f268454b;

    public y241(int i, boolean z) {
        this.f268453a = i;
        this.f268454b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y241)) {
            return false;
        }
        y241 y241Var = (y241) obj;
        return this.f268453a == y241Var.f268453a && this.f268454b == y241Var.f268454b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268454b) + (Integer.hashCode(this.f268453a) * 31);
    }
}
