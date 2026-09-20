package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fel {

    /* JADX INFO: renamed from: a */
    public final CharSequence f68785a;

    /* JADX INFO: renamed from: b */
    public final String f68786b;

    /* JADX INFO: renamed from: c */
    public final kel f68787c;

    /* JADX INFO: renamed from: d */
    public final jel f68788d;

    /* JADX INFO: renamed from: e */
    public final eel f68789e;

    /* JADX INFO: renamed from: f */
    public final Integer f68790f;

    /* JADX INFO: renamed from: g */
    public final boolean f68791g;

    /* JADX INFO: renamed from: h */
    public final sdl f68792h;

    /* JADX INFO: renamed from: i */
    public final boolean f68793i;

    /* JADX INFO: renamed from: j */
    public final boolean f68794j;

    public fel(CharSequence charSequence, String str, kel kelVar, jel jelVar, eel eelVar, Integer num, boolean z, sdl sdlVar, boolean z2, boolean z3) {
        this.f68785a = charSequence;
        this.f68786b = str;
        this.f68787c = kelVar;
        this.f68788d = jelVar;
        this.f68789e = eelVar;
        this.f68790f = num;
        this.f68791g = z;
        this.f68792h = sdlVar;
        this.f68793i = z2;
        this.f68794j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fel)) {
            return false;
        }
        fel felVar = (fel) obj;
        return wj50.m88271j(this.f68785a, felVar.f68785a) && wj50.m88271j(this.f68786b, felVar.f68786b) && wj50.m88271j(this.f68787c, felVar.f68787c) && wj50.m88271j(this.f68788d, felVar.f68788d) && wj50.m88271j(this.f68789e, felVar.f68789e) && wj50.m88271j(this.f68790f, felVar.f68790f) && this.f68791g == felVar.f68791g && wj50.m88271j(this.f68792h, felVar.f68792h) && this.f68793i == felVar.f68793i && this.f68794j == felVar.f68794j;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f68785a;
        int iHashCode = (this.f68789e.hashCode() + ((this.f68788d.hashCode() + ((this.f68787c.hashCode() + s571.m77243b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.f68786b)) * 31)) * 31)) * 31;
        Integer num = this.f68790f;
        return Boolean.hashCode(this.f68794j) + s571.m77245d((this.f68792h.hashCode() + s571.m77245d((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f68791g)) * 31, 31, this.f68793i);
    }
}
