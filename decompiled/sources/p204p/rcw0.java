package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rcw0 {

    /* JADX INFO: renamed from: a */
    public final int f197933a;

    /* JADX INFO: renamed from: b */
    public final String f197934b;

    /* JADX INFO: renamed from: c */
    public final fgr f197935c;

    /* JADX INFO: renamed from: d */
    public final psx0 f197936d;

    public rcw0(int i, String str, fgr fgrVar, psx0 psx0Var) {
        this.f197933a = i;
        this.f197934b = str;
        this.f197935c = fgrVar;
        this.f197936d = psx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcw0)) {
            return false;
        }
        rcw0 rcw0Var = (rcw0) obj;
        return this.f197933a == rcw0Var.f197933a && wj50.m88271j(this.f197934b, rcw0Var.f197934b) && wj50.m88271j(this.f197935c, rcw0Var.f197935c) && wj50.m88271j(this.f197936d, rcw0Var.f197936d);
    }

    public final int hashCode() {
        return this.f197936d.hashCode() + ((this.f197935c.hashCode() + s571.m77243b(Integer.hashCode(this.f197933a) * 31, 31, this.f197934b)) * 31);
    }
}
