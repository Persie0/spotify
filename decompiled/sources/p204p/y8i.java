package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class y8i {

    /* JADX INFO: renamed from: a */
    public final ArrayList f270304a;

    public y8i(ArrayList arrayList) {
        this.f270304a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8i) && this.f270304a.equals(((y8i) obj).f270304a);
    }

    public final int hashCode() {
        return this.f270304a.hashCode();
    }
}
