package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f5m {

    /* JADX INFO: renamed from: a */
    public final g3m f66105a;

    /* JADX INFO: renamed from: b */
    public final List f66106b;

    public f5m(g3m g3mVar, List list) {
        this.f66105a = g3mVar;
        this.f66106b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5m)) {
            return false;
        }
        f5m f5mVar = (f5m) obj;
        return wj50.m88271j(this.f66105a, f5mVar.f66105a) && wj50.m88271j(this.f66106b, f5mVar.f66106b);
    }

    public final int hashCode() {
        return this.f66106b.hashCode() + (this.f66105a.hashCode() * 31);
    }
}
