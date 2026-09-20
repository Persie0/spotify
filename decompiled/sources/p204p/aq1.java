package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class aq1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final tq1 f18051a;

    /* JADX INFO: renamed from: b */
    public final z650 f18052b;

    public aq1(tq1 tq1Var, z650 z650Var) {
        this.f18051a = tq1Var;
        this.f18052b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1Var = (aq1) obj;
        return wj50.m88271j(this.f18051a, aq1Var.f18051a) && wj50.m88271j(this.f18052b, aq1Var.f18052b);
    }

    public final int hashCode() {
        return this.f18052b.f279709a.hashCode() + (this.f18051a.hashCode() * 31);
    }
}
