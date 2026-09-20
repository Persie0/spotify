package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w500 implements yvb0 {

    /* JADX INFO: renamed from: a */
    public final int f247947a;

    public w500(int i) {
        this.f247947a = i;
    }

    @Override // p204p.yvb0
    /* JADX INFO: renamed from: a */
    public final yvb0 mo46657a(yvb0 yvb0Var, float f) {
        return new w500(wj50.m88250J(this.f247947a, ((w500) yvb0Var).f247947a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w500) && this.f247947a == ((w500) obj).f247947a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247947a);
    }
}
