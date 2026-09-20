package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f287686a;

    /* JADX INFO: renamed from: b */
    public final String f287687b;

    /* JADX INFO: renamed from: c */
    public final String f287688c;

    public zyw(String str, String str2, String str3) {
        this.f287686a = str;
        this.f287687b = str2;
        this.f287688c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyw)) {
            return false;
        }
        zyw zywVar = (zyw) obj;
        return wj50.m88271j(this.f287686a, zywVar.f287686a) && wj50.m88271j(this.f287687b, zywVar.f287687b) && wj50.m88271j(this.f287688c, zywVar.f287688c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f287686a.hashCode() * 31, 31, this.f287687b);
        String str = this.f287688c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
