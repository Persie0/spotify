package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lb6 {

    /* JADX INFO: renamed from: a */
    public final String f131569a;

    /* JADX INFO: renamed from: b */
    public final String f131570b;

    /* JADX INFO: renamed from: c */
    public final Boolean f131571c;

    /* JADX INFO: renamed from: d */
    public final Integer f131572d;

    /* JADX INFO: renamed from: e */
    public final String f131573e;

    /* JADX INFO: renamed from: f */
    public final long f131574f;

    /* JADX INFO: renamed from: g */
    public final long f131575g;

    public lb6(String str, String str2, Boolean bool, Integer num, String str3, long j, long j2) {
        this.f131569a = str;
        this.f131570b = str2;
        this.f131571c = bool;
        this.f131572d = num;
        this.f131573e = str3;
        this.f131574f = j;
        this.f131575g = j2;
    }

    /* JADX INFO: renamed from: a */
    public final int m58619a() {
        if (this.f131571c != null) {
            return 1;
        }
        if (this.f131572d != null) {
            return 2;
        }
        return this.f131573e != null ? 3 : 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb6)) {
            return false;
        }
        lb6 lb6Var = (lb6) obj;
        return wj50.m88271j(this.f131569a, lb6Var.f131569a) && wj50.m88271j(this.f131570b, lb6Var.f131570b) && wj50.m88271j(this.f131571c, lb6Var.f131571c) && wj50.m88271j(this.f131572d, lb6Var.f131572d) && wj50.m88271j(this.f131573e, lb6Var.f131573e) && this.f131574f == lb6Var.f131574f && this.f131575g == lb6Var.f131575g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f131569a.hashCode() * 31, 31, this.f131570b);
        Boolean bool = this.f131571c;
        int iHashCode = (iM77243b + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f131572d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f131573e;
        return Long.hashCode(this.f131575g) + dq60.m36605e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.f131574f, 31);
    }
}
