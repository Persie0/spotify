package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uew implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f229606a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f229607b;

    /* JADX INFO: renamed from: c */
    public final o4x f229608c;

    /* JADX INFO: renamed from: d */
    public final vew f229609d;

    public uew(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, vew vewVar) {
        this.f229606a = otd0Var;
        this.f229607b = ibp0Var;
        this.f229608c = o4xVar;
        this.f229609d = vewVar;
    }

    /* JADX INFO: renamed from: a */
    public final vew m82922a() {
        return this.f229609d;
    }

    /* JADX INFO: renamed from: b */
    public final o4x m82923b() {
        return this.f229608c;
    }

    /* JADX INFO: renamed from: c */
    public final otd0 m82924c() {
        return this.f229606a;
    }

    /* JADX INFO: renamed from: d */
    public final ibp0 m82925d() {
        return this.f229607b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uew)) {
            return false;
        }
        uew uewVar = (uew) obj;
        return wj50.m88271j(this.f229606a, uewVar.f229606a) && wj50.m88271j(this.f229607b, uewVar.f229607b) && wj50.m88271j(this.f229608c, uewVar.f229608c) && wj50.m88271j(this.f229609d, uewVar.f229609d);
    }

    public final int hashCode() {
        return this.f229609d.hashCode() + ((this.f229608c.hashCode() + ((this.f229607b.hashCode() + (this.f229606a.hashCode() * 31)) * 31)) * 31);
    }
}
