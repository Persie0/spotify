package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class os81 {

    /* JADX INFO: renamed from: a */
    public final String f168770a;

    /* JADX INFO: renamed from: b */
    public final String f168771b;

    /* JADX INFO: renamed from: c */
    public final int f168772c;

    /* JADX INFO: renamed from: d */
    public final rcm0 f168773d;

    /* JADX INFO: renamed from: e */
    public final String f168774e;

    /* JADX INFO: renamed from: f */
    public final qf40 f168775f;

    public os81(String str, String str2, int i, rcm0 rcm0Var, String str3, qf40 qf40Var) {
        this.f168770a = str;
        this.f168771b = str2;
        this.f168772c = i;
        this.f168773d = rcm0Var;
        this.f168774e = str3;
        this.f168775f = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os81)) {
            return false;
        }
        os81 os81Var = (os81) obj;
        return wj50.m88271j(this.f168770a, os81Var.f168770a) && wj50.m88271j(this.f168771b, os81Var.f168771b) && this.f168772c == os81Var.f168772c && wj50.m88271j(this.f168773d, os81Var.f168773d) && wj50.m88271j(this.f168774e, os81Var.f168774e) && wj50.m88271j(this.f168775f, os81Var.f168775f);
    }

    public final int hashCode() {
        return this.f168775f.hashCode() + s571.m77243b(yds.m93483m(this.f168773d, mt60.m62800g(this.f168772c, s571.m77243b(this.f168770a.hashCode() * 31, 31, this.f168771b), 31), 31), 31, this.f168774e);
    }
}
