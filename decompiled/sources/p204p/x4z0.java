package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class x4z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f258224a;

    public x4z0(ArrayList arrayList) {
        this.f258224a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4z0) && this.f258224a.equals(((x4z0) obj).f258224a);
    }

    public final int hashCode() {
        return this.f258224a.hashCode();
    }
}
