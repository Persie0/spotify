package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u1w implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f225924a;

    /* JADX INFO: renamed from: b */
    public final String f225925b;

    /* JADX INFO: renamed from: c */
    public final String f225926c;

    /* JADX INFO: renamed from: d */
    public final String f225927d;

    /* JADX INFO: renamed from: e */
    public final String f225928e;

    public u1w(String str, String str2, String str3, String str4, String str5) {
        this.f225924a = str;
        this.f225925b = str2;
        this.f225926c = str3;
        this.f225927d = str4;
        this.f225928e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1w)) {
            return false;
        }
        u1w u1wVar = (u1w) obj;
        return wj50.m88271j(this.f225924a, u1wVar.f225924a) && wj50.m88271j(this.f225925b, u1wVar.f225925b) && wj50.m88271j(this.f225926c, u1wVar.f225926c) && wj50.m88271j(this.f225927d, u1wVar.f225927d) && wj50.m88271j(this.f225928e, u1wVar.f225928e);
    }

    public final int hashCode() {
        return this.f225928e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f225924a.hashCode() * 31, 31, this.f225925b), 31, this.f225926c), 31, this.f225927d);
    }
}
