package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bpq0 {

    /* JADX INFO: renamed from: a */
    public final cqq0 f29565a;

    /* JADX INFO: renamed from: b */
    public final int f29566b;

    public bpq0(cqq0 cqq0Var, int i) {
        this.f29565a = cqq0Var;
        this.f29566b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpq0)) {
            return false;
        }
        bpq0 bpq0Var = (bpq0) obj;
        return wj50.m88271j(this.f29565a, bpq0Var.f29565a) && this.f29566b == bpq0Var.f29566b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29566b) + (this.f29565a.hashCode() * 31);
    }
}
