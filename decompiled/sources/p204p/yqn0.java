package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class yqn0 extends AbstractC2282q6 {

    /* JADX INFO: renamed from: a */
    public final eqn0 f275266a;

    public yqn0(eqn0 eqn0Var) {
        this.f275266a = eqn0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f275266a.mo36659c();
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f275266a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        mj91 mj91Var = this.f275266a.f61928a;
        oj91[] oj91VarArr = new oj91[8];
        for (int i = 0; i < 8; i++) {
            oj91VarArr[i] = new qj91(1);
        }
        return new uqn0(mj91Var, oj91VarArr);
    }
}
