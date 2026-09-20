package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hw21 {

    /* JADX INFO: renamed from: a */
    public final dut f95842a;

    /* JADX INFO: renamed from: b */
    public final tw21 f95843b;

    /* JADX INFO: renamed from: c */
    public final fxh0 f95844c;

    public hw21(dut dutVar, tw21 tw21Var, fxh0 fxh0Var) {
        this.f95842a = dutVar;
        this.f95843b = tw21Var;
        this.f95844c = fxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw21)) {
            return false;
        }
        hw21 hw21Var = (hw21) obj;
        return wj50.m88271j(this.f95842a, hw21Var.f95842a) && wj50.m88271j(this.f95843b, hw21Var.f95843b) && wj50.m88271j(this.f95844c, hw21Var.f95844c);
    }

    public final int hashCode() {
        return this.f95844c.hashCode() + ((this.f95843b.hashCode() + (this.f95842a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ hw21(dut dutVar, mc21 mc21Var) {
        this(dutVar, mc21Var, cxh0.f43038a);
    }
}
