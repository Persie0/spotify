package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class vt21 implements au21 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f244535a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f244536b;

    /* JADX INFO: renamed from: c */
    public final i3a0 f244537c;

    public vt21(ArrayList arrayList, LinkedHashMap linkedHashMap, i3a0 i3a0Var) {
        this.f244535a = arrayList;
        this.f244536b = linkedHashMap;
        this.f244537c = i3a0Var;
    }

    @Override // p204p.au21
    public final String breadcrumb() {
        return "GotLayout: " + this.f244535a.size() + " slots, strategies=" + this.f244536b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt21)) {
            return false;
        }
        vt21 vt21Var = (vt21) obj;
        return this.f244535a.equals(vt21Var.f244535a) && this.f244536b.equals(vt21Var.f244536b) && this.f244537c == vt21Var.f244537c;
    }

    public final int hashCode() {
        return this.f244537c.hashCode() + ((this.f244536b.hashCode() + (this.f244535a.hashCode() * 31)) * 31);
    }
}
