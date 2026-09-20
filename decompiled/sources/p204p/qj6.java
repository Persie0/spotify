package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final br50 f189161a;

    /* JADX INFO: renamed from: b */
    public final z650 f189162b;

    public qj6(br50 br50Var, z650 z650Var) {
        this.f189161a = br50Var;
        this.f189162b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj6)) {
            return false;
        }
        qj6 qj6Var = (qj6) obj;
        return wj50.m88271j(this.f189161a, qj6Var.f189161a) && wj50.m88271j(this.f189162b, qj6Var.f189162b);
    }

    public final int hashCode() {
        return this.f189162b.f279709a.hashCode() + (this.f189161a.hashCode() * 31);
    }
}
