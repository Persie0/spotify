package p204p;

import android.os.Bundle;
import com.google.protobuf.Any;
import com.spotify.music.R;
import com.spotify.watchfeed.component.item.p184v1.VerticalOnboardingComponent;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class txa1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final txa1 f224632L0;

    /* JADX INFO: renamed from: M0 */
    public static final txa1 f224633M0;

    /* JADX INFO: renamed from: N0 */
    public static final txa1 f224634N0;

    /* JADX INFO: renamed from: O0 */
    public static final txa1 f224635O0;

    /* JADX INFO: renamed from: P0 */
    public static final txa1 f224636P0;

    /* JADX INFO: renamed from: Q0 */
    public static final txa1 f224637Q0;

    /* JADX INFO: renamed from: R0 */
    public static final txa1 f224638R0;

    /* JADX INFO: renamed from: S0 */
    public static final txa1 f224639S0;

    /* JADX INFO: renamed from: T0 */
    public static final txa1 f224640T0;

    /* JADX INFO: renamed from: U0 */
    public static final txa1 f224641U0;

    /* JADX INFO: renamed from: V0 */
    public static final txa1 f224642V0;

    /* JADX INFO: renamed from: W0 */
    public static final txa1 f224643W0;

    /* JADX INFO: renamed from: X */
    public static final txa1 f224644X;

    /* JADX INFO: renamed from: X0 */
    public static final txa1 f224645X0;

    /* JADX INFO: renamed from: Y */
    public static final txa1 f224646Y;

    /* JADX INFO: renamed from: Y0 */
    public static final txa1 f224647Y0;

    /* JADX INFO: renamed from: Z */
    public static final txa1 f224648Z;

    /* JADX INFO: renamed from: Z0 */
    public static final txa1 f224649Z0;

    /* JADX INFO: renamed from: a1 */
    public static final txa1 f224650a1;

    /* JADX INFO: renamed from: b */
    public static final txa1 f224651b;

    /* JADX INFO: renamed from: b1 */
    public static final txa1 f224652b1;

    /* JADX INFO: renamed from: c */
    public static final txa1 f224653c;

    /* JADX INFO: renamed from: c1 */
    public static final txa1 f224654c1;

    /* JADX INFO: renamed from: d */
    public static final txa1 f224655d;

    /* JADX INFO: renamed from: e */
    public static final txa1 f224656e;

    /* JADX INFO: renamed from: f */
    public static final txa1 f224657f;

    /* JADX INFO: renamed from: g */
    public static final txa1 f224658g;

    /* JADX INFO: renamed from: h */
    public static final txa1 f224659h;

    /* JADX INFO: renamed from: i */
    public static final txa1 f224660i;

    /* JADX INFO: renamed from: t */
    public static final txa1 f224661t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224662a;

    static {
        int i = 1;
        f224651b = new txa1(i, 0);
        f224653c = new txa1(i, 1);
        f224655d = new txa1(i, 2);
        f224656e = new txa1(i, 3);
        f224657f = new txa1(i, 4);
        f224658g = new txa1(i, 5);
        f224659h = new txa1(i, 6);
        f224660i = new txa1(i, 7);
        f224661t = new txa1(i, 8);
        f224644X = new txa1(i, 9);
        f224646Y = new txa1(i, 10);
        f224648Z = new txa1(i, 11);
        f224632L0 = new txa1(i, 12);
        f224633M0 = new txa1(i, 13);
        f224634N0 = new txa1(i, 14);
        f224635O0 = new txa1(i, 15);
        f224636P0 = new txa1(i, 16);
        f224637Q0 = new txa1(i, 17);
        f224638R0 = new txa1(i, 18);
        f224639S0 = new txa1(i, 19);
        f224640T0 = new txa1(i, 20);
        f224641U0 = new txa1(i, 21);
        f224642V0 = new txa1(i, 22);
        f224643W0 = new txa1(i, 23);
        f224645X0 = new txa1(i, 24);
        f224647Y0 = new txa1(i, 25);
        f224649Z0 = new txa1(i, 26);
        f224650a1 = new txa1(i, 27);
        f224652b1 = new txa1(i, 28);
        f224654c1 = new txa1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ txa1(int i, int i2) {
        super(i);
        this.f224662a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f224662a) {
            case 0:
                return new pp71(R.string.timeline_page_title_GM, gp71.f83100a, cro0.f41336a);
            case 1:
                return new wya1((xam) obj, null);
            case 2:
                return ((g6b1) obj).f77015a;
            case 3:
                return ((g6b1) obj).f77015a;
            case 4:
                return ((g6b1) obj).f77015a;
            case 5:
                return Boolean.valueOf((obj instanceof v5b1) || (obj instanceof w2a1));
            case 6:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v5b1) obj;
            case 7:
                return Boolean.valueOf(obj instanceof v140);
            case 8:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 9:
                return Boolean.valueOf(obj instanceof erc1);
            case 10:
                if (obj != null) {
                    return (erc1) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
            case 11:
                return o6b1.f162312f;
            case 12:
                return w2a1.f247311a;
            case 13:
                Bundle bundle = new Bundle();
                kab1 kab1Var = ((lab1) obj).f131326a;
                if (kab1Var instanceof iab1) {
                    bundle.putSerializable("verification_onboarding_step", ((iab1) kab1Var).f100213a);
                }
                return bundle;
            case 14:
                return pp91.m70529j(new pqm0("verificationCodeVerifyBundle", (ecb1) obj));
            case 15:
                return w2a1.f247311a;
            case 16:
                return w2a1.f247311a;
            case 17:
                return ((odb1) obj).f164145a;
            case 18:
                return (wil) obj;
            case 19:
                return new pdb1((kr8) null, (List) (0 == true ? 1 : 0), 7);
            case 20:
                return ((odb1) obj).f164145a;
            case 21:
                return (jcl0) obj;
            case 22:
                return Boolean.valueOf((obj instanceof jcl0) || (obj instanceof w2a1));
            case 23:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (jcl0) obj;
            case 24:
                return Boolean.valueOf((obj instanceof wil) || (obj instanceof w2a1));
            case 25:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (wil) obj;
            case 26:
                VerticalOnboardingComponent verticalOnboardingComponentM22741t = VerticalOnboardingComponent.m22741t(((Any) obj).m1913r());
                return new wfb1(verticalOnboardingComponentM22741t.getTitle(), verticalOnboardingComponentM22741t.m22744p(), verticalOnboardingComponentM22741t.m22745q(), verticalOnboardingComponentM22741t.m22746r(), verticalOnboardingComponentM22741t.m22747s(), verticalOnboardingComponentM22741t.m22742n(), verticalOnboardingComponentM22741t.m22743o());
            case 27:
                wgb1 wgb1Var = ((zgb1) obj).f282580a;
                return new wgb1(wgb1Var.f251019a, wgb1Var.f251020b, wgb1Var.f251021c, wgb1Var.f251022d, wgb1Var.f251023e, wgb1Var.f251024f, wgb1Var.f251025g, "home:mdc_card");
            case 28:
                return Boolean.valueOf((obj instanceof yfj) || (obj instanceof w2a1));
            default:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (yfj) obj;
        }
    }
}
