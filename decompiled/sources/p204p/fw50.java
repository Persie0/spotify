package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fw50 implements hw50 {

    /* JADX INFO: renamed from: a */
    public final c8r0 f73947a;

    /* JADX INFO: renamed from: b */
    public final s5a0 f73948b;

    public fw50(c8r0 c8r0Var, s5a0 s5a0Var) {
        this.f73947a = c8r0Var;
        this.f73948b = s5a0Var;
    }

    @Override // p204p.hw50
    /* JADX INFO: renamed from: a */
    public final s5a0 mo42939a() {
        return this.f73948b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw50)) {
            return false;
        }
        fw50 fw50Var = (fw50) obj;
        return wj50.m88271j(this.f73947a, fw50Var.f73947a) && wj50.m88271j(this.f73948b, fw50Var.f73948b);
    }

    public final int hashCode() {
        return this.f73948b.hashCode() + (this.f73947a.hashCode() * 31);
    }
}
