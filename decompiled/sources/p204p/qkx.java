package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qkx implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f189663a;

    /* JADX INFO: renamed from: b */
    public final String f189664b;

    /* JADX INFO: renamed from: c */
    public final String f189665c;

    /* JADX INFO: renamed from: d */
    public final String f189666d;

    public qkx(String str, String str2, String str3, String str4) {
        this.f189663a = str;
        this.f189664b = str2;
        this.f189665c = str3;
        this.f189666d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkx)) {
            return false;
        }
        qkx qkxVar = (qkx) obj;
        return wj50.m88271j(this.f189663a, qkxVar.f189663a) && wj50.m88271j(this.f189664b, qkxVar.f189664b) && wj50.m88271j(this.f189665c, qkxVar.f189665c) && wj50.m88271j(this.f189666d, qkxVar.f189666d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f189663a.hashCode() * 31, 31, this.f189664b), 31, this.f189665c);
        String str = this.f189666d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
