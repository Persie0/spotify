package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o491 {

    /* JADX INFO: renamed from: a */
    public final int f161596a;

    /* JADX INFO: renamed from: b */
    public final xb71 f161597b;

    public o491(int i, xb71 xb71Var) {
        this.f161596a = i;
        this.f161597b = xb71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o491)) {
            return false;
        }
        o491 o491Var = (o491) obj;
        return this.f161596a == o491Var.f161596a && wj50.m88271j(this.f161597b, o491Var.f161597b);
    }

    public final int hashCode() {
        return this.f161597b.hashCode() + (Integer.hashCode(this.f161596a) * 31);
    }
}
