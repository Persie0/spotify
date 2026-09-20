package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pth implements n3b1 {

    /* JADX INFO: renamed from: a */
    public final gh00 f181155a;

    public pth(gh00 gh00Var) {
        this.f181155a = gh00Var;
    }

    @Override // p204p.n3b1
    /* JADX INFO: renamed from: a */
    public final Object mo34407a(wpn0 wpn0Var) {
        return this.f181155a.invoke(wpn0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pth) && wj50.m88271j(this.f181155a, ((pth) obj).f181155a);
    }

    public final int hashCode() {
        return this.f181155a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f181155a + ')';
    }
}
