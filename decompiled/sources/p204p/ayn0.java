package p204p;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ayn0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byn0 f21273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ayn0(byn0 byn0Var, int i) {
        super(3);
        this.f21272a = i;
        this.f21273b = byn0Var;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r2v9, types: [p.qe70, p.th00] */
    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f21272a) {
            case 0:
                yxn0 yxn0Var = (yxn0) obj2;
                boolean zEquals = yxn0Var.equals(vxn0.f245791a);
                byn0 byn0Var = this.f21273b;
                if (zEquals) {
                    byn0Var.f32277b.invoke();
                } else if (yxn0Var instanceof wxn0) {
                    byn0Var.f32278c.invoke(((wxn0) yxn0Var).f256081a);
                } else if (yxn0Var instanceof xxn0) {
                    xxn0 xxn0Var = (xxn0) yxn0Var;
                    byn0Var.f32279d.invoke(Integer.valueOf(xxn0Var.f267031a), xxn0Var.f267032b);
                } else if (yxn0Var.equals(txn0.f224730a)) {
                    byn0Var.f32281f.invoke();
                } else {
                    if (!yxn0Var.equals(uxn0.f234974a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    byn0Var.f32280e.invoke();
                }
                return w2a1.f247311a;
            default:
                zxn0 zxn0Var = (zxn0) obj;
                yxn0 yxn0Var2 = (yxn0) obj3;
                eh00 eh00Var = this.f21273b.f32276a;
                if (yxn0Var2.equals(vxn0.f245791a)) {
                    qag0 qag0Var = (qag0) eh00Var.invoke();
                    qag0Var.getClass();
                    yt91 yt91VarM96903c = qag0Var.f186874a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("input_field", null, null, null, null));
                    yt91VarM96903c2.f276056j = true;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (!(yxn0Var2 instanceof wxn0)) {
                    if ((yxn0Var2 instanceof xxn0) || yxn0Var2.equals(txn0.f224730a) || yxn0Var2.equals(uxn0.f234974a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List list = zxn0Var.f287360c;
                xyn0 xyn0Var = ((wxn0) yxn0Var2).f256081a;
                int iIndexOf = list.indexOf(xyn0Var);
                qag0 qag0Var2 = (qag0) eh00Var.invoke();
                qag0Var2.getClass();
                yt91 yt91VarM96903c3 = qag0Var2.f186874a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("filter_chips", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
                Integer numValueOf = Integer.valueOf(iIndexOf);
                String str = xyn0Var.f267388b;
                yt91 yt91VarM96903c4 = zt91VarM94607a.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("filter_chip", null, numValueOf, str, null));
                yt91VarM96903c4.f276056j = true;
                return new av91("", "", new dv91("hit", 1), new bv91("filter", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
