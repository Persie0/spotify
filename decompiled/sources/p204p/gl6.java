package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gl6 {

    /* JADX INFO: renamed from: a */
    public final String f81003a;

    /* JADX INFO: renamed from: b */
    public final String f81004b;

    public gl6(String str, String str2) {
        this.f81003a = str;
        this.f81004b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl6)) {
            return false;
        }
        gl6 gl6Var = (gl6) obj;
        return wj50.m88271j(this.f81003a, gl6Var.f81003a) && wj50.m88271j(this.f81004b, gl6Var.f81004b);
    }

    public final int hashCode() {
        return this.f81004b.hashCode() + (this.f81003a.hashCode() * 31);
    }
}
