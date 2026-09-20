package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mb21 {

    /* JADX INFO: renamed from: a */
    public final int f141767a;

    /* JADX INFO: renamed from: b */
    public final qf40 f141768b;

    public mb21(int i, qf40 qf40Var) {
        this.f141767a = i;
        this.f141768b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb21)) {
            return false;
        }
        mb21 mb21Var = (mb21) obj;
        return this.f141767a == mb21Var.f141767a && wj50.m88271j(this.f141768b, mb21Var.f141768b);
    }

    public final int hashCode() {
        return this.f141768b.hashCode() + (Integer.hashCode(this.f141767a) * 31);
    }
}
