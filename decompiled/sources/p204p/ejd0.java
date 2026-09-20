package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ejd0 {

    /* JADX INFO: renamed from: a */
    public final int f60197a;

    /* JADX INFO: renamed from: b */
    public final int f60198b;

    public ejd0(int i, int i2) {
        this.f60197a = i;
        this.f60198b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejd0)) {
            return false;
        }
        ejd0 ejd0Var = (ejd0) obj;
        return this.f60197a == ejd0Var.f60197a && this.f60198b == ejd0Var.f60198b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60198b) + (Integer.hashCode(this.f60197a) * 31);
    }
}
