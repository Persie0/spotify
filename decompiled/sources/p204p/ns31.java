package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ns31 {

    /* JADX INFO: renamed from: a */
    public final ibj f157657a;

    /* JADX INFO: renamed from: b */
    public final List f157658b;

    public ns31(ibj ibjVar, List list) {
        this.f157657a = ibjVar;
        this.f157658b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns31)) {
            return false;
        }
        ns31 ns31Var = (ns31) obj;
        return wj50.m88271j(this.f157657a, ns31Var.f157657a) && wj50.m88271j(this.f157658b, ns31Var.f157658b);
    }

    public final int hashCode() {
        return this.f157658b.hashCode() + (this.f157657a.hashCode() * 31);
    }
}
