package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qr50 {

    /* JADX INFO: renamed from: a */
    public final int f191738a;

    /* JADX INFO: renamed from: b */
    public final int f191739b;

    public qr50(int i, int i2) {
        this.f191738a = i;
        this.f191739b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr50)) {
            return false;
        }
        qr50 qr50Var = (qr50) obj;
        return this.f191738a == qr50Var.f191738a && this.f191739b == qr50Var.f191739b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f191739b) + (Integer.hashCode(this.f191738a) * 31);
    }
}
