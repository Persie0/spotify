package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class psn0 {

    /* JADX INFO: renamed from: a */
    public final x1j f180895a;

    /* JADX INFO: renamed from: b */
    public final gh00 f180896b;

    public psn0(x1j x1jVar, gh00 gh00Var) {
        this.f180895a = x1jVar;
        this.f180896b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psn0)) {
            return false;
        }
        psn0 psn0Var = (psn0) obj;
        return wj50.m88271j(this.f180895a, psn0Var.f180895a) && wj50.m88271j(this.f180896b, psn0Var.f180896b);
    }

    public final int hashCode() {
        return this.f180896b.hashCode() + (this.f180895a.hashCode() * 31);
    }
}
