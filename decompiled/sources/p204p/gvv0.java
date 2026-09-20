package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gvv0 {

    /* JADX INFO: renamed from: a */
    public final amw0 f84845a;

    /* JADX INFO: renamed from: b */
    public final int f84846b;

    public gvv0(amw0 amw0Var, int i) {
        this.f84845a = amw0Var;
        this.f84846b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvv0)) {
            return false;
        }
        gvv0 gvv0Var = (gvv0) obj;
        return this.f84845a.equals(gvv0Var.f84845a) && this.f84846b == gvv0Var.f84846b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f84846b) + (this.f84845a.hashCode() * 31);
    }
}
