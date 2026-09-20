package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ovy0 {

    /* JADX INFO: renamed from: a */
    public final String f170584a;

    /* JADX INFO: renamed from: b */
    public final String f170585b;

    /* JADX INFO: renamed from: c */
    public final String f170586c;

    public ovy0(String str, String str2, String str3) {
        this.f170584a = str;
        this.f170585b = str2;
        this.f170586c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovy0)) {
            return false;
        }
        ovy0 ovy0Var = (ovy0) obj;
        return wj50.m88271j(this.f170584a, ovy0Var.f170584a) && wj50.m88271j(this.f170585b, ovy0Var.f170585b) && wj50.m88271j(this.f170586c, ovy0Var.f170586c);
    }

    public final int hashCode() {
        return Long.hashCode(350L) + s571.m77243b(s571.m77243b(this.f170584a.hashCode() * 31, 31, this.f170585b), 31, this.f170586c);
    }
}
