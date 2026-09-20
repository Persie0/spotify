package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class se61 implements te61 {

    /* JADX INFO: renamed from: a */
    public final fiz f208224a;

    /* JADX INFO: renamed from: b */
    public final qe70 f208225b;

    /* JADX WARN: Multi-variable type inference failed */
    public se61(fiz fizVar, vh00 vh00Var) {
        this.f208224a = fizVar;
        this.f208225b = (qe70) vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se61)) {
            return false;
        }
        se61 se61Var = (se61) obj;
        return wj50.m88271j(this.f208224a, se61Var.f208224a) && this.f208225b.equals(se61Var.f208225b);
    }

    public final int hashCode() {
        return this.f208225b.hashCode() + (this.f208224a.hashCode() * 31);
    }
}
