package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fmr0 {

    /* JADX INFO: renamed from: a */
    public final String f71115a;

    /* JADX INFO: renamed from: b */
    public final String f71116b;

    public fmr0(String str, String str2) {
        this.f71115a = str;
        this.f71116b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmr0)) {
            return false;
        }
        fmr0 fmr0Var = (fmr0) obj;
        return wj50.m88271j(this.f71115a, fmr0Var.f71115a) && wj50.m88271j(this.f71116b, fmr0Var.f71116b);
    }

    public final int hashCode() {
        int iHashCode = this.f71115a.hashCode() * 31;
        String str = this.f71116b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
