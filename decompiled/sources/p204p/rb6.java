package p204p;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.Any;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.watchfeed.component.item.p184v1.AssociatedFeedsOnboardingComponent;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class rb6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final rb6 f197478L0;

    /* JADX INFO: renamed from: M0 */
    public static final rb6 f197479M0;

    /* JADX INFO: renamed from: N0 */
    public static final rb6 f197480N0;

    /* JADX INFO: renamed from: O0 */
    public static final rb6 f197481O0;

    /* JADX INFO: renamed from: P0 */
    public static final rb6 f197482P0;

    /* JADX INFO: renamed from: Q0 */
    public static final rb6 f197483Q0;

    /* JADX INFO: renamed from: R0 */
    public static final rb6 f197484R0;

    /* JADX INFO: renamed from: S0 */
    public static final rb6 f197485S0;

    /* JADX INFO: renamed from: T0 */
    public static final rb6 f197486T0;

    /* JADX INFO: renamed from: U0 */
    public static final rb6 f197487U0;

    /* JADX INFO: renamed from: V0 */
    public static final rb6 f197488V0;

    /* JADX INFO: renamed from: W0 */
    public static final rb6 f197489W0;

    /* JADX INFO: renamed from: X */
    public static final rb6 f197490X;

    /* JADX INFO: renamed from: X0 */
    public static final rb6 f197491X0;

    /* JADX INFO: renamed from: Y */
    public static final rb6 f197492Y;

    /* JADX INFO: renamed from: Y0 */
    public static final rb6 f197493Y0;

    /* JADX INFO: renamed from: Z */
    public static final rb6 f197494Z;

    /* JADX INFO: renamed from: Z0 */
    public static final rb6 f197495Z0;

    /* JADX INFO: renamed from: a1 */
    public static final rb6 f197496a1;

    /* JADX INFO: renamed from: b */
    public static final rb6 f197497b;

    /* JADX INFO: renamed from: b1 */
    public static final rb6 f197498b1;

    /* JADX INFO: renamed from: c */
    public static final rb6 f197499c;

    /* JADX INFO: renamed from: c1 */
    public static final rb6 f197500c1;

    /* JADX INFO: renamed from: d */
    public static final rb6 f197501d;

    /* JADX INFO: renamed from: e */
    public static final rb6 f197502e;

    /* JADX INFO: renamed from: f */
    public static final rb6 f197503f;

    /* JADX INFO: renamed from: g */
    public static final rb6 f197504g;

    /* JADX INFO: renamed from: h */
    public static final rb6 f197505h;

    /* JADX INFO: renamed from: i */
    public static final rb6 f197506i;

    /* JADX INFO: renamed from: t */
    public static final rb6 f197507t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197508a;

    static {
        int i = 1;
        f197497b = new rb6(i, 0);
        f197499c = new rb6(i, 1);
        f197501d = new rb6(i, 2);
        f197502e = new rb6(i, 3);
        f197503f = new rb6(i, 4);
        f197504g = new rb6(i, 5);
        f197505h = new rb6(i, 6);
        f197506i = new rb6(i, 7);
        f197507t = new rb6(i, 8);
        f197490X = new rb6(i, 9);
        f197492Y = new rb6(i, 10);
        f197494Z = new rb6(i, 11);
        f197478L0 = new rb6(i, 12);
        f197479M0 = new rb6(i, 13);
        f197480N0 = new rb6(i, 14);
        f197481O0 = new rb6(i, 15);
        f197482P0 = new rb6(i, 16);
        f197483Q0 = new rb6(i, 17);
        f197484R0 = new rb6(i, 18);
        f197485S0 = new rb6(i, 19);
        f197486T0 = new rb6(i, 20);
        f197487U0 = new rb6(i, 21);
        f197488V0 = new rb6(i, 22);
        f197489W0 = new rb6(i, 23);
        f197491X0 = new rb6(i, 24);
        f197493Y0 = new rb6(i, 25);
        f197495Z0 = new rb6(i, 26);
        f197496a1 = new rb6(i, 27);
        f197498b1 = new rb6(i, 28);
        f197500c1 = new rb6(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb6(int i, int i2) {
        super(i);
        this.f197508a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f197508a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 2;
        boolean z = true;
        switch (i) {
            case 0:
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.spotify.promptedplaylists.assistance.PromptedPlaylistAssistanceRow>");
            case 1:
                return w2a1Var;
            case 2:
                return (List) obj;
            case 3:
                return w2a1Var;
            case 4:
                return w2a1Var;
            case 5:
                oi6 oi6Var = (oi6) obj;
                return klh.m56834f(oi6Var.f165714c.mo29288r1(), "?context=", oi6Var.f165712a);
            case 6:
                return Boolean.valueOf(((arx0) obj) instanceof vqx0);
            case 7:
                arx0 arx0Var = (arx0) obj;
                return Boolean.valueOf((arx0Var instanceof vpx0) && ((vpx0) arx0Var).f243801a.f40742g == 2);
            case 8:
                arx0 arx0Var2 = (arx0) obj;
                return Boolean.valueOf((arx0Var2 instanceof vpx0) && ((vpx0) arx0Var2).f243801a.f40742g == 3);
            case 9:
                arx0 arx0Var3 = (arx0) obj;
                return Boolean.valueOf((arx0Var3 instanceof vpx0) && ((vpx0) arx0Var3).f243801a.f40742g == 4);
            case 10:
                return edb.m38564m("spotify:assisted-curation:search?context=", ((zi6) obj).f283086a);
            case 11:
                return s571.m77251j("spotify:assisted-curation?context=", Uri.encode(((tk6) obj).f221090a), "&mode=selection");
            case 12:
                AssociatedFeedsOnboardingComponent associatedFeedsOnboardingComponentM22572s = AssociatedFeedsOnboardingComponent.m22572s(((Any) obj).m1913r());
                return new al6((int) associatedFeedsOnboardingComponentM22572s.m22576q(), associatedFeedsOnboardingComponentM22572s.m22574o(), associatedFeedsOnboardingComponentM22572s.m22577r(), associatedFeedsOnboardingComponentM22572s.getTitle(), associatedFeedsOnboardingComponentM22572s.m22573n(), associatedFeedsOnboardingComponentM22572s.m22575p());
            case 13:
                return ((fjh0) obj).m41846k("", 0, 0);
            case 14:
                fjh0 fjh0Var = (fjh0) obj;
                dv91 dv91Var = new dv91("swipe", 1);
                pqm0 pqm0Var = new pqm0("item_to_be_skipped", "");
                String strValueOf = String.valueOf(0);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
                String strValueOf2 = String.valueOf(0);
                return new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), fjh0Var.f70295a, st91.f213865b, System.currentTimeMillis());
            case 15:
                fjh0 fjh0Var2 = (fjh0) obj;
                dv91 dv91Var2 = new dv91("swipe", 1);
                pqm0 pqm0Var3 = new pqm0("item_to_be_skipped", "");
                String strValueOf3 = String.valueOf(0);
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                pqm0 pqm0Var4 = new pqm0("position_ms", strValueOf3);
                String strValueOf4 = String.valueOf(0);
                return new av91("", "", dv91Var2, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var3, pqm0Var4, new pqm0("total_content_ms", strValueOf4 != null ? strValueOf4 : ""))), fjh0Var2.f70295a, st91.f213865b, System.currentTimeMillis());
            case 16:
                b070 b070Var = (b070) obj;
                b070Var.f21789a = CtaType.BUY_TICKETS_FIELD_NUMBER;
                a070 a070VarM27747a = b070Var.m27747a(Float.valueOf(-16.0f), 72);
                hqs hqsVar = iqs.f104842d;
                a070VarM27747a.f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(16.0f), 156).f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(-10.24f), 240).f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(10.24f), 324).f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(-4.64f), 408).f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(4.64f), 492).f11004b = hqsVar;
                b070Var.m27747a(Float.valueOf(0.0f), CtaType.BUY_TICKETS_FIELD_NUMBER).f11004b = hqsVar;
                return w2a1Var;
            case 17:
                Set set = dd41.f47702f;
                return Boolean.valueOf(r46.m74726U(((km51) obj).getUri()).f47709c == gn80.SHOW_SHOW);
            case 18:
                v6w0 v6w0Var = (v6w0) obj;
                u6w0 u6w0Var = v6w0Var.f237984f;
                String str = v6w0Var.f237979a;
                String str2 = u6w0Var != null ? u6w0Var.f227441a : null;
                String str3 = str2 == null ? "" : str2;
                String str4 = u6w0Var != null ? u6w0Var.f227442b : null;
                return new yqr0(str, new qla1(40, u6w0Var != null ? u6w0Var.f227445e : null, str3, str4 == null ? "" : str4, u6w0Var != null ? u6w0Var.f227444d : null, u6w0Var != null ? u6w0Var.f227443c : null), i2);
            case 19:
                return new iz80((String) obj);
            case 20:
                return (hz80) obj;
            case 21:
                if (!(obj instanceof hz80) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (hz80) obj;
            case 23:
                return new cv41(((czs0) obj).f43616a);
            case 24:
                p5a0 p5a0Var = ((cv41) obj).f42292a;
                if (!(p5a0Var instanceof q6a0)) {
                    if (p5a0Var instanceof o8a0) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                q6a0 q6a0Var = (q6a0) p5a0Var;
                String strM31957v = c9g1.m31957v(q6a0Var);
                String str5 = q6a0Var.f185714c;
                return new qq01(str5 != null ? str5 : "", strM31957v, q6a0Var.f185717f);
            case 25:
                return c9g1.m31955t(((cv41) obj).f42292a);
            case 26:
                p5a0 p5a0Var2 = ((cv41) obj).f42292a;
                if (!(p5a0Var2 instanceof q6a0)) {
                    if (p5a0Var2 instanceof o8a0) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                q6a0 q6a0Var2 = (q6a0) p5a0Var2;
                String str6 = q6a0Var2.f185714c;
                String str7 = str6 != null ? str6 : "";
                ee7 ee7Var = (ee7) q6a0Var2.f185723l.mo30169a(ee7.class);
                return new qqo0(ee7Var != null ? Long.valueOf(ee7Var.f58692e / ((long) 1000)) : null, str7);
            case 27:
                bv6 bv6Var = (bv6) obj;
                return new cv6(bv6Var.f31287a, bv6Var.f31288b, bv6Var.f31289c, bv6Var.f31290d, bv6Var.f31291e, bv6Var.f31292f, bv6Var.f31293g, (av6) null, 384);
            case 28:
                return pp91.m70529j(new pqm0("audio.chapter.format.share.card.key", (cv6) obj));
            default:
                return (cv6) zn91.m96523K((Bundle) obj, "audio.chapter.format.share.card.key", cv6.class);
        }
    }
}
