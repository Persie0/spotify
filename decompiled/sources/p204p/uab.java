package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class uab extends vab {

    /* JADX INFO: renamed from: b */
    public final rmx0 f228437b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f228438c;

    /* JADX INFO: renamed from: d */
    public final int f228439d;

    public uab(rmx0 rmx0Var, ArrayList arrayList, int i) {
        super(rmx0Var, arrayList);
        this.f228437b = rmx0Var;
        this.f228438c = arrayList;
        this.f228439d = i;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: a */
    public final rmx0 mo63978a() {
        return this.f228437b;
    }

    @Override // p204p.vab
    /* JADX INFO: renamed from: b */
    public final List mo63979b() {
        return this.f228438c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uab)) {
            return false;
        }
        uab uabVar = (uab) obj;
        return this.f228437b.equals(uabVar.f228437b) && this.f228438c.equals(uabVar.f228438c) && this.f228439d == uabVar.f228439d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f228439d) + lq51.m59700f(this.f228438c, this.f228437b.hashCode() * 31, 31);
    }
}
