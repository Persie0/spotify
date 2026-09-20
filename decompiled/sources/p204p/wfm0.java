package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wfm0 {

    /* JADX INFO: renamed from: a */
    public final na01 f250870a;

    /* JADX INFO: renamed from: b */
    public final Object f250871b;

    public wfm0(na01 na01Var, Object obj) {
        this.f250870a = na01Var;
        this.f250871b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfm0)) {
            return false;
        }
        wfm0 wfm0Var = (wfm0) obj;
        return wj50.m88271j(this.f250870a, wfm0Var.f250870a) && wj50.m88271j(this.f250871b, wfm0Var.f250871b);
    }

    public final int hashCode() {
        int iHashCode = this.f250870a.hashCode() * 31;
        Object obj = this.f250871b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
