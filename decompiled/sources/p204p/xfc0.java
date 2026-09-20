package p204p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.encoremobile.component.icons.IconSpotifyLogo;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class xfc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final xfc0 f260896L0;

    /* JADX INFO: renamed from: M0 */
    public static final xfc0 f260897M0;

    /* JADX INFO: renamed from: N0 */
    public static final xfc0 f260898N0;

    /* JADX INFO: renamed from: O0 */
    public static final xfc0 f260899O0;

    /* JADX INFO: renamed from: P0 */
    public static final xfc0 f260900P0;

    /* JADX INFO: renamed from: Q0 */
    public static final xfc0 f260901Q0;

    /* JADX INFO: renamed from: R0 */
    public static final xfc0 f260902R0;

    /* JADX INFO: renamed from: S0 */
    public static final xfc0 f260903S0;

    /* JADX INFO: renamed from: T0 */
    public static final xfc0 f260904T0;

    /* JADX INFO: renamed from: U0 */
    public static final xfc0 f260905U0;

    /* JADX INFO: renamed from: V0 */
    public static final xfc0 f260906V0;

    /* JADX INFO: renamed from: W0 */
    public static final xfc0 f260907W0;

    /* JADX INFO: renamed from: X */
    public static final xfc0 f260908X;

    /* JADX INFO: renamed from: X0 */
    public static final xfc0 f260909X0;

    /* JADX INFO: renamed from: Y */
    public static final xfc0 f260910Y;

    /* JADX INFO: renamed from: Y0 */
    public static final xfc0 f260911Y0;

    /* JADX INFO: renamed from: Z */
    public static final xfc0 f260912Z;

    /* JADX INFO: renamed from: Z0 */
    public static final xfc0 f260913Z0;

    /* JADX INFO: renamed from: a1 */
    public static final xfc0 f260914a1;

    /* JADX INFO: renamed from: b */
    public static final xfc0 f260915b;

    /* JADX INFO: renamed from: b1 */
    public static final xfc0 f260916b1;

    /* JADX INFO: renamed from: c */
    public static final xfc0 f260917c;

    /* JADX INFO: renamed from: c1 */
    public static final xfc0 f260918c1;

    /* JADX INFO: renamed from: d */
    public static final xfc0 f260919d;

    /* JADX INFO: renamed from: e */
    public static final xfc0 f260920e;

    /* JADX INFO: renamed from: f */
    public static final xfc0 f260921f;

    /* JADX INFO: renamed from: g */
    public static final xfc0 f260922g;

    /* JADX INFO: renamed from: h */
    public static final xfc0 f260923h;

    /* JADX INFO: renamed from: i */
    public static final xfc0 f260924i;

    /* JADX INFO: renamed from: t */
    public static final xfc0 f260925t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260926a;

    static {
        int i = 1;
        f260915b = new xfc0(i, 0);
        f260917c = new xfc0(i, 1);
        f260919d = new xfc0(i, 2);
        f260920e = new xfc0(i, 3);
        f260921f = new xfc0(i, 4);
        f260922g = new xfc0(i, 5);
        f260923h = new xfc0(i, 6);
        f260924i = new xfc0(i, 7);
        f260925t = new xfc0(i, 8);
        f260908X = new xfc0(i, 9);
        f260910Y = new xfc0(i, 10);
        f260912Z = new xfc0(i, 11);
        f260896L0 = new xfc0(i, 12);
        f260897M0 = new xfc0(i, 13);
        f260898N0 = new xfc0(i, 14);
        f260899O0 = new xfc0(i, 15);
        f260900P0 = new xfc0(i, 16);
        f260901Q0 = new xfc0(i, 17);
        f260902R0 = new xfc0(i, 18);
        f260903S0 = new xfc0(i, 19);
        f260904T0 = new xfc0(i, 20);
        f260905U0 = new xfc0(i, 21);
        f260906V0 = new xfc0(i, 22);
        f260907W0 = new xfc0(i, 23);
        f260909X0 = new xfc0(i, 24);
        f260911Y0 = new xfc0(i, 25);
        f260913Z0 = new xfc0(i, 26);
        f260914a1 = new xfc0(i, 27);
        f260916b1 = new xfc0(i, 28);
        f260918c1 = new xfc0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfc0(int i, int i2) {
        super(i);
        this.f260926a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f260926a) {
            case 0:
                return Boolean.valueOf((obj instanceof dl31) || (obj instanceof w2a1));
            case 1:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (dl31) obj;
            case 2:
                return Boolean.valueOf(obj instanceof erc1);
            case 3:
                return (qho) obj;
            case 4:
                return w2a1.f247311a;
            case 5:
                jpz0.m53990d((mpz0) obj);
                return w2a1.f247311a;
            case 6:
                return bx4.m30755d(kbv.m55958d(jg31.m53259E(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, null, 6), 2), kbv.m55959e(jg31.m53259E(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, null, 6), 2));
            case 7:
                ((FrameLayout) obj).setTag(R.id.compose_transformer_event_dispatcher, null);
                return w2a1.f247311a;
            case 8:
                return new av91("", "", new dv91("hit", 1), new bv91("no_action", 1, nau.f152117a), ((mxg0) obj).f148048a, st91.f213865b, System.currentTimeMillis());
            case 9:
                return new glg0((slg0) obj, null);
            case 10:
                return new glg0((slg0) obj, null);
            case 11:
                return new pkc0(((r8w) obj).f196845a);
            case 12:
                return (CharSequence) ((p2d0) ((r2d0) obj).m74520a()).get(1);
            case 13:
                r2d0 r2d0Var = (r2d0) obj;
                return new xmc0(1, r2d0Var.m74521b(), r2d0Var);
            case 14:
                r2d0 r2d0Var2 = (r2d0) obj;
                return new xmc0(2, r2d0Var2.m74521b(), r2d0Var2);
            case 15:
                return w2a1.f247311a;
            case 16:
                Context context = (Context) obj;
                IconSpotifyLogo iconSpotifyLogo = new IconSpotifyLogo(context, null, 0, 6, null);
                int i = (int) (24 * context.getResources().getDisplayMetrics().density);
                iconSpotifyLogo.setLayoutParams(new ViewGroup.LayoutParams(i, i));
                return iconSpotifyLogo;
            case 17:
                return w2a1.f247311a;
            case 18:
                return new jsc0(31, (String) null, (String) null, false, false);
            case 19:
                return ((ysc0) obj).f275743a;
            case 20:
                return (v140) obj;
            case 21:
                return new wsc0("", null, false, false, null);
            case 22:
                return Boolean.valueOf(obj instanceof v140);
            case 23:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 24:
                return vsc0.f244405a;
            case 25:
                gzc0 gzc0Var = (gzc0) obj;
                return new bu31(gzc0Var.f85893c, gzc0Var.f85892b);
            case 26:
                return gbu.f78413a;
            case 27:
                return gbu.f78413a;
            case 28:
                throw ei6.m39072i(obj);
            default:
                return gbu.f78413a;
        }
    }
}
