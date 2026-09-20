package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cd10 {

    /* JADX INFO: renamed from: a */
    public final String f36708a;

    /* JADX INFO: renamed from: b */
    public final String f36709b;

    /* JADX INFO: renamed from: c */
    public final int f36710c;

    /* JADX INFO: renamed from: d */
    public final int f36711d;

    public cd10(int i, String str, int i2, String str2) {
        this.f36708a = str;
        this.f36709b = str2;
        this.f36710c = i;
        this.f36711d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd10)) {
            return false;
        }
        cd10 cd10Var = (cd10) obj;
        return wj50.m88271j(this.f36708a, cd10Var.f36708a) && wj50.m88271j(this.f36709b, cd10Var.f36709b) && this.f36710c == cd10Var.f36710c && this.f36711d == cd10Var.f36711d;
    }

    public final int hashCode() {
        int iHashCode = this.f36708a.hashCode() * 31;
        String str = this.f36709b;
        return Integer.hashCode(this.f36711d) + mt60.m62800g(this.f36710c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
