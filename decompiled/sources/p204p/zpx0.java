package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zpx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f285249a;

    /* JADX INFO: renamed from: b */
    public final String f285250b;

    /* JADX INFO: renamed from: c */
    public final String f285251c;

    /* JADX INFO: renamed from: d */
    public final String f285252d;

    /* JADX INFO: renamed from: e */
    public final String f285253e;

    /* JADX INFO: renamed from: f */
    public final String f285254f;

    /* JADX INFO: renamed from: g */
    public final String f285255g;

    /* JADX INFO: renamed from: h */
    public final String f285256h;

    /* JADX INFO: renamed from: i */
    public final String f285257i;

    public zpx0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f285249a = i;
        this.f285250b = str;
        this.f285251c = str2;
        this.f285252d = str3;
        this.f285253e = str4;
        this.f285254f = str5;
        this.f285255g = str6;
        this.f285256h = str7;
        this.f285257i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpx0)) {
            return false;
        }
        zpx0 zpx0Var = (zpx0) obj;
        return this.f285249a == zpx0Var.f285249a && wj50.m88271j(this.f285250b, zpx0Var.f285250b) && wj50.m88271j(this.f285251c, zpx0Var.f285251c) && wj50.m88271j(this.f285252d, zpx0Var.f285252d) && wj50.m88271j(this.f285253e, zpx0Var.f285253e) && wj50.m88271j(this.f285254f, zpx0Var.f285254f) && wj50.m88271j(this.f285255g, zpx0Var.f285255g) && wj50.m88271j(this.f285256h, zpx0Var.f285256h) && wj50.m88271j(this.f285257i, zpx0Var.f285257i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f285249a) * 31, 31, this.f285250b), 31, this.f285251c), 31, this.f285252d), 31, this.f285253e);
        String str = this.f285254f;
        return this.f285257i.hashCode() + s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f285255g), 31, this.f285256h);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f285249a;
    }
}
