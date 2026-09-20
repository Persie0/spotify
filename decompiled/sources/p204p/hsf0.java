package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hsf0 {

    /* JADX INFO: renamed from: a */
    public final zs6 f94686a;

    /* JADX INFO: renamed from: b */
    public final daj f94687b;

    public hsf0(zs6 zs6Var, daj dajVar) {
        this.f94686a = zs6Var;
        this.f94687b = dajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsf0)) {
            return false;
        }
        hsf0 hsf0Var = (hsf0) obj;
        return wj50.m88271j(this.f94686a, hsf0Var.f94686a) && wj50.m88271j(this.f94687b, hsf0Var.f94687b);
    }

    public final int hashCode() {
        zs6 zs6Var = this.f94686a;
        int iHashCode = (zs6Var == null ? 0 : zs6Var.hashCode()) * 31;
        daj dajVar = this.f94687b;
        return iHashCode + (dajVar != null ? dajVar.hashCode() : 0);
    }
}
