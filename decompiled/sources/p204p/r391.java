package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r391 implements t391 {

    /* JADX INFO: renamed from: a */
    public final String f195453a;

    /* JADX INFO: renamed from: b */
    public final String f195454b;

    /* JADX INFO: renamed from: c */
    public final String f195455c;

    /* JADX INFO: renamed from: d */
    public final long f195456d;

    /* JADX INFO: renamed from: e */
    public final s391 f195457e;

    /* JADX INFO: renamed from: f */
    public final long f195458f;

    /* JADX INFO: renamed from: g */
    public final q391 f195459g;

    /* JADX INFO: renamed from: h */
    public final o391 f195460h;

    public r391(String str, String str2, String str3, long j, s391 s391Var, long j2, q391 q391Var, o391 o391Var) {
        this.f195453a = str;
        this.f195454b = str2;
        this.f195455c = str3;
        this.f195456d = j;
        this.f195457e = s391Var;
        this.f195458f = j2;
        this.f195459g = q391Var;
        this.f195460h = o391Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r391)) {
            return false;
        }
        r391 r391Var = (r391) obj;
        return wj50.m88271j(this.f195453a, r391Var.f195453a) && wj50.m88271j(this.f195454b, r391Var.f195454b) && wj50.m88271j(this.f195455c, r391Var.f195455c) && this.f195456d == r391Var.f195456d && wj50.m88271j(this.f195457e, r391Var.f195457e) && this.f195458f == r391Var.f195458f && wj50.m88271j(this.f195459g, r391Var.f195459g) && wj50.m88271j(this.f195460h, r391Var.f195460h);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(s571.m77243b(s571.m77243b(this.f195453a.hashCode() * 31, 31, this.f195454b), 31, this.f195455c), this.f195456d, 31);
        s391 s391Var = this.f195457e;
        int iM36605e2 = dq60.m36605e((iM36605e + (s391Var == null ? 0 : s391Var.hashCode())) * 31, this.f195458f, 31);
        q391 q391Var = this.f195459g;
        int iHashCode = (iM36605e2 + (q391Var == null ? 0 : q391Var.hashCode())) * 31;
        o391 o391Var = this.f195460h;
        return iHashCode + (o391Var != null ? o391Var.hashCode() : 0);
    }
}
