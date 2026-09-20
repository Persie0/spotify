package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class klb1 {

    /* JADX INFO: renamed from: a */
    public final us4 f123853a = new us4(2, 28, null);

    /* JADX INFO: renamed from: b */
    public final uo5 f123854b;

    /* JADX INFO: renamed from: c */
    public final rat f123855c;

    /* JADX INFO: renamed from: d */
    public final mcs f123856d;

    public klb1(uo5 uo5Var, rat ratVar, mcs mcsVar) {
        this.f123854b = uo5Var;
        this.f123855c = ratVar;
        this.f123856d = mcsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klb1)) {
            return false;
        }
        klb1 klb1Var = (klb1) obj;
        return wj50.m88271j(this.f123853a, klb1Var.f123853a) && wj50.m88271j(this.f123854b, klb1Var.f123854b) && wj50.m88271j(this.f123855c, klb1Var.f123855c) && wj50.m88271j(this.f123856d, klb1Var.f123856d);
    }

    public final int hashCode() {
        return this.f123856d.hashCode() + ((this.f123855c.hashCode() + ((this.f123854b.hashCode() + (this.f123853a.hashCode() * 31)) * 31)) * 31);
    }
}
