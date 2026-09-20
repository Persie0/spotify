package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fx60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final List f74272a;

    /* JADX INFO: renamed from: b */
    public final h400 f74273b;

    public fx60(ArrayList arrayList, h400 h400Var) {
        this.f74272a = arrayList;
        this.f74273b = h400Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx60)) {
            return false;
        }
        fx60 fx60Var = (fx60) obj;
        return wj50.m88271j(this.f74272a, fx60Var.f74272a) && wj50.m88271j(this.f74273b, fx60Var.f74273b);
    }

    public final int hashCode() {
        List list = this.f74272a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        h400 h400Var = this.f74273b;
        return iHashCode + (h400Var != null ? h400Var.hashCode() : 0);
    }
}
