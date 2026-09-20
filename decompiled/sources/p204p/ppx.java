package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ppx {

    /* JADX INFO: renamed from: a */
    public final String f180126a;

    /* JADX INFO: renamed from: b */
    public final up60 f180127b;

    /* JADX INFO: renamed from: c */
    public final jqx f180128c;

    public ppx(String str, up60 up60Var, jqx jqxVar) {
        this.f180126a = str;
        this.f180127b = up60Var;
        this.f180128c = jqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppx)) {
            return false;
        }
        ppx ppxVar = (ppx) obj;
        return wj50.m88271j(this.f180126a, ppxVar.f180126a) && wj50.m88271j(this.f180127b, ppxVar.f180127b) && wj50.m88271j(this.f180128c, ppxVar.f180128c);
    }

    public final int hashCode() {
        return ((this.f180127b.hashCode() + (this.f180126a.hashCode() * 31)) * 31) + this.f180128c.f115018b;
    }
}
