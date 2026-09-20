package p204p;

import android.view.Surface;

/* JADX INFO: loaded from: classes5.dex */
public final class af50 {

    /* JADX INFO: renamed from: a */
    public final Surface f15033a;

    /* JADX INFO: renamed from: b */
    public final di21 f15034b;

    public af50(Surface surface, di21 di21Var) {
        this.f15033a = surface;
        this.f15034b = di21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af50)) {
            return false;
        }
        af50 af50Var = (af50) obj;
        return wj50.m88271j(this.f15033a, af50Var.f15033a) && wj50.m88271j(this.f15034b, af50Var.f15034b);
    }

    public final int hashCode() {
        Surface surface = this.f15033a;
        return this.f15034b.hashCode() + ((surface == null ? 0 : surface.hashCode()) * 31);
    }
}
