package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hls0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f92733a;

    public hls0(ArrayList arrayList) {
        this.f92733a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hls0) && this.f92733a.equals(((hls0) obj).f92733a);
    }

    public final int hashCode() {
        return this.f92733a.hashCode();
    }
}
