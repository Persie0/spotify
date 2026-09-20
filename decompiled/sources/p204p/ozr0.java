package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ozr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final p0s0 f172350a;

    /* JADX INFO: renamed from: b */
    public final int f172351b;

    public ozr0(p0s0 p0s0Var, int i) {
        this.f172350a = p0s0Var;
        this.f172351b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozr0)) {
            return false;
        }
        ozr0 ozr0Var = (ozr0) obj;
        return wj50.m88271j(this.f172350a, ozr0Var.f172350a) && this.f172351b == ozr0Var.f172351b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f172351b) + (this.f172350a.hashCode() * 31);
    }
}
