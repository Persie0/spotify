package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ua71 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final ua71 f228396L0;

    /* JADX INFO: renamed from: M0 */
    public static final ua71 f228397M0;

    /* JADX INFO: renamed from: N0 */
    public static final ua71 f228398N0;

    /* JADX INFO: renamed from: O0 */
    public static final ua71 f228399O0;

    /* JADX INFO: renamed from: P0 */
    public static final ua71 f228400P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ua71 f228401Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ua71 f228402R0;

    /* JADX INFO: renamed from: S0 */
    public static final ua71 f228403S0;

    /* JADX INFO: renamed from: T0 */
    public static final ua71 f228404T0;

    /* JADX INFO: renamed from: U0 */
    public static final ua71 f228405U0;

    /* JADX INFO: renamed from: V0 */
    public static final ua71 f228406V0;

    /* JADX INFO: renamed from: W0 */
    public static final ua71 f228407W0;

    /* JADX INFO: renamed from: X */
    public static final ua71 f228408X;

    /* JADX INFO: renamed from: X0 */
    public static final ua71 f228409X0;

    /* JADX INFO: renamed from: Y */
    public static final ua71 f228410Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ua71 f228411Y0;

    /* JADX INFO: renamed from: Z */
    public static final ua71 f228412Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ua71 f228413Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ua71 f228414a1;

    /* JADX INFO: renamed from: b */
    public static final ua71 f228415b;

    /* JADX INFO: renamed from: b1 */
    public static final ua71 f228416b1;

    /* JADX INFO: renamed from: c */
    public static final ua71 f228417c;

    /* JADX INFO: renamed from: c1 */
    public static final ua71 f228418c1;

    /* JADX INFO: renamed from: d */
    public static final ua71 f228419d;

    /* JADX INFO: renamed from: e */
    public static final ua71 f228420e;

    /* JADX INFO: renamed from: f */
    public static final ua71 f228421f;

    /* JADX INFO: renamed from: g */
    public static final ua71 f228422g;

    /* JADX INFO: renamed from: h */
    public static final ua71 f228423h;

    /* JADX INFO: renamed from: i */
    public static final ua71 f228424i;

    /* JADX INFO: renamed from: t */
    public static final ua71 f228425t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228426a;

    static {
        int i = 2;
        f228415b = new ua71(i, 0);
        f228417c = new ua71(i, 1);
        f228419d = new ua71(i, 2);
        f228420e = new ua71(i, 3);
        f228421f = new ua71(i, 4);
        f228422g = new ua71(i, 5);
        f228423h = new ua71(i, 6);
        f228424i = new ua71(i, 7);
        f228425t = new ua71(i, 8);
        f228408X = new ua71(i, 9);
        f228410Y = new ua71(i, 10);
        f228412Z = new ua71(i, 11);
        f228396L0 = new ua71(i, 12);
        f228397M0 = new ua71(i, 13);
        f228398N0 = new ua71(i, 14);
        f228399O0 = new ua71(i, 15);
        f228400P0 = new ua71(i, 16);
        f228401Q0 = new ua71(i, 17);
        f228402R0 = new ua71(i, 18);
        f228403S0 = new ua71(i, 19);
        f228404T0 = new ua71(i, 20);
        f228405U0 = new ua71(i, 21);
        f228406V0 = new ua71(i, 22);
        f228407W0 = new ua71(i, 23);
        f228409X0 = new ua71(i, 24);
        f228411Y0 = new ua71(i, 25);
        f228413Z0 = new ua71(i, 26);
        f228414a1 = new ua71(i, 27);
        f228416b1 = new ua71(i, 28);
        f228418c1 = new ua71(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua71(int i, int i2) {
        super(i);
        this.f228426a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str;
        cbf0 cbf0VarM35556a;
        m340 m340Var;
        z240 z240VarM60640a;
        cbf0 cbf0VarM35556a2;
        yg81 xg81Var;
        switch (this.f228426a) {
            case 0:
                ((f7u) obj).f66796b = (gf71) obj2;
                return w2a1.f247311a;
            case 1:
                ((f7u) obj).f66797c = ((Number) obj2).intValue();
                return w2a1.f247311a;
            case 2:
                Object objM96523K = zn91.m96523K((Bundle) obj, "parcelable", oe71.class);
                wj50.m88279p(objM96523K);
                return (Parcelable) objM96523K;
            case 3:
                re71 re71Var = (re71) obj;
                suc sucVar = (suc) obj2;
                int i = re71Var.f198307b;
                String str2 = re71Var.f198309d;
                int i2 = sucVar.f214049a;
                int iM38547C = edb.m38547C(re71Var.f198313h);
                int length = 0;
                if (iM38547C == 0) {
                    int i3 = re71Var.f198308c;
                    if (i2 <= i3 && i <= i2) {
                        length = Math.min(sucVar.f214050b, str2.length());
                    } else if (i2 >= i3) {
                        length = str2.length();
                    }
                } else if (iM38547C != 1) {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (i2 >= i) {
                    length = str2.length();
                }
                return new se71(length, re71Var);
            case 4:
                return (ri71) obj2;
            case 5:
                return new n6f(n6f.f150862b);
            case 6:
                return new n6f(n6f.m63765b(n6f.f150866f, 0.12f, 0.0f, 0.0f, 0.0f, 14));
            case 7:
                tk71 tk71Var = (tk71) obj2;
                return new vk71(tk71Var.f221094a, tk71Var.f221095b);
            case 8:
                lfh0 lfh0Var = (lfh0) obj;
                dv91 dv91Var = new dv91("hit", 1);
                String string = ((String) obj2).toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), lfh0Var.f132954a, st91.f213865b, System.currentTimeMillis());
            case 9:
                Object objM96523K2 = zn91.m96523K((Bundle) obj, "parcelable", d181.class);
                wj50.m88279p(objM96523K2);
                return (Parcelable) objM96523K2;
            case 10:
                return new n581((l581) obj, ((Boolean) obj2).booleanValue());
            case 11:
                return ufc1.m82980w(((wjm0) obj).f251988b, (b250) obj2);
            case 12:
                d881 d881Var = (d881) obj2;
                return Next.m15606h(new d881((b881) obj, d881Var.f46406b, d881Var.f46407c));
            case 13:
                return ufc1.m82980w(((xjm0) obj).f262176f, (b250) obj2);
            case 14:
                ebf0 ebf0Var = (ebf0) obj2;
                String str3 = ((la81) obj).f131306a;
                dbf0 dbf0VarM38368c = ebf0Var.m38368c(erc1.class, str3);
                v140 v140Var = null;
                erc1 erc1Var = (dbf0VarM38368c == null || (cbf0VarM35556a2 = dbf0VarM38368c.m35556a()) == null) ? null : (erc1) cbf0VarM35556a2.f36107a;
                String str4 = (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11860a)) == null) ? null : z240VarM60640a.f278475a.f198763a;
                dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(v140.class, str3);
                if (dbf0VarM38368c2 != null && (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) != null) {
                    v140Var = (v140) cbf0VarM35556a.f36107a;
                }
                String strConcat = str3.concat(":concerts");
                if (v140Var == null || (str = v140Var.f236243a) == null) {
                    str = "";
                }
                return new ma81(strConcat, str, str4);
            case 15:
                return (fd81) obj2;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return ufc1.m82980w(((yjm0) obj).f273409c, (b250) obj2);
            case 19:
                dh81 dh81Var = (dh81) obj2;
                ContextTrack contextTrack = dh81Var.f49016a;
                osj osjVar = dh81Var.f49017b;
                boolean z = dh81Var.f49018c;
                rqi rqiVar = dh81Var.f49019d;
                String strM38000d0 = e72.m37986T(contextTrack) ? e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ALBUM_TITLE) : e72.m38021r(contextTrack);
                if (strM38000d0 == null) {
                    strM38000d0 = "";
                }
                String strM38012j0 = e72.m38012j0(contextTrack);
                String str5 = strM38012j0 != null ? strM38012j0 : "";
                int i4 = eh81.f59518a[osjVar.ordinal()] != 1 ? 0 : 1;
                if ((rqiVar instanceof nqi) || (rqiVar instanceof oqi)) {
                    xg81Var = wg81.f251006a;
                } else {
                    if (!(rqiVar instanceof pqi) && !wj50.m88271j(rqiVar, qqi.f191607a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xg81Var = new xg81(z, strM38000d0);
                }
                return new ch81(xg81Var instanceof wg81 ? new zg81(i4, str5, strM38000d0) : new ah81(i4, str5), xg81Var);
            case 20:
                yi81 yi81Var = (yi81) obj2;
                return new xi81(yi81Var.f273063a, yi81Var.f273065c);
            case 21:
                xk81 xk81Var = (xk81) obj;
                cg21 cg21Var = (cg21) obj2;
                k7i0 k7i0Var = cg21Var.f37537a;
                boolean zM88271j = wj50.m88271j(k7i0Var != null ? k7i0Var.f120135a : null, xk81Var.f262310c);
                return new yk81(xk81Var.f262308a, xk81Var.f262310c, xk81Var.f262311d, zM88271j, zM88271j && (n5h1.m63740p(cg21Var) || wj50.m88271j(cg21Var.f37544h, dg21.f48708a)) && !cg21Var.f37543g, cg21Var);
            case 22:
                return ufc1.m82980w(((zjm0) obj).f283473e, (b250) obj2);
            case 23:
                bp81 bp81Var = (bp81) obj;
                String str6 = bp81Var.f29354c;
                String str7 = bp81Var.f29356e;
                String str8 = bp81Var.f29357f;
                x18 x18Var = ((v2y) obj2).f236733a;
                return new gp81(str6, str7, str8, (x18Var.f257084a.length() > 0 && wj50.m88271j(x18Var.f257084a, bp81Var.f29358g) && x18Var.m89622a()) ? new zo81(x18Var.f257088e.longValue(), x18Var.f257089f.longValue()) : ap81.f17852c, bp81Var.f29359h, bp81Var.f29360i);
            case 24:
                os81 os81Var = (os81) obj2;
                return new ps81(os81Var, ((Bundle) obj).getBoolean("expanded"), gue.m45751m(os81Var.f168775f));
            case 25:
                return new ox81((v140) obj2, (erc1) obj);
            case 26:
                a091 a091Var = (a091) obj2;
                wj50.m88279p(a091Var);
                Next nextM49323E = i091.m49323E((wz81) obj, a091Var);
                return First.m15575c(nextM49323E.m15612f(a091Var), nextM49323E.mo15561b());
            case 27:
                a191 a191Var = (a191) obj2;
                return new y091(a191Var.f11361a, a191Var.f11362b, !a191Var.f11365e && (!a191Var.f11363c || a191Var.f11364d));
            case 28:
                return null;
            default:
                return null;
        }
    }
}
