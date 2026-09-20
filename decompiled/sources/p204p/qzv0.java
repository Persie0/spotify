package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class qzv0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final qzv0 f194293L0;

    /* JADX INFO: renamed from: M0 */
    public static final qzv0 f194294M0;

    /* JADX INFO: renamed from: N0 */
    public static final qzv0 f194295N0;

    /* JADX INFO: renamed from: O0 */
    public static final qzv0 f194296O0;

    /* JADX INFO: renamed from: P0 */
    public static final qzv0 f194297P0;

    /* JADX INFO: renamed from: Q0 */
    public static final qzv0 f194298Q0;

    /* JADX INFO: renamed from: R0 */
    public static final qzv0 f194299R0;

    /* JADX INFO: renamed from: S0 */
    public static final qzv0 f194300S0;

    /* JADX INFO: renamed from: T0 */
    public static final qzv0 f194301T0;

    /* JADX INFO: renamed from: U0 */
    public static final qzv0 f194302U0;

    /* JADX INFO: renamed from: V0 */
    public static final qzv0 f194303V0;

    /* JADX INFO: renamed from: W0 */
    public static final qzv0 f194304W0;

    /* JADX INFO: renamed from: X */
    public static final qzv0 f194305X;

    /* JADX INFO: renamed from: X0 */
    public static final qzv0 f194306X0;

    /* JADX INFO: renamed from: Y */
    public static final qzv0 f194307Y;

    /* JADX INFO: renamed from: Y0 */
    public static final qzv0 f194308Y0;

    /* JADX INFO: renamed from: Z */
    public static final qzv0 f194309Z;

    /* JADX INFO: renamed from: Z0 */
    public static final qzv0 f194310Z0;

    /* JADX INFO: renamed from: a1 */
    public static final qzv0 f194311a1;

    /* JADX INFO: renamed from: b */
    public static final qzv0 f194312b;

    /* JADX INFO: renamed from: b1 */
    public static final qzv0 f194313b1;

    /* JADX INFO: renamed from: c */
    public static final qzv0 f194314c;

    /* JADX INFO: renamed from: c1 */
    public static final qzv0 f194315c1;

    /* JADX INFO: renamed from: d */
    public static final qzv0 f194316d;

    /* JADX INFO: renamed from: e */
    public static final qzv0 f194317e;

    /* JADX INFO: renamed from: f */
    public static final qzv0 f194318f;

    /* JADX INFO: renamed from: g */
    public static final qzv0 f194319g;

    /* JADX INFO: renamed from: h */
    public static final qzv0 f194320h;

    /* JADX INFO: renamed from: i */
    public static final qzv0 f194321i;

    /* JADX INFO: renamed from: t */
    public static final qzv0 f194322t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194323a;

    static {
        int i = 2;
        f194312b = new qzv0(i, 0);
        f194314c = new qzv0(i, 1);
        f194316d = new qzv0(i, 2);
        f194317e = new qzv0(i, 3);
        f194318f = new qzv0(i, 4);
        f194319g = new qzv0(i, 5);
        f194320h = new qzv0(i, 6);
        f194321i = new qzv0(i, 7);
        f194322t = new qzv0(i, 8);
        f194305X = new qzv0(i, 9);
        f194307Y = new qzv0(i, 10);
        f194309Z = new qzv0(i, 11);
        f194293L0 = new qzv0(i, 12);
        f194294M0 = new qzv0(i, 13);
        f194295N0 = new qzv0(i, 14);
        f194296O0 = new qzv0(i, 15);
        f194297P0 = new qzv0(i, 16);
        f194298Q0 = new qzv0(i, 17);
        f194299R0 = new qzv0(i, 18);
        f194300S0 = new qzv0(i, 19);
        f194301T0 = new qzv0(i, 20);
        f194302U0 = new qzv0(i, 21);
        f194303V0 = new qzv0(i, 22);
        f194304W0 = new qzv0(i, 23);
        f194306X0 = new qzv0(i, 24);
        f194308Y0 = new qzv0(i, 25);
        f194310Z0 = new qzv0(i, 26);
        f194311a1 = new qzv0(i, 27);
        f194313b1 = new qzv0(i, 28);
        f194315c1 = new qzv0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzv0(int i, int i2) {
        super(i);
        this.f194323a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        m340 m340Var;
        List list;
        z240 z240Var;
        List list2;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        boolean z;
        aqw0 aqw0Var;
        switch (this.f194323a) {
            case 0:
                ebf0 ebf0Var = ((jzv0) obj2).f117805a;
                String str = ((kzv0) obj).f128227a;
                dbf0 dbf0VarM38368c = ebf0Var.m38368c(v140.class, str);
                String str2 = null;
                v140 v140Var = (v140) ((dbf0VarM38368c == null || (cbf0VarM35556a2 = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a2.f36107a);
                dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(erc1.class, str);
                erc1 erc1Var = (erc1) ((dbf0VarM38368c2 == null || (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a);
                String str3 = v140Var != null ? v140Var.f236243a : null;
                if (str3 == null) {
                    str3 = "";
                }
                String strM43753y0 = (v140Var == null || (list2 = v140Var.f236246d) == null) ? null : g6f.m43753y0(list2, ", ", null, null, k3y.f119019g, 30);
                if (strM43753y0 == null) {
                    strM43753y0 = "";
                }
                if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (list = m340Var.f139524a) != null && (z240Var = (z240) g6f.m43745s0(list)) != null) {
                    str2 = z240Var.f278475a.f198763a;
                }
                return new lzv0(str, str3, strM43753y0, str2 != null ? str2 : "");
            case 1:
                return null;
            case 2:
                c3w0 c3w0Var = (c3w0) obj;
                x2w0 x2w0Var = (x2w0) obj2;
                String str4 = c3w0Var.f33769a;
                String str5 = c3w0Var.f33771c;
                v72 v72Var = x2w0Var.f257591c;
                nhl nhlVar = x2w0Var.f257590b;
                b3w0 b3w0Var = x2w0Var.f257589a;
                if (b3w0Var == null) {
                    return new d3w0(str5);
                }
                if ((nhlVar instanceof mhl) && wj50.m88271j(((mhl) nhlVar).f143823a, str4)) {
                    return new g3w0(str5);
                }
                if ((nhlVar.mo56441a().get(str4) instanceof ghl) || (b3w0Var instanceof y2w0)) {
                    return new e3w0(str5);
                }
                if ((nhlVar.mo56441a().get(str4) instanceof hhl) || (b3w0Var instanceof z2w0)) {
                    return new f3w0(str5);
                }
                return ((nhlVar instanceof lhl) && wj50.m88271j(((lhl) nhlVar).f133586a, str4)) ? new i3w0(v72Var, str5) : new h3w0(v72Var, str5);
            case 3:
                return null;
            case 4:
                v6w0 v6w0Var = (v6w0) obj;
                i2y i2yVar = (i2y) obj2;
                String str6 = v6w0Var.f237979a;
                ex81 ex81Var = i2yVar.f97929a;
                if (wj50.m88271j(ex81Var, ax81.f20810a)) {
                    return new ss41(str6);
                }
                if (!(ex81Var instanceof bx81)) {
                    if (wj50.m88271j(ex81Var, cx81.f42952a)) {
                        return new hu41(str6);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                y6s0 y6s0Var = i2yVar.f97931c;
                bx81 bx81Var = (bx81) ex81Var;
                d6w0 d6w0Var = bx81Var.f31804b;
                m140 m140Var = bx81Var.f31803a;
                if (m140Var != null) {
                    String str7 = i2yVar.f97939k;
                    if (str7 != null) {
                        m140Var = new m140(m140Var.f138841a, str7, m140Var.f138843c);
                    }
                } else {
                    m140Var = null;
                }
                m140 m140Var2 = m140Var;
                m140 m140Var3 = i2yVar.f97938j;
                int iM35156a = d6w0Var.m35156a(d6w0Var.f45902i);
                pro0 pro0Var = i2yVar.f97933e;
                y9s y9sVar = i2yVar.f97930b;
                glr glrVar = i2yVar.f97932d;
                boolean z2 = false;
                if (i2yVar.f97934f && wj50.m88271j(glrVar, clr.f39347a)) {
                    z2 = true;
                    z = true;
                } else {
                    z = true;
                }
                boolean z3 = i2yVar.f97935g;
                if (!z3 || d6w0Var.f45915v != null) {
                    z = false;
                }
                return new it41(v6w0Var, d6w0Var, m140Var2, m140Var3, y6s0Var, pro0Var, y9sVar, iM35156a, glrVar, z2, z3, z, i2yVar.f97937i, i2yVar.f97936h);
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                Logger.m3974j((Throwable) obj2, "Failure from createGeneration endpoint", new Object[0]);
                return new gli((ms51) obj);
            case 19:
                bhw0 bhw0Var = (bhw0) obj2;
                ContextTrack contextTrack = bhw0Var.f27251a;
                String strUri = contextTrack.uri();
                boolean z4 = Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_BAN));
                boolean z5 = Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_IS_BANNED));
                Boolean bool = bhw0Var.f27252b;
                return new chw0(strUri, z4, z5, bool != null ? bool.booleanValue() : e72.m37981O(contextTrack), bhw0Var.f27253c.f67695c);
            case 20:
                miw0 miw0Var = (miw0) obj;
                return Next.m15606h(new niw0(miw0Var.f144108a, miw0Var.f144109b, miw0Var.f144110c, miw0Var.f144111d, false, false, miw0Var.f144112e, miw0Var.f144113f));
            case 21:
                tiv0 tiv0Var = (tiv0) obj;
                float f = tiv0Var.f220752b;
                float f2 = tiv0Var.f220754d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((tiv0) obj2).m80934f() & 4294967295L));
                return Boolean.valueOf(fIntBitsToFloat >= f && fIntBitsToFloat < f2);
            case 22:
                tiv0 tiv0Var2 = (tiv0) obj;
                float f3 = tiv0Var2.f220751a;
                float f4 = tiv0Var2.f220753c;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((tiv0) obj2).m80934f() >> 32));
                return Boolean.valueOf(fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f4);
            case 23:
                PlayerState playerState = (PlayerState) obj2;
                String strUri2 = ((ContextTrack) playerState.track().mo49278b()).uri();
                Restrictions restrictions = playerState.restrictions();
                return new amw0(strUri2, zxc.m97189i(playerState), zxc.m97195o(zxc.m97189i(playerState), playerState.restrictions()), restrictions.disallowTogglingRepeatTrackReasons().isEmpty() || restrictions.disallowTogglingRepeatContextReasons().isEmpty());
            case 24:
                return new anw0(((Bundle) obj).getBoolean("markLaterAsUnplayed"));
            case 25:
                oow0 oow0Var = (oow0) obj;
                return Next.m15607i(sow0.m78842a((sow0) obj2, false, true, new qow0(oow0Var.f167707b, oow0Var.f167708c, oow0Var.f167709d), 1), Collections.singleton(new mnw0(oow0Var.f167706a)));
            case 26:
                oow0 oow0Var2 = (oow0) obj;
                sow0 sow0Var = (sow0) obj2;
                wj50.m88279p(sow0Var);
                return First.m15575c(sow0.m78842a(sow0Var, false, true, new qow0(oow0Var2.f167707b, oow0Var2.f167708c, oow0Var2.f167709d), 1), Collections.singleton(new mnw0(oow0Var2.f167706a)));
            case 27:
                pqm0 pqm0Var = (pqm0) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (aqw0Var = (aqw0) bundle.getParcelable("report_a_problem_model")) == null) ? new aqw0((String) pqm0Var.f180350a, (String) pqm0Var.f180351b, bhr0.f27231a, "", true, false, vv8.f245169a, "https://contentreporting.spotify.com/mobile/content-policy", qky.f189667a, false) : aqw0Var;
            case 28:
                return Boolean.valueOf(((gxw0) obj2).f85350a);
            default:
                return null;
        }
    }
}
