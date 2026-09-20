package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dnn0 implements enn0 {

    /* JADX INFO: renamed from: a */
    public final boolean f50859a;

    /* JADX INFO: renamed from: b */
    public final int f50860b;

    public dnn0(boolean z, int i) {
        this.f50859a = z;
        this.f50860b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnn0)) {
            return false;
        }
        dnn0 dnn0Var = (dnn0) obj;
        return this.f50859a == dnn0Var.f50859a && this.f50860b == dnn0Var.f50860b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50860b) + (Boolean.hashCode(this.f50859a) * 31);
    }
}
