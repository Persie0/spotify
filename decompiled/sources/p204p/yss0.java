package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yss0 implements cts0 {

    /* JADX INFO: renamed from: a */
    public final String f275871a;

    /* JADX INFO: renamed from: b */
    public final boolean f275872b;

    /* JADX INFO: renamed from: c */
    public final boolean f275873c;

    /* JADX INFO: renamed from: d */
    public final boolean f275874d = true;

    public yss0(String str, boolean z, boolean z2) {
        this.f275871a = str;
        this.f275872b = z;
        this.f275873c = z2;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: a */
    public final boolean mo27152a() {
        return this.f275873c;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: b */
    public final boolean mo27153b() {
        return this.f275872b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yss0)) {
            return false;
        }
        yss0 yss0Var = (yss0) obj;
        return wj50.m88271j(this.f275871a, yss0Var.f275871a) && this.f275872b == yss0Var.f275872b && this.f275873c == yss0Var.f275873c;
    }

    @Override // p204p.cts0
    public final boolean getEnabled() {
        return this.f275874d;
    }

    @Override // p204p.cts0
    public final String getUri() {
        return this.f275871a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275873c) + s571.m77245d(this.f275871a.hashCode() * 31, 31, this.f275872b);
    }
}
