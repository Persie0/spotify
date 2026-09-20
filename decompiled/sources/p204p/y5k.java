package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y5k implements eh00 {

    /* JADX INFO: renamed from: a */
    public final boolean f269476a;

    /* JADX INFO: renamed from: b */
    public final boolean f269477b;

    /* JADX INFO: renamed from: c */
    public final boolean f269478c;

    /* JADX INFO: renamed from: d */
    public final ray f269479d;

    /* JADX INFO: renamed from: e */
    public final boolean f269480e;

    /* JADX INFO: renamed from: f */
    public final gh00 f269481f;

    /* JADX INFO: renamed from: g */
    public final boolean f269482g;

    /* JADX INFO: renamed from: h */
    public final gh00 f269483h;

    /* JADX INFO: renamed from: i */
    public final boolean f269484i;

    /* JADX INFO: renamed from: t */
    public final boolean f269485t;

    public y5k(boolean z, boolean z2, boolean z3, ray rayVar, boolean z4, gh00 gh00Var, boolean z5, gh00 gh00Var2, boolean z6, boolean z7) {
        this.f269476a = z;
        this.f269477b = z2;
        this.f269478c = z3;
        this.f269479d = rayVar;
        this.f269480e = z4;
        this.f269481f = gh00Var;
        this.f269482g = z5;
        this.f269483h = gh00Var2;
        this.f269484i = z6;
        this.f269485t = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5k)) {
            return false;
        }
        y5k y5kVar = (y5k) obj;
        return this.f269476a == y5kVar.f269476a && this.f269477b == y5kVar.f269477b && this.f269478c == y5kVar.f269478c && wj50.m88271j(this.f269479d, y5kVar.f269479d) && this.f269480e == y5kVar.f269480e && wj50.m88271j(this.f269481f, y5kVar.f269481f) && this.f269482g == y5kVar.f269482g && wj50.m88271j(this.f269483h, y5kVar.f269483h) && this.f269484i == y5kVar.f269484i && this.f269485t == y5kVar.f269485t;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f269476a) * 31, 31, this.f269477b), 31, this.f269478c);
        ray rayVar = this.f269479d;
        int iM77245d2 = s571.m77245d((iM77245d + (rayVar == null ? 0 : rayVar.hashCode())) * 31, 31, this.f269480e);
        gh00 gh00Var = this.f269481f;
        int iM77245d3 = s571.m77245d((iM77245d2 + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31, 31, this.f269482g);
        gh00 gh00Var2 = this.f269483h;
        return Boolean.hashCode(this.f269485t) + s571.m77245d((iM77245d3 + (gh00Var2 != null ? gh00Var2.hashCode() : 0)) * 31, 31, this.f269484i);
    }

    @Override // p204p.eh00
    public final Object invoke() {
        boolean z = this.f269476a;
        return new q4k(null, this.f269477b, this.f269484i, z, !z, false, false, this.f269479d, false, false, z ? 2 : 3, false, this.f269478c, true, this.f269480e, false, this.f269481f, false, false, null, this.f269482g, null, this.f269483h, null, this.f269485t, false, 729167569);
    }
}
