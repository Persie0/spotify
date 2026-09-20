package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b7n0 {

    /* JADX INFO: renamed from: a */
    public final d7n0 f24349a;

    /* JADX INFO: renamed from: b */
    public final List f24350b;

    public /* synthetic */ b7n0(d7n0 d7n0Var) {
        this(d7n0Var, lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7n0)) {
            return false;
        }
        b7n0 b7n0Var = (b7n0) obj;
        return wj50.m88271j(this.f24349a, b7n0Var.f24349a) && wj50.m88271j(this.f24350b, b7n0Var.f24350b);
    }

    public final int hashCode() {
        return this.f24350b.hashCode() + (this.f24349a.hashCode() * 31);
    }

    public b7n0(d7n0 d7n0Var, List list) {
        this.f24349a = d7n0Var;
        this.f24350b = list;
    }
}
