package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fnx {

    /* JADX INFO: renamed from: a */
    public final String f71367a;

    /* JADX INFO: renamed from: b */
    public final String f71368b;

    /* JADX INFO: renamed from: c */
    public final String f71369c;

    /* JADX INFO: renamed from: d */
    public final String f71370d;

    public fnx(String str, String str2, String str3, String str4) {
        this.f71367a = str;
        this.f71368b = str2;
        this.f71369c = str3;
        this.f71370d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnx)) {
            return false;
        }
        fnx fnxVar = (fnx) obj;
        return wj50.m88271j(this.f71367a, fnxVar.f71367a) && wj50.m88271j(this.f71368b, fnxVar.f71368b) && wj50.m88271j(this.f71369c, fnxVar.f71369c) && wj50.m88271j(this.f71370d, fnxVar.f71370d);
    }

    public final int hashCode() {
        return this.f71370d.hashCode() + s571.m77243b(s571.m77243b(this.f71367a.hashCode() * 31, 31, this.f71368b), 31, this.f71369c);
    }
}
