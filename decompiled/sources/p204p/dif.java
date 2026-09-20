package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f49351a;

    /* JADX INFO: renamed from: b */
    public final boolean f49352b;

    /* JADX INFO: renamed from: c */
    public final uhf f49353c;

    public dif(int i, uhf uhfVar, boolean z) {
        this.f49351a = i;
        this.f49352b = z;
        this.f49353c = uhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dif)) {
            return false;
        }
        dif difVar = (dif) obj;
        return this.f49351a == difVar.f49351a && this.f49352b == difVar.f49352b && wj50.m88271j(this.f49353c, difVar.f49353c);
    }

    public final int hashCode() {
        return this.f49353c.hashCode() + s571.m77245d(Integer.hashCode(this.f49351a) * 31, 31, this.f49352b);
    }
}
