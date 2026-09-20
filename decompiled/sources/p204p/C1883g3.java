package p204p;

/* JADX INFO: renamed from: p.g3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1883g3 {

    /* JADX INFO: renamed from: a */
    public final String f76036a;

    /* JADX INFO: renamed from: b */
    public final String f76037b;

    /* JADX INFO: renamed from: c */
    public final String f76038c;

    /* JADX INFO: renamed from: d */
    public final String f76039d;

    /* JADX INFO: renamed from: e */
    public final String f76040e;

    /* JADX INFO: renamed from: f */
    public final String f76041f;

    /* JADX INFO: renamed from: g */
    public final ci20 f76042g;

    /* JADX INFO: renamed from: h */
    public final String f76043h;

    public C1883g3(String str, String str2, String str3, String str4, String str5, String str6, ci20 ci20Var, String str7) {
        this.f76036a = str;
        this.f76037b = str2;
        this.f76038c = str3;
        this.f76039d = str4;
        this.f76040e = str5;
        this.f76041f = str6;
        this.f76042g = ci20Var;
        this.f76043h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883g3)) {
            return false;
        }
        C1883g3 c1883g3 = (C1883g3) obj;
        return wj50.m88271j(this.f76036a, c1883g3.f76036a) && wj50.m88271j(this.f76037b, c1883g3.f76037b) && wj50.m88271j(this.f76038c, c1883g3.f76038c) && wj50.m88271j(this.f76039d, c1883g3.f76039d) && wj50.m88271j(this.f76040e, c1883g3.f76040e) && wj50.m88271j(this.f76041f, c1883g3.f76041f) && wj50.m88271j(this.f76042g, c1883g3.f76042g) && wj50.m88271j(this.f76043h, c1883g3.f76043h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f76036a.hashCode() * 31, 31, this.f76037b), 31, this.f76038c), 31, this.f76039d), 31, this.f76040e);
        String str = this.f76041f;
        return this.f76043h.hashCode() + ((this.f76042g.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
