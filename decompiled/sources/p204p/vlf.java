package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f242474a;

    /* JADX INFO: renamed from: b */
    public final qgf f242475b;

    /* JADX INFO: renamed from: c */
    public final enw0 f242476c;

    public vlf(String str, qgf qgfVar, enw0 enw0Var) {
        this.f242474a = str;
        this.f242475b = qgfVar;
        this.f242476c = enw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlf)) {
            return false;
        }
        vlf vlfVar = (vlf) obj;
        return wj50.m88271j(this.f242474a, vlfVar.f242474a) && wj50.m88271j(this.f242475b, vlfVar.f242475b) && wj50.m88271j(this.f242476c, vlfVar.f242476c);
    }

    public final int hashCode() {
        return this.f242476c.hashCode() + ((this.f242475b.hashCode() + (this.f242474a.hashCode() * 31)) * 31);
    }
}
