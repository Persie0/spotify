package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jlb implements mlb {

    /* JADX INFO: renamed from: a */
    public final String f113575a;

    /* JADX INFO: renamed from: b */
    public final String f113576b;

    /* JADX INFO: renamed from: c */
    public final String f113577c;

    public jlb(String str, String str2, String str3) {
        this.f113575a = str;
        this.f113576b = str2;
        this.f113577c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m53668a() {
        return this.f113577c;
    }

    /* JADX INFO: renamed from: b */
    public final String m53669b() {
        return this.f113576b;
    }

    /* JADX INFO: renamed from: c */
    public final String m53670c() {
        return this.f113575a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb)) {
            return false;
        }
        jlb jlbVar = (jlb) obj;
        return wj50.m88271j(this.f113575a, jlbVar.f113575a) && wj50.m88271j(this.f113576b, jlbVar.f113576b) && wj50.m88271j(this.f113577c, jlbVar.f113577c);
    }

    public final int hashCode() {
        return this.f113577c.hashCode() + s571.m77243b(this.f113575a.hashCode() * 31, 31, this.f113576b);
    }
}
