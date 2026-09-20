package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aaw {

    /* JADX INFO: renamed from: a */
    public final String f13937a;

    /* JADX INFO: renamed from: b */
    public final v140 f13938b;

    /* JADX INFO: renamed from: c */
    public final daj f13939c;

    /* JADX INFO: renamed from: d */
    public final String f13940d;

    /* JADX INFO: renamed from: e */
    public final drc1 f13941e;

    /* JADX INFO: renamed from: f */
    public final boolean f13942f;

    /* JADX INFO: renamed from: g */
    public final boolean f13943g;

    public aaw(String str, v140 v140Var, daj dajVar, String str2, drc1 drc1Var, boolean z, boolean z2) {
        this.f13937a = str;
        this.f13938b = v140Var;
        this.f13939c = dajVar;
        this.f13940d = str2;
        this.f13941e = drc1Var;
        this.f13942f = z;
        this.f13943g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaw)) {
            return false;
        }
        aaw aawVar = (aaw) obj;
        return wj50.m88271j(this.f13937a, aawVar.f13937a) && wj50.m88271j(this.f13938b, aawVar.f13938b) && wj50.m88271j(this.f13939c, aawVar.f13939c) && wj50.m88271j(this.f13940d, aawVar.f13940d) && wj50.m88271j(this.f13941e, aawVar.f13941e) && this.f13942f == aawVar.f13942f && this.f13943g == aawVar.f13943g;
    }

    public final int hashCode() {
        int iHashCode = (this.f13939c.hashCode() + ((this.f13938b.hashCode() + (this.f13937a.hashCode() * 31)) * 31)) * 31;
        String str = this.f13940d;
        return Boolean.hashCode(this.f13943g) + s571.m77245d((this.f13941e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f13942f);
    }
}
