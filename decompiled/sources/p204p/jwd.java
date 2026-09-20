package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jwd implements mwd {

    /* JADX INFO: renamed from: a */
    public final String f116622a;

    /* JADX INFO: renamed from: b */
    public final String f116623b;

    /* JADX INFO: renamed from: c */
    public final boolean f116624c;

    /* JADX INFO: renamed from: d */
    public final Long f116625d;

    public jwd(Long l, String str, String str2, boolean z) {
        this.f116622a = str;
        this.f116623b = str2;
        this.f116624c = z;
        this.f116625d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwd)) {
            return false;
        }
        jwd jwdVar = (jwd) obj;
        return wj50.m88271j(this.f116622a, jwdVar.f116622a) && wj50.m88271j(this.f116623b, jwdVar.f116623b) && this.f116624c == jwdVar.f116624c && wj50.m88271j(this.f116625d, jwdVar.f116625d);
    }

    public final int hashCode() {
        String str = this.f116622a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f116623b;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f116624c);
        Long l = this.f116625d;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
