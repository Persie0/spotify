package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class pq10 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f180153a;

    public pq10(ArrayList arrayList) {
        this.f180153a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq10) && this.f180153a.equals(((pq10) obj).f180153a);
    }

    public final int hashCode() {
        return this.f180153a.hashCode();
    }
}
