package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w8k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final z650 f248941a;

    public w8k0(z650 z650Var) {
        this.f248941a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8k0) && wj50.m88271j(this.f248941a, ((w8k0) obj).f248941a);
    }

    public final int hashCode() {
        z650 z650Var = this.f248941a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
