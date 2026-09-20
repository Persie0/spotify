package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h581 implements j581 {

    /* JADX INFO: renamed from: a */
    public final int f87771a;

    /* JADX INFO: renamed from: b */
    public final String f87772b;

    public h581(int i, String str) {
        this.f87771a = i;
        this.f87772b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h581)) {
            return false;
        }
        h581 h581Var = (h581) obj;
        return this.f87771a == h581Var.f87771a && wj50.m88271j(this.f87772b, h581Var.f87772b);
    }

    public final int hashCode() {
        return this.f87772b.hashCode() + (Integer.hashCode(this.f87771a) * 31);
    }
}
