package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hmz implements imz {

    /* JADX INFO: renamed from: a */
    public final List f93102a;

    /* JADX INFO: renamed from: b */
    public final e6l f93103b;

    public hmz(List list, e6l e6lVar) {
        this.f93102a = list;
        this.f93103b = e6lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmz)) {
            return false;
        }
        hmz hmzVar = (hmz) obj;
        return wj50.m88271j(this.f93102a, hmzVar.f93102a) && wj50.m88271j(this.f93103b, hmzVar.f93103b);
    }

    public final int hashCode() {
        return this.f93103b.hashCode() + (this.f93102a.hashCode() * 31);
    }

    @Override // p204p.imz
    /* JADX INFO: renamed from: z */
    public final List mo45284z() {
        return this.f93102a;
    }
}
