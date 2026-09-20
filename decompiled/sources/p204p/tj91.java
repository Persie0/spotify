package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tj91 extends oj91 {

    /* JADX INFO: renamed from: d */
    public final nqn0 f220860d;

    public tj91(nqn0 nqn0Var) {
        this.f220860d = nqn0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f166020c;
        this.f166020c = i + 2;
        Object[] objArr = this.f166018a;
        return new dpi0(this.f220860d, objArr[i], objArr[i + 1]);
    }
}
