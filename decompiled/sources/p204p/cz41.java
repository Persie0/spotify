package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cz41 implements n3b1 {

    /* JADX INFO: renamed from: a */
    public final Object f43472a;

    public cz41(Object obj) {
        this.f43472a = obj;
    }

    @Override // p204p.n3b1
    /* JADX INFO: renamed from: a */
    public final Object mo34407a(wpn0 wpn0Var) {
        return this.f43472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz41) && wj50.m88271j(this.f43472a, ((cz41) obj).f43472a);
    }

    public final int hashCode() {
        Object obj = this.f43472a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f43472a + ')';
    }
}
