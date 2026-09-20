package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w4y {

    /* JADX INFO: renamed from: a */
    public final int f247918a;

    /* JADX INFO: renamed from: b */
    public final int f247919b;

    public w4y(int i, int i2) {
        this.f247918a = i;
        this.f247919b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4y)) {
            return false;
        }
        w4y w4yVar = (w4y) obj;
        return this.f247918a == w4yVar.f247918a && this.f247919b == w4yVar.f247919b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247919b) + (Integer.hashCode(this.f247918a) * 31);
    }
}
