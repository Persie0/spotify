package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zss0 implements cts0 {

    /* JADX INFO: renamed from: a */
    public final String f285994a;

    /* JADX INFO: renamed from: b */
    public final boolean f285995b;

    /* JADX INFO: renamed from: c */
    public final boolean f285996c;

    public zss0(String str, boolean z, boolean z2) {
        this.f285994a = str;
        this.f285995b = z;
        this.f285996c = z2;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: a */
    public final boolean mo27152a() {
        return this.f285996c;
    }

    @Override // p204p.cts0
    /* JADX INFO: renamed from: b */
    public final boolean mo27153b() {
        return this.f285995b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zss0)) {
            return false;
        }
        zss0 zss0Var = (zss0) obj;
        return wj50.m88271j(this.f285994a, zss0Var.f285994a) && this.f285995b == zss0Var.f285995b && this.f285996c == zss0Var.f285996c;
    }

    @Override // p204p.cts0
    public final boolean getEnabled() {
        return false;
    }

    @Override // p204p.cts0
    public final String getUri() {
        return this.f285994a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285996c) + s571.m77245d(this.f285994a.hashCode() * 31, 31, this.f285995b);
    }
}
