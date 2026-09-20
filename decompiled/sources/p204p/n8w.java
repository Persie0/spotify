package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final pi1 f151645a;

    /* JADX INFO: renamed from: b */
    public final boolean f151646b;

    public n8w(pi1 pi1Var, boolean z) {
        this.f151645a = pi1Var;
        this.f151646b = z;
    }

    @Override // p204p.t8w
    /* JADX INFO: renamed from: a */
    public final boolean mo63860a() {
        return this.f151646b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8w)) {
            return false;
        }
        n8w n8wVar = (n8w) obj;
        return wj50.m88271j(this.f151645a, n8wVar.f151645a) && this.f151646b == n8wVar.f151646b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151646b) + (this.f151645a.hashCode() * 31);
    }
}
