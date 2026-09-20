package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class an20 {

    /* JADX INFO: renamed from: a */
    public final int f17249a;

    /* JADX INFO: renamed from: b */
    public final el20 f17250b;

    public an20(int i, el20 el20Var) {
        this.f17249a = i;
        this.f17250b = el20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an20)) {
            return false;
        }
        an20 an20Var = (an20) obj;
        return this.f17249a == an20Var.f17249a && wj50.m88271j(this.f17250b, an20Var.f17250b);
    }

    public final int hashCode() {
        return this.f17250b.hashCode() + (Integer.hashCode(this.f17249a) * 31);
    }
}
