package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f175461b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f175462c;

    public pab(rmx0 rmx0Var, ArrayList arrayList) {
        super(rmx0Var, arrayList);
        this.f175461b = rmx0Var;
        this.f175462c = arrayList;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f175461b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f175462c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab)) {
            return false;
        }
        pab pabVar = (pab) obj;
        return this.f175461b.equals(pabVar.f175461b) && this.f175462c.equals(pabVar.f175462c);
    }

    public final int hashCode() {
        return this.f175462c.hashCode() + (this.f175461b.hashCode() * 31);
    }
}
