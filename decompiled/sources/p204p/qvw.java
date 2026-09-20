package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qvw implements s2x {

    /* JADX INFO: renamed from: a */
    public final int f193126a;

    /* JADX INFO: renamed from: b */
    public final cfv0 f193127b;

    public qvw(int i, cfv0 cfv0Var) {
        this.f193126a = i;
        this.f193127b = cfv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvw)) {
            return false;
        }
        qvw qvwVar = (qvw) obj;
        return this.f193126a == qvwVar.f193126a && wj50.m88271j(this.f193127b, qvwVar.f193127b);
    }

    public final int hashCode() {
        return this.f193127b.hashCode() + (Integer.hashCode(this.f193126a) * 31);
    }
}
