package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class nqn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157299a = 3;

    /* JADX INFO: renamed from: b */
    public final Iterator f157300b;

    public nqn0(Object[] objArr) {
        this.f157300b = new C2042k7(objArr, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f157299a) {
            case 0:
                return ((jqn0) this.f157300b).f72240c;
            case 1:
                return ((kqn0) this.f157300b).f83500c;
            case 2:
                return ((C2042k7) this.f157300b).hasNext();
            default:
                return this.f157300b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f157299a) {
            case 0:
                return (Map.Entry) ((jqn0) this.f157300b).next();
            case 1:
                return (Map.Entry) ((kqn0) this.f157300b).next();
            case 2:
                return ((C2042k7) this.f157300b).next();
            default:
                return (d5b1) this.f157300b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f157299a) {
            case 0:
                ((jqn0) this.f157300b).remove();
                return;
            case 1:
                ((kqn0) this.f157300b).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nqn0(hqn0 hqn0Var) {
        nj91[] nj91VarArr = new nj91[8];
        for (int i = 0; i < 8; i++) {
            nj91VarArr[i] = new sj91(this);
        }
        this.f157300b = new jqn0(hqn0Var, nj91VarArr);
    }

    public nqn0(iqn0 iqn0Var) {
        oj91[] oj91VarArr = new oj91[8];
        for (int i = 0; i < 8; i++) {
            oj91VarArr[i] = new tj91(this);
        }
        this.f157300b = new kqn0(iqn0Var, oj91VarArr);
    }

    public nqn0(b5b1 b5b1Var) {
        this.f157300b = b5b1Var.f23555t.iterator();
    }
}
