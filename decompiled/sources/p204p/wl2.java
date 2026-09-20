package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wl2 {

    /* JADX INFO: renamed from: a */
    public final String f252344a;

    /* JADX INFO: renamed from: b */
    public final String f252345b;

    /* JADX INFO: renamed from: c */
    public final boolean f252346c;

    public wl2(String str, String str2, boolean z) {
        this.f252344a = str;
        this.f252345b = str2;
        this.f252346c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m88379a() {
        return this.f252344a;
    }

    /* JADX INFO: renamed from: b */
    public final String m88380b() {
        return this.f252345b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88381c() {
        return this.f252346c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2)) {
            return false;
        }
        wl2 wl2Var = (wl2) obj;
        return wj50.m88271j(this.f252344a, wl2Var.f252344a) && wj50.m88271j(this.f252345b, wl2Var.f252345b) && this.f252346c == wl2Var.f252346c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252346c) + s571.m77243b(this.f252344a.hashCode() * 31, 31, this.f252345b);
    }
}
