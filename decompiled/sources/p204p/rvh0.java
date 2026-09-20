package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rvh0 {

    /* JADX INFO: renamed from: a */
    public final oh91 f203086a;

    /* JADX INFO: renamed from: b */
    public final bh91 f203087b;

    public rvh0(oh91 oh91Var, bh91 bh91Var) {
        this.f203086a = oh91Var;
        this.f203087b = bh91Var;
    }

    /* JADX INFO: renamed from: a */
    public static rvh0 m76480a(rvh0 rvh0Var, oh91 oh91Var) {
        bh91 bh91Var = rvh0Var.f203087b;
        rvh0Var.getClass();
        return new rvh0(oh91Var, bh91Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvh0)) {
            return false;
        }
        rvh0 rvh0Var = (rvh0) obj;
        return wj50.m88271j(this.f203086a, rvh0Var.f203086a) && wj50.m88271j(this.f203087b, rvh0Var.f203087b);
    }

    public final int hashCode() {
        return this.f203087b.hashCode() + (this.f203086a.hashCode() * 31);
    }
}
