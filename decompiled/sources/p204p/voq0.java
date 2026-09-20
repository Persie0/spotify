package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class voq0 {

    /* JADX INFO: renamed from: a */
    public final s920 f243521a;

    /* JADX INFO: renamed from: b */
    public final int f243522b;

    public voq0(s920 s920Var, int i) {
        this.f243521a = s920Var;
        this.f243522b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voq0)) {
            return false;
        }
        voq0 voq0Var = (voq0) obj;
        return wj50.m88271j(this.f243521a, voq0Var.f243521a) && this.f243522b == voq0Var.f243522b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243522b) + (this.f243521a.hashCode() * 31);
    }
}
