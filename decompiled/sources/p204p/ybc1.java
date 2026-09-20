package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ybc1 extends bcc1 {

    /* JADX INFO: renamed from: a */
    public final int f271155a;

    /* JADX INFO: renamed from: b */
    public final fq01 f271156b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f271157c;

    /* JADX INFO: renamed from: d */
    public final ho01 f271158d;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public ybc1(int i, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f271155a = i;
        this.f271156b = fq01Var;
        this.f271157c = ccl0Var;
        this.f271158d = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybc1)) {
            return false;
        }
        ybc1 ybc1Var = (ybc1) obj;
        return this.f271155a == ybc1Var.f271155a && wj50.m88271j(this.f271156b, ybc1Var.f271156b) && wj50.m88271j(this.f271157c, ybc1Var.f271157c) && wj50.m88271j(this.f271158d, ybc1Var.f271158d);
    }

    public final int hashCode() {
        int iHashCode = (this.f271156b.hashCode() + (Integer.hashCode(this.f271155a) * 31)) * 31;
        ccl0 ccl0Var = this.f271157c;
        return this.f271158d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
