package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zk0 implements bl0 {

    /* JADX INFO: renamed from: a */
    public final Object f283575a;

    /* JADX INFO: renamed from: b */
    public final dut f283576b;

    public zk0(Object obj, dut dutVar) {
        this.f283575a = obj;
        this.f283576b = dutVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk0)) {
            return false;
        }
        zk0 zk0Var = (zk0) obj;
        return wj50.m88271j(this.f283575a, zk0Var.f283575a) && wj50.m88271j(this.f283576b, zk0Var.f283576b);
    }

    public final int hashCode() {
        Object obj = this.f283575a;
        return this.f283576b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
