package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class y3a implements a4a {

    /* JADX INFO: renamed from: a */
    public final int f268789a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f268790b;

    public y3a(int i, ArrayList arrayList) {
        this.f268789a = i;
        this.f268790b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3a)) {
            return false;
        }
        y3a y3aVar = (y3a) obj;
        return this.f268789a == y3aVar.f268789a && this.f268790b.equals(y3aVar.f268790b);
    }

    public final int hashCode() {
        return this.f268790b.hashCode() + (edb.m38547C(this.f268789a) * 31);
    }
}
