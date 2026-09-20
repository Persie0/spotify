package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class sab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f207166b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f207167c;

    public sab(rmx0 rmx0Var, ArrayList arrayList) {
        super(rmx0Var, arrayList);
        this.f207166b = rmx0Var;
        this.f207167c = arrayList;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f207166b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f207167c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sab)) {
            return false;
        }
        sab sabVar = (sab) obj;
        return this.f207166b.equals(sabVar.f207166b) && this.f207167c.equals(sabVar.f207167c);
    }

    public final int hashCode() {
        return this.f207167c.hashCode() + (this.f207166b.hashCode() * 31);
    }
}
