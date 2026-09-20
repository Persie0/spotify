package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tko {

    /* JADX INFO: renamed from: a */
    public final tn61 f221189a;

    /* JADX INFO: renamed from: b */
    public final boolean f221190b;

    public tko(tn61 tn61Var, boolean z) {
        this.f221189a = tn61Var;
        this.f221190b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tko)) {
            return false;
        }
        tko tkoVar = (tko) obj;
        return wj50.m88271j(this.f221189a, tkoVar.f221189a) && this.f221190b == tkoVar.f221190b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221190b) + (this.f221189a.hashCode() * 31);
    }
}
