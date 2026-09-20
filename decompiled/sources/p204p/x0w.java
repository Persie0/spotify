package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class x0w {

    /* JADX INFO: renamed from: a */
    public final ArrayList f257003a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f257004b;

    public x0w(ArrayList arrayList, ArrayList arrayList2) {
        this.f257003a = arrayList;
        this.f257004b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0w)) {
            return false;
        }
        x0w x0wVar = (x0w) obj;
        return this.f257003a.equals(x0wVar.f257003a) && this.f257004b.equals(x0wVar.f257004b);
    }

    public final int hashCode() {
        return this.f257004b.hashCode() + (this.f257003a.hashCode() * 31);
    }
}
