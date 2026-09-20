package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class nn11 implements pn11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f156315a;

    public nn11(ArrayList arrayList) {
        this.f156315a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn11) && this.f156315a.equals(((nn11) obj).f156315a);
    }

    public final int hashCode() {
        return this.f156315a.hashCode();
    }
}
