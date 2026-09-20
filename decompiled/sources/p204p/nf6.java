package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nf6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f153254a;

    public nf6(ArrayList arrayList) {
        this.f153254a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf6) && this.f153254a.equals(((nf6) obj).f153254a);
    }

    public final int hashCode() {
        return this.f153254a.hashCode();
    }
}
