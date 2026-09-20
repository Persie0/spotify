package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aby {

    /* JADX INFO: renamed from: a */
    public final String f14202a;

    /* JADX INFO: renamed from: b */
    public final int f14203b;

    /* JADX INFO: renamed from: c */
    public final String f14204c;

    public aby(String str, int i, String str2) {
        this.f14202a = str;
        this.f14203b = i;
        this.f14204c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aby)) {
            return false;
        }
        aby abyVar = (aby) obj;
        return this.f14202a.equals(abyVar.f14202a) && this.f14203b == abyVar.f14203b && this.f14204c.equals(abyVar.f14204c);
    }

    public final int hashCode() {
        return s571.m77243b(mt60.m62800g(this.f14203b, this.f14202a.hashCode() * 31, 31), 31, this.f14204c);
    }
}
