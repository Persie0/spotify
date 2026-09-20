package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wt01 extends yt01 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2206o9 f254793a;

    /* JADX INFO: renamed from: b */
    public final int f254794b;

    public wt01(AbstractC2206o9 abstractC2206o9, int i) {
        this.f254793a = abstractC2206o9;
        this.f254794b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt01)) {
            return false;
        }
        wt01 wt01Var = (wt01) obj;
        return this.f254793a.equals(wt01Var.f254793a) && this.f254794b == wt01Var.f254794b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f254794b) + (this.f254793a.hashCode() * 31);
    }
}
