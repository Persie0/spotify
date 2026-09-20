package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tt81 {

    /* JADX INFO: renamed from: b */
    public static final tt81 f223553b;

    /* JADX INFO: renamed from: c */
    public static final String f223554c;

    /* JADX INFO: renamed from: a */
    public final pf40 f223555a;

    static {
        kf40 kf40Var = pf40.f176960b;
        f223553b = new tt81(wsv0.f254763e);
        String str = h0b1.f86200a;
        f223554c = Integer.toString(0, 36);
    }

    public tt81(wsv0 wsv0Var) {
        this.f223555a = pf40.m69791p(wsv0Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81500a(int i) {
        int i2 = 0;
        while (true) {
            pf40 pf40Var = this.f223555a;
            if (i2 >= pf40Var.size()) {
                return false;
            }
            st81 st81Var = (st81) pf40Var.get(i2);
            for (boolean z : st81Var.f213857e) {
                if (z) {
                    if (st81Var.f213854b.f122101c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tt81.class != obj.getClass()) {
            return false;
        }
        pf40 pf40Var = ((tt81) obj).f223555a;
        pf40 pf40Var2 = this.f223555a;
        pf40Var2.getClass();
        return pmf0.m70330p(pf40Var2, pf40Var);
    }

    public final int hashCode() {
        return this.f223555a.hashCode();
    }
}
