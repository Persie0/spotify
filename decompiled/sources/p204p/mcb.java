package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mcb {

    /* JADX INFO: renamed from: a */
    public final int f142121a;

    /* JADX INFO: renamed from: b */
    public final lcb f142122b;

    public mcb(int i, lcb lcbVar) {
        this.f142121a = i;
        this.f142122b = lcbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcb)) {
            return false;
        }
        mcb mcbVar = (mcb) obj;
        return this.f142121a == mcbVar.f142121a && this.f142122b == mcbVar.f142122b;
    }

    public final int hashCode() {
        return this.f142122b.hashCode() + (Integer.hashCode(this.f142121a) * 31);
    }
}
