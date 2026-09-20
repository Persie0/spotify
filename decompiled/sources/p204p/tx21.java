package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tx21 extends ux21 {

    /* JADX INFO: renamed from: a */
    public final int f224549a;

    /* JADX INFO: renamed from: b */
    public final d850 f224550b;

    public tx21(int i, d850 d850Var) {
        this.f224549a = i;
        this.f224550b = d850Var;
    }

    @Override // p204p.ux21
    /* JADX INFO: renamed from: a */
    public final int mo79571a() {
        return this.f224549a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx21)) {
            return false;
        }
        tx21 tx21Var = (tx21) obj;
        return this.f224549a == tx21Var.f224549a && wj50.m88271j(this.f224550b, tx21Var.f224550b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f224549a) * 31;
        d850 d850Var = this.f224550b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
