package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cd2 extends ed2 {

    /* JADX INFO: renamed from: a */
    public final int f36713a;

    /* JADX INFO: renamed from: b */
    public final int f36714b;

    public cd2(int i, int i2) {
        this.f36713a = i;
        this.f36714b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        return this.f36713a == cd2Var.f36713a && this.f36714b == cd2Var.f36714b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f36714b) + (edb.m38547C(this.f36713a) * 31);
    }
}
