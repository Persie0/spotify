package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z181 {

    /* JADX INFO: renamed from: a */
    public final a281 f278258a;

    /* JADX INFO: renamed from: b */
    public final List f278259b;

    /* JADX INFO: renamed from: c */
    public final boolean f278260c;

    /* JADX INFO: renamed from: d */
    public final boolean f278261d;

    public /* synthetic */ z181(a281 a281Var, List list, boolean z, int i) {
        this(a281Var, list, (i & 4) != 0 ? true : z, true);
    }

    /* JADX INFO: renamed from: a */
    public static z181 m95093a(z181 z181Var, List list) {
        a281 a281Var = z181Var.f278258a;
        boolean z = z181Var.f278260c;
        boolean z2 = z181Var.f278261d;
        z181Var.getClass();
        z181Var.getClass();
        return new z181(a281Var, list, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static w181 m95094b(List list) {
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        for (Object obj2 : list) {
            if (((w181) obj2).f247024d) {
                obj = obj2;
                break;
            }
        }
        w181 w181Var = (w181) obj;
        if (w181Var != null) {
            return w181Var;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((w181) it.next()).f247026f, arrayList);
        }
        return m95094b(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z181)) {
            return false;
        }
        z181 z181Var = (z181) obj;
        return wj50.m88271j(this.f278258a, z181Var.f278258a) && wj50.m88271j(this.f278259b, z181Var.f278259b) && this.f278260c == z181Var.f278260c && this.f278261d == z181Var.f278261d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(s571.m77245d(s571.m77244c(this.f278258a.hashCode() * 31, 31, this.f278259b), 31, this.f278260c), 31, this.f278261d);
    }

    public z181(a281 a281Var, List list, boolean z, boolean z2) {
        this.f278258a = a281Var;
        this.f278259b = list;
        this.f278260c = z;
        this.f278261d = z2;
    }
}
