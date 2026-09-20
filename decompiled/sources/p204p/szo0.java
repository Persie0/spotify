package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class szo0 {

    /* JADX INFO: renamed from: a */
    public final hq10 f215622a;

    /* JADX INFO: renamed from: b */
    public final iq10 f215623b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f215624c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f215625d;

    public szo0(hq10 hq10Var, iq10 iq10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.f215622a = hq10Var;
        this.f215623b = iq10Var;
        this.f215624c = arrayList;
        this.f215625d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szo0)) {
            return false;
        }
        szo0 szo0Var = (szo0) obj;
        return wj50.m88271j(this.f215622a, szo0Var.f215622a) && this.f215623b == szo0Var.f215623b && this.f215624c.equals(szo0Var.f215624c) && this.f215625d.equals(szo0Var.f215625d);
    }

    public final int hashCode() {
        return this.f215625d.hashCode() + lq51.m59700f(this.f215624c, (this.f215623b.hashCode() + (this.f215622a.hashCode() * 31)) * 31, 31);
    }
}
