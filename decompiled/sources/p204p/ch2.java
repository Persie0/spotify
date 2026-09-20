package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ch2 extends fh2 {

    /* JADX INFO: renamed from: b */
    public final ze2 f37869b;

    public ch2(ze2 ze2Var) {
        super(ze2Var);
        this.f37869b = ze2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch2) && wj50.m88271j(this.f37869b, ((ch2) obj).f37869b);
    }

    public final int hashCode() {
        return this.f37869b.hashCode();
    }
}
