package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vqn0 extends AbstractC2285q9 implements jg40 {

    /* JADX INFO: renamed from: a */
    public final eqn0 f243969a;

    public vqn0(eqn0 eqn0Var) {
        this.f243969a = eqn0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f243969a.mo36659c();
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f243969a.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mj91 mj91Var = this.f243969a.f61928a;
        oj91[] oj91VarArr = new oj91[8];
        for (int i = 0; i < 8; i++) {
            oj91VarArr[i] = new rj91();
        }
        return new wqn0(mj91Var, oj91VarArr);
    }
}
