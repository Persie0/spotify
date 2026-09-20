package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hyv0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f96688a;

    public hyv0(ArrayList arrayList) {
        this.f96688a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyv0) && this.f96688a.equals(((hyv0) obj).f96688a);
    }

    public final int hashCode() {
        return this.f96688a.hashCode();
    }
}
