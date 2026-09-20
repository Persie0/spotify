package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yub {

    /* JADX INFO: renamed from: a */
    public final String f276294a;

    /* JADX INFO: renamed from: b */
    public final int f276295b;

    /* JADX INFO: renamed from: c */
    public final long f276296c;

    /* JADX INFO: renamed from: d */
    public final long f276297d;

    /* JADX INFO: renamed from: e */
    public final n6f f276298e;

    /* JADX INFO: renamed from: f */
    public final if71 f276299f;

    /* JADX INFO: renamed from: g */
    public final int f276300g;

    public yub(String str, int i, long j, long j2, n6f n6fVar, if71 if71Var, int i2) {
        this.f276294a = str;
        this.f276295b = i;
        this.f276296c = j;
        this.f276297d = j2;
        this.f276298e = n6fVar;
        this.f276299f = if71Var;
        this.f276300g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yub)) {
            return false;
        }
        yub yubVar = (yub) obj;
        if (!wj50.m88271j(this.f276294a, yubVar.f276294a) || this.f276295b != yubVar.f276295b) {
            return false;
        }
        long j = yubVar.f276296c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f276296c, j) && as91.m27074b(this.f276297d, yubVar.f276297d) && wj50.m88271j(this.f276298e, yubVar.f276298e) && wj50.m88271j(this.f276299f, yubVar.f276299f) && this.f276300g == yubVar.f276300g;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f276295b, this.f276294a.hashCode() * 31, 31);
        int i = n6f.f150872l;
        int iM36605e = dq60.m36605e(dq60.m36605e(iM62800g, this.f276296c, 31), this.f276297d, 31);
        n6f n6fVar = this.f276298e;
        return Integer.hashCode(this.f276300g) + lq51.m59701g(this.f276299f, (iM36605e + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31, 31);
    }
}
