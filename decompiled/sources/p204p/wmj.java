package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wmj {

    /* JADX INFO: renamed from: a */
    public final String f252902a;

    /* JADX INFO: renamed from: b */
    public final String f252903b;

    /* JADX INFO: renamed from: c */
    public final String f252904c;

    public wmj(String str, String str2, String str3) {
        this.f252902a = str;
        this.f252903b = str2;
        this.f252904c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmj)) {
            return false;
        }
        wmj wmjVar = (wmj) obj;
        return wj50.m88271j(this.f252902a, wmjVar.f252902a) && wj50.m88271j(this.f252903b, wmjVar.f252903b) && wj50.m88271j(this.f252904c, wmjVar.f252904c);
    }

    public final int hashCode() {
        return this.f252904c.hashCode() + s571.m77243b(this.f252902a.hashCode() * 31, 31, this.f252903b);
    }
}
