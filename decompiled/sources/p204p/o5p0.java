package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o5p0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f162046a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f162047b;

    public o5p0(ArrayList arrayList, ArrayList arrayList2) {
        this.f162046a = arrayList;
        this.f162047b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5p0)) {
            return false;
        }
        o5p0 o5p0Var = (o5p0) obj;
        return this.f162046a.equals(o5p0Var.f162046a) && this.f162047b.equals(o5p0Var.f162047b);
    }

    public final int hashCode() {
        return this.f162047b.hashCode() + (this.f162046a.hashCode() * 31);
    }
}
