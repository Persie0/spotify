package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p03 {

    /* JADX INFO: renamed from: a */
    public final String f172445a;

    /* JADX INFO: renamed from: b */
    public final String f172446b;

    /* JADX INFO: renamed from: c */
    public final String f172447c;

    public p03(String str, String str2, String str3) {
        this.f172445a = str;
        this.f172446b = str2;
        this.f172447c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p03)) {
            return false;
        }
        p03 p03Var = (p03) obj;
        return wj50.m88271j(this.f172445a, p03Var.f172445a) && wj50.m88271j(this.f172446b, p03Var.f172446b) && wj50.m88271j(this.f172447c, p03Var.f172447c);
    }

    public final int hashCode() {
        return this.f172447c.hashCode() + s571.m77243b(this.f172445a.hashCode() * 31, 31, this.f172446b);
    }
}
