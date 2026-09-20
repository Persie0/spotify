package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eee1 {

    /* JADX INFO: renamed from: a */
    public final hee1 f58759a;

    /* JADX INFO: renamed from: b */
    public final z0r f58760b;

    public eee1(hee1 hee1Var, z0r z0rVar) {
        this.f58759a = hee1Var;
        this.f58760b = z0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eee1)) {
            return false;
        }
        eee1 eee1Var = (eee1) obj;
        return wj50.m88271j(this.f58759a, eee1Var.f58759a) && wj50.m88271j(this.f58760b, eee1Var.f58760b);
    }

    public final int hashCode() {
        return this.f58760b.hashCode() + (this.f58759a.hashCode() * 31);
    }
}
