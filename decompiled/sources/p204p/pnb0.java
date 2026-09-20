package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pnb0 {

    /* JADX INFO: renamed from: a */
    public final List f179357a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f179358b;

    /* JADX INFO: renamed from: c */
    public final boolean f179359c;

    public pnb0(ArrayList arrayList, List list, boolean z) {
        this.f179357a = list;
        this.f179358b = arrayList;
        this.f179359c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnb0)) {
            return false;
        }
        pnb0 pnb0Var = (pnb0) obj;
        return this.f179357a.equals(pnb0Var.f179357a) && this.f179358b.equals(pnb0Var.f179358b) && this.f179359c == pnb0Var.f179359c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179359c) + lq51.m59700f(this.f179358b, this.f179357a.hashCode() * 31, 31);
    }
}
