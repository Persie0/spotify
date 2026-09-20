package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class hec0 extends iec0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f90410a;

    public hec0(ArrayList arrayList) {
        this.f90410a = arrayList;
    }

    @Override // p204p.iec0
    /* JADX INFO: renamed from: a */
    public final boolean mo35773a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hec0) && this.f90410a.equals(((hec0) obj).f90410a);
    }

    public final int hashCode() {
        return lq51.m59700f(this.f90410a, Boolean.hashCode(true) * 31, 31);
    }
}
