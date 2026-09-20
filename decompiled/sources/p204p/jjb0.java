package p204p;

import com.comscore.streaming.ContentType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class jjb0 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f112970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f112971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ib31 f112972c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f112973d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rv41 f112974e;

    public jjb0(List list, long j, ib31 ib31Var, float f, rv41 rv41Var) {
        this.f112970a = list;
        this.f112971b = j;
        this.f112972c = ib31Var;
        this.f112973d = f;
        this.f112974e = rv41Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft70 ft70Var = (ft70) obj;
        int iIntValue = ((Number) obj2).intValue();
        xq00 xq00Var = (xq00) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (xq00Var.m91766g(ft70Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= xq00Var.m91762e(iIntValue) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
            rab0 rab0Var = (rab0) this.f112970a.get(iIntValue);
            xq00Var.m91771i0(1656110258);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            String str = rab0Var.f197249b;
            boolean z = iIntValue == ((Number) this.f112974e.getValue()).intValue();
            ib31 ib31Var = this.f112972c;
            boolean zM91770i = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91762e(iIntValue)) || (i & 48) == 32) | xq00Var.m91770i(ib31Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new C2580xm(ib31Var, iIntValue, 15);
                xq00Var.m91793t0(objM91750T);
            }
            qhg1.m72821l(str, z, this.f112971b, (gh00) objM91750T, xq00Var, 0);
            tfe.m80659q(cxh0Var, this.f112973d, xq00Var, xq00Var, true);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }
}
