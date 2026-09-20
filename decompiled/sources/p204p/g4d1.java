package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f76394a;

    /* JADX INFO: renamed from: b */
    public final String f76395b;

    public g4d1(String str, String str2) {
        this.f76394a = str;
        this.f76395b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4d1)) {
            return false;
        }
        g4d1 g4d1Var = (g4d1) obj;
        return wj50.m88271j(this.f76394a, g4d1Var.f76394a) && wj50.m88271j(this.f76395b, g4d1Var.f76395b);
    }

    public final int hashCode() {
        int iHashCode = this.f76394a.hashCode() * 31;
        String str = this.f76395b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
