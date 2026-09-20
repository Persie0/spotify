package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pk1 {

    /* JADX INFO: renamed from: a */
    public final String f178362a;

    /* JADX INFO: renamed from: b */
    public final int f178363b;

    public pk1(String str, int i) {
        this.f178362a = str;
        this.f178363b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1)) {
            return false;
        }
        pk1 pk1Var = (pk1) obj;
        return wj50.m88271j(this.f178362a, pk1Var.f178362a) && this.f178363b == pk1Var.f178363b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178363b) + (this.f178362a.hashCode() * 31);
    }
}
