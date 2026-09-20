package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kve0 extends ove0 {

    /* JADX INFO: renamed from: a */
    public final String f126850a;

    /* JADX INFO: renamed from: b */
    public final String f126851b;

    /* JADX INFO: renamed from: c */
    public final int f126852c;

    /* JADX INFO: renamed from: d */
    public final boolean f126853d;

    /* JADX INFO: renamed from: e */
    public final boolean f126854e;

    public kve0(int i, String str, String str2, boolean z, boolean z2) {
        this.f126850a = str;
        this.f126851b = str2;
        this.f126852c = i;
        this.f126853d = z;
        this.f126854e = z2;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: a */
    public final String mo54379a() {
        return this.f126851b;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: b */
    public final String mo54380b() {
        return this.f126850a;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: d */
    public final int mo54381d() {
        return this.f126852c;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: e */
    public final boolean mo54382e() {
        return this.f126853d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kve0)) {
            return false;
        }
        kve0 kve0Var = (kve0) obj;
        return wj50.m88271j(this.f126850a, kve0Var.f126850a) && wj50.m88271j(this.f126851b, kve0Var.f126851b) && this.f126852c == kve0Var.f126852c && this.f126853d == kve0Var.f126853d && this.f126854e == kve0Var.f126854e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126854e) + s571.m77245d(f710.m40938f(this.f126852c, s571.m77243b(this.f126850a.hashCode() * 31, 31, this.f126851b), 31), 31, this.f126853d);
    }
}
