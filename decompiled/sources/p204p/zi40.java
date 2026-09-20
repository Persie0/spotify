package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class zi40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final xi40 f283077a;

    /* JADX INFO: renamed from: b */
    public final kbm0 f283078b;

    public zi40(xi40 xi40Var, kbm0 kbm0Var) {
        this.f283077a = xi40Var;
        this.f283078b = kbm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi40)) {
            return false;
        }
        zi40 zi40Var = (zi40) obj;
        return wj50.m88271j(this.f283077a, zi40Var.f283077a) && wj50.m88271j(this.f283078b, zi40Var.f283078b);
    }

    public final int hashCode() {
        int iHashCode = this.f283077a.f261762a.hashCode() * 31;
        kbm0 kbm0Var = this.f283078b;
        return iHashCode + (kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode());
    }
}
