package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class js8 {

    /* JADX INFO: renamed from: a */
    public final String f115442a;

    /* JADX INFO: renamed from: b */
    public final Boolean f115443b;

    public js8(String str, Boolean bool) {
        this.f115442a = str;
        this.f115443b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js8)) {
            return false;
        }
        js8 js8Var = (js8) obj;
        return wj50.m88271j(this.f115442a, js8Var.f115442a) && wj50.m88271j(this.f115443b, js8Var.f115443b);
    }

    public final int hashCode() {
        String str = this.f115442a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f115443b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
