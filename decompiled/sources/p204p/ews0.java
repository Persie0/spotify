package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ews0 extends gws0 {

    /* JADX INFO: renamed from: a */
    public final int f63596a;

    /* JADX INFO: renamed from: b */
    public final fq01 f63597b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f63598c;

    /* JADX INFO: renamed from: d */
    public final ho01 f63599d;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public ews0(int i, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f63596a = i;
        this.f63597b = fq01Var;
        this.f63598c = ccl0Var;
        this.f63599d = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ews0)) {
            return false;
        }
        ews0 ews0Var = (ews0) obj;
        return this.f63596a == ews0Var.f63596a && wj50.m88271j(this.f63597b, ews0Var.f63597b) && wj50.m88271j(this.f63598c, ews0Var.f63598c) && wj50.m88271j(this.f63599d, ews0Var.f63599d);
    }

    public final int hashCode() {
        int iHashCode = (this.f63597b.hashCode() + (Integer.hashCode(this.f63596a) * 31)) * 31;
        ccl0 ccl0Var = this.f63598c;
        return this.f63599d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
