package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t50 {

    /* JADX INFO: renamed from: a */
    public final g3m f217183a;

    /* JADX INFO: renamed from: b */
    public final List f217184b;

    public t50(g3m g3mVar, List list) {
        this.f217183a = g3mVar;
        this.f217184b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return wj50.m88271j(this.f217183a, t50Var.f217183a) && wj50.m88271j(this.f217184b, t50Var.f217184b);
    }

    public final int hashCode() {
        return this.f217184b.hashCode() + (this.f217183a.hashCode() * 31);
    }
}
