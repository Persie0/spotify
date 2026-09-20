package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class jl9 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: L0 */
    public static final jl9 f113525L0;

    /* JADX INFO: renamed from: M0 */
    public static final jl9 f113526M0;

    /* JADX INFO: renamed from: N0 */
    public static final jl9 f113527N0;

    /* JADX INFO: renamed from: O0 */
    public static final jl9 f113528O0;

    /* JADX INFO: renamed from: P0 */
    public static final jl9 f113529P0;

    /* JADX INFO: renamed from: Q0 */
    public static final jl9 f113530Q0;

    /* JADX INFO: renamed from: R0 */
    public static final jl9 f113531R0;

    /* JADX INFO: renamed from: S0 */
    public static final jl9 f113532S0;

    /* JADX INFO: renamed from: T0 */
    public static final jl9 f113533T0;

    /* JADX INFO: renamed from: U0 */
    public static final jl9 f113534U0;

    /* JADX INFO: renamed from: V0 */
    public static final jl9 f113535V0;

    /* JADX INFO: renamed from: W0 */
    public static final jl9 f113536W0;

    /* JADX INFO: renamed from: X */
    public static final jl9 f113537X;

    /* JADX INFO: renamed from: X0 */
    public static final jl9 f113538X0;

    /* JADX INFO: renamed from: Y */
    public static final jl9 f113539Y;

    /* JADX INFO: renamed from: Y0 */
    public static final jl9 f113540Y0;

    /* JADX INFO: renamed from: Z */
    public static final jl9 f113541Z;

    /* JADX INFO: renamed from: Z0 */
    public static final jl9 f113542Z0;

    /* JADX INFO: renamed from: a1 */
    public static final jl9 f113543a1;

    /* JADX INFO: renamed from: b */
    public static final jl9 f113544b;

    /* JADX INFO: renamed from: b1 */
    public static final jl9 f113545b1;

    /* JADX INFO: renamed from: c */
    public static final jl9 f113546c;

    /* JADX INFO: renamed from: c1 */
    public static final jl9 f113547c1;

    /* JADX INFO: renamed from: d */
    public static final jl9 f113548d;

    /* JADX INFO: renamed from: e */
    public static final jl9 f113549e;

    /* JADX INFO: renamed from: f */
    public static final jl9 f113550f;

    /* JADX INFO: renamed from: g */
    public static final jl9 f113551g;

    /* JADX INFO: renamed from: h */
    public static final jl9 f113552h;

    /* JADX INFO: renamed from: i */
    public static final jl9 f113553i;

    /* JADX INFO: renamed from: t */
    public static final jl9 f113554t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113555a;

    static {
        int i = 3;
        f113544b = new jl9(i, 0);
        f113546c = new jl9(i, 1);
        f113548d = new jl9(i, 2);
        f113549e = new jl9(i, 3);
        f113550f = new jl9(i, 4);
        f113551g = new jl9(i, 5);
        f113552h = new jl9(i, 6);
        f113553i = new jl9(i, 7);
        f113554t = new jl9(i, 8);
        f113537X = new jl9(i, 9);
        f113539Y = new jl9(i, 10);
        f113541Z = new jl9(i, 11);
        f113525L0 = new jl9(i, 12);
        f113526M0 = new jl9(i, 13);
        f113527N0 = new jl9(i, 14);
        f113528O0 = new jl9(i, 15);
        f113529P0 = new jl9(i, 16);
        f113530Q0 = new jl9(i, 17);
        f113531R0 = new jl9(i, 18);
        f113532S0 = new jl9(i, 19);
        f113533T0 = new jl9(i, 20);
        f113534U0 = new jl9(i, 21);
        f113535V0 = new jl9(i, 22);
        f113536W0 = new jl9(i, 23);
        f113538X0 = new jl9(i, 24);
        f113540Y0 = new jl9(i, 25);
        f113542Z0 = new jl9(i, 26);
        f113543a1 = new jl9(i, 27);
        f113545b1 = new jl9(i, 28);
        f113547c1 = new jl9(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl9(int i, int i2) {
        super(i);
        this.f113555a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        m340 m340Var;
        z240 z240VarM60640a;
        m340 m340Var2;
        z240 z240VarM60640a2;
        switch (this.f113555a) {
            case 0:
                swd1 swd1Var = (swd1) obj2;
                uq40 uq40Var = (uq40) obj3;
                ((View) obj).setPadding(uq40Var.f232925a, uq40Var.f232926b, uq40Var.f232927c, uq40Var.f232928d + swd1Var.f214650a.mo51806g(519).f53851d);
                return swd1Var;
            case 1:
                return ((o6d0) obj).mo44714T(0, ((h6d0) obj2).mo39619B(((b8j) obj3).f24596a).f217323b, nau.f152117a, apa.f17863M0);
            case 2:
                return thg1.m80856v(16, (st91) obj3);
            case 3:
                v140 v140Var = (v140) obj;
                erc1 erc1Var = (erc1) obj2;
                eua1 eua1Var = (eua1) obj3;
                return new v8c(eua1Var != null ? eua1Var.f62934f : null, v140Var != null ? v140Var.f236243a : null, (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a.f278475a.f198763a);
            case 4:
                swd1 swd1Var2 = (swd1) obj2;
                uq40 uq40Var2 = (uq40) obj3;
                ((View) obj).setPadding(uq40Var2.f232925a, uq40Var2.f232926b, uq40Var2.f232927c, uq40Var2.f232928d + swd1Var2.f214650a.mo51806g(519).f53851d);
                return swd1Var2;
            case 5:
                swd1 swd1Var3 = (swd1) obj2;
                uq40 uq40Var3 = (uq40) obj3;
                ((View) obj).setPadding(uq40Var3.f232925a, uq40Var3.f232926b, uq40Var3.f232927c, uq40Var3.f232928d + swd1Var3.f214650a.mo51806g(519).f53851d);
                return swd1Var3;
            case 6:
                yzc yzcVar = (yzc) obj;
                xzc xzcVar = (xzc) obj2;
                cvt cvtVar = (cvt) obj3;
                if (!(xzcVar instanceof xzc)) {
                    throw new NoWhenBranchMatchedException();
                }
                yzcVar.f277760c.invoke(xzcVar.f267578a, cvtVar != null ? m3h1.m60683w(cvtVar) : null);
                return w2a1.f247311a;
            case 7:
                cbd cbdVar = (cbd) obj;
                if (!((bbd) obj2).equals(bbd.f25535a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cbdVar.f36094a.invoke();
                return w2a1.f247311a;
            case 8:
                t5o0 t5o0VarMo39619B = ((h6d0) obj2).mo39619B(((b8j) obj3).f24596a);
                return ((o6d0) obj).mo44714T(t5o0VarMo39619B.f217322a, 0, nau.f152117a, new C2000j2(t5o0VarMo39619B, 7));
            case 9:
                long j = ((b8j) obj3).f24596a;
                int iMin = Math.min(b8j.m28430i(j), b8j.m28429h(j));
                t5o0 t5o0VarMo39619B2 = ((h6d0) obj2).mo39619B(e8j.m38111b(0, iMin, 0, iMin, 5));
                return ((o6d0) obj).mo44714T(t5o0VarMo39619B2.f217322a, t5o0VarMo39619B2.f217323b, nau.f152117a, new dy4(t5o0VarMo39619B2, (int) (iMin * 0.125f), 2));
            case 10:
                View view = (View) obj;
                swd1 swd1Var4 = (swd1) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((uq40) obj3).f232928d + swd1Var4.f214650a.mo51806g(519).f53851d);
                return swd1Var4;
            case 11:
                return new tk20((v140) obj, (erc1) obj2, (uy80) obj3);
            case 12:
                v140 v140Var2 = (v140) obj;
                erc1 erc1Var2 = (erc1) obj2;
                List list = (List) obj3;
                if (list == null) {
                    list = lau.f131415a;
                }
                return new fff(list, v140Var2, erc1Var2);
            case 13:
                fxh0 fxh0VarM61826j = (fxh0) obj;
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var.m91771i0(-660096516);
                boolean zM37490b = e0b1.m37490b((Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b));
                boolean z = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).orientation == 2;
                if (zM37490b || z) {
                    fxh0VarM61826j = mi21.m61826j(fxh0VarM61826j, 0.0f, 240, 1);
                }
                xq00Var.m91788r(false);
                return fxh0VarM61826j;
            case 14:
                v140 v140Var3 = (v140) obj;
                erc1 erc1Var3 = (erc1) obj3;
                return new sj81(v140Var3.f236243a, ((daj) obj2).f47051b, g6f.m43753y0(v140Var3.f236246d, ", ", null, null, rif.f199513U0, 30), (erc1Var3 == null || (m340Var2 = erc1Var3.f62079a) == null || (z240VarM60640a2 = m340Var2.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a2.f278475a.f198763a);
            case 15:
                ((Number) obj3).intValue();
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.account_switching_add_account_button_text, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var3 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.account_switching_add_account_button_subtitle, xq00Var3), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var4 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.account_switching_parental_controls_row_title, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var5 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.account_switching_parental_controls_row_subtitle, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 20:
                ((Number) obj3).intValue();
                y85.m93057b(ksu.f126017c, qgj.f188480a, null, 0L, 0L, false, (xq00) obj2, ksu.f126018d | 48, 60);
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var6 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var6).f117235g.f159605c, cxh0.f43038a), leu.m58815a(xq00Var6).f112824b.f138758b, 0L, false, xq00Var6, pou.f179786d | 48, 48);
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var7 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var7).f117235g.f159605c, cxh0.f43038a), leu.m58815a(xq00Var7).f112824b.f138758b, 0L, false, xq00Var7, pou.f179786d | 48, 48);
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var8 = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var8.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_account_type_selection_page_title, xq00Var8), null, leu.m58818d(xq00Var8).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var8, 0, 0, 2042);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var9 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var9.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var9.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var9.m91778m();
                    cxh0 cxh0Var = cxh0.f43038a;
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var9, cxh0Var);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var9.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var9.m91779m0();
                    if (xq00Var9.f264808S) {
                        xq00Var9.m91776l(c2087le);
                    } else {
                        xq00Var9.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var9);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var9);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var9);
                    zsf1.m96833D(roh.f201266k, xq00Var9);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var9);
                    dha.m36004a(nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var9).f112823a.f229875b.f123093a, hmx0.f93097a), xq00Var9, 0);
                    y85.m93057b(ztu.f286267c, qgj.f188480a, null, leu.m58815a(xq00Var9).f112824b.f138758b, 0L, false, xq00Var9, ztu.f286268d | 48, 52);
                    xq00Var9.m91788r(true);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var10 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (xq00Var10.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_different_account_title, xq00Var10), null, leu.m58818d(xq00Var10).f64971g, 0L, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, 2042);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var11 = (xq00) obj2;
                ((Number) obj3).intValue();
                fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0.f43038a);
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46174i, false);
                int iHashCode2 = Long.hashCode(xq00Var11.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var11.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var11, fxh0VarM61820d);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                if (xq00Var11.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var11.m91779m0();
                if (xq00Var11.f264808S) {
                    xq00Var11.m91776l(c2087le2);
                } else {
                    xq00Var11.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, roh.f201262g, xq00Var11);
                zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var11);
                zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var11);
                zsf1.m96833D(roh.f201266k, xq00Var11);
                zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var11);
                amg1.m26401b(null, new ybs(leu.m58816b(xq00Var11).f117235g.f159616n), 0.0f, false, xq00Var11, 24582);
                xq00Var11.m91788r(true);
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var12 = (xq00) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (xq00Var12.m91752Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pvg1.m71180l(0, xq00Var12);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var13 = (xq00) obj2;
                ((Number) obj3).intValue();
                fmx0 fmx0Var = hmx0.f93097a;
                vju vjuVar = vju.f242057e;
                wb9 wb9Var = d7f0.f46174i;
                float f = leu.m58816b(xq00Var13).f117230b.f224762e;
                zn91.m96545d(null, wb9Var, fmx0Var, vjuVar, new j4m0(f, f, f, f), null, false, null, null, null, null, e0g.f54966a, xq00Var13, 0, 48, 2017);
                return w2a1.f247311a;
            default:
                xq00 xq00Var14 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(ztu.f286267c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var14).f117235g.f159605c, cxh0.f43038a), leu.m58815a(xq00Var14).f112824b.f138758b, 0L, false, xq00Var14, ztu.f286268d | 48, 48);
                return w2a1.f247311a;
        }
    }
}
