package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zbc1 extends bcc1 {

    /* JADX INFO: renamed from: a */
    public final z0r f281297a;

    /* JADX INFO: renamed from: b */
    public final int f281298b;

    public zbc1(z0r z0rVar, int i) {
        this.f281297a = z0rVar;
        this.f281298b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbc1)) {
            return false;
        }
        zbc1 zbc1Var = (zbc1) obj;
        return wj50.m88271j(this.f281297a, zbc1Var.f281297a) && this.f281298b == zbc1Var.f281298b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281298b) + (this.f281297a.hashCode() * 31);
    }
}
