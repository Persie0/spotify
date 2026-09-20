package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s7j0 {

    /* JADX INFO: renamed from: a */
    public final String f206390a;

    /* JADX INFO: renamed from: b */
    public final int f206391b;

    /* JADX INFO: renamed from: c */
    public final pni f206392c;

    public /* synthetic */ s7j0(String str, int i) {
        this(str, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m77380a() {
        return this.f206390a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7j0)) {
            return false;
        }
        s7j0 s7j0Var = (s7j0) obj;
        return wj50.m88271j(this.f206390a, s7j0Var.f206390a) && this.f206391b == s7j0Var.f206391b && wj50.m88271j(this.f206392c, s7j0Var.f206392c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f206391b, this.f206390a.hashCode() * 31, 31);
        pni pniVar = this.f206392c;
        return iM40938f + (pniVar == null ? 0 : pniVar.f179386a.hashCode());
    }

    public s7j0(String str, int i, pni pniVar) {
        this.f206390a = str;
        this.f206391b = i;
        this.f206392c = pniVar;
    }
}
