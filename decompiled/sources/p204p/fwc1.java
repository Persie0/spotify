package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class fwc1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f74047a;

    public fwc1(ArrayList arrayList) {
        this.f74047a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwc1) && this.f74047a.equals(((fwc1) obj).f74047a);
    }

    public final int hashCode() {
        return this.f74047a.hashCode();
    }
}
