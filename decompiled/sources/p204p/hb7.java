package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hb7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f89417a;

    public hb7(ArrayList arrayList) {
        this.f89417a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb7) && this.f89417a.equals(((hb7) obj).f89417a);
    }

    public final int hashCode() {
        return this.f89417a.hashCode();
    }
}
