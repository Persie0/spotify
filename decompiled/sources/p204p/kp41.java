package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class kp41 {

    /* JADX INFO: renamed from: a */
    public final String f124976a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f124977b;

    /* JADX INFO: renamed from: c */
    public final jp41 f124978c;

    public kp41(String str, ArrayList arrayList, jp41 jp41Var) {
        this.f124976a = str;
        this.f124977b = arrayList;
        this.f124978c = jp41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp41)) {
            return false;
        }
        kp41 kp41Var = (kp41) obj;
        return this.f124976a.equals(kp41Var.f124976a) && this.f124977b.equals(kp41Var.f124977b) && wj50.m88271j(this.f124978c, kp41Var.f124978c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f124977b, this.f124976a.hashCode() * 31, 31);
        jp41 jp41Var = this.f124978c;
        return iM59700f + (jp41Var == null ? 0 : jp41Var.hashCode());
    }
}
