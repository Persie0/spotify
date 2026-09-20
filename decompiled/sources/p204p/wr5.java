package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wr5 {

    /* JADX INFO: renamed from: a */
    public final v140 f254271a;

    /* JADX INFO: renamed from: b */
    public final v140 f254272b;

    /* JADX INFO: renamed from: c */
    public final List f254273c;

    public wr5(v140 v140Var, v140 v140Var2, List list) {
        this.f254271a = v140Var;
        this.f254272b = v140Var2;
        this.f254273c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr5)) {
            return false;
        }
        wr5 wr5Var = (wr5) obj;
        return wj50.m88271j(this.f254271a, wr5Var.f254271a) && wj50.m88271j(this.f254272b, wr5Var.f254272b) && wj50.m88271j(this.f254273c, wr5Var.f254273c);
    }

    public final int hashCode() {
        v140 v140Var = this.f254271a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        v140 v140Var2 = this.f254272b;
        int iHashCode2 = (iHashCode + (v140Var2 == null ? 0 : v140Var2.hashCode())) * 31;
        List list = this.f254273c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
