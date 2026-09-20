package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class izl {

    /* JADX INFO: renamed from: a */
    public final String f107251a;

    /* JADX INFO: renamed from: b */
    public final String f107252b;

    /* JADX INFO: renamed from: c */
    public final String f107253c;

    /* JADX INFO: renamed from: d */
    public final int f107254d;

    public izl(String str, String str2, int i, String str3) {
        this.f107251a = str;
        this.f107252b = str2;
        this.f107253c = str3;
        this.f107254d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izl)) {
            return false;
        }
        izl izlVar = (izl) obj;
        return wj50.m88271j(this.f107251a, izlVar.f107251a) && wj50.m88271j(this.f107252b, izlVar.f107252b) && wj50.m88271j(this.f107253c, izlVar.f107253c) && this.f107254d == izlVar.f107254d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107254d) + s571.m77243b(s571.m77243b(this.f107251a.hashCode() * 31, 31, this.f107252b), 31, this.f107253c);
    }
}
