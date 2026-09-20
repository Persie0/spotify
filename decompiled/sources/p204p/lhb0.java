package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lhb0 implements mhb0 {

    /* JADX INFO: renamed from: a */
    public final s7f f133464a;

    /* JADX INFO: renamed from: b */
    public final int f133465b;

    public lhb0(int i, s7f s7fVar) {
        this.f133464a = s7fVar;
        this.f133465b = i;
    }

    @Override // p204p.mhb0
    /* JADX INFO: renamed from: a */
    public final s7f mo53373a() {
        return this.f133464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhb0)) {
            return false;
        }
        lhb0 lhb0Var = (lhb0) obj;
        return wj50.m88271j(this.f133464a, lhb0Var.f133464a) && this.f133465b == lhb0Var.f133465b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133465b) + (this.f133464a.hashCode() * 31);
    }
}
