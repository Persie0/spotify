package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class rqn0 extends AbstractC2285q9 implements ig40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201853a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2328r7 f201854b;

    public /* synthetic */ rqn0(AbstractC2328r7 abstractC2328r7, int i) {
        this.f201853a = i;
        this.f201854b = abstractC2328r7;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        switch (this.f201853a) {
            case 0:
                return ((dqn0) this.f201854b).mo36659c();
            case 1:
                return ((dqn0) this.f201854b).mo36659c();
            default:
                return ((grn0) this.f201854b).mo36659c();
        }
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f201853a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                dqn0 dqn0Var = (dqn0) this.f201854b;
                Object obj2 = dqn0Var.get(entry.getKey());
                Boolean boolValueOf = obj2 == null ? null : Boolean.valueOf(obj2.equals(entry.getValue()));
                if (boolValueOf == null) {
                    return entry.getValue() == null && dqn0Var.containsKey(entry.getKey());
                }
                return boolValueOf.booleanValue();
            case 1:
                return ((dqn0) this.f201854b).containsKey(obj);
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                grn0 grn0Var = (grn0) this.f201854b;
                Object obj3 = grn0Var.get(entry2.getKey());
                Boolean boolValueOf2 = obj3 == null ? null : Boolean.valueOf(obj3.equals(entry2.getValue()));
                if (boolValueOf2 == null) {
                    return entry2.getValue() == null && grn0Var.containsKey(entry2.getKey());
                }
                return boolValueOf2.booleanValue();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f201853a) {
            case 0:
                lj91 lj91Var = ((dqn0) this.f201854b).f52041a;
                nj91[] nj91VarArr = new nj91[8];
                for (int i = 0; i < 8; i++) {
                    nj91VarArr[i] = new pj91(0);
                }
                return new tqn0(lj91Var, nj91VarArr);
            case 1:
                lj91 lj91Var2 = ((dqn0) this.f201854b).f52041a;
                nj91[] nj91VarArr2 = new nj91[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nj91VarArr2[i2] = new pj91(1);
                }
                return new tqn0(lj91Var2, nj91VarArr2);
            default:
                return new krn0((grn0) this.f201854b, 0);
        }
    }
}
