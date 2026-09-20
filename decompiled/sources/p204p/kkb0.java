package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class kkb0 {

    /* JADX INFO: renamed from: a */
    public final xf81 f123555a;

    /* JADX INFO: renamed from: b */
    public final s7f f123556b;

    /* JADX INFO: renamed from: c */
    public final int f123557c;

    /* JADX INFO: renamed from: d */
    public final okb0 f123558d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f123559e;

    public kkb0(xf81 xf81Var, s7f s7fVar, int i, okb0 okb0Var, ArrayList arrayList) {
        this.f123555a = xf81Var;
        this.f123556b = s7fVar;
        this.f123557c = i;
        this.f123558d = okb0Var;
        this.f123559e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkb0)) {
            return false;
        }
        kkb0 kkb0Var = (kkb0) obj;
        return this.f123555a.equals(kkb0Var.f123555a) && this.f123556b.equals(kkb0Var.f123556b) && this.f123557c == kkb0Var.f123557c && this.f123558d.equals(kkb0Var.f123558d) && this.f123559e.equals(kkb0Var.f123559e);
    }

    public final int hashCode() {
        return this.f123559e.hashCode() + ((this.f123558d.hashCode() + mt60.m62800g(this.f123557c, (this.f123556b.hashCode() + (this.f123555a.hashCode() * 31)) * 31, 31)) * 31);
    }
}
