package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hkk {

    /* JADX INFO: renamed from: a */
    public final String f92450a;

    /* JADX INFO: renamed from: b */
    public final String f92451b;

    /* JADX INFO: renamed from: c */
    public final long f92452c;

    public hkk(String str, String str2, long j) {
        this.f92450a = str;
        this.f92451b = str2;
        this.f92452c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkk)) {
            return false;
        }
        hkk hkkVar = (hkk) obj;
        if (!wj50.m88271j(this.f92450a, hkkVar.f92450a) || !wj50.m88271j(this.f92451b, hkkVar.f92451b)) {
            return false;
        }
        long j = hkkVar.f92452c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f92452c, j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f92450a.hashCode() * 31, 31, this.f92451b);
        int i = n6f.f150872l;
        return Long.hashCode(this.f92452c) + iM77243b;
    }
}
