package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class hlw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f92759a;

    public hlw0(ArrayList arrayList) {
        this.f92759a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlw0) && this.f92759a.equals(((hlw0) obj).f92759a);
    }

    public final int hashCode() {
        return this.f92759a.hashCode();
    }
}
