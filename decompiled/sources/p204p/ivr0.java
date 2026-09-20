package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ivr0 extends bwr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106270a;

    /* JADX INFO: renamed from: b */
    public final String f106271b;

    public ivr0(boolean z, String str) {
        this.f106270a = z;
        this.f106271b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivr0)) {
            return false;
        }
        ivr0 ivr0Var = (ivr0) obj;
        return this.f106270a == ivr0Var.f106270a && wj50.m88271j(this.f106271b, ivr0Var.f106271b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f106270a) * 31;
        String str = this.f106271b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
