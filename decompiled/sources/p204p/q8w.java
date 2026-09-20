package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final u2s f186412a;

    /* JADX INFO: renamed from: b */
    public final boolean f186413b = true;

    public q8w(u2s u2sVar) {
        this.f186412a = u2sVar;
    }

    @Override // p204p.t8w
    /* JADX INFO: renamed from: a */
    public final boolean mo63860a() {
        return this.f186413b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8w)) {
            return false;
        }
        q8w q8wVar = (q8w) obj;
        return wj50.m88271j(this.f186412a, q8wVar.f186412a) && this.f186413b == q8wVar.f186413b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186413b) + (this.f186412a.hashCode() * 31);
    }
}
