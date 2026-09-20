package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h20 {

    /* JADX INFO: renamed from: a */
    public final String f86826a;

    /* JADX INFO: renamed from: b */
    public final int f86827b;

    public h20(String str, int i) {
        this.f86826a = str;
        this.f86827b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return wj50.m88271j(this.f86826a, h20Var.f86826a) && this.f86827b == h20Var.f86827b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f86827b) + (this.f86826a.hashCode() * 31);
    }
}
