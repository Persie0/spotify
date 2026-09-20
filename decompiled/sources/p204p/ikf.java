package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ikf implements lkf {

    /* JADX INFO: renamed from: a */
    public final ekf f103112a;

    /* JADX INFO: renamed from: b */
    public final String f103113b;

    public ikf(ekf ekfVar, String str) {
        this.f103112a = ekfVar;
        this.f103113b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikf)) {
            return false;
        }
        ikf ikfVar = (ikf) obj;
        return wj50.m88271j(this.f103112a, ikfVar.f103112a) && wj50.m88271j(this.f103113b, ikfVar.f103113b);
    }

    public final int hashCode() {
        int iHashCode = this.f103112a.hashCode() * 31;
        String str = this.f103113b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
