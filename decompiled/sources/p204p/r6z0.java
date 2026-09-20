package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r6z0 {

    /* JADX INFO: renamed from: a */
    public final dut f196395a;

    /* JADX INFO: renamed from: b */
    public final Object f196396b;

    /* JADX INFO: renamed from: c */
    public final int f196397c;

    public r6z0(dut dutVar, Object obj, int i) {
        this.f196395a = dutVar;
        this.f196396b = obj;
        this.f196397c = i;
    }

    /* JADX INFO: renamed from: a */
    public final dut m74879a() {
        return this.f196395a;
    }

    /* JADX INFO: renamed from: b */
    public final int m74880b() {
        return this.f196397c;
    }

    /* JADX INFO: renamed from: c */
    public final Object m74881c() {
        return this.f196396b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6z0)) {
            return false;
        }
        r6z0 r6z0Var = (r6z0) obj;
        return wj50.m88271j(this.f196395a, r6z0Var.f196395a) && wj50.m88271j(this.f196396b, r6z0Var.f196396b) && this.f196397c == r6z0Var.f196397c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f196397c) + dq60.m36604d(this.f196395a.hashCode() * 31, 31, this.f196396b);
    }
}
