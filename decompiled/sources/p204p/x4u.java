package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class x4u extends y4u {

    /* JADX INFO: renamed from: a */
    public final int f258197a;

    /* JADX INFO: renamed from: b */
    public final int f258198b;

    public x4u(int i, int i2) {
        this.f258197a = i;
        this.f258198b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4u)) {
            return false;
        }
        x4u x4uVar = (x4u) obj;
        return this.f258197a == x4uVar.f258197a && this.f258198b == x4uVar.f258198b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258198b) + (Integer.hashCode(this.f258197a) * 31);
    }
}
