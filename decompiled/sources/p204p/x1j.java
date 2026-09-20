package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x1j {

    /* JADX INFO: renamed from: a */
    public final String f257206a;

    /* JADX INFO: renamed from: b */
    public final String f257207b;

    /* JADX INFO: renamed from: c */
    public final String f257208c;

    /* JADX INFO: renamed from: d */
    public final String f257209d;

    /* JADX INFO: renamed from: e */
    public final boolean f257210e;

    /* JADX INFO: renamed from: f */
    public final String f257211f;

    /* JADX INFO: renamed from: g */
    public final String f257212g;

    /* JADX INFO: renamed from: h */
    public final boolean f257213h;

    public x1j(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.f257206a = str;
        this.f257207b = str2;
        this.f257208c = str3;
        this.f257209d = str4;
        this.f257210e = z;
        this.f257211f = str5;
        this.f257212g = str6;
        this.f257213h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1j)) {
            return false;
        }
        x1j x1jVar = (x1j) obj;
        return wj50.m88271j(this.f257206a, x1jVar.f257206a) && wj50.m88271j(this.f257207b, x1jVar.f257207b) && wj50.m88271j(this.f257208c, x1jVar.f257208c) && wj50.m88271j(this.f257209d, x1jVar.f257209d) && this.f257210e == x1jVar.f257210e && wj50.m88271j(this.f257211f, x1jVar.f257211f) && wj50.m88271j(this.f257212g, x1jVar.f257212g) && this.f257213h == x1jVar.f257213h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257213h) + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f257206a.hashCode() * 31, 31, this.f257207b), 31, this.f257208c), 31, this.f257209d), 31, this.f257210e), 31, this.f257211f), 31, this.f257212g);
    }
}
