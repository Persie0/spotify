package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class jn3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f113995a;

    public jn3(ArrayList arrayList) {
        this.f113995a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn3) && this.f113995a.equals(((jn3) obj).f113995a);
    }

    public final int hashCode() {
        return this.f113995a.hashCode();
    }
}
