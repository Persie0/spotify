package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vnb0 {

    /* JADX INFO: renamed from: a */
    public final Object f243034a;

    /* JADX INFO: renamed from: b */
    public final int f243035b;

    public vnb0(int i, List list) {
        this.f243034a = list;
        this.f243035b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnb0)) {
            return false;
        }
        vnb0 vnb0Var = (vnb0) obj;
        return this.f243034a.equals(vnb0Var.f243034a) && this.f243035b == vnb0Var.f243035b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f243035b) + (this.f243034a.hashCode() * 31);
    }
}
