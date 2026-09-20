package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qya extends vya {

    /* JADX INFO: renamed from: a */
    public final rza f193857a;

    /* JADX INFO: renamed from: b */
    public final e95 f193858b;

    /* JADX INFO: renamed from: c */
    public final List f193859c;

    public qya(rza rzaVar, e95 e95Var, List list) {
        this.f193857a = rzaVar;
        this.f193858b = e95Var;
        this.f193859c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qya)) {
            return false;
        }
        qya qyaVar = (qya) obj;
        return wj50.m88271j(this.f193857a, qyaVar.f193857a) && wj50.m88271j(this.f193858b, qyaVar.f193858b) && wj50.m88271j(this.f193859c, qyaVar.f193859c);
    }

    public final int hashCode() {
        return this.f193859c.hashCode() + ((this.f193858b.hashCode() + (this.f193857a.hashCode() * 31)) * 31);
    }
}
