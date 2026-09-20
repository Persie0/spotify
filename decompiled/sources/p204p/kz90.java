package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class kz90 {

    /* JADX INFO: renamed from: a */
    public final boolean f128047a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f128048b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f128049c;

    public kz90(boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.f128047a = z;
        this.f128048b = arrayList;
        this.f128049c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz90)) {
            return false;
        }
        kz90 kz90Var = (kz90) obj;
        return this.f128047a == kz90Var.f128047a && this.f128048b.equals(kz90Var.f128048b) && this.f128049c.equals(kz90Var.f128049c);
    }

    public final int hashCode() {
        return this.f128049c.hashCode() + lq51.m59700f(this.f128048b, Boolean.hashCode(this.f128047a) * 31, 31);
    }
}
