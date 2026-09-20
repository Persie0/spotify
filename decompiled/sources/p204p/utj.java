package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class utj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f233931a;

    /* JADX INFO: renamed from: b */
    public final String f233932b;

    /* JADX INFO: renamed from: c */
    public final String f233933c;

    /* JADX INFO: renamed from: d */
    public final String f233934d;

    public utj(String str, String str2, String str3, String str4) {
        this.f233931a = str;
        this.f233932b = str2;
        this.f233933c = str3;
        this.f233934d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utj)) {
            return false;
        }
        utj utjVar = (utj) obj;
        return wj50.m88271j(this.f233931a, utjVar.f233931a) && wj50.m88271j(this.f233932b, utjVar.f233932b) && wj50.m88271j(this.f233933c, utjVar.f233933c) && wj50.m88271j(this.f233934d, utjVar.f233934d);
    }

    public final int hashCode() {
        return this.f233934d.hashCode() + s571.m77243b(s571.m77243b(this.f233931a.hashCode() * 31, 31, this.f233932b), 31, this.f233933c);
    }
}
