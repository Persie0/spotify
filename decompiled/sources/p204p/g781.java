package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class g781 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77210a;

    public g781(ArrayList arrayList) {
        this.f77210a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g781) && this.f77210a.equals(((g781) obj).f77210a);
    }

    public final int hashCode() {
        return this.f77210a.hashCode();
    }
}
