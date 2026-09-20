package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mbb {

    /* JADX INFO: renamed from: a */
    public final String f141849a;

    /* JADX INFO: renamed from: b */
    public final int f141850b;

    /* JADX INFO: renamed from: c */
    public final String f141851c;

    public mbb(String str, int i, String str2) {
        this.f141849a = str;
        this.f141850b = i;
        this.f141851c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m61362a() {
        return this.f141849a;
    }

    /* JADX INFO: renamed from: b */
    public final int m61363b() {
        return this.f141850b;
    }

    /* JADX INFO: renamed from: c */
    public final String m61364c() {
        return this.f141851c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbb)) {
            return false;
        }
        mbb mbbVar = (mbb) obj;
        return wj50.m88271j(this.f141849a, mbbVar.f141849a) && this.f141850b == mbbVar.f141850b && wj50.m88271j(this.f141851c, mbbVar.f141851c);
    }

    public final int hashCode() {
        return this.f141851c.hashCode() + mt60.m62800g(this.f141850b, this.f141849a.hashCode() * 31, 31);
    }
}
