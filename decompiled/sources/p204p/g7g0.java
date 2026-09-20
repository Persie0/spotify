package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class g7g0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77262a;

    /* JADX INFO: renamed from: b */
    public final Integer f77263b;

    public g7g0(Integer num, ArrayList arrayList) {
        this.f77262a = arrayList;
        this.f77263b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7g0)) {
            return false;
        }
        g7g0 g7g0Var = (g7g0) obj;
        return this.f77262a.equals(g7g0Var.f77262a) && wj50.m88271j(this.f77263b, g7g0Var.f77263b);
    }

    public final int hashCode() {
        int iHashCode = this.f77262a.hashCode() * 31;
        Integer num = this.f77263b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
