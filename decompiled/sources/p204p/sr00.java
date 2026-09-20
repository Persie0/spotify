package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sr00 implements xr00 {

    /* JADX INFO: renamed from: a */
    public final String f213199a;

    /* JADX INFO: renamed from: b */
    public final boolean f213200b;

    public sr00(String str, boolean z) {
        this.f213199a = str;
        this.f213200b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr00)) {
            return false;
        }
        sr00 sr00Var = (sr00) obj;
        return wj50.m88271j(this.f213199a, sr00Var.f213199a) && this.f213200b == sr00Var.f213200b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213200b) + (this.f213199a.hashCode() * 31);
    }
}
