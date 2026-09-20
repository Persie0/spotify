package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fba0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67774a;

    public fba0(ArrayList arrayList) {
        this.f67774a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fba0) && this.f67774a.equals(((fba0) obj).f67774a);
    }

    public final int hashCode() {
        return this.f67774a.hashCode();
    }
}
