package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class phf extends uhf {

    /* JADX INFO: renamed from: b */
    public final qf40 f177645b;

    public phf(qf40 qf40Var) {
        super(khf.f122643g);
        this.f177645b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phf) && wj50.m88271j(this.f177645b, ((phf) obj).f177645b);
    }

    public final int hashCode() {
        return this.f177645b.hashCode();
    }
}
