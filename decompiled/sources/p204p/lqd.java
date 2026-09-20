package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lqd implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f136011a;

    public lqd(ArrayList arrayList) {
        this.f136011a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqd) && this.f136011a.equals(((lqd) obj).f136011a);
    }

    public final int hashCode() {
        return this.f136011a.hashCode();
    }
}
