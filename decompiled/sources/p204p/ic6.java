package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ic6 implements kc6 {

    /* JADX INFO: renamed from: a */
    public final int f100742a;

    /* JADX INFO: renamed from: b */
    public final boolean f100743b;

    public ic6(int i, boolean z) {
        this.f100742a = i;
        this.f100743b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic6)) {
            return false;
        }
        ic6 ic6Var = (ic6) obj;
        return this.f100742a == ic6Var.f100742a && this.f100743b == ic6Var.f100743b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100743b) + (Integer.hashCode(this.f100742a) * 31);
    }
}
