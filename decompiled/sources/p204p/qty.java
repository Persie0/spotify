package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qty {

    /* JADX INFO: renamed from: a */
    public final ybv f192505a;

    /* JADX INFO: renamed from: b */
    public final String f192506b;

    /* JADX INFO: renamed from: c */
    public final Object f192507c;

    public qty(ybv ybvVar, String str, List list) {
        this.f192505a = ybvVar;
        this.f192506b = str;
        this.f192507c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qty)) {
            return false;
        }
        qty qtyVar = (qty) obj;
        return wj50.m88271j(this.f192505a, qtyVar.f192505a) && wj50.m88271j(this.f192506b, qtyVar.f192506b) && this.f192507c.equals(qtyVar.f192507c);
    }

    public final int hashCode() {
        int iHashCode = this.f192505a.hashCode() * 31;
        String str = this.f192506b;
        return this.f192507c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
