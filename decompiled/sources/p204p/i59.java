package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class i59 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f98847a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f98848b;

    public i59(ArrayList arrayList, ArrayList arrayList2) {
        this.f98847a = arrayList;
        this.f98848b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i59)) {
            return false;
        }
        i59 i59Var = (i59) obj;
        return this.f98847a.equals(i59Var.f98847a) && this.f98848b.equals(i59Var.f98848b);
    }

    public final int hashCode() {
        return this.f98848b.hashCode() + (this.f98847a.hashCode() * 31);
    }
}
