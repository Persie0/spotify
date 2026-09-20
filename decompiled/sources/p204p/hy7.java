package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hy7 extends n59 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f96478a;

    public hy7(ArrayList arrayList) {
        this.f96478a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n59)) {
            return false;
        }
        return this.f96478a.equals(((hy7) ((n59) obj)).f96478a);
    }

    public final int hashCode() {
        return this.f96478a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f96478a + "}";
    }
}
