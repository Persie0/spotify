package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i3w0 extends j3w0 {

    /* JADX INFO: renamed from: a */
    public final v72 f98343a;

    /* JADX INFO: renamed from: b */
    public final String f98344b;

    public i3w0(v72 v72Var, String str) {
        this.f98343a = v72Var;
        this.f98344b = str;
    }

    @Override // p204p.j3w0
    /* JADX INFO: renamed from: a */
    public final String mo34897a() {
        return this.f98344b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3w0)) {
            return false;
        }
        i3w0 i3w0Var = (i3w0) obj;
        return wj50.m88271j(this.f98343a, i3w0Var.f98343a) && wj50.m88271j(this.f98344b, i3w0Var.f98344b);
    }

    public final int hashCode() {
        v72 v72Var = this.f98343a;
        int iHashCode = (v72Var == null ? 0 : v72Var.hashCode()) * 31;
        String str = this.f98344b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
