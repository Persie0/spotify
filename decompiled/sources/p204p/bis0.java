package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bis0 implements cis0 {

    /* JADX INFO: renamed from: a */
    public final String f27537a;

    /* JADX INFO: renamed from: b */
    public final String f27538b;

    public bis0(String str, String str2) {
        this.f27537a = str;
        this.f27538b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bis0)) {
            return false;
        }
        bis0 bis0Var = (bis0) obj;
        return wj50.m88271j(this.f27537a, bis0Var.f27537a) && wj50.m88271j(this.f27538b, bis0Var.f27538b);
    }

    public final int hashCode() {
        int iHashCode = this.f27537a.hashCode() * 31;
        String str = this.f27538b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
