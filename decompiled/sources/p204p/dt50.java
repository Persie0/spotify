package p204p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class dt50 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52730a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f52731b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f52732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dt50(gh00 gh00Var, xh00 xh00Var) {
        super(4);
        this.f52731b = (qe70) gh00Var;
        this.f52732c = (qe70) xh00Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.qe70, p.xh00] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.qe70, p.xh00] */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f52730a) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                return (pv91) this.f52732c.mo24818M(new w3h0(Integer.valueOf(iIntValue), (String) this.f52731b.invoke(obj), (st91) obj4), obj, obj2, Integer.valueOf(iIntValue));
            default:
                gh00 gh00Var = (gh00) obj4;
                return new j5o0((owt) this.f52731b.mo24818M((au4) obj, (Context) obj2, (ViewGroup) obj3, gh00Var), this.f52732c, gh00Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dt50(xh00 xh00Var, gh00 gh00Var) {
        super(4);
        this.f52731b = (qe70) xh00Var;
        this.f52732c = (qe70) gh00Var;
    }
}
