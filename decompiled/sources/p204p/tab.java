package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f218528b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f218529c;

    /* JADX INFO: renamed from: d */
    public final int f218530d;

    public tab(rmx0 rmx0Var, ArrayList arrayList, int i) {
        super(rmx0Var, arrayList);
        this.f218528b = rmx0Var;
        this.f218529c = arrayList;
        this.f218530d = i;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f218528b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f218529c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab)) {
            return false;
        }
        tab tabVar = (tab) obj;
        return this.f218528b.equals(tabVar.f218528b) && this.f218529c.equals(tabVar.f218529c) && this.f218530d == tabVar.f218530d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218530d) + lq51.m59700f(this.f218529c, this.f218528b.hashCode() * 31, 31);
    }
}
