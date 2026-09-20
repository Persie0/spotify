package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f133784a;

    /* JADX INFO: renamed from: b */
    public final boolean f133785b;

    /* JADX INFO: renamed from: c */
    public final uhf f133786c;

    /* JADX INFO: renamed from: d */
    public final int f133787d;

    public lif(int i, boolean z, uhf uhfVar, int i2) {
        this.f133784a = i;
        this.f133785b = z;
        this.f133786c = uhfVar;
        this.f133787d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lif)) {
            return false;
        }
        lif lifVar = (lif) obj;
        return this.f133784a == lifVar.f133784a && this.f133785b == lifVar.f133785b && wj50.m88271j(this.f133786c, lifVar.f133786c) && this.f133787d == lifVar.f133787d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133787d) + ((this.f133786c.hashCode() + s571.m77245d(Integer.hashCode(this.f133784a) * 31, 31, this.f133785b)) * 31);
    }
}
