package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wls0 {

    /* JADX INFO: renamed from: a */
    public final String f252611a;

    /* JADX INFO: renamed from: b */
    public final String f252612b;

    /* JADX INFO: renamed from: c */
    public final String f252613c;

    /* JADX INFO: renamed from: d */
    public final int f252614d;

    public wls0(String str, String str2, int i, String str3) {
        this.f252611a = str;
        this.f252612b = str2;
        this.f252613c = str3;
        this.f252614d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wls0)) {
            return false;
        }
        wls0 wls0Var = (wls0) obj;
        return wj50.m88271j(this.f252611a, wls0Var.f252611a) && wj50.m88271j(this.f252612b, wls0Var.f252612b) && wj50.m88271j(this.f252613c, wls0Var.f252613c) && this.f252614d == wls0Var.f252614d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f252614d) + s571.m77243b(s571.m77243b(this.f252611a.hashCode() * 31, 31, this.f252612b), 31, this.f252613c);
    }
}
