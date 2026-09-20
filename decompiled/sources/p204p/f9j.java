package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f9j {

    /* JADX INFO: renamed from: a */
    public final int f67282a;

    /* JADX INFO: renamed from: b */
    public final int f67283b;

    /* JADX INFO: renamed from: c */
    public final yzb f67284c;

    public f9j(int i, int i2, yzb yzbVar) {
        this.f67282a = i;
        this.f67283b = i2;
        this.f67284c = yzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9j)) {
            return false;
        }
        f9j f9jVar = (f9j) obj;
        return this.f67282a == f9jVar.f67282a && this.f67283b == f9jVar.f67283b && wj50.m88271j(this.f67284c, f9jVar.f67284c);
    }

    public final int hashCode() {
        return this.f67284c.hashCode() + mt60.m62800g(this.f67283b, Integer.hashCode(this.f67282a) * 31, 31);
    }
}
