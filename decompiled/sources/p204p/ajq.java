package p204p;

import com.spotify.mobius.runners.WorkRunners;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ajq extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final ajq f16306L0;

    /* JADX INFO: renamed from: M0 */
    public static final ajq f16307M0;

    /* JADX INFO: renamed from: N0 */
    public static final ajq f16308N0;

    /* JADX INFO: renamed from: O0 */
    public static final ajq f16309O0;

    /* JADX INFO: renamed from: P0 */
    public static final ajq f16310P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ajq f16311Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ajq f16312R0;

    /* JADX INFO: renamed from: S0 */
    public static final ajq f16313S0;

    /* JADX INFO: renamed from: T0 */
    public static final ajq f16314T0;

    /* JADX INFO: renamed from: U0 */
    public static final ajq f16315U0;

    /* JADX INFO: renamed from: V0 */
    public static final ajq f16316V0;

    /* JADX INFO: renamed from: W0 */
    public static final ajq f16317W0;

    /* JADX INFO: renamed from: X */
    public static final ajq f16318X;

    /* JADX INFO: renamed from: X0 */
    public static final ajq f16319X0;

    /* JADX INFO: renamed from: Y */
    public static final ajq f16320Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ajq f16321Y0;

    /* JADX INFO: renamed from: Z */
    public static final ajq f16322Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ajq f16323Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ajq f16324a1;

    /* JADX INFO: renamed from: b */
    public static final ajq f16325b;

    /* JADX INFO: renamed from: b1 */
    public static final ajq f16326b1;

    /* JADX INFO: renamed from: c */
    public static final ajq f16327c;

    /* JADX INFO: renamed from: c1 */
    public static final ajq f16328c1;

    /* JADX INFO: renamed from: d */
    public static final ajq f16329d;

    /* JADX INFO: renamed from: e */
    public static final ajq f16330e;

    /* JADX INFO: renamed from: f */
    public static final ajq f16331f;

    /* JADX INFO: renamed from: g */
    public static final ajq f16332g;

    /* JADX INFO: renamed from: h */
    public static final ajq f16333h;

    /* JADX INFO: renamed from: i */
    public static final ajq f16334i;

    /* JADX INFO: renamed from: t */
    public static final ajq f16335t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16336a;

    static {
        int i = 0;
        f16325b = new ajq(i, 0);
        f16327c = new ajq(i, 1);
        f16329d = new ajq(i, 2);
        f16330e = new ajq(i, 3);
        f16331f = new ajq(i, 4);
        f16332g = new ajq(i, 5);
        f16333h = new ajq(i, 6);
        f16334i = new ajq(i, 7);
        f16335t = new ajq(i, 8);
        f16318X = new ajq(i, 9);
        f16320Y = new ajq(i, 10);
        f16322Z = new ajq(i, 11);
        f16306L0 = new ajq(i, 12);
        f16307M0 = new ajq(i, 13);
        f16308N0 = new ajq(i, 14);
        f16309O0 = new ajq(i, 15);
        f16310P0 = new ajq(i, 16);
        f16311Q0 = new ajq(i, 17);
        f16312R0 = new ajq(i, 18);
        f16313S0 = new ajq(i, 19);
        f16314T0 = new ajq(i, 20);
        f16315U0 = new ajq(i, 21);
        f16316V0 = new ajq(i, 22);
        f16317W0 = new ajq(i, 23);
        f16319X0 = new ajq(i, 24);
        f16321Y0 = new ajq(i, 25);
        f16323Z0 = new ajq(i, 26);
        f16324a1 = new ajq(i, 27);
        f16326b1 = new ajq(i, 28);
        f16328c1 = new ajq(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajq(int i, int i2) {
        super(i);
        this.f16336a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f16336a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                return new nkh0();
            case 1:
                return w2a1Var;
            case 2:
                return new hdh0(new vch0(st91.f213865b, 4));
            case 3:
            case 4:
            case 5:
                return w2a1Var;
            case 6:
                return WorkRunners.m15651a();
            case 7:
                return WorkRunners.m15651a();
            case 8:
                return sam.m77645B(Boolean.FALSE);
            case 9:
                return sam.m77645B(Boolean.FALSE);
            case 10:
                return new vzv("com.spotify.puffin.core.domain.DevicePredictionStatus", mbr.values());
            case 11:
                return new mj5(ql51.f189738a, 0);
            case 12:
                return w2a1Var;
            case 13:
                return new mj5(x4r.f258187a, 0);
            case 14:
                return new mj5(ca0.f35683a, 0);
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return w2a1Var;
            case 21:
                return null;
            case 22:
                return new vkj0();
            case 23:
                return Boolean.TRUE;
            case 24:
                return Boolean.TRUE;
            case 25:
                return w2a1Var;
            case 26:
                Integer numValueOf = Integer.valueOf(R.string.settings_item_download_quality_very_high_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf, null, null, null, null, null, false);
            case 27:
                Integer numValueOf2 = Integer.valueOf(R.string.settings_item_download_quality_lossless_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf2);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf2, null, null, null, null, null, false);
            case 28:
                Integer numValueOf3 = Integer.valueOf(R.string.settings_item_download_quality_very_high_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf3);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf3, null, null, null, null, null, false);
            default:
                Integer numValueOf4 = Integer.valueOf(R.string.settings_item_download_quality_lossless_quality_not_available);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf4);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                return new g631(null, "", numValueOf4, null, null, null, null, null, false);
        }
    }
}
