package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rhw0 {

    /* JADX INFO: renamed from: a */
    public final int f199362a;

    /* JADX INFO: renamed from: b */
    public final String f199363b;

    public rhw0(int i, String str) {
        this.f199362a = i;
        this.f199363b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhw0)) {
            return false;
        }
        rhw0 rhw0Var = (rhw0) obj;
        return this.f199362a == rhw0Var.f199362a && wj50.m88271j(this.f199363b, rhw0Var.f199363b);
    }

    public final int hashCode() {
        return this.f199363b.hashCode() + (edb.m38547C(this.f199362a) * 31);
    }
}
