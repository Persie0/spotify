package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class uf9 {

    /* JADX INFO: renamed from: a */
    public final cg9 f229723a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f229724b;

    public uf9(cg9 cg9Var, ArrayList arrayList) {
        this.f229723a = cg9Var;
        this.f229724b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf9)) {
            return false;
        }
        uf9 uf9Var = (uf9) obj;
        return this.f229723a == uf9Var.f229723a && this.f229724b.equals(uf9Var.f229724b);
    }

    public final int hashCode() {
        return this.f229724b.hashCode() + (this.f229723a.hashCode() * 31);
    }
}
