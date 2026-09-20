package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.music.R;
import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class c781 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final c781 f34792L0;

    /* JADX INFO: renamed from: M0 */
    public static final c781 f34793M0;

    /* JADX INFO: renamed from: N0 */
    public static final c781 f34794N0;

    /* JADX INFO: renamed from: O0 */
    public static final c781 f34795O0;

    /* JADX INFO: renamed from: P0 */
    public static final c781 f34796P0;

    /* JADX INFO: renamed from: Q0 */
    public static final c781 f34797Q0;

    /* JADX INFO: renamed from: R0 */
    public static final c781 f34798R0;

    /* JADX INFO: renamed from: S0 */
    public static final c781 f34799S0;

    /* JADX INFO: renamed from: T0 */
    public static final c781 f34800T0;

    /* JADX INFO: renamed from: U0 */
    public static final c781 f34801U0;

    /* JADX INFO: renamed from: V0 */
    public static final c781 f34802V0;

    /* JADX INFO: renamed from: W0 */
    public static final c781 f34803W0;

    /* JADX INFO: renamed from: X */
    public static final c781 f34804X;

    /* JADX INFO: renamed from: X0 */
    public static final c781 f34805X0;

    /* JADX INFO: renamed from: Y */
    public static final c781 f34806Y;

    /* JADX INFO: renamed from: Y0 */
    public static final c781 f34807Y0;

    /* JADX INFO: renamed from: Z */
    public static final c781 f34808Z;

    /* JADX INFO: renamed from: Z0 */
    public static final c781 f34809Z0;

    /* JADX INFO: renamed from: a1 */
    public static final c781 f34810a1;

    /* JADX INFO: renamed from: b */
    public static final c781 f34811b;

    /* JADX INFO: renamed from: b1 */
    public static final c781 f34812b1;

    /* JADX INFO: renamed from: c */
    public static final c781 f34813c;

    /* JADX INFO: renamed from: c1 */
    public static final c781 f34814c1;

    /* JADX INFO: renamed from: d */
    public static final c781 f34815d;

    /* JADX INFO: renamed from: e */
    public static final c781 f34816e;

    /* JADX INFO: renamed from: f */
    public static final c781 f34817f;

    /* JADX INFO: renamed from: g */
    public static final c781 f34818g;

    /* JADX INFO: renamed from: h */
    public static final c781 f34819h;

    /* JADX INFO: renamed from: i */
    public static final c781 f34820i;

    /* JADX INFO: renamed from: t */
    public static final c781 f34821t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34822a;

    static {
        int i = 0;
        f34811b = new c781(i, 0);
        f34813c = new c781(i, 1);
        f34815d = new c781(i, 2);
        f34816e = new c781(i, 3);
        f34817f = new c781(i, 4);
        f34818g = new c781(i, 5);
        f34819h = new c781(i, 6);
        f34820i = new c781(i, 7);
        f34821t = new c781(i, 8);
        f34804X = new c781(i, 9);
        f34806Y = new c781(i, 10);
        f34808Z = new c781(i, 11);
        f34792L0 = new c781(i, 12);
        f34793M0 = new c781(i, 13);
        f34794N0 = new c781(i, 14);
        f34795O0 = new c781(i, 15);
        f34796P0 = new c781(i, 16);
        f34797Q0 = new c781(i, 17);
        f34798R0 = new c781(i, 18);
        f34799S0 = new c781(i, 19);
        f34800T0 = new c781(i, 20);
        f34801U0 = new c781(i, 21);
        f34802V0 = new c781(i, 22);
        f34803W0 = new c781(i, 23);
        f34805X0 = new c781(i, 24);
        f34807Y0 = new c781(i, 25);
        f34809Z0 = new c781(i, 26);
        f34810a1 = new c781(i, 27);
        f34812b1 = new c781(i, 28);
        f34814c1 = new c781(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c781(int i, int i2) {
        super(i);
        this.f34822a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f34822a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return new q4k(null, false, false, false, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741821);
            case 1:
                return w2a1Var;
            case 2:
                return new mj5(ql51.f189738a, 0);
            case 3:
                return new mj5(ql51.f189738a, 0);
            case 4:
                return null;
            case 5:
                return 0L;
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 8:
                return new mj5(t291.f216463a, 0);
            case 9:
                return w2a1Var;
            case 10:
                return null;
            case 11:
                return Integer.valueOf(R.drawable.encore_icon_shuffle_24);
            case 12:
                return Integer.valueOf(R.drawable.smart_shuffle_icon);
            case 13:
                return w2a1Var;
            case 14:
                return new mj5(ev91.f63187a, 0);
            case 15:
                return wu31.Companion.serializer();
            case 16:
                pw71 pw71Var = new pw71(new sl51(""));
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90662N1("UNBOXING_MAIN_HUB", "unboxing/main-hub", 1991, "unboxing"), xoc1.f264106i3, null), new sw91(14, true, false, false)}, false);
            case 17:
                return vgg1.m85475p("com.spotify.betamax.contextplayercoordinatorimpl.cosmos.UnplayableReason", x3a1.values(), new String[]{"not_available", "not_available_offline", "not_available_in_current_region", "nt_available_in_non_premium", "not_available_by_artist_ban", "local_file_not_found", "local_file_bad_format", "local_file_drm_protected", "user_streaming_disallowed", "user_capping_reached", "background", "driver_distracted", "missing_manifest_id"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 18:
            case 19:
                return w2a1Var;
            case 20:
                return vgg1.m85475p("com.spotify.jam.integrations.messagingservice.UserMessage", hta1.values(), new String[]{"PERMISSIONS_RESTRICTED_GENERIC", "CONNECTIVITY_ISSUES", "CONTENT_ISSUES", "NO_HOST_ACTIVE_DEVICE", "GENERIC_ERROR"}, new Annotation[][]{null, null, null, null, null});
            case 21:
            case 22:
                return w2a1Var;
            case 23:
                return new lwr();
            case 24:
                return w2a1Var;
            case 25:
                return jag1.m52819d(zp8.f285014a);
            case 26:
                return jag1.m52819d(txa1.f224632L0);
            case 27:
                return jag1.m52819d(new e9b1(0, lau.f131415a));
            case 28:
                return sam.m77645B(Boolean.FALSE);
            default:
                return new vum0(0);
        }
    }
}
