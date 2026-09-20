package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aet extends smt {

    /* JADX INFO: renamed from: a */
    public final int f14948a;

    /* JADX INFO: renamed from: b */
    public final String f14949b;

    /* JADX INFO: renamed from: c */
    public final String f14950c;

    /* JADX INFO: renamed from: d */
    public final String f14951d;

    public aet(String str, String str2, int i, String str3) {
        this.f14948a = i;
        this.f14949b = str;
        this.f14950c = str2;
        this.f14951d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aet)) {
            return false;
        }
        aet aetVar = (aet) obj;
        return this.f14948a == aetVar.f14948a && wj50.m88271j(this.f14949b, aetVar.f14949b) && wj50.m88271j(this.f14950c, aetVar.f14950c) && wj50.m88271j(this.f14951d, aetVar.f14951d);
    }

    public final int hashCode() {
        return this.f14951d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f14948a) * 31, 31, this.f14949b), 31, this.f14950c);
    }
}
