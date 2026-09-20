package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class egl0 {

    /* JADX INFO: renamed from: a */
    public final wfb1 f59359a;

    /* JADX INFO: renamed from: b */
    public final al6 f59360b;

    public egl0(wfb1 wfb1Var, al6 al6Var) {
        this.f59359a = wfb1Var;
        this.f59360b = al6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egl0)) {
            return false;
        }
        egl0 egl0Var = (egl0) obj;
        return wj50.m88271j(this.f59359a, egl0Var.f59359a) && wj50.m88271j(this.f59360b, egl0Var.f59360b);
    }

    public final int hashCode() {
        wfb1 wfb1Var = this.f59359a;
        int iHashCode = (wfb1Var == null ? 0 : wfb1Var.hashCode()) * 31;
        al6 al6Var = this.f59360b;
        return iHashCode + (al6Var != null ? al6Var.hashCode() : 0);
    }
}
