package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f20437a;

    /* JADX INFO: renamed from: b */
    public final boolean f20438b;

    public aw90(String str, boolean z) {
        this.f20437a = str;
        this.f20438b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw90)) {
            return false;
        }
        aw90 aw90Var = (aw90) obj;
        return wj50.m88271j(this.f20437a, aw90Var.f20437a) && this.f20438b == aw90Var.f20438b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20438b) + (this.f20437a.hashCode() * 31);
    }
}
