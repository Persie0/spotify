package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zhg1 {

    /* JADX INFO: renamed from: a */
    public final int f282919a;

    /* JADX INFO: renamed from: b */
    public final pf40 f282920b;

    public zhg1(int i, pf40 pf40Var) {
        this.f282919a = i;
        this.f282920b = pf40Var;
    }

    /* JADX INFO: renamed from: a */
    public static mbg1 m96130a() {
        return new mbg1();
    }

    /* JADX INFO: renamed from: b */
    public final int m96131b() {
        return this.f282919a;
    }

    /* JADX INFO: renamed from: c */
    public final pf40 m96132c() {
        return this.f282920b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zhg1) {
            zhg1 zhg1Var = (zhg1) obj;
            if (this.f282919a == zhg1Var.f282919a) {
                pf40 pf40Var = zhg1Var.f282920b;
                pf40 pf40Var2 = this.f282920b;
                pf40Var2.getClass();
                if (pmf0.m70330p(pf40Var2, pf40Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f282919a ^ 1000003) * 1000003) ^ this.f282920b.hashCode();
    }

    public final String toString() {
        return "ClientQueue{currentIndex=" + this.f282919a + ", entries=" + this.f282920b.toString() + "}";
    }
}
