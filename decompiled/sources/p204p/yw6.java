package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yw6 {

    /* JADX INFO: renamed from: a */
    public final String f276871a;

    /* JADX INFO: renamed from: b */
    public final String f276872b;

    /* JADX INFO: renamed from: c */
    public final long f276873c;

    /* JADX INFO: renamed from: d */
    public final long f276874d;

    /* JADX INFO: renamed from: e */
    public final String f276875e;

    /* JADX INFO: renamed from: f */
    public final boolean f276876f;

    public yw6(String str, String str2, long j, long j2, String str3, boolean z) {
        this.f276871a = str;
        this.f276872b = str2;
        this.f276873c = j;
        this.f276874d = j2;
        this.f276875e = str3;
        this.f276876f = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m94776a() {
        return s571.m77250i(this.f276871a, this.f276872b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw6)) {
            return false;
        }
        yw6 yw6Var = (yw6) obj;
        return wj50.m88271j(this.f276871a, yw6Var.f276871a) && wj50.m88271j(this.f276872b, yw6Var.f276872b) && this.f276873c == yw6Var.f276873c && this.f276874d == yw6Var.f276874d && wj50.m88271j(this.f276875e, yw6Var.f276875e) && this.f276876f == yw6Var.f276876f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276876f) + s571.m77243b(dq60.m36605e(dq60.m36605e(s571.m77243b(this.f276871a.hashCode() * 31, 31, this.f276872b), this.f276873c, 31), this.f276874d, 31), 31, this.f276875e);
    }
}
