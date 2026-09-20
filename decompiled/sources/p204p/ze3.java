package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ze3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final z650 f281869a;

    public ze3(z650 z650Var) {
        this.f281869a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze3) && wj50.m88271j(this.f281869a, ((ze3) obj).f281869a);
    }

    public final int hashCode() {
        z650 z650Var = this.f281869a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
