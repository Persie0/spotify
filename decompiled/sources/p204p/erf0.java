package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class erf0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62116a;

    /* JADX INFO: renamed from: b */
    public final Integer f62117b;

    public erf0(Integer num, ArrayList arrayList) {
        this.f62116a = arrayList;
        this.f62117b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erf0)) {
            return false;
        }
        erf0 erf0Var = (erf0) obj;
        return this.f62116a.equals(erf0Var.f62116a) && wj50.m88271j(this.f62117b, erf0Var.f62117b);
    }

    public final int hashCode() {
        int iHashCode = this.f62116a.hashCode() * 31;
        Integer num = this.f62117b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
