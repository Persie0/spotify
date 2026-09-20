package p204p;

import android.os.Bundle;
import com.spotify.checkout.proto.model.p044v1.proto.C0496j;
import com.spotify.checkout.proto.model.p044v1.proto.Error;
import com.spotify.checkout.proto.model.p044v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class z7g0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final z7g0 f280197L0;

    /* JADX INFO: renamed from: M0 */
    public static final z7g0 f280198M0;

    /* JADX INFO: renamed from: N0 */
    public static final z7g0 f280199N0;

    /* JADX INFO: renamed from: O0 */
    public static final z7g0 f280200O0;

    /* JADX INFO: renamed from: P0 */
    public static final z7g0 f280201P0;

    /* JADX INFO: renamed from: Q0 */
    public static final z7g0 f280202Q0;

    /* JADX INFO: renamed from: R0 */
    public static final z7g0 f280203R0;

    /* JADX INFO: renamed from: S0 */
    public static final z7g0 f280204S0;

    /* JADX INFO: renamed from: T0 */
    public static final z7g0 f280205T0;

    /* JADX INFO: renamed from: U0 */
    public static final z7g0 f280206U0;

    /* JADX INFO: renamed from: V0 */
    public static final z7g0 f280207V0;

    /* JADX INFO: renamed from: W0 */
    public static final z7g0 f280208W0;

    /* JADX INFO: renamed from: X */
    public static final z7g0 f280209X;

    /* JADX INFO: renamed from: X0 */
    public static final z7g0 f280210X0;

    /* JADX INFO: renamed from: Y */
    public static final z7g0 f280211Y;

    /* JADX INFO: renamed from: Y0 */
    public static final z7g0 f280212Y0;

    /* JADX INFO: renamed from: Z */
    public static final z7g0 f280213Z;

    /* JADX INFO: renamed from: Z0 */
    public static final z7g0 f280214Z0;

    /* JADX INFO: renamed from: a1 */
    public static final z7g0 f280215a1;

    /* JADX INFO: renamed from: b */
    public static final z7g0 f280216b;

    /* JADX INFO: renamed from: b1 */
    public static final z7g0 f280217b1;

    /* JADX INFO: renamed from: c */
    public static final z7g0 f280218c;

    /* JADX INFO: renamed from: c1 */
    public static final z7g0 f280219c1;

    /* JADX INFO: renamed from: d */
    public static final z7g0 f280220d;

    /* JADX INFO: renamed from: e */
    public static final z7g0 f280221e;

    /* JADX INFO: renamed from: f */
    public static final z7g0 f280222f;

    /* JADX INFO: renamed from: g */
    public static final z7g0 f280223g;

    /* JADX INFO: renamed from: h */
    public static final z7g0 f280224h;

    /* JADX INFO: renamed from: i */
    public static final z7g0 f280225i;

    /* JADX INFO: renamed from: t */
    public static final z7g0 f280226t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280227a;

    static {
        int i = 1;
        f280216b = new z7g0(i, 0);
        f280218c = new z7g0(i, 1);
        f280220d = new z7g0(i, 2);
        f280221e = new z7g0(i, 3);
        f280222f = new z7g0(i, 4);
        f280223g = new z7g0(i, 5);
        f280224h = new z7g0(i, 6);
        f280225i = new z7g0(i, 7);
        f280226t = new z7g0(i, 8);
        f280209X = new z7g0(i, 9);
        f280211Y = new z7g0(i, 10);
        f280213Z = new z7g0(i, 11);
        f280197L0 = new z7g0(i, 12);
        f280198M0 = new z7g0(i, 13);
        f280199N0 = new z7g0(i, 14);
        f280200O0 = new z7g0(i, 15);
        f280201P0 = new z7g0(i, 16);
        f280202Q0 = new z7g0(i, 17);
        f280203R0 = new z7g0(i, 18);
        f280204S0 = new z7g0(i, 19);
        f280205T0 = new z7g0(i, 20);
        f280206U0 = new z7g0(i, 21);
        f280207V0 = new z7g0(i, 22);
        f280208W0 = new z7g0(i, 23);
        f280210X0 = new z7g0(i, 24);
        f280212Y0 = new z7g0(i, 25);
        f280214Z0 = new z7g0(i, 26);
        f280215a1 = new z7g0(i, 27);
        f280217b1 = new z7g0(i, 28);
        f280219c1 = new z7g0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7g0(int i, int i2) {
        super(i);
        this.f280227a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws IOException {
        switch (this.f280227a) {
            case 0:
                return Boolean.valueOf((obj instanceof k69) || (obj instanceof w2a1));
            case 1:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (k69) obj;
            case 2:
                return Boolean.valueOf((obj instanceof Map) || (obj instanceof w2a1));
            case 3:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Map) obj;
            case 4:
                return Boolean.valueOf((obj instanceof Map) || (obj instanceof w2a1));
            case 5:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Map) obj;
            case 6:
                return Boolean.valueOf((obj instanceof Map) || (obj instanceof w2a1));
            case 7:
                return Boolean.valueOf(obj instanceof daj);
            case 8:
                if (obj != null) {
                    return (daj) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
            case 9:
                return Boolean.valueOf(obj instanceof daj);
            case 10:
                if (obj != null) {
                    return (daj) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
            case 11:
                return ((q7g0) obj).f186104a.f24196b.f204176c;
            case 12:
                return ((q7g0) obj).f186104a.f24196b.f204177d;
            case 13:
                return w2a1.f247311a;
            case 14:
                return pp91.m70529j(new pqm0("LyricsFullscreenElementSavedStateKey", (cgb0) obj));
            case 15:
                return pp91.m70529j(new pqm0("LyricsTextElementSavedStateKey", (opb0) obj));
            case 16:
                cgb0 cgb0Var = (cgb0) zn91.m96523K((Bundle) obj, "LyricsFullscreenElementSavedStateKey", cgb0.class);
                if (cgb0Var != null) {
                    return cgb0Var;
                }
                throw new IllegalStateException("Saved state not found");
            case 17:
                opb0 opb0Var = (opb0) zn91.m96523K((Bundle) obj, "LyricsTextElementSavedStateKey", opb0.class);
                if (opb0Var != null) {
                    return opb0Var;
                }
                throw new IllegalStateException("Saved state not found");
            case 18:
                return pp91.m70529j(new pqm0("wrapped.state", (hee1) obj));
            case 19:
                Object objM96523K = zn91.m96523K((Bundle) obj, "wrapped.state", hee1.class);
                if (objM96523K != null) {
                    return (hee1) objM96523K;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                return (lw1) ((RetrofitMaker) obj).createWebgateService(lw1.class, "android-system-address");
            case 21:
                return tph0.m81264c(tph0.f222546a, new pph0(false), 6);
            case 22:
                return tph0.m81264c(tph0.f222546a, new pph0(true), 6);
            case 23:
                return tph0.m81264c(tph0.f222546a, new C1758cy(false, 28), 4);
            case 24:
                return tph0.m81264c(tph0.f222546a, new C1758cy(true, 28), 4);
            case 25:
                return tph0.m81264c(tph0.f222546a, null, 3);
            case 26:
                throw new IOException("Mock network error");
            case 27:
                return tph0.f222549d;
            case 28:
                nb10 nb10VarM6212y = GetSpotifyCheckoutPageResponse.m6212y();
                nb10VarM6212y.m64057q(lqh0.f136062l);
                return (GetSpotifyCheckoutPageResponse) nb10VarM6212y.build();
            default:
                nb10 nb10VarM6212y2 = GetSpotifyCheckoutPageResponse.m6212y();
                C0496j c0496jM6011z = Error.m6011z();
                c0496jM6011z.m6591u("Error follow link");
                c0496jM6011z.m6590t("This error only has a follow Link CTA");
                pwz pwzVarM6043s = FollowLinkCta.m6043s();
                pwzVarM6043s.m71318q("go to page");
                pwzVarM6043s.m71317m("https://www.youtube.com/watch?v=g0amdIcZt5I");
                c0496jM6011z.m6588r(pwzVarM6043s);
                nb10VarM6212y2.m64058r(c0496jM6011z);
                return (GetSpotifyCheckoutPageResponse) nb10VarM6212y2.build();
        }
    }
}
