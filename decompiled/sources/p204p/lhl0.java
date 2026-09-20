package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class lhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final Set f133597a;

    /* JADX INFO: renamed from: b */
    public final f5r f133598b;

    public lhl0(Set set, f5r f5rVar) {
        this.f133597a = set;
        this.f133598b = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhl0)) {
            return false;
        }
        lhl0 lhl0Var = (lhl0) obj;
        return wj50.m88271j(this.f133597a, lhl0Var.f133597a) && wj50.m88271j(this.f133598b, lhl0Var.f133598b);
    }

    public final int hashCode() {
        return this.f133598b.hashCode() + (this.f133597a.hashCode() * 31);
    }
}
