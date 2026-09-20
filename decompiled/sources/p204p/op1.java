package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class op1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qf40 f167733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op1(int i, qf40 qf40Var) {
        super(1);
        this.f167732a = i;
        this.f167733b = qf40Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f167732a) {
            case 0:
                String str = (String) obj;
                Iterator<E> it = this.f167733b.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    uq1 uq1Var = (uq1) next;
                    if (!wl51.m88460J0(str) && !wl51.m88460J0(uq1Var.f232886c) && bm51.m29796g0(str, uq1Var.f232886c, false)) {
                        return (uq1) next;
                    }
                }
                next = null;
                return (uq1) next;
            case 1:
                jpz0.m53997k((mpz0) obj, new b4f(((AbstractC2282q6) this.f167733b).mo33075a(), 1));
                return w2a1.f247311a;
            case 2:
                jpz0.m53997k((mpz0) obj, new b4f(1, ((AbstractC2282q6) this.f167733b).mo33075a()));
                return w2a1.f247311a;
            case 3:
                jpz0.m53997k((mpz0) obj, new b4f(((AbstractC2282q6) this.f167733b).mo33075a(), 1));
                return w2a1.f247311a;
            case 4:
                return (qf40) this.f167733b.get(((Number) obj).intValue());
            case 5:
                return (qf40) this.f167733b.get(((Number) obj).intValue());
            case 6:
                jpz0.m53998l((mpz0) obj, new d4f(0, ((AbstractC2282q6) this.f167733b).mo33075a()));
                return w2a1.f247311a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                return tfe.m80649g(iIntValue, "-", ((xwa1) this.f167733b.get(iIntValue)).f266627c);
            default:
                fbd1 fbd1Var = (fbd1) g6f.m43747t0(((tw70) obj).f224325a, this.f167733b);
                if (fbd1Var != null) {
                    return fbd1Var.f67803f;
                }
                return null;
        }
    }
}
