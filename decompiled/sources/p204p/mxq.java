package p204p;

import android.app.Activity;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes11.dex */
public final class mxq implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148164a;

    /* JADX INFO: renamed from: b */
    public static final mxq f148153b = new mxq(0);

    /* JADX INFO: renamed from: c */
    public static final mxq f148155c = new mxq(1);

    /* JADX INFO: renamed from: d */
    public static final mxq f148157d = new mxq(2);

    /* JADX INFO: renamed from: e */
    public static final mxq f148158e = new mxq(3);

    /* JADX INFO: renamed from: f */
    public static final mxq f148159f = new mxq(4);

    /* JADX INFO: renamed from: g */
    public static final mxq f148160g = new mxq(5);

    /* JADX INFO: renamed from: h */
    public static final mxq f148161h = new mxq(6);

    /* JADX INFO: renamed from: i */
    public static final mxq f148162i = new mxq(7);

    /* JADX INFO: renamed from: t */
    public static final mxq f148163t = new mxq(8);

    /* JADX INFO: renamed from: X */
    public static final mxq f148146X = new mxq(9);

    /* JADX INFO: renamed from: Y */
    public static final mxq f148148Y = new mxq(10);

    /* JADX INFO: renamed from: Z */
    public static final mxq f148150Z = new mxq(11);

    /* JADX INFO: renamed from: L0 */
    public static final mxq f148134L0 = new mxq(12);

    /* JADX INFO: renamed from: M0 */
    public static final mxq f148135M0 = new mxq(13);

    /* JADX INFO: renamed from: N0 */
    public static final mxq f148136N0 = new mxq(14);

    /* JADX INFO: renamed from: O0 */
    public static final mxq f148137O0 = new mxq(15);

    /* JADX INFO: renamed from: P0 */
    public static final mxq f148138P0 = new mxq(16);

    /* JADX INFO: renamed from: Q0 */
    public static final mxq f148139Q0 = new mxq(17);

    /* JADX INFO: renamed from: R0 */
    public static final mxq f148140R0 = new mxq(18);

    /* JADX INFO: renamed from: S0 */
    public static final mxq f148141S0 = new mxq(19);

    /* JADX INFO: renamed from: T0 */
    public static final mxq f148142T0 = new mxq(20);

    /* JADX INFO: renamed from: U0 */
    public static final mxq f148143U0 = new mxq(21);

    /* JADX INFO: renamed from: V0 */
    public static final mxq f148144V0 = new mxq(22);

    /* JADX INFO: renamed from: W0 */
    public static final mxq f148145W0 = new mxq(23);

    /* JADX INFO: renamed from: X0 */
    public static final mxq f148147X0 = new mxq(24);

    /* JADX INFO: renamed from: Y0 */
    public static final mxq f148149Y0 = new mxq(25);

    /* JADX INFO: renamed from: Z0 */
    public static final mxq f148151Z0 = new mxq(26);

    /* JADX INFO: renamed from: a1 */
    public static final mxq f148152a1 = new mxq(27);

    /* JADX INFO: renamed from: b1 */
    public static final mxq f148154b1 = new mxq(28);

    /* JADX INFO: renamed from: c1 */
    public static final mxq f148156c1 = new mxq(29);

    public /* synthetic */ mxq(int i) {
        this.f148164a = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        gd70 type;
        switch (this.f148164a) {
            case 0:
                gd70 gd70Var = (gd70) obj;
                qr60[] qr60VarArr = nxq.f159530Y;
                return gd70Var;
            case 1:
                qr60[] qr60VarArr2 = nxq.f159530Y;
                return "...";
            case 2:
                int i = txq.f224744a;
                return ((oqo) obj).mo27379o();
            case 3:
                return Boolean.valueOf(obj instanceof TextView);
            case 4:
                return ((s3b1) obj).getType();
            case 5:
                return Boolean.valueOf(obj instanceof xtj);
            case 6:
                euf eufVar = lay.f131442a;
                lq60 lq60VarMo25527a = ((tvq) obj).mo25527a();
                up60 up60Var = lq60VarMo25527a instanceof up60 ? (up60) lq60VarMo25527a : null;
                return Boolean.valueOf(up60Var != null && ((ife) up60Var).mo28587A().isInterface());
            case 7:
                euf eufVar2 = lay.f131442a;
                return Boolean.valueOf(wj50.m88271j(((tvq) obj).mo25527a(), qpv0.f191387a.mo54112b(Object.class)));
            case 8:
                return 0;
            case 9:
                return Boolean.TRUE;
            case 10:
                return ((gd70) obj).toString();
            case 11:
                return ((gd70) obj).toString();
            case 12:
                Object obj2 = zc60.f281465a;
                s3b1 s3b1VarM56921s = kmg1.m56921s(xc60.f260105b, ((mxh0) obj).mo53211g().m50158k(qm41.f190119t));
                return (s3b1VarM56921s == null || (type = s3b1VarM56921s.getType()) == null) ? ehw.m39006b(chw.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            case 13:
                return bov0.m30094b(((Method) obj).getReturnType());
            case 14:
                Class cls = (Class) obj;
                wj50.m88279p(cls);
                return bov0.m30094b(cls);
            case 15:
                nys0 nys0Var = (nys0) obj;
                urv0 urv0Var = nq60.f157171a;
                return jxq.f117172e.m54718v(nys0Var) + " | " + mvx0.m62973b(nys0Var).mo51380k();
            case 16:
                t870 t870Var = (t870) obj;
                urv0 urv0Var2 = nq60.f157171a;
                return t870Var.m80255a() + " | " + ppg1.m70574s(t870Var);
            case 17:
                mi00 mi00Var = (mi00) obj;
                urv0 urv0Var3 = nq60.f157171a;
                return jxq.f117172e.m54718v(mi00Var) + " | " + mvx0.m62974c(mi00Var).mo26568m();
            case 18:
                urv0 urv0Var4 = nq60.f157171a;
                return String.valueOf(ppg1.m70573r((n870) obj));
            case 19:
                return Boolean.valueOf(obj instanceof Activity);
            case 20:
                pqm0 pqm0Var = (pqm0) obj;
                return ((String) pqm0Var.f180350a) + " = " + ((h870) pqm0Var.f180351b);
            case 21:
                ((Number) obj).intValue();
                return null;
            case 22:
                int i2 = qt70.f192307v;
                return Boolean.valueOf(!Modifier.isStatic(((tov0) obj).mo70492t().getModifiers()));
            case 23:
                qc21 qc21Var = (qc21) obj;
                qr60[] qr60VarArr3 = du70.f52989m;
                return qc21Var;
            case 24:
                int i3 = fu70.f73422p;
                return Boolean.valueOf(Modifier.isStatic(((tov0) obj).mo70492t().getModifiers()));
            case 25:
                int i4 = fu70.f73422p;
                return ((bfe0) obj).mo25812f();
            case 26:
                int i5 = fu70.f73422p;
                qge qgeVarMo25169G = ((gd70) obj).mo36063C0().mo25169G();
                if (qgeVarMo25169G instanceof nfe) {
                    return (nfe) qgeVarMo25169G;
                }
                return null;
            case 27:
                ((Number) obj).intValue();
                return null;
            case 28:
                ((Number) obj).intValue();
                return null;
            default:
                mzx mzxVar = mzx.f148805M0;
                return Boolean.TRUE;
        }
    }
}
