package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o730 {

    /* JADX INFO: renamed from: a */
    public final u730 f162455a;

    /* JADX INFO: renamed from: b */
    public final String f162456b;

    /* JADX INFO: renamed from: c */
    public final qi60 f162457c;

    /* JADX INFO: renamed from: d */
    public final String f162458d;

    public o730(u730 u730Var, String str, qi60 qi60Var, String str2) {
        this.f162455a = u730Var;
        this.f162456b = str;
        this.f162457c = qi60Var;
        this.f162458d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o730)) {
            return false;
        }
        o730 o730Var = (o730) obj;
        return wj50.m88271j(this.f162455a, o730Var.f162455a) && wj50.m88271j(this.f162456b, o730Var.f162456b) && this.f162457c == o730Var.f162457c && wj50.m88271j(this.f162458d, o730Var.f162458d);
    }

    public final int hashCode() {
        u730 u730Var = this.f162455a;
        int iHashCode = (this.f162457c.hashCode() + s571.m77243b((u730Var == null ? 0 : u730Var.hashCode()) * 31, 31, this.f162456b)) * 31;
        String str = this.f162458d;
        return edb.m38547C(1) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
