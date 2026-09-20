package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a4x implements guj {

    /* JADX INFO: renamed from: a */
    public final String f12335a;

    /* JADX INFO: renamed from: b */
    public final String f12336b;

    /* JADX INFO: renamed from: c */
    public final String f12337c;

    /* JADX INFO: renamed from: d */
    public final String f12338d;

    /* JADX INFO: renamed from: e */
    public final String f12339e;

    /* JADX INFO: renamed from: f */
    public final String f12340f;

    /* JADX INFO: renamed from: g */
    public final String f12341g;

    /* JADX INFO: renamed from: h */
    public final l2i f12342h;

    public a4x(String str, String str2, String str3, String str4, String str5, String str6, String str7, l2i l2iVar) {
        this.f12335a = str;
        this.f12336b = str2;
        this.f12337c = str3;
        this.f12338d = str4;
        this.f12339e = str5;
        this.f12340f = str6;
        this.f12341g = str7;
        this.f12342h = l2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4x)) {
            return false;
        }
        a4x a4xVar = (a4x) obj;
        return wj50.m88271j(this.f12335a, a4xVar.f12335a) && wj50.m88271j(this.f12336b, a4xVar.f12336b) && wj50.m88271j(this.f12337c, a4xVar.f12337c) && wj50.m88271j(this.f12338d, a4xVar.f12338d) && wj50.m88271j(this.f12339e, a4xVar.f12339e) && wj50.m88271j(this.f12340f, a4xVar.f12340f) && wj50.m88271j(this.f12341g, a4xVar.f12341g) && this.f12342h == a4xVar.f12342h;
    }

    public final int hashCode() {
        return this.f12342h.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f12335a.hashCode() * 31, 31, this.f12336b), 31, this.f12337c), 31, this.f12338d), 31, this.f12339e), 31, this.f12340f), 31, this.f12341g);
    }
}
