package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class r941 {

    /* JADX INFO: renamed from: a */
    public final int f196909a;

    /* JADX INFO: renamed from: b */
    public final q941 f196910b;

    public r941(int i, q941 q941Var) {
        this.f196909a = i;
        this.f196910b = q941Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r941)) {
            return false;
        }
        r941 r941Var = (r941) obj;
        return this.f196909a == r941Var.f196909a && wj50.m88271j(this.f196910b, r941Var.f196910b);
    }

    public final int hashCode() {
        return this.f196910b.hashCode() + (Integer.hashCode(this.f196909a) * 31);
    }
}
