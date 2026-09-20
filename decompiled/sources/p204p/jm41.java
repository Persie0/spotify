package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jm41 {

    /* JADX INFO: renamed from: a */
    public final String f113759a;

    /* JADX INFO: renamed from: b */
    public final int f113760b;

    public jm41(String str, int i) {
        this.f113759a = str;
        this.f113760b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm41)) {
            return false;
        }
        jm41 jm41Var = (jm41) obj;
        return wj50.m88271j(this.f113759a, jm41Var.f113759a) && this.f113760b == jm41Var.f113760b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f113760b) + (this.f113759a.hashCode() * 31);
    }
}
