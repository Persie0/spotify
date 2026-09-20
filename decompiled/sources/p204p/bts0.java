package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bts0 implements cts0 {

    /* JADX INFO: renamed from: a */
    public final String f30928a;

    /* JADX INFO: renamed from: b */
    public final boolean f30929b;

    /* JADX INFO: renamed from: c */
    public final boolean f30930c;

    /* JADX INFO: renamed from: d */
    public final boolean f30931d = true;

    public bts0(String str, boolean z, boolean z2) {
        this.f30928a = str;
        this.f30929b = z;
        this.f30930c = z2;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: a */
    public final boolean mo27152a() {
        return this.f30930c;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: b */
    public final boolean mo27153b() {
        return this.f30929b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bts0)) {
            return false;
        }
        bts0 bts0Var = (bts0) obj;
        return wj50.m88271j(this.f30928a, bts0Var.f30928a) && this.f30929b == bts0Var.f30929b && this.f30930c == bts0Var.f30930c;
    }

    @Override // p204p.cts0
    public final boolean getEnabled() {
        return this.f30931d;
    }

    @Override // p204p.cts0
    public final String getUri() {
        return this.f30928a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30930c) + s571.m77245d(this.f30928a.hashCode() * 31, 31, this.f30929b);
    }
}
