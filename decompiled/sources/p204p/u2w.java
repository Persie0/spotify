package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u2w {

    /* JADX INFO: renamed from: a */
    public final String f226184a;

    /* JADX INFO: renamed from: b */
    public final String f226185b;

    /* JADX INFO: renamed from: c */
    public final String f226186c;

    /* JADX INFO: renamed from: d */
    public final String f226187d;

    /* JADX INFO: renamed from: e */
    public final String f226188e;

    /* JADX INFO: renamed from: f */
    public final String f226189f;

    /* JADX INFO: renamed from: g */
    public final String f226190g;

    public u2w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f226184a = str;
        this.f226185b = str2;
        this.f226186c = str3;
        this.f226187d = str4;
        this.f226188e = str5;
        this.f226189f = str6;
        this.f226190g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2w)) {
            return false;
        }
        u2w u2wVar = (u2w) obj;
        return wj50.m88271j(this.f226184a, u2wVar.f226184a) && wj50.m88271j(this.f226185b, u2wVar.f226185b) && wj50.m88271j(this.f226186c, u2wVar.f226186c) && wj50.m88271j(this.f226187d, u2wVar.f226187d) && wj50.m88271j(this.f226188e, u2wVar.f226188e) && wj50.m88271j(this.f226189f, u2wVar.f226189f) && wj50.m88271j(this.f226190g, u2wVar.f226190g);
    }

    public final int hashCode() {
        return this.f226190g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f226184a.hashCode() * 31, 31, this.f226185b), 31, this.f226186c), 31, this.f226187d), 31, this.f226188e), 31, this.f226189f);
    }
}
