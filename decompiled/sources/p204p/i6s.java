package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class i6s implements l6s {

    /* JADX INFO: renamed from: a */
    public final ArrayList f99314a;

    public i6s(ArrayList arrayList) {
        this.f99314a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6s) && this.f99314a.equals(((i6s) obj).f99314a);
    }

    public final int hashCode() {
        return this.f99314a.hashCode();
    }
}
