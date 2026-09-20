package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class euh {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62980a;

    /* JADX INFO: renamed from: b */
    public final List f62981b;

    public euh(ArrayList arrayList, List list) {
        this.f62980a = arrayList;
        this.f62981b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euh)) {
            return false;
        }
        euh euhVar = (euh) obj;
        return this.f62980a.equals(euhVar.f62980a) && this.f62981b.equals(euhVar.f62981b);
    }

    public final int hashCode() {
        return this.f62981b.hashCode() + (this.f62980a.hashCode() * 31);
    }
}
