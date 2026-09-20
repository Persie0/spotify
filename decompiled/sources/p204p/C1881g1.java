package p204p;

/* JADX INFO: renamed from: p.g1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1881g1 {

    /* JADX INFO: renamed from: a */
    public final String f75497a;

    /* JADX INFO: renamed from: b */
    public final String f75498b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1844f1 f75499c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1844f1 f75500d;

    public C1881g1(String str, String str2, InterfaceC1844f1 interfaceC1844f1, InterfaceC1844f1 interfaceC1844f2) {
        this.f75497a = str;
        this.f75498b = str2;
        this.f75499c = interfaceC1844f1;
        this.f75500d = interfaceC1844f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1881g1)) {
            return false;
        }
        C1881g1 c1881g1 = (C1881g1) obj;
        return wj50.m88271j(this.f75497a, c1881g1.f75497a) && wj50.m88271j(this.f75498b, c1881g1.f75498b) && wj50.m88271j(this.f75499c, c1881g1.f75499c) && wj50.m88271j(this.f75500d, c1881g1.f75500d);
    }

    public final int hashCode() {
        return this.f75500d.hashCode() + ((this.f75499c.hashCode() + s571.m77243b(this.f75497a.hashCode() * 31, 31, this.f75498b)) * 31);
    }

    public /* synthetic */ C1881g1(String str, InterfaceC1844f1 interfaceC1844f1, InterfaceC1844f1 interfaceC1844f2) {
        this(str, "", interfaceC1844f1, interfaceC1844f2);
    }
}
