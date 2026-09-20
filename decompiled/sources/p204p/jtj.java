package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jtj extends juj {

    /* JADX INFO: renamed from: a */
    public final String f115910a;

    /* JADX INFO: renamed from: b */
    public final String f115911b;

    /* JADX INFO: renamed from: c */
    public final String f115912c;

    /* JADX INFO: renamed from: d */
    public final String f115913d;

    /* JADX INFO: renamed from: e */
    public final String f115914e;

    /* JADX INFO: renamed from: f */
    public final String f115915f;

    public jtj(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f115910a = str;
        this.f115911b = str2;
        this.f115912c = str3;
        this.f115913d = str4;
        this.f115914e = str5;
        this.f115915f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtj)) {
            return false;
        }
        jtj jtjVar = (jtj) obj;
        return wj50.m88271j(this.f115910a, jtjVar.f115910a) && wj50.m88271j(this.f115911b, jtjVar.f115911b) && wj50.m88271j(this.f115912c, jtjVar.f115912c) && wj50.m88271j(this.f115913d, jtjVar.f115913d) && wj50.m88271j(this.f115914e, jtjVar.f115914e) && wj50.m88271j(this.f115915f, jtjVar.f115915f);
    }

    public final int hashCode() {
        return this.f115915f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f115910a.hashCode() * 31, 31, this.f115911b), 31, this.f115912c), 31, this.f115913d), 31, this.f115914e);
    }
}
