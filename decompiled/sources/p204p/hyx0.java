package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class hyx0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96733a;

    /* JADX INFO: renamed from: b */
    public static final hyx0 f96722b = new hyx0(0);

    /* JADX INFO: renamed from: c */
    public static final hyx0 f96724c = new hyx0(1);

    /* JADX INFO: renamed from: d */
    public static final hyx0 f96726d = new hyx0(2);

    /* JADX INFO: renamed from: e */
    public static final hyx0 f96727e = new hyx0(3);

    /* JADX INFO: renamed from: f */
    public static final hyx0 f96728f = new hyx0(4);

    /* JADX INFO: renamed from: g */
    public static final hyx0 f96729g = new hyx0(5);

    /* JADX INFO: renamed from: h */
    public static final hyx0 f96730h = new hyx0(6);

    /* JADX INFO: renamed from: i */
    public static final hyx0 f96731i = new hyx0(7);

    /* JADX INFO: renamed from: t */
    public static final hyx0 f96732t = new hyx0(8);

    /* JADX INFO: renamed from: X */
    public static final hyx0 f96715X = new hyx0(9);

    /* JADX INFO: renamed from: Y */
    public static final hyx0 f96717Y = new hyx0(10);

    /* JADX INFO: renamed from: Z */
    public static final hyx0 f96719Z = new hyx0(11);

    /* JADX INFO: renamed from: L0 */
    public static final hyx0 f96703L0 = new hyx0(12);

    /* JADX INFO: renamed from: M0 */
    public static final hyx0 f96704M0 = new hyx0(13);

    /* JADX INFO: renamed from: N0 */
    public static final hyx0 f96705N0 = new hyx0(14);

    /* JADX INFO: renamed from: O0 */
    public static final hyx0 f96706O0 = new hyx0(15);

    /* JADX INFO: renamed from: P0 */
    public static final hyx0 f96707P0 = new hyx0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final hyx0 f96708Q0 = new hyx0(17);

    /* JADX INFO: renamed from: R0 */
    public static final hyx0 f96709R0 = new hyx0(18);

    /* JADX INFO: renamed from: S0 */
    public static final hyx0 f96710S0 = new hyx0(19);

    /* JADX INFO: renamed from: T0 */
    public static final hyx0 f96711T0 = new hyx0(20);

    /* JADX INFO: renamed from: U0 */
    public static final hyx0 f96712U0 = new hyx0(21);

    /* JADX INFO: renamed from: V0 */
    public static final hyx0 f96713V0 = new hyx0(22);

    /* JADX INFO: renamed from: W0 */
    public static final hyx0 f96714W0 = new hyx0(23);

    /* JADX INFO: renamed from: X0 */
    public static final hyx0 f96716X0 = new hyx0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final hyx0 f96718Y0 = new hyx0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final hyx0 f96720Z0 = new hyx0(26);

    /* JADX INFO: renamed from: a1 */
    public static final hyx0 f96721a1 = new hyx0(27);

    /* JADX INFO: renamed from: b1 */
    public static final hyx0 f96723b1 = new hyx0(28);

    /* JADX INFO: renamed from: c1 */
    public static final hyx0 f96725c1 = new hyx0(29);

    public /* synthetic */ hyx0(int i) {
        this.f96733a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f96733a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                Throwable th = (Throwable) obj;
                Logger.m3966b(edb.m38564m("Failed to change playlist follow state: ", th != null ? th.getMessage() : null), new Object[0]);
                break;
            case 4:
                Throwable th2 = (Throwable) obj;
                Logger.m3966b(edb.m38564m("Unable to save content: ", th2 != null ? th2.getMessage() : null), new Object[0]);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                Logger.m3966b(edb.m38564m("Unable to save content: ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
            case 8:
                na6.m63957e("[Puffin] Error in SaveFilterStateUseCase: " + ((Throwable) obj));
                break;
            case 9:
                Logger.m3967c((Throwable) obj, "Failed to search main", new Object[0]);
                break;
            case 10:
                Logger.m3967c((Throwable) obj, "Failed to search entity", new Object[0]);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                Logger.m3967c((Throwable) obj, "Failed sending reset signal", new Object[0]);
                break;
            case 19:
                Logger.m3967c((Throwable) obj, "[Puffin] Error while combining ShouldOverrideNormalization observables.", new Object[0]);
                break;
            case 20:
                break;
            case 21:
                Logger.m3967c((Throwable) obj, "Error playing from pick and shuffle cap", new Object[0]);
                break;
            case 22:
                Logger.m3967c((Throwable) obj, "Could not load signup v2 configuration, fallback to default", new Object[0]);
                break;
            case 23:
                ((EsResponseWithReasons$ResponseWithReasons) obj).toString();
                break;
            case 24:
                Logger.m3967c((Throwable) obj, "Failed starting lens Smart Shuffle playback", new Object[0]);
                break;
            case 25:
                ((p2x0) obj).toString();
                break;
            case 26:
                na6.m63972t("Failed to send minus signal through the context player client for the currently playing item", (Throwable) obj);
                break;
            case 27:
                ((p2x0) obj).m68969b(o131.f160587P0, o131.f160588Q0);
                break;
            case 28:
                Logger.m3967c((Throwable) obj, "social listening impl: Failed observing device broadcast status.", new Object[0]);
                break;
            default:
                Logger.m3967c((Throwable) obj, "social listening impl: Failed observing social session update.", new Object[0]);
                break;
        }
    }
}
