package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m5v implements t5v {

    /* JADX INFO: renamed from: a */
    public final z650 f140291a;

    public m5v(z650 z650Var) {
        this.f140291a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5v) && wj50.m88271j(this.f140291a, ((m5v) obj).f140291a);
    }

    public final int hashCode() {
        z650 z650Var = this.f140291a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
