package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g4t0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f76525a;

    /* JADX INFO: renamed from: b */
    public final vmd0 f76526b;

    /* JADX INFO: renamed from: c */
    public final boolean f76527c;

    public g4t0(ArrayList arrayList, vmd0 vmd0Var, boolean z) {
        this.f76525a = arrayList;
        this.f76526b = vmd0Var;
        this.f76527c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4t0)) {
            return false;
        }
        g4t0 g4t0Var = (g4t0) obj;
        return this.f76525a.equals(g4t0Var.f76525a) && wj50.m88271j(this.f76526b, g4t0Var.f76526b) && this.f76527c == g4t0Var.f76527c;
    }

    public final int hashCode() {
        int iHashCode = this.f76525a.hashCode() * 31;
        vmd0 vmd0Var = this.f76526b;
        return Boolean.hashCode(this.f76527c) + ((iHashCode + (vmd0Var == null ? 0 : vmd0Var.hashCode())) * 31);
    }
}
