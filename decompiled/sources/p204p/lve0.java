package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lve0 extends ove0 {

    /* JADX INFO: renamed from: a */
    public final String f137298a;

    /* JADX INFO: renamed from: b */
    public final int f137299b;

    /* JADX INFO: renamed from: c */
    public final String f137300c;

    /* JADX INFO: renamed from: d */
    public final boolean f137301d;

    /* JADX INFO: renamed from: e */
    public final boolean f137302e;

    public lve0(int i, String str, String str2, boolean z, boolean z2) {
        this.f137298a = str;
        this.f137299b = i;
        this.f137300c = str2;
        this.f137301d = z;
        this.f137302e = z2;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: a */
    public final String mo54379a() {
        return this.f137300c;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: b */
    public final String mo54380b() {
        return this.f137298a;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: d */
    public final int mo54381d() {
        return this.f137299b;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: e */
    public final boolean mo54382e() {
        return this.f137301d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lve0)) {
            return false;
        }
        lve0 lve0Var = (lve0) obj;
        return this.f137298a.equals(lve0Var.f137298a) && this.f137299b == lve0Var.f137299b && this.f137300c.equals(lve0Var.f137300c) && this.f137301d == lve0Var.f137301d && this.f137302e == lve0Var.f137302e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137302e) + s571.m77245d(s571.m77243b(f710.m40938f(this.f137299b, this.f137298a.hashCode() * 31, 31), 31, this.f137300c), 31, this.f137301d);
    }
}
