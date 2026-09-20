package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ljm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final List f134102a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f134103b;

    public ljm0(List list, gkm0 gkm0Var) {
        this.f134102a = list;
        this.f134103b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljm0)) {
            return false;
        }
        ljm0 ljm0Var = (ljm0) obj;
        return wj50.m88271j(this.f134102a, ljm0Var.f134102a) && wj50.m88271j(this.f134103b, ljm0Var.f134103b);
    }

    public final int hashCode() {
        return this.f134103b.hashCode() + (this.f134102a.hashCode() * 31);
    }
}
