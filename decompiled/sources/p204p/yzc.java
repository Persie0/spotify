package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yzc {

    /* JADX INFO: renamed from: a */
    public final qf40 f277758a;

    /* JADX INFO: renamed from: b */
    public final int f277759b;

    /* JADX INFO: renamed from: c */
    public final th00 f277760c;

    public yzc(int i, th00 th00Var, qf40 qf40Var) {
        this.f277758a = qf40Var;
        this.f277759b = i;
        this.f277760c = th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzc)) {
            return false;
        }
        yzc yzcVar = (yzc) obj;
        return wj50.m88271j(this.f277758a, yzcVar.f277758a) && this.f277759b == yzcVar.f277759b && wj50.m88271j(this.f277760c, yzcVar.f277760c);
    }

    public final int hashCode() {
        return this.f277760c.hashCode() + mt60.m62800g(this.f277759b, this.f277758a.hashCode() * 31, 31);
    }
}
