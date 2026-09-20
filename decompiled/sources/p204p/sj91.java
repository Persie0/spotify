package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sj91 extends nj91 {

    /* JADX INFO: renamed from: d */
    public final nqn0 f209788d;

    public sj91(nqn0 nqn0Var) {
        this.f209788d = nqn0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f154534c;
        this.f154534c = i + 2;
        Object[] objArr = this.f154532a;
        return new cpi0(this.f209788d, objArr[i], objArr[i + 1]);
    }
}
