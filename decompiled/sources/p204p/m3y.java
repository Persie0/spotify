package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m3y {

    /* JADX INFO: renamed from: a */
    public final String f139775a;

    /* JADX INFO: renamed from: b */
    public final String f139776b;

    /* JADX INFO: renamed from: c */
    public final wwu f139777c;

    /* JADX INFO: renamed from: d */
    public final boolean f139778d;

    public m3y(String str, String str2, wwu wwuVar, boolean z) {
        this.f139775a = str;
        this.f139776b = str2;
        this.f139777c = wwuVar;
        this.f139778d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3y)) {
            return false;
        }
        m3y m3yVar = (m3y) obj;
        return wj50.m88271j(this.f139775a, m3yVar.f139775a) && wj50.m88271j(this.f139776b, m3yVar.f139776b) && wj50.m88271j(this.f139777c, m3yVar.f139777c) && this.f139778d == m3yVar.f139778d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139778d) + ((this.f139777c.hashCode() + s571.m77243b(this.f139775a.hashCode() * 31, 31, this.f139776b)) * 31);
    }
}
