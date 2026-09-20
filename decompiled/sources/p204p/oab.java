package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class oab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f163286b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f163287c;

    public oab(rmx0 rmx0Var, ArrayList arrayList) {
        super(rmx0Var, arrayList);
        this.f163286b = rmx0Var;
        this.f163287c = arrayList;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f163286b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f163287c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        return this.f163286b.equals(oabVar.f163286b) && this.f163287c.equals(oabVar.f163287c);
    }

    public final int hashCode() {
        return this.f163287c.hashCode() + (this.f163286b.hashCode() * 31);
    }
}
