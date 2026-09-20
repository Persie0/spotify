package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bwb0 implements dwb0 {

    /* JADX INFO: renamed from: a */
    public final dut f31605a;

    /* JADX INFO: renamed from: b */
    public final Object f31606b;

    /* JADX INFO: renamed from: c */
    public final xv41 f31607c;

    public bwb0(dut dutVar, Object obj, xv41 xv41Var) {
        this.f31605a = dutVar;
        this.f31606b = obj;
        this.f31607c = xv41Var;
    }

    @Override // p204p.dwb0
    /* JADX INFO: renamed from: a */
    public final xv41 mo30677a() {
        return this.f31607c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwb0)) {
            return false;
        }
        bwb0 bwb0Var = (bwb0) obj;
        return wj50.m88271j(this.f31605a, bwb0Var.f31605a) && wj50.m88271j(this.f31606b, bwb0Var.f31606b) && wj50.m88271j(this.f31607c, bwb0Var.f31607c);
    }

    public final int hashCode() {
        int iHashCode = this.f31605a.hashCode() * 31;
        Object obj = this.f31606b;
        return this.f31607c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }
}
