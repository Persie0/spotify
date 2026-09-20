package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c370 {

    /* JADX INFO: renamed from: a */
    public final String f33585a;

    /* JADX INFO: renamed from: b */
    public final String f33586b;

    /* JADX INFO: renamed from: c */
    public final String f33587c;

    /* JADX INFO: renamed from: d */
    public final String f33588d;

    /* JADX INFO: renamed from: e */
    public final String f33589e;

    /* JADX INFO: renamed from: f */
    public final String f33590f;

    /* JADX INFO: renamed from: g */
    public final d0n0 f33591g;

    /* JADX INFO: renamed from: h */
    public final String f33592h;

    /* JADX INFO: renamed from: i */
    public final Integer f33593i;

    public c370(String str, String str2, String str3, String str4, String str5, String str6, d0n0 d0n0Var, String str7, Integer num) {
        this.f33585a = str;
        this.f33586b = str2;
        this.f33587c = str3;
        this.f33588d = str4;
        this.f33589e = str5;
        this.f33590f = str6;
        this.f33591g = d0n0Var;
        this.f33592h = str7;
        this.f33593i = num;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m31364a() {
        return this.f33593i;
    }

    /* JADX INFO: renamed from: b */
    public final String m31365b() {
        return this.f33585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c370)) {
            return false;
        }
        c370 c370Var = (c370) obj;
        return wj50.m88271j(this.f33585a, c370Var.f33585a) && wj50.m88271j(this.f33586b, c370Var.f33586b) && wj50.m88271j(this.f33587c, c370Var.f33587c) && wj50.m88271j(this.f33588d, c370Var.f33588d) && wj50.m88271j(this.f33589e, c370Var.f33589e) && wj50.m88271j(this.f33590f, c370Var.f33590f) && wj50.m88271j(this.f33591g, c370Var.f33591g) && wj50.m88271j(this.f33592h, c370Var.f33592h) && wj50.m88271j(this.f33593i, c370Var.f33593i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f33591g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f33585a.hashCode() * 31, 31, this.f33586b), 31, this.f33587c), 31, this.f33588d), 31, this.f33589e), 31, this.f33590f)) * 31, 31, this.f33592h);
        Integer num = this.f33593i;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }
}
