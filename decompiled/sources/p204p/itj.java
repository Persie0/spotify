package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class itj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f105606a;

    /* JADX INFO: renamed from: b */
    public final String f105607b;

    /* JADX INFO: renamed from: c */
    public final String f105608c;

    /* JADX INFO: renamed from: d */
    public final String f105609d;

    /* JADX INFO: renamed from: e */
    public final String f105610e;

    public itj(String str, String str2, String str3, String str4, String str5) {
        this.f105606a = str;
        this.f105607b = str2;
        this.f105608c = str3;
        this.f105609d = str4;
        this.f105610e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itj)) {
            return false;
        }
        itj itjVar = (itj) obj;
        return wj50.m88271j(this.f105606a, itjVar.f105606a) && wj50.m88271j(this.f105607b, itjVar.f105607b) && wj50.m88271j(this.f105608c, itjVar.f105608c) && wj50.m88271j(this.f105609d, itjVar.f105609d) && wj50.m88271j(this.f105610e, itjVar.f105610e);
    }

    public final int hashCode() {
        return this.f105610e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f105606a.hashCode() * 31, 31, this.f105607b), 31, this.f105608c), 31, this.f105609d);
    }
}
