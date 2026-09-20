package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qlt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f189917a;

    /* JADX INFO: renamed from: b */
    public final String f189918b;

    /* JADX INFO: renamed from: c */
    public final String f189919c;

    public qlt(String str, String str2, String str3) {
        this.f189917a = str;
        this.f189918b = str2;
        this.f189919c = str3;
    }

    /* JADX INFO: renamed from: b */
    public final String m73249b() {
        return this.f189919c;
    }

    /* JADX INFO: renamed from: c */
    public final String m73250c() {
        return this.f189918b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlt)) {
            return false;
        }
        qlt qltVar = (qlt) obj;
        return wj50.m88271j(this.f189917a, qltVar.f189917a) && wj50.m88271j(this.f189918b, qltVar.f189918b) && wj50.m88271j(this.f189919c, qltVar.f189919c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f189917a.hashCode() * 31, 31, this.f189918b);
        String str = this.f189919c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: t */
    public final String m73251t() {
        return this.f189917a;
    }
}
