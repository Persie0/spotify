package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class cwp0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f42799a;

    public cwp0(ArrayList arrayList) {
        this.f42799a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwp0) && this.f42799a.equals(((cwp0) obj).f42799a);
    }

    public final int hashCode() {
        return this.f42799a.hashCode();
    }
}
