package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ad6 {

    /* JADX INFO: renamed from: a */
    public final qf40 f14536a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f14537b;

    /* JADX INFO: renamed from: c */
    public final String f14538c;

    public ad6(qf40 qf40Var, ArrayList arrayList, String str) {
        this.f14536a = qf40Var;
        this.f14537b = arrayList;
        this.f14538c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad6)) {
            return false;
        }
        ad6 ad6Var = (ad6) obj;
        return wj50.m88271j(this.f14536a, ad6Var.f14536a) && this.f14537b.equals(ad6Var.f14537b) && wj50.m88271j(this.f14538c, ad6Var.f14538c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f14537b, this.f14536a.hashCode() * 31, 31);
        String str = this.f14538c;
        return iM59700f + (str == null ? 0 : str.hashCode());
    }
}
