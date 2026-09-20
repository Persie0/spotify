package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class j6s implements l6s {

    /* JADX INFO: renamed from: a */
    public final ArrayList f109395a;

    /* JADX INFO: renamed from: b */
    public final Throwable f109396b;

    public j6s(ArrayList arrayList, Throwable th) {
        this.f109395a = arrayList;
        this.f109396b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6s)) {
            return false;
        }
        j6s j6sVar = (j6s) obj;
        return this.f109395a.equals(j6sVar.f109395a) && this.f109396b.equals(j6sVar.f109396b);
    }

    public final int hashCode() {
        return this.f109396b.hashCode() + (this.f109395a.hashCode() * 31);
    }
}
