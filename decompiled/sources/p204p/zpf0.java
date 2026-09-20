package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class zpf0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f285122a;

    public zpf0(ArrayList arrayList) {
        this.f285122a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpf0) && this.f285122a.equals(((zpf0) obj).f285122a);
    }

    public final int hashCode() {
        return this.f285122a.hashCode();
    }
}
