package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m340 {

    /* JADX INFO: renamed from: a */
    public final List f139524a;

    /* JADX INFO: renamed from: b */
    public final w240 f139525b;

    /* JADX INFO: renamed from: c */
    public final int f139526c;

    public m340(List list, w240 w240Var, int i) {
        this.f139524a = list;
        this.f139525b = w240Var;
        this.f139526c = i;
    }

    /* JADX INFO: renamed from: a */
    public final z240 m60640a(a340 a340Var) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f139524a) {
            if (((z240) obj2).f278476b.compareTo(a340Var) <= 0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iOrdinal = ((z240) next).f278476b.ordinal();
                do {
                    Object next2 = it.next();
                    int iOrdinal2 = ((z240) next2).f278476b.ordinal();
                    if (iOrdinal < iOrdinal2) {
                        next = next2;
                        iOrdinal = iOrdinal2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (z240) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m340)) {
            return false;
        }
        m340 m340Var = (m340) obj;
        return wj50.m88271j(this.f139524a, m340Var.f139524a) && wj50.m88271j(this.f139525b, m340Var.f139525b) && this.f139526c == m340Var.f139526c;
    }

    public final int hashCode() {
        int iHashCode = this.f139524a.hashCode() * 31;
        w240 w240Var = this.f139525b;
        return edb.m38547C(this.f139526c) + ((iHashCode + (w240Var == null ? 0 : w240Var.hashCode())) * 31);
    }

    public /* synthetic */ m340(int i, List list) {
        this((i & 1) != 0 ? lau.f131415a : list, null, 1);
    }
}
