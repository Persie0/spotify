package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class k8k0 {

    /* JADX INFO: renamed from: a */
    public final Map f120385a;

    /* JADX INFO: renamed from: b */
    public final Map f120386b;

    /* JADX INFO: renamed from: c */
    public final Map f120387c;

    public k8k0(Map map, Map map2, Map map3) {
        this.f120385a = map;
        this.f120386b = map2;
        this.f120387c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8k0)) {
            return false;
        }
        k8k0 k8k0Var = (k8k0) obj;
        return wj50.m88271j(this.f120385a, k8k0Var.f120385a) && wj50.m88271j(this.f120386b, k8k0Var.f120386b) && wj50.m88271j(this.f120387c, k8k0Var.f120387c);
    }

    public final int hashCode() {
        return this.f120387c.hashCode() + edb.m38557f(this.f120385a.hashCode() * 31, 31, this.f120386b);
    }
}
