package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gz00 {

    /* JADX INFO: renamed from: a */
    public final String f85794a;

    /* JADX INFO: renamed from: b */
    public final String f85795b;

    /* JADX INFO: renamed from: c */
    public final String f85796c;

    /* JADX INFO: renamed from: d */
    public final boolean f85797d;

    /* JADX INFO: renamed from: e */
    public final Integer f85798e;

    public gz00(Integer num, String str, String str2, String str3, boolean z) {
        this.f85794a = str;
        this.f85795b = str2;
        this.f85796c = str3;
        this.f85797d = z;
        this.f85798e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz00)) {
            return false;
        }
        gz00 gz00Var = (gz00) obj;
        return wj50.m88271j(this.f85794a, gz00Var.f85794a) && wj50.m88271j(this.f85795b, gz00Var.f85795b) && wj50.m88271j(this.f85796c, gz00Var.f85796c) && this.f85797d == gz00Var.f85797d && wj50.m88271j(this.f85798e, gz00Var.f85798e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(this.f85794a.hashCode() * 31, 31, this.f85795b), 31, this.f85796c), 31, this.f85797d);
        Integer num = this.f85798e;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
