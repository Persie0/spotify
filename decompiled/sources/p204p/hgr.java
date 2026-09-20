package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class hgr extends igr {

    /* JADX INFO: renamed from: a */
    public final ArrayList f91192a;

    public hgr(ArrayList arrayList) {
        this.f91192a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgr) && this.f91192a.equals(((hgr) obj).f91192a);
    }

    public final int hashCode() {
        return this.f91192a.hashCode();
    }
}
