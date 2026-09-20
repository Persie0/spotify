package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class aaz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13956a;

    /* JADX INFO: renamed from: b */
    public final List f13957b;

    public aaz0(int i, ArrayList arrayList, boolean z) {
        z = (i & 2) != 0 ? false : z;
        List list = (i & 4) != 0 ? lau.f131415a : arrayList;
        this.f13956a = z;
        this.f13957b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaz0)) {
            return false;
        }
        aaz0 aaz0Var = (aaz0) obj;
        return this.f13956a == aaz0Var.f13956a && wj50.m88271j(this.f13957b, aaz0Var.f13957b);
    }

    public final int hashCode() {
        return this.f13957b.hashCode() + (Boolean.hashCode(this.f13956a) * 31);
    }
}
