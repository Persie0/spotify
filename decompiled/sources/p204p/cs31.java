package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class cs31 {

    /* JADX INFO: renamed from: a */
    public final ur31 f41458a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f41459b;

    public cs31(ArrayList arrayList, ur31 ur31Var) {
        this.f41458a = ur31Var;
        this.f41459b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs31)) {
            return false;
        }
        cs31 cs31Var = (cs31) obj;
        return this.f41458a == cs31Var.f41458a && this.f41459b.equals(cs31Var.f41459b);
    }

    public final int hashCode() {
        ur31 ur31Var = this.f41458a;
        return this.f41459b.hashCode() + ((ur31Var == null ? 0 : ur31Var.hashCode()) * 31);
    }
}
