package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wme {

    /* JADX INFO: renamed from: a */
    public final String f252839a;

    /* JADX INFO: renamed from: b */
    public final String f252840b;

    /* JADX INFO: renamed from: c */
    public final int f252841c;

    /* JADX INFO: renamed from: d */
    public final String f252842d;

    public wme(String str, String str2, int i, String str3) {
        this.f252839a = str;
        this.f252840b = str2;
        this.f252841c = i;
        this.f252842d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wme)) {
            return false;
        }
        wme wmeVar = (wme) obj;
        return wj50.m88271j(this.f252839a, wmeVar.f252839a) && wj50.m88271j(this.f252840b, wmeVar.f252840b) && this.f252841c == wmeVar.f252841c && wj50.m88271j(this.f252842d, wmeVar.f252842d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f252841c, s571.m77243b(this.f252839a.hashCode() * 31, 31, this.f252840b), 31);
        String str = this.f252842d;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
