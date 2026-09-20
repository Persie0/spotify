package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ka30 implements la30 {

    /* JADX INFO: renamed from: a */
    public final boolean f120775a;

    /* JADX INFO: renamed from: b */
    public final int f120776b;

    /* JADX INFO: renamed from: c */
    public final q730 f120777c;

    public ka30(boolean z, int i, q730 q730Var) {
        this.f120775a = z;
        this.f120776b = i;
        this.f120777c = q730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka30)) {
            return false;
        }
        ka30 ka30Var = (ka30) obj;
        return this.f120775a == ka30Var.f120775a && this.f120776b == ka30Var.f120776b && wj50.m88271j(this.f120777c, ka30Var.f120777c);
    }

    public final int hashCode() {
        return this.f120777c.hashCode() + f710.m40938f(this.f120776b, Boolean.hashCode(this.f120775a) * 31, 31);
    }
}
