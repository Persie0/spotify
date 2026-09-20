package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tns implements n3b1 {

    /* JADX INFO: renamed from: a */
    public final yum0 f222071a;

    public tns(yum0 yum0Var) {
        this.f222071a = yum0Var;
    }

    @Override // p204p.n3b1
    /* JADX INFO: renamed from: a */
    public final Object mo34407a(wpn0 wpn0Var) {
        return this.f222071a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tns) && this.f222071a.equals(((tns) obj).f222071a);
    }

    public final int hashCode() {
        return this.f222071a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f222071a + ')';
    }
}
