package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class omp0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f167073a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f167074b;

    public omp0(ArrayList arrayList, ArrayList arrayList2) {
        this.f167073a = arrayList;
        this.f167074b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omp0)) {
            return false;
        }
        omp0 omp0Var = (omp0) obj;
        return this.f167073a.equals(omp0Var.f167073a) && this.f167074b.equals(omp0Var.f167074b);
    }

    public final int hashCode() {
        return this.f167074b.hashCode() + (this.f167073a.hashCode() * 31);
    }
}
