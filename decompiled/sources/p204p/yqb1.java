package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yqb1 extends arb1 {

    /* JADX INFO: renamed from: a */
    public final int f275185a;

    /* JADX INFO: renamed from: b */
    public final fq01 f275186b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f275187c;

    /* JADX INFO: renamed from: d */
    public final ho01 f275188d;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public yqb1(int i, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f275185a = i;
        this.f275186b = fq01Var;
        this.f275187c = ccl0Var;
        this.f275188d = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqb1)) {
            return false;
        }
        yqb1 yqb1Var = (yqb1) obj;
        return this.f275185a == yqb1Var.f275185a && wj50.m88271j(this.f275186b, yqb1Var.f275186b) && wj50.m88271j(this.f275187c, yqb1Var.f275187c) && wj50.m88271j(this.f275188d, yqb1Var.f275188d);
    }

    public final int hashCode() {
        int iHashCode = (this.f275186b.hashCode() + (Integer.hashCode(this.f275185a) * 31)) * 31;
        ccl0 ccl0Var = this.f275187c;
        return this.f275188d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
