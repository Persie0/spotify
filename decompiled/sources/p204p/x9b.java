package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class x9b implements vwf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f259311a;

    public x9b(ArrayList arrayList) {
        this.f259311a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9b) && this.f259311a.equals(((x9b) obj).f259311a);
    }

    public final int hashCode() {
        return this.f259311a.hashCode();
    }
}
