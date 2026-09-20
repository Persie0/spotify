package p204p;

/* JADX INFO: renamed from: p.o4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2201o4 implements InterfaceC2243p4 {

    /* JADX INFO: renamed from: a */
    public final String f161490a;

    /* JADX INFO: renamed from: b */
    public final String f161491b;

    /* JADX INFO: renamed from: c */
    public final String f161492c;

    /* JADX INFO: renamed from: d */
    public final int f161493d;

    /* JADX INFO: renamed from: e */
    public final int f161494e;

    public C2201o4(int i, int i2, String str, String str2, String str3) {
        this.f161490a = str;
        this.f161491b = str2;
        this.f161492c = str3;
        this.f161493d = i;
        this.f161494e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2201o4)) {
            return false;
        }
        C2201o4 c2201o4 = (C2201o4) obj;
        return wj50.m88271j(this.f161490a, c2201o4.f161490a) && wj50.m88271j(this.f161491b, c2201o4.f161491b) && wj50.m88271j(this.f161492c, c2201o4.f161492c) && this.f161493d == c2201o4.f161493d && this.f161494e == c2201o4.f161494e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161494e) + mt60.m62800g(this.f161493d, s571.m77243b(s571.m77243b(this.f161490a.hashCode() * 31, 31, this.f161491b), 31, this.f161492c), 31);
    }
}
