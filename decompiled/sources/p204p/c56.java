package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c56 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34092a;

    public c56(ArrayList arrayList) {
        this.f34092a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c56) && this.f34092a.equals(((c56) obj).f34092a);
    }

    public final int hashCode() {
        return this.f34092a.hashCode();
    }
}
