package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nve0 extends ove0 {

    /* JADX INFO: renamed from: a */
    public final String f158877a;

    /* JADX INFO: renamed from: b */
    public final String f158878b;

    /* JADX INFO: renamed from: c */
    public final int f158879c;

    /* JADX INFO: renamed from: d */
    public final boolean f158880d;

    /* JADX INFO: renamed from: e */
    public final boolean f158881e;

    public nve0(int i, String str, String str2, boolean z, boolean z2) {
        this.f158877a = str;
        this.f158878b = str2;
        this.f158879c = i;
        this.f158880d = z;
        this.f158881e = z2;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: a */
    public final String mo54379a() {
        return this.f158878b;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: b */
    public final String mo54380b() {
        return this.f158877a;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: d */
    public final int mo54381d() {
        return this.f158879c;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: e */
    public final boolean mo54382e() {
        return this.f158880d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nve0)) {
            return false;
        }
        nve0 nve0Var = (nve0) obj;
        return wj50.m88271j(this.f158877a, nve0Var.f158877a) && wj50.m88271j(this.f158878b, nve0Var.f158878b) && this.f158879c == nve0Var.f158879c && this.f158880d == nve0Var.f158880d && this.f158881e == nve0Var.f158881e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158881e) + s571.m77245d(f710.m40938f(this.f158879c, s571.m77243b(this.f158877a.hashCode() * 31, 31, this.f158878b), 31), 31, this.f158880d);
    }
}
