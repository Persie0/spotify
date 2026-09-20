package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bh2 extends fh2 {

    /* JADX INFO: renamed from: b */
    public final ze2 f27055b;

    public bh2(ze2 ze2Var) {
        super(ze2Var);
        this.f27055b = ze2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh2) && wj50.m88271j(this.f27055b, ((bh2) obj).f27055b);
    }

    public final int hashCode() {
        return this.f27055b.hashCode();
    }
}
