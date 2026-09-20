package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class n6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f150986a;

    public n6z0(ArrayList arrayList) {
        this.f150986a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6z0) && this.f150986a.equals(((n6z0) obj).f150986a);
    }

    public final int hashCode() {
        return this.f150986a.hashCode();
    }
}
