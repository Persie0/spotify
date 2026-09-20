package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mf20 {

    /* JADX INFO: renamed from: a */
    public final String f142934a;

    /* JADX INFO: renamed from: b */
    public final String f142935b;

    /* JADX INFO: renamed from: c */
    public final String f142936c;

    /* JADX INFO: renamed from: d */
    public final int f142937d;

    public mf20(String str, String str2, int i, String str3) {
        this.f142934a = str;
        this.f142935b = str2;
        this.f142936c = str3;
        this.f142937d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf20)) {
            return false;
        }
        mf20 mf20Var = (mf20) obj;
        return wj50.m88271j(this.f142934a, mf20Var.f142934a) && wj50.m88271j(this.f142935b, mf20Var.f142935b) && wj50.m88271j(this.f142936c, mf20Var.f142936c) && this.f142937d == mf20Var.f142937d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f142937d) + s571.m77243b(s571.m77243b(this.f142934a.hashCode() * 31, 961, this.f142935b), 31, this.f142936c);
    }
}
