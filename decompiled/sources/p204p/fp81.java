package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fp81 implements hp81 {

    /* JADX INFO: renamed from: a */
    public final String f71770a;

    /* JADX INFO: renamed from: b */
    public final String f71771b;

    public fp81(String str, String str2) {
        this.f71770a = str;
        this.f71771b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp81)) {
            return false;
        }
        fp81 fp81Var = (fp81) obj;
        return wj50.m88271j(this.f71770a, fp81Var.f71770a) && wj50.m88271j(this.f71771b, fp81Var.f71771b);
    }

    public final int hashCode() {
        int iHashCode = this.f71770a.hashCode() * 31;
        String str = this.f71771b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
