package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g541 {

    /* JADX INFO: renamed from: a */
    public final String f76587a;

    /* JADX INFO: renamed from: b */
    public final Float f76588b;

    public g541(String str, Float f) {
        this.f76587a = str;
        this.f76588b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g541)) {
            return false;
        }
        g541 g541Var = (g541) obj;
        return wj50.m88271j(this.f76587a, g541Var.f76587a) && wj50.m88271j(this.f76588b, g541Var.f76588b);
    }

    public final int hashCode() {
        String str = this.f76587a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.f76588b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }
}
