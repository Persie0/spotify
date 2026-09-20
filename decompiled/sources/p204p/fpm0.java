package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fpm0 {

    /* JADX INFO: renamed from: a */
    public final String f71932a;

    /* JADX INFO: renamed from: b */
    public final String f71933b;

    public fpm0(String str, String str2) {
        this.f71932a = str;
        this.f71933b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpm0)) {
            return false;
        }
        fpm0 fpm0Var = (fpm0) obj;
        return wj50.m88271j(this.f71932a, fpm0Var.f71932a) && wj50.m88271j(this.f71933b, fpm0Var.f71933b);
    }

    public final int hashCode() {
        String str = this.f71932a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71933b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
