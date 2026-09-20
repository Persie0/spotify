package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v4y {

    /* JADX INFO: renamed from: a */
    public final int f237264a;

    /* JADX INFO: renamed from: b */
    public final int f237265b;

    public v4y(int i, int i2) {
        this.f237264a = i;
        this.f237265b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4y)) {
            return false;
        }
        v4y v4yVar = (v4y) obj;
        return this.f237264a == v4yVar.f237264a && this.f237265b == v4yVar.f237265b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f237265b) + (Integer.hashCode(this.f237264a) * 31);
    }
}
