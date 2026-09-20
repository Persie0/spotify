package p204p;

/* JADX INFO: renamed from: p.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1727c3 {

    /* JADX INFO: renamed from: a */
    public final String f33499a;

    /* JADX INFO: renamed from: b */
    public final String f33500b;

    public C1727c3(String str, String str2) {
        this.f33499a = str;
        this.f33500b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1727c3)) {
            return false;
        }
        C1727c3 c1727c3 = (C1727c3) obj;
        return wj50.m88271j(this.f33499a, c1727c3.f33499a) && wj50.m88271j(this.f33500b, c1727c3.f33500b);
    }

    public final int hashCode() {
        return this.f33500b.hashCode() + (this.f33499a.hashCode() * 31);
    }
}
