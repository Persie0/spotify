package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zil implements cjl {

    /* JADX INFO: renamed from: a */
    public final String f283192a;

    /* JADX INFO: renamed from: b */
    public final String f283193b;

    public zil(String str, String str2) {
        this.f283192a = str;
        this.f283193b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zil)) {
            return false;
        }
        zil zilVar = (zil) obj;
        return wj50.m88271j(this.f283192a, zilVar.f283192a) && wj50.m88271j(this.f283193b, zilVar.f283193b);
    }

    public final int hashCode() {
        return this.f283193b.hashCode() + (this.f283192a.hashCode() * 31);
    }
}
