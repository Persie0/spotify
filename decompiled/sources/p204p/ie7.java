package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ie7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f101336a;

    public ie7(ArrayList arrayList) {
        this.f101336a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie7) && this.f101336a.equals(((ie7) obj).f101336a);
    }

    public final int hashCode() {
        return this.f101336a.hashCode();
    }
}
