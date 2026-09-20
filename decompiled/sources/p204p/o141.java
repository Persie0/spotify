package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final hdr0 f160615a;

    public o141(hdr0 hdr0Var) {
        this.f160615a = hdr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o141) && wj50.m88271j(this.f160615a, ((o141) obj).f160615a);
    }

    public final int hashCode() {
        hdr0 hdr0Var = this.f160615a;
        if (hdr0Var == null) {
            return 0;
        }
        return hdr0Var.hashCode();
    }
}
