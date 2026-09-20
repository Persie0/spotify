package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dvf0 {

    /* JADX INFO: renamed from: a */
    public final cvf0 f53450a;

    /* JADX INFO: renamed from: b */
    public final cvf0 f53451b;

    public dvf0(cvf0 cvf0Var, cvf0 cvf0Var2) {
        this.f53450a = cvf0Var;
        this.f53451b = cvf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvf0)) {
            return false;
        }
        dvf0 dvf0Var = (dvf0) obj;
        return wj50.m88271j(this.f53450a, dvf0Var.f53450a) && wj50.m88271j(this.f53451b, dvf0Var.f53451b);
    }

    public final int hashCode() {
        return this.f53451b.hashCode() + (this.f53450a.hashCode() * 31);
    }
}
