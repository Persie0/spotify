package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yl2 {

    /* JADX INFO: renamed from: a */
    public final xl2 f273880a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f273881b;

    public yl2(xl2 xl2Var, ArrayList arrayList) {
        this.f273880a = xl2Var;
        this.f273881b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final xl2 m94146a() {
        return this.f273880a;
    }

    /* JADX INFO: renamed from: b */
    public final List m94147b() {
        return this.f273881b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2)) {
            return false;
        }
        yl2 yl2Var = (yl2) obj;
        return wj50.m88271j(this.f273880a, yl2Var.f273880a) && this.f273881b.equals(yl2Var.f273881b);
    }

    public final int hashCode() {
        xl2 xl2Var = this.f273880a;
        return this.f273881b.hashCode() + ((xl2Var == null ? 0 : xl2Var.hashCode()) * 31);
    }
}
