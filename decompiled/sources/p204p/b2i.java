package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b2i implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f22614a;

    public b2i(ArrayList arrayList) {
        this.f22614a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2i) && this.f22614a.equals(((b2i) obj).f22614a);
    }

    public final int hashCode() {
        return this.f22614a.hashCode();
    }
}
