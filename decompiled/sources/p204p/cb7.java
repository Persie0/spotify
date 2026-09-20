package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cb7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f36029a;

    public cb7(ArrayList arrayList) {
        this.f36029a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb7) && this.f36029a.equals(((cb7) obj).f36029a);
    }

    public final int hashCode() {
        return this.f36029a.hashCode();
    }
}
