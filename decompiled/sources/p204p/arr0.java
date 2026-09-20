package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class arr0 {

    /* JADX INFO: renamed from: a */
    public final Integer f19133a;

    /* JADX INFO: renamed from: b */
    public final String f19134b;

    /* JADX INFO: renamed from: c */
    public final String f19135c;

    /* JADX INFO: renamed from: d */
    public final String f19136d;

    /* JADX INFO: renamed from: e */
    public final String f19137e;

    public arr0(String str, String str2, Integer num, String str3, String str4) {
        this.f19133a = num;
        this.f19134b = str;
        this.f19135c = str2;
        this.f19136d = str3;
        this.f19137e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arr0)) {
            return false;
        }
        arr0 arr0Var = (arr0) obj;
        return wj50.m88271j(this.f19133a, arr0Var.f19133a) && wj50.m88271j(this.f19134b, arr0Var.f19134b) && wj50.m88271j(this.f19135c, arr0Var.f19135c) && wj50.m88271j(this.f19136d, arr0Var.f19136d) && wj50.m88271j(this.f19137e, arr0Var.f19137e);
    }

    public final int hashCode() {
        Integer num = this.f19133a;
        return this.f19137e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((num == null ? 0 : num.hashCode()) * 31, 31, this.f19134b), 31, this.f19135c), 31, this.f19136d);
    }
}
