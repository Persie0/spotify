package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rc2 {

    /* JADX INFO: renamed from: a */
    public final int f197691a;

    /* JADX INFO: renamed from: b */
    public final jc2 f197692b;

    /* JADX INFO: renamed from: c */
    public final int f197693c;

    /* JADX INFO: renamed from: d */
    public final int f197694d;

    public rc2(int i, jc2 jc2Var, int i2, int i3) {
        this.f197691a = i;
        this.f197692b = jc2Var;
        this.f197693c = i2;
        this.f197694d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc2)) {
            return false;
        }
        rc2 rc2Var = (rc2) obj;
        return this.f197691a == rc2Var.f197691a && wj50.m88271j(this.f197692b, rc2Var.f197692b) && this.f197693c == rc2Var.f197693c && this.f197694d == rc2Var.f197694d;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f197691a) * 31;
        jc2 jc2Var = this.f197692b;
        return edb.m38547C(this.f197694d) + f710.m40938f(this.f197693c, (iM38547C + (jc2Var == null ? 0 : jc2Var.hashCode())) * 31, 31);
    }
}
