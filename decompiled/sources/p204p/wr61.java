package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wr61 extends xr61 {

    /* JADX INFO: renamed from: a */
    public final int f254275a;

    /* JADX INFO: renamed from: b */
    public final String f254276b;

    public wr61(int i, String str) {
        this.f254275a = i;
        this.f254276b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr61)) {
            return false;
        }
        wr61 wr61Var = (wr61) obj;
        return this.f254275a == wr61Var.f254275a && wj50.m88271j(this.f254276b, wr61Var.f254276b);
    }

    public final int hashCode() {
        return this.f254276b.hashCode() + (Integer.hashCode(this.f254275a) * 31);
    }
}
