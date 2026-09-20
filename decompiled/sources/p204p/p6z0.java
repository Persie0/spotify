package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class p6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f174530a;

    public p6z0(ArrayList arrayList) {
        this.f174530a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6z0) && this.f174530a.equals(((p6z0) obj).f174530a);
    }

    public final int hashCode() {
        return this.f174530a.hashCode();
    }
}
