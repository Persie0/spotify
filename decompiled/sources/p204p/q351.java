package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class q351 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f184797a;

    public q351(ArrayList arrayList) {
        this.f184797a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q351) && this.f184797a.equals(((q351) obj).f184797a);
    }

    public final int hashCode() {
        return this.f184797a.hashCode();
    }
}
