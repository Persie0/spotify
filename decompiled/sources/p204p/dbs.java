package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class dbs implements fbs {

    /* JADX INFO: renamed from: a */
    public final ArrayList f47353a;

    /* JADX INFO: renamed from: b */
    public final Throwable f47354b;

    public dbs(ArrayList arrayList, Throwable th) {
        this.f47353a = arrayList;
        this.f47354b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbs)) {
            return false;
        }
        dbs dbsVar = (dbs) obj;
        return this.f47353a.equals(dbsVar.f47353a) && this.f47354b.equals(dbsVar.f47354b);
    }

    public final int hashCode() {
        return this.f47354b.hashCode() + (this.f47353a.hashCode() * 31);
    }
}
