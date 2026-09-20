package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g49 implements h49 {

    /* JADX INFO: renamed from: a */
    public final int f76369a;

    /* JADX INFO: renamed from: b */
    public final String f76370b;

    /* JADX INFO: renamed from: c */
    public final String f76371c;

    /* JADX INFO: renamed from: d */
    public final long f76372d;

    /* JADX INFO: renamed from: e */
    public final Integer f76373e;

    /* JADX INFO: renamed from: f */
    public final Integer f76374f;

    /* JADX INFO: renamed from: g */
    public final ki71 f76375g;

    public g49(int i, String str, String str2, long j, Integer num, Integer num2, ki71 ki71Var) {
        this.f76369a = i;
        this.f76370b = str;
        this.f76371c = str2;
        this.f76372d = j;
        this.f76373e = num;
        this.f76374f = num2;
        this.f76375g = ki71Var;
    }

    @Override // p204p.h49
    /* JADX INFO: renamed from: a */
    public final String mo40721a() {
        return this.f76370b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g49)) {
            return false;
        }
        g49 g49Var = (g49) obj;
        return this.f76369a == g49Var.f76369a && wj50.m88271j(this.f76370b, g49Var.f76370b) && wj50.m88271j(this.f76371c, g49Var.f76371c) && this.f76372d == g49Var.f76372d && wj50.m88271j(this.f76373e, g49Var.f76373e) && wj50.m88271j(this.f76374f, g49Var.f76374f) && wj50.m88271j(this.f76375g, g49Var.f76375g);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(s571.m77243b(s571.m77243b(Integer.hashCode(this.f76369a) * 31, 31, this.f76370b), 31, this.f76371c), this.f76372d, 31);
        Integer num = this.f76373e;
        int iHashCode = (iM36605e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f76374f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ki71 ki71Var = this.f76375g;
        return iHashCode2 + (ki71Var != null ? ki71Var.hashCode() : 0);
    }
}
