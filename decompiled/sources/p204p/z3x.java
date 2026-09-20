package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z3x {

    /* JADX INFO: renamed from: a */
    public final String f279048a;

    /* JADX INFO: renamed from: b */
    public final String f279049b;

    /* JADX INFO: renamed from: c */
    public final String f279050c;

    /* JADX INFO: renamed from: d */
    public final String f279051d;

    /* JADX INFO: renamed from: e */
    public final String f279052e;

    /* JADX INFO: renamed from: f */
    public final String f279053f;

    /* JADX INFO: renamed from: g */
    public final String f279054g;

    /* JADX INFO: renamed from: h */
    public final String f279055h;

    public z3x(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f279048a = str;
        this.f279049b = str2;
        this.f279050c = str3;
        this.f279051d = str4;
        this.f279052e = str5;
        this.f279053f = str6;
        this.f279054g = str7;
        this.f279055h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3x)) {
            return false;
        }
        z3x z3xVar = (z3x) obj;
        return this.f279048a.equals(z3xVar.f279048a) && this.f279049b.equals(z3xVar.f279049b) && this.f279050c.equals(z3xVar.f279050c) && wj50.m88271j(this.f279051d, z3xVar.f279051d) && wj50.m88271j(this.f279052e, z3xVar.f279052e) && this.f279053f.equals(z3xVar.f279053f) && this.f279054g.equals(z3xVar.f279054g) && this.f279055h.equals(z3xVar.f279055h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77243b(this.f279048a.hashCode() * 31, 29791, this.f279049b), 31, false), 31, this.f279050c);
        String str = this.f279051d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279052e;
        return Boolean.hashCode(false) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f279053f), 31, this.f279054g), 961, this.f279055h), 29791, false), 31, false);
    }
}
