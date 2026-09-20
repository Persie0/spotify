package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class pfa1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f177019a;

    /* JADX INFO: renamed from: b */
    public final idd0 f177020b;

    /* JADX INFO: renamed from: c */
    public final int f177021c;

    public pfa1(ArrayList arrayList, idd0 idd0Var, int i) {
        this.f177019a = arrayList;
        this.f177020b = idd0Var;
        this.f177021c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfa1)) {
            return false;
        }
        pfa1 pfa1Var = (pfa1) obj;
        return this.f177019a.equals(pfa1Var.f177019a) && this.f177020b == pfa1Var.f177020b && this.f177021c == pfa1Var.f177021c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177021c) + ((this.f177020b.hashCode() + (this.f177019a.hashCode() * 31)) * 31);
    }
}
