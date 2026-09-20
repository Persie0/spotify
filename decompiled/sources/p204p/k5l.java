package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class k5l {

    /* JADX INFO: renamed from: a */
    public final t2b0 f119538a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f119539b;

    /* JADX INFO: renamed from: c */
    public final long f119540c;

    public k5l(t2b0 t2b0Var, ArrayList arrayList, long j) {
        this.f119538a = t2b0Var;
        this.f119539b = arrayList;
        this.f119540c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5l)) {
            return false;
        }
        k5l k5lVar = (k5l) obj;
        return this.f119538a.equals(k5lVar.f119538a) && this.f119539b.equals(k5lVar.f119539b) && this.f119540c == k5lVar.f119540c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f119540c) + lq51.m59700f(this.f119539b, this.f119538a.hashCode() * 31, 31);
    }
}
