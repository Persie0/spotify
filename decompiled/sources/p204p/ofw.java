package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ofw {

    /* JADX INFO: renamed from: a */
    public final String f164914a;

    /* JADX INFO: renamed from: b */
    public final int f164915b;

    /* JADX INFO: renamed from: c */
    public final String f164916c;

    public ofw(String str, int i, String str2) {
        this.f164914a = str;
        this.f164915b = i;
        this.f164916c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m66861a() {
        return this.f164914a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofw)) {
            return false;
        }
        ofw ofwVar = (ofw) obj;
        return wj50.m88271j(this.f164914a, ofwVar.f164914a) && this.f164915b == ofwVar.f164915b && wj50.m88271j(this.f164916c, ofwVar.f164916c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f164915b, this.f164914a.hashCode() * 31, 31);
        String str = this.f164916c;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
