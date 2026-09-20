package p204p;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class oxr0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: L0 */
    public static final oxr0 f171503L0;

    /* JADX INFO: renamed from: M0 */
    public static final oxr0 f171504M0;

    /* JADX INFO: renamed from: N0 */
    public static final oxr0 f171505N0;

    /* JADX INFO: renamed from: O0 */
    public static final oxr0 f171506O0;

    /* JADX INFO: renamed from: P0 */
    public static final oxr0 f171507P0;

    /* JADX INFO: renamed from: Q0 */
    public static final oxr0 f171508Q0;

    /* JADX INFO: renamed from: R0 */
    public static final oxr0 f171509R0;

    /* JADX INFO: renamed from: S0 */
    public static final oxr0 f171510S0;

    /* JADX INFO: renamed from: T0 */
    public static final oxr0 f171511T0;

    /* JADX INFO: renamed from: U0 */
    public static final oxr0 f171512U0;

    /* JADX INFO: renamed from: V0 */
    public static final oxr0 f171513V0;

    /* JADX INFO: renamed from: W0 */
    public static final oxr0 f171514W0;

    /* JADX INFO: renamed from: X */
    public static final oxr0 f171515X;

    /* JADX INFO: renamed from: X0 */
    public static final oxr0 f171516X0;

    /* JADX INFO: renamed from: Y */
    public static final oxr0 f171517Y;

    /* JADX INFO: renamed from: Y0 */
    public static final oxr0 f171518Y0;

    /* JADX INFO: renamed from: Z */
    public static final oxr0 f171519Z;

    /* JADX INFO: renamed from: Z0 */
    public static final oxr0 f171520Z0;

    /* JADX INFO: renamed from: a1 */
    public static final oxr0 f171521a1;

    /* JADX INFO: renamed from: b */
    public static final oxr0 f171522b;

    /* JADX INFO: renamed from: b1 */
    public static final oxr0 f171523b1;

    /* JADX INFO: renamed from: c */
    public static final oxr0 f171524c;

    /* JADX INFO: renamed from: c1 */
    public static final oxr0 f171525c1;

    /* JADX INFO: renamed from: d */
    public static final oxr0 f171526d;

    /* JADX INFO: renamed from: e */
    public static final oxr0 f171527e;

    /* JADX INFO: renamed from: f */
    public static final oxr0 f171528f;

    /* JADX INFO: renamed from: g */
    public static final oxr0 f171529g;

    /* JADX INFO: renamed from: h */
    public static final oxr0 f171530h;

    /* JADX INFO: renamed from: i */
    public static final oxr0 f171531i;

    /* JADX INFO: renamed from: t */
    public static final oxr0 f171532t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171533a;

    static {
        int i = 3;
        f171522b = new oxr0(i, 0);
        f171524c = new oxr0(i, 1);
        f171526d = new oxr0(i, 2);
        f171527e = new oxr0(i, 3);
        f171528f = new oxr0(i, 4);
        f171529g = new oxr0(i, 5);
        f171530h = new oxr0(i, 6);
        f171531i = new oxr0(i, 7);
        f171532t = new oxr0(i, 8);
        f171515X = new oxr0(i, 9);
        f171517Y = new oxr0(i, 10);
        f171519Z = new oxr0(i, 11);
        f171503L0 = new oxr0(i, 12);
        f171504M0 = new oxr0(i, 13);
        f171505N0 = new oxr0(i, 14);
        f171506O0 = new oxr0(i, 15);
        f171507P0 = new oxr0(i, 16);
        f171508Q0 = new oxr0(i, 17);
        f171509R0 = new oxr0(i, 18);
        f171510S0 = new oxr0(i, 19);
        f171511T0 = new oxr0(i, 20);
        f171512U0 = new oxr0(i, 21);
        f171513V0 = new oxr0(i, 22);
        f171514W0 = new oxr0(i, 23);
        f171516X0 = new oxr0(i, 24);
        f171518Y0 = new oxr0(i, 25);
        f171520Z0 = new oxr0(i, 26);
        f171521a1 = new oxr0(i, 27);
        f171523b1 = new oxr0(i, 28);
        f171525c1 = new oxr0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxr0(int i, int i2) {
        super(i);
        this.f171533a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02be  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02da  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String str4;
        m340 m340Var;
        int i;
        m340 m340Var2;
        z240 z240VarM60640a;
        String str5;
        String str6;
        m340 m340Var3;
        z240 z240VarM60640a2;
        String str7;
        int i2 = this.f171533a;
        a340 a340Var = a340.f11861b;
        int i3 = 1;
        int i4 = 0;
        str = null;
        str = null;
        str = null;
        str = null;
        String str8 = null;
        str = null;
        str = null;
        String str9 = null;
        str = null;
        str = null;
        String str10 = null;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i2) {
            case 0:
                ((Number) obj2).intValue();
                return w2a1Var;
            case 1:
                ((Number) obj2).intValue();
                return w2a1Var;
            case 2:
                swd1 swd1Var = (swd1) obj2;
                ((View) obj).setPadding(0, 0, 0, swd1Var.f214650a.mo51806g(519).f53851d);
                return swd1Var;
            case 3:
                View view = (View) obj;
                swd1 swd1Var2 = (swd1) obj2;
                uq40 uq40Var = (uq40) obj3;
                pwd1 pwd1Var = swd1Var2.f214650a;
                dx40 dx40VarMo51806g = pwd1Var.mo51806g(519);
                int i5 = pwd1Var.mo51806g(8).f53851d;
                view.setPadding(view.getPaddingLeft(), uq40Var.f232926b + dx40VarMo51806g.f53849b, view.getPaddingRight(), uq40Var.f232928d + i5 + ((i5 <= 0 ? 0 : 1) == 0 ? dx40VarMo51806g.f53851d : 0));
                return swd1Var2;
            case 4:
                als0 als0Var = (als0) obj;
                if (!((zks0) obj2).equals(zks0.f283842a)) {
                    throw new NoWhenBranchMatchedException();
                }
                als0Var.f16978c.invoke();
                return w2a1Var;
            case 5:
                ((jlt0) obj).f113680e.invoke();
                return w2a1Var;
            case 6:
                if (((azt0) obj2) instanceof azt0) {
                    return w2a1Var;
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                vzt0 vzt0Var = (vzt0) obj;
                uzt0 uzt0Var = (uzt0) obj2;
                cvt cvtVar = (cvt) obj3;
                if (uzt0Var instanceof tzt0) {
                    vzt0Var.f246540c.invoke(((tzt0) uzt0Var).f225311a, cvtVar != null ? m3h1.m60683w(cvtVar) : null);
                } else if (!(uzt0Var instanceof szt0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1Var;
            case 8:
                a6u0 a6u0Var = (a6u0) obj;
                z5u0 z5u0Var = (z5u0) obj2;
                if (!(z5u0Var instanceof z5u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                a6u0Var.f12874e.invoke(z5u0Var.f279636a, z5u0Var.f279637b);
                return w2a1Var;
            case 9:
                ((fgu0) obj).f69405e.invoke((egu0) obj2);
                return w2a1Var;
            case 10:
                xhu0 xhu0Var = (xhu0) obj;
                vhu0 vhu0Var = (vhu0) obj2;
                cvt cvtVar2 = (cvt) obj3;
                if (vhu0Var instanceof thu0) {
                    thu0 thu0Var = (thu0) vhu0Var;
                    xhu0Var.f261710c.invoke(thu0Var.f220505a, Integer.valueOf(thu0Var.f220506b));
                } else {
                    if (!(vhu0Var instanceof uhu0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00 gh00Var = xhu0Var.f261711d;
                    if (gh00Var != null) {
                        gh00Var.invoke(cvtVar2 != null ? m3h1.m60683w(cvtVar2) : null);
                    }
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var.m91771i0(-2112286023);
                fxh0 fxh0VarM63031k = mwg1.m63031k((fxh0) obj, (float) 1.5d, new xk80(0, 0L, 9187343241974906880L, h6f.m46715L(new n6f(leu.m58815a(xq00Var).f112824b.f138757a), new n6f(leu.m58815a(xq00Var).f112824b.f138759c)), null), hmx0.f93097a);
                xq00Var.m91788r(false);
                return fxh0VarM63031k;
            case 12:
                v140 v140Var = (v140) obj;
                ub21 ub21Var = (ub21) obj2;
                erc1 erc1Var = (erc1) obj3;
                if (ub21Var == null || (str = ub21Var.f228616b) == null) {
                    str = v140Var.f236243a;
                } else {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        str = v140Var.f236243a;
                    }
                }
                if (ub21Var == null || (str3 = ub21Var.f228617c) == null) {
                    str2 = v140Var.f236244b;
                    if (str2.length() == 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                } else {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str2 = v140Var.f236244b;
                        if (str2.length() == 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                    }
                }
                if (erc1Var != null && (m340Var2 = erc1Var.f62079a) != null && (z240VarM60640a = m340Var2.m60640a(a340Var)) != null && (str5 = z240VarM60640a.f278475a.f198763a) != null) {
                    str10 = str5;
                } else if (ub21Var != null && (str4 = ub21Var.f228615a) != null && str4.length() > 0) {
                    str10 = str4;
                }
                if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (i = m340Var.f139526c) != 0) {
                    i3 = i;
                }
                return new bbv0(str, str3, i3, str10);
            case 13:
                View view2 = (View) obj;
                swd1 swd1Var3 = (swd1) obj2;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((uq40) obj3).f232928d + swd1Var3.f214650a.mo51806g(2).f53851d);
                return swd1Var3;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                st91 st91Var = (st91) obj3;
                wj50.m88279p(st91Var);
                return new dhg0(Integer.valueOf(iIntValue), (String) obj2, st91Var);
            case 15:
                mkj mkjVar = (mkj) obj;
                th00 th00Var = (th00) obj3;
                okw0 okw0Var = new okw0(obj2, th00Var, i4);
                uw70 uw70Var = mkjVar.f144593a;
                if (uw70Var != null) {
                    okw0Var.invoke(uw70Var);
                }
                okw0 okw0Var2 = new okw0(obj2, th00Var, i3);
                ks70 ks70Var = mkjVar.f144594b;
                if (ks70Var != null) {
                    okw0Var2.invoke(ks70Var);
                }
                return w2a1Var;
            case 16:
                return w2a1Var;
            case 17:
                return new wix0((jl31) obj, (v140) obj2, (v140) obj3);
            case 18:
                eoz0 eoz0Var = (eoz0) obj;
                lar0 lar0Var = (lar0) obj2;
                bv41 bv41Var = (bv41) obj3;
                jar0 jar0Var = lar0Var != null ? lar0Var.f131400b : null;
                har0 har0Var = jar0Var instanceof har0 ? (har0) jar0Var : null;
                if (har0Var != null && (str6 = har0Var.f89268a.f223223a.f213499a.f198763a) != null && str6.length() > 0) {
                    str9 = str6;
                }
                return new ipx0(str9, bv41Var, eoz0Var);
            case 19:
                v140 v140Var2 = (v140) obj;
                erc1 erc1Var2 = (erc1) obj2;
                hz80 hz80Var = (hz80) obj3;
                if (v140Var2 == null) {
                    return null;
                }
                String str11 = v140Var2.f236243a;
                Integer numValueOf = hz80Var != null ? Integer.valueOf(hz80Var.f96815P0) : null;
                if (erc1Var2 != null && (m340Var3 = erc1Var2.f62079a) != null && (z240VarM60640a2 = m340Var3.m60640a(a340Var)) != null && (str7 = z240VarM60640a2.f278475a.f198763a) != null && !wl51.m88460J0(str7)) {
                    str8 = str7;
                }
                return new r4y0(numValueOf, str11, str8);
            case 20:
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var2.m91771i0(1269029821);
                im91 im91VarM53259E = jg31.m53259E(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, gqs.f83525c, 2);
                xq00Var2.m91788r(false);
                return im91VarM53259E;
            case 21:
                Bitmap bitmap = (Bitmap) obj2;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                return w2a1Var;
            case 22:
                ((nvy0) obj).f158980a.invoke((jvy0) obj2);
                return w2a1Var;
            case 23:
                mvy0 mvy0Var = (mvy0) obj2;
                gh00 gh00Var2 = ((qvy0) obj).f193140a;
                if (mvy0Var instanceof ivy0) {
                    gh00Var2.invoke(((ivy0) mvy0Var).f106301a);
                } else {
                    if (!mvy0Var.equals(bvy0.f31482a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var2.invoke("");
                }
                return w2a1Var;
            case 24:
                return w2a1Var;
            case 25:
                long j = ((Offset) obj2).f493a;
                long j2 = ((n6f) obj3).f150873a;
                return w2a1Var;
            case 26:
                return new ouz0((v140) obj, (erc1) obj2, (ee7) obj3);
            case 27:
                ((ryz0) obj).f203998c.invoke((qyz0) obj2);
                return w2a1Var;
            case 28:
                r911 r911Var = (r911) obj3;
                y911 y911Var = ((z911) obj2).f280641a;
                if (!(y911Var instanceof w911)) {
                    return null;
                }
                u911 u911Var = ((w911) y911Var).f249054a;
                String str12 = u911Var.f228055a;
                ArrayList arrayList = u911Var.f228056b;
                st91 st91Var2 = st91.f213865b;
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-chat-sharedby-chip";
                yt91VarM50626j.f276052f = "3.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276050d = str12;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                if (!r911Var.equals(o911.f162906a)) {
                    if (r911Var.equals(p911.f175117a) || (r911Var instanceof q911) || (r911Var instanceof n911) || r911Var.equals(m911.f141187a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (arrayList.size() != 1) {
                    yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("shared_by_multiple", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                String str13 = ((s911) g6f.m43741q0(arrayList)).f206821b;
                yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("shared_by_single", null, null, str13, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str13.toString();
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            default:
                azs0 azs0Var = (azs0) obj;
                i3x i3xVar = (i3x) obj2;
                if (!azs0Var.f21676b) {
                    azs0Var.f21678d.invoke(i3xVar.f98345a);
                }
                return w2a1Var;
        }
    }
}
