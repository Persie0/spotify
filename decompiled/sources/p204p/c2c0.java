package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f33341a;

    /* JADX INFO: renamed from: b */
    public final boolean f33342b;

    /* JADX INFO: renamed from: c */
    public final boolean f33343c;

    public c2c0(String str, boolean z, boolean z2) {
        this.f33341a = str;
        this.f33342b = z;
        this.f33343c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2c0)) {
            return false;
        }
        c2c0 c2c0Var = (c2c0) obj;
        return wj50.m88271j(this.f33341a, c2c0Var.f33341a) && this.f33342b == c2c0Var.f33342b && this.f33343c == c2c0Var.f33343c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33343c) + s571.m77245d(this.f33341a.hashCode() * 31, 31, this.f33342b);
    }
}
