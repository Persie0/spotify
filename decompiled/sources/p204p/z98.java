package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z98 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f280706a;

    public z98(ArrayList arrayList) {
        this.f280706a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z98) && this.f280706a.equals(((z98) obj).f280706a);
    }

    public final int hashCode() {
        return this.f280706a.hashCode();
    }
}
