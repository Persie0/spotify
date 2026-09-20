package p204p;

/* JADX INFO: renamed from: p.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1846f3 {

    /* JADX INFO: renamed from: a */
    public final String f65322a;

    /* JADX INFO: renamed from: b */
    public final String f65323b;

    /* JADX INFO: renamed from: c */
    public final String f65324c;

    public C1846f3(String str, String str2, String str3) {
        this.f65322a = str;
        this.f65323b = str2;
        this.f65324c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1846f3)) {
            return false;
        }
        C1846f3 c1846f3 = (C1846f3) obj;
        return wj50.m88271j(this.f65322a, c1846f3.f65322a) && wj50.m88271j(this.f65323b, c1846f3.f65323b) && wj50.m88271j(this.f65324c, c1846f3.f65324c);
    }

    public final int hashCode() {
        return this.f65324c.hashCode() + s571.m77243b(this.f65322a.hashCode() * 31, 31, this.f65323b);
    }
}
