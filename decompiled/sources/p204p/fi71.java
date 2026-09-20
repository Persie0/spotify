package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fi71 {

    /* JADX INFO: renamed from: a */
    public final int f69801a;

    /* JADX INFO: renamed from: b */
    public final ei71 f69802b;

    public fi71(int i, ei71 ei71Var) {
        this.f69801a = i;
        this.f69802b = ei71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi71)) {
            return false;
        }
        fi71 fi71Var = (fi71) obj;
        return this.f69801a == fi71Var.f69801a && wj50.m88271j(this.f69802b, fi71Var.f69802b);
    }

    public final int hashCode() {
        return this.f69802b.hashCode() + (Integer.hashCode(this.f69801a) * 31);
    }
}
