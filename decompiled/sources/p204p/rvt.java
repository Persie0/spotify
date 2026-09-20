package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rvt implements svt {

    /* JADX INFO: renamed from: a */
    public final ArrayList f203127a;

    public rvt(ArrayList arrayList) {
        this.f203127a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvt) && this.f203127a.equals(((rvt) obj).f203127a);
    }

    public final int hashCode() {
        return this.f203127a.hashCode();
    }
}
