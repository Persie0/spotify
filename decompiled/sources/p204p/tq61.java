package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class tq61 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hr61 f222738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq61(hr61 hr61Var, int i) {
        super(4);
        this.f222737a = i;
        this.f222738b = hr61Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f222737a) {
            case 0:
                ((Number) obj3).intValue();
                return (pv91) this.f222738b.mo33238c().invoke((st91) obj4);
            default:
                pv91 pv91Var = (pv91) obj;
                rq61 rq61Var = (rq61) obj4;
                boolean z = rq61Var instanceof oq61;
                hr61 hr61Var = this.f222738b;
                if (z) {
                    return hr61Var.mo33241h((oq61) rq61Var, pv91Var);
                }
                if (rq61Var instanceof pq61) {
                    return hr61Var.mo33245l((pq61) rq61Var, pv91Var);
                }
                if (rq61Var instanceof qq61) {
                    return hr61Var.mo33246m((qq61) rq61Var, pv91Var);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
