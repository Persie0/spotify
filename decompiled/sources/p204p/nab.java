package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f152013b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f152014c;

    public nab(rmx0 rmx0Var, ArrayList arrayList) {
        super(rmx0Var, arrayList);
        this.f152013b = rmx0Var;
        this.f152014c = arrayList;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f152013b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f152014c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nab)) {
            return false;
        }
        nab nabVar = (nab) obj;
        return wj50.m88271j(this.f152013b, nabVar.f152013b) && this.f152014c.equals(nabVar.f152014c);
    }

    public final int hashCode() {
        return this.f152014c.hashCode() + (this.f152013b.hashCode() * 31);
    }
}
