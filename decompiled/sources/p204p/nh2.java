package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 extends oh2 {

    /* JADX INFO: renamed from: a */
    public final int f153844a;

    /* JADX INFO: renamed from: b */
    public final int f153845b;

    public nh2(int i, int i2) {
        this.f153844a = i;
        this.f153845b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh2)) {
            return false;
        }
        nh2 nh2Var = (nh2) obj;
        return this.f153844a == nh2Var.f153844a && this.f153845b == nh2Var.f153845b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f153845b) + (edb.m38547C(this.f153844a) * 31);
    }
}
