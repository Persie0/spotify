package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class im41 {

    /* JADX INFO: renamed from: a */
    public final String f103590a;

    /* JADX INFO: renamed from: b */
    public final String f103591b;

    /* JADX INFO: renamed from: c */
    public final int f103592c;

    public im41(String str, String str2, int i) {
        this.f103590a = str;
        this.f103591b = str2;
        this.f103592c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im41)) {
            return false;
        }
        im41 im41Var = (im41) obj;
        return wj50.m88271j(this.f103590a, im41Var.f103590a) && wj50.m88271j(this.f103591b, im41Var.f103591b) && this.f103592c == im41Var.f103592c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f103592c) + s571.m77243b(this.f103590a.hashCode() * 31, 31, this.f103591b);
    }
}
