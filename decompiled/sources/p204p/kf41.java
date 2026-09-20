package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kf41 {

    /* JADX INFO: renamed from: a */
    public final eka1 f122054a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f122055b;

    public kf41(eka1 eka1Var, LinkedHashMap linkedHashMap) {
        this.f122054a = eka1Var;
        this.f122055b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf41)) {
            return false;
        }
        kf41 kf41Var = (kf41) obj;
        return this.f122054a.equals(kf41Var.f122054a) && this.f122055b.equals(kf41Var.f122055b);
    }

    public final int hashCode() {
        return this.f122055b.hashCode() + (this.f122054a.hashCode() * 31);
    }
}
