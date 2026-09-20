package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ga60 {

    /* JADX INFO: renamed from: a */
    public final ddy0 f77982a;

    /* JADX INFO: renamed from: b */
    public final Set f77983b;

    /* JADX INFO: renamed from: c */
    public final boolean f77984c;

    public ga60(ddy0 ddy0Var, Set set, boolean z) {
        this.f77982a = ddy0Var;
        this.f77983b = set;
        this.f77984c = z;
    }

    /* JADX INFO: renamed from: a */
    public static ga60 m44147a(ga60 ga60Var, ddy0 ddy0Var, Set set, int i) {
        if ((i & 1) != 0) {
            ddy0Var = ga60Var.f77982a;
        }
        if ((i & 2) != 0) {
            set = ga60Var.f77983b;
        }
        boolean z = ga60Var.f77984c;
        ga60Var.getClass();
        return new ga60(ddy0Var, set, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga60)) {
            return false;
        }
        ga60 ga60Var = (ga60) obj;
        return wj50.m88271j(this.f77982a, ga60Var.f77982a) && wj50.m88271j(this.f77983b, ga60Var.f77983b) && this.f77984c == ga60Var.f77984c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77984c) + klh.m56830b(this.f77982a.hashCode() * 31, 31, this.f77983b);
    }
}
