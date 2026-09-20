package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class glx {

    /* JADX INFO: renamed from: a */
    public final String f81192a;

    /* JADX INFO: renamed from: b */
    public final String f81193b;

    /* JADX INFO: renamed from: c */
    public final hlx f81194c;

    /* JADX INFO: renamed from: d */
    public final String f81195d;

    public glx(String str, String str2, hlx hlxVar, String str3) {
        this.f81192a = str;
        this.f81193b = str2;
        this.f81194c = hlxVar;
        this.f81195d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glx)) {
            return false;
        }
        glx glxVar = (glx) obj;
        return wj50.m88271j(this.f81192a, glxVar.f81192a) && wj50.m88271j(this.f81193b, glxVar.f81193b) && wj50.m88271j(this.f81194c, glxVar.f81194c) && wj50.m88271j(this.f81195d, glxVar.f81195d);
    }

    public final int hashCode() {
        int iHashCode = this.f81192a.hashCode() * 31;
        String str = this.f81193b;
        return this.f81195d.hashCode() + ((this.f81194c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public glx(String str, String str2, int i) {
        this(str, str2, new hlx(i, 1, null), "");
    }
}
