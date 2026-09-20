package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jk71 {

    /* JADX INFO: renamed from: a */
    public final String f113232a;

    /* JADX INFO: renamed from: b */
    public final String f113233b;

    public jk71(String str, String str2) {
        this.f113232a = str;
        this.f113233b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk71)) {
            return false;
        }
        jk71 jk71Var = (jk71) obj;
        return wj50.m88271j(this.f113232a, jk71Var.f113232a) && wj50.m88271j(this.f113233b, jk71Var.f113233b);
    }

    public final int hashCode() {
        String str = this.f113232a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113233b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
