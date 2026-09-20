package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m721 implements t721 {

    /* JADX INFO: renamed from: a */
    public final z650 f140631a;

    public m721(z650 z650Var) {
        this.f140631a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m721) && wj50.m88271j(this.f140631a, ((m721) obj).f140631a);
    }

    public final int hashCode() {
        z650 z650Var = this.f140631a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
