package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class w4i0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f247832a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f247833b;

    /* JADX INFO: renamed from: c */
    public final List f247834c;

    public w4i0(ArrayList arrayList, ArrayList arrayList2, List list) {
        this.f247832a = arrayList;
        this.f247833b = arrayList2;
        this.f247834c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4i0)) {
            return false;
        }
        w4i0 w4i0Var = (w4i0) obj;
        return this.f247832a.equals(w4i0Var.f247832a) && this.f247833b.equals(w4i0Var.f247833b) && wj50.m88271j(this.f247834c, w4i0Var.f247834c);
    }

    public final int hashCode() {
        return this.f247834c.hashCode() + lq51.m59700f(this.f247833b, this.f247832a.hashCode() * 31, 31);
    }
}
