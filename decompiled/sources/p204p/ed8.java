package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ed8 {

    /* JADX INFO: renamed from: a */
    public final String f58475a;

    /* JADX INFO: renamed from: b */
    public final hg8 f58476b;

    /* JADX INFO: renamed from: c */
    public final int f58477c;

    /* JADX INFO: renamed from: d */
    public final long f58478d;

    /* JADX INFO: renamed from: e */
    public final Set f58479e;

    public ed8(String str, hg8 hg8Var, int i, long j, Set set) {
        this.f58475a = str;
        this.f58476b = hg8Var;
        this.f58477c = i;
        this.f58478d = j;
        this.f58479e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed8)) {
            return false;
        }
        ed8 ed8Var = (ed8) obj;
        return wj50.m88271j(this.f58475a, ed8Var.f58475a) && this.f58476b == ed8Var.f58476b && this.f58477c == ed8Var.f58477c && this.f58478d == ed8Var.f58478d && wj50.m88271j(this.f58479e, ed8Var.f58479e);
    }

    public final int hashCode() {
        return this.f58479e.hashCode() + dq60.m36605e(mt60.m62800g(this.f58477c, (this.f58476b.hashCode() + (this.f58475a.hashCode() * 31)) * 31, 31), this.f58478d, 31);
    }
}
