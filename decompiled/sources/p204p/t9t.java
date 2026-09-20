package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class t9t implements u9t {

    /* JADX INFO: renamed from: a */
    public final ArrayList f218355a;

    public t9t(ArrayList arrayList) {
        this.f218355a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9t) && this.f218355a.equals(((t9t) obj).f218355a);
    }

    public final int hashCode() {
        return this.f218355a.hashCode();
    }
}
