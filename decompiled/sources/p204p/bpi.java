package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bpi extends epi {

    /* JADX INFO: renamed from: a */
    public final ArrayList f29478a;

    public bpi(ArrayList arrayList) {
        this.f29478a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpi) && this.f29478a.equals(((bpi) obj).f29478a);
    }

    public final int hashCode() {
        return this.f29478a.hashCode();
    }
}
