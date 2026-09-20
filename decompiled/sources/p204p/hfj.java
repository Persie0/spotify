package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hfj implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f90746a;

    public hfj(ArrayList arrayList) {
        this.f90746a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfj) && this.f90746a.equals(((hfj) obj).f90746a);
    }

    public final int hashCode() {
        return this.f90746a.hashCode();
    }
}
