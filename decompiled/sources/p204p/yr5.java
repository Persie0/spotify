package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yr5 {

    /* JADX INFO: renamed from: a */
    public final String f275394a;

    /* JADX INFO: renamed from: b */
    public final String f275395b;

    /* JADX INFO: renamed from: c */
    public final Integer f275396c;

    /* JADX INFO: renamed from: d */
    public final String f275397d;

    /* JADX INFO: renamed from: e */
    public final String f275398e;

    public yr5(String str, String str2, Integer num, String str3, String str4) {
        this.f275394a = str;
        this.f275395b = str2;
        this.f275396c = num;
        this.f275397d = str3;
        this.f275398e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr5)) {
            return false;
        }
        yr5 yr5Var = (yr5) obj;
        return wj50.m88271j(this.f275394a, yr5Var.f275394a) && wj50.m88271j(this.f275395b, yr5Var.f275395b) && wj50.m88271j(this.f275396c, yr5Var.f275396c) && wj50.m88271j(this.f275397d, yr5Var.f275397d) && wj50.m88271j(this.f275398e, yr5Var.f275398e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f275394a.hashCode() * 31, 31, this.f275395b);
        Integer num = this.f275396c;
        return this.f275398e.hashCode() + s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f275397d);
    }
}
