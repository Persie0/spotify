package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j0m {

    /* JADX INFO: renamed from: a */
    public final int f107483a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f107484b;

    public j0m(int i, ArrayList arrayList) {
        this.f107483a = i;
        this.f107484b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0m)) {
            return false;
        }
        j0m j0mVar = (j0m) obj;
        return this.f107483a == j0mVar.f107483a && this.f107484b.equals(j0mVar.f107484b);
    }

    public final int hashCode() {
        return this.f107484b.hashCode() + (Integer.hashCode(this.f107483a) * 31);
    }
}
