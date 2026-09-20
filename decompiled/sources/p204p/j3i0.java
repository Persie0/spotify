package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class j3i0 implements l3i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f108404a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f108405b;

    /* JADX INFO: renamed from: c */
    public final Map f108406c;

    public j3i0(ArrayList arrayList, Map map, boolean z) {
        this.f108404a = z;
        this.f108405b = arrayList;
        this.f108406c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3i0)) {
            return false;
        }
        j3i0 j3i0Var = (j3i0) obj;
        return this.f108404a == j3i0Var.f108404a && this.f108405b.equals(j3i0Var.f108405b) && wj50.m88271j(this.f108406c, j3i0Var.f108406c);
    }

    public final int hashCode() {
        return this.f108406c.hashCode() + lq51.m59700f(this.f108405b, Boolean.hashCode(this.f108404a) * 31, 31);
    }
}
