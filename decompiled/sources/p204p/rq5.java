package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rq5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f201756a;

    public rq5(ArrayList arrayList) {
        this.f201756a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq5) && this.f201756a.equals(((rq5) obj).f201756a);
    }

    public final int hashCode() {
        return this.f201756a.hashCode();
    }
}
