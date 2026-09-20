package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class hid0 implements iid0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f91794a;

    public hid0(ArrayList arrayList) {
        this.f91794a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hid0) && this.f91794a.equals(((hid0) obj).f91794a);
    }

    public final int hashCode() {
        return this.f91794a.hashCode();
    }
}
