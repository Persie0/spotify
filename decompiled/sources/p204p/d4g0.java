package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class d4g0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f45157a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f45158b;

    /* JADX INFO: renamed from: c */
    public final Integer f45159c;

    public d4g0(ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.f45157a = arrayList;
        this.f45158b = arrayList2;
        this.f45159c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4g0)) {
            return false;
        }
        d4g0 d4g0Var = (d4g0) obj;
        return this.f45157a.equals(d4g0Var.f45157a) && this.f45158b.equals(d4g0Var.f45158b) && wj50.m88271j(this.f45159c, d4g0Var.f45159c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f45158b, this.f45157a.hashCode() * 31, 31);
        Integer num = this.f45159c;
        return iM59700f + (num == null ? 0 : num.hashCode());
    }
}
