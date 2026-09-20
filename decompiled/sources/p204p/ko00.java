package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ko00 implements mo00 {

    /* JADX INFO: renamed from: a */
    public final no00 f124492a;

    /* JADX INFO: renamed from: b */
    public final no00 f124493b;

    /* JADX INFO: renamed from: c */
    public final boolean f124494c;

    /* JADX INFO: renamed from: d */
    public final String f124495d;

    public ko00(no00 no00Var, no00 no00Var2, boolean z, String str) {
        this.f124492a = no00Var;
        this.f124493b = no00Var2;
        this.f124494c = z;
        this.f124495d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko00)) {
            return false;
        }
        ko00 ko00Var = (ko00) obj;
        return wj50.m88271j(this.f124492a, ko00Var.f124492a) && wj50.m88271j(this.f124493b, ko00Var.f124493b) && this.f124494c == ko00Var.f124494c && wj50.m88271j(this.f124495d, ko00Var.f124495d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f124493b.hashCode() + (this.f124492a.hashCode() * 31)) * 31, 31, this.f124494c);
        String str = this.f124495d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
