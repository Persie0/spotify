package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o770 extends h870 {

    /* JADX INFO: renamed from: a */
    public final n770 f162486a;

    public o770(n770 n770Var) {
        this.f162486a = n770Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o770) && wj50.m88271j(this.f162486a, ((o770) obj).f162486a);
    }

    public final int hashCode() {
        return this.f162486a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f162486a + ')';
    }
}
