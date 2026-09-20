package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qpe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f191282a;

    /* JADX INFO: renamed from: b */
    public final z650 f191283b;

    public qpe0(String str, z650 z650Var) {
        this.f191282a = str;
        this.f191283b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpe0)) {
            return false;
        }
        qpe0 qpe0Var = (qpe0) obj;
        return wj50.m88271j(this.f191282a, qpe0Var.f191282a) && wj50.m88271j(this.f191283b, qpe0Var.f191283b);
    }

    public final int hashCode() {
        int iHashCode = this.f191282a.hashCode() * 31;
        z650 z650Var = this.f191283b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
