package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zzm0 {

    /* JADX INFO: renamed from: a */
    public final a0n0 f288028a;

    /* JADX INFO: renamed from: b */
    public final boolean f288029b;

    public zzm0(a0n0 a0n0Var, boolean z) {
        this.f288028a = a0n0Var;
        this.f288029b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzm0)) {
            return false;
        }
        zzm0 zzm0Var = (zzm0) obj;
        return this.f288028a == zzm0Var.f288028a && this.f288029b == zzm0Var.f288029b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288029b) + (this.f288028a.hashCode() * 31);
    }
}
