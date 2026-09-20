package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class wmf0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f252851a;

    /* JADX INFO: renamed from: b */
    public final Integer f252852b;

    public wmf0(Integer num, ArrayList arrayList) {
        this.f252851a = arrayList;
        this.f252852b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmf0)) {
            return false;
        }
        wmf0 wmf0Var = (wmf0) obj;
        return this.f252851a.equals(wmf0Var.f252851a) && wj50.m88271j(this.f252852b, wmf0Var.f252852b);
    }

    public final int hashCode() {
        int iHashCode = this.f252851a.hashCode() * 31;
        Integer num = this.f252852b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
