package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class xqn0 extends AbstractC2282q6 implements df40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265067a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2328r7 f265068b;

    public /* synthetic */ xqn0(AbstractC2328r7 abstractC2328r7, int i) {
        this.f265067a = i;
        this.f265068b = abstractC2328r7;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        switch (this.f265067a) {
            case 0:
                return ((dqn0) this.f265068b).mo36659c();
            default:
                return ((grn0) this.f265068b).mo36659c();
        }
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f265067a) {
            case 0:
                return ((dqn0) this.f265068b).containsValue(obj);
            default:
                return ((grn0) this.f265068b).containsValue(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f265067a) {
            case 0:
                lj91 lj91Var = ((dqn0) this.f265068b).f52041a;
                nj91[] nj91VarArr = new nj91[8];
                for (int i = 0; i < 8; i++) {
                    nj91VarArr[i] = new pj91(2);
                }
                return new tqn0(lj91Var, nj91VarArr);
            default:
                return new krn0((grn0) this.f265068b, 1);
        }
    }
}
