package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vje0 implements wje0 {

    /* JADX INFO: renamed from: a */
    public final String f241980a;

    /* JADX INFO: renamed from: b */
    public final int f241981b;

    public vje0(String str, int i) {
        this.f241980a = str;
        this.f241981b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vje0)) {
            return false;
        }
        vje0 vje0Var = (vje0) obj;
        return wj50.m88271j(this.f241980a, vje0Var.f241980a) && this.f241981b == vje0Var.f241981b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241981b) + (this.f241980a.hashCode() * 31);
    }
}
