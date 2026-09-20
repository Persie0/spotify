package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sqn0 extends AbstractC2285q9 implements jg40 {

    /* JADX INFO: renamed from: a */
    public final eqn0 f213119a;

    public sqn0(eqn0 eqn0Var) {
        this.f213119a = eqn0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f213119a.mo36659c();
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        eqn0 eqn0Var = this.f213119a;
        Object obj2 = eqn0Var.get(key);
        if (obj2 != null) {
            return obj2.equals(entry.getValue());
        }
        return entry.getValue() == null && eqn0Var.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mj91 mj91Var = this.f213119a.f61928a;
        oj91[] oj91VarArr = new oj91[8];
        for (int i = 0; i < 8; i++) {
            oj91VarArr[i] = new qj91(0);
        }
        return new uqn0(mj91Var, oj91VarArr);
    }
}
