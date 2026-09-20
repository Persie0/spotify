package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ohj {

    /* JADX INFO: renamed from: a */
    public final ArrayList f165471a;

    /* JADX INFO: renamed from: b */
    public final boolean f165472b;

    public ohj(ArrayList arrayList, boolean z) {
        this.f165471a = arrayList;
        this.f165472b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohj)) {
            return false;
        }
        ohj ohjVar = (ohj) obj;
        return this.f165471a.equals(ohjVar.f165471a) && this.f165472b == ohjVar.f165472b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165472b) + (this.f165471a.hashCode() * 31);
    }
}
