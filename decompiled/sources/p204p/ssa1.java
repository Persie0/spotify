package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ssa1 {

    /* JADX INFO: renamed from: a */
    public final int f213556a;

    /* JADX INFO: renamed from: b */
    public final Map f213557b;

    public ssa1(int i, Map map) {
        this.f213556a = i;
        this.f213557b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssa1)) {
            return false;
        }
        ssa1 ssa1Var = (ssa1) obj;
        return this.f213556a == ssa1Var.f213556a && this.f213557b.equals(ssa1Var.f213557b);
    }

    public final int hashCode() {
        return this.f213557b.hashCode() + (edb.m38547C(this.f213556a) * 31);
    }
}
