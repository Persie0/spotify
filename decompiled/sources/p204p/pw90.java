package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class pw90 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181972a;

    /* JADX INFO: renamed from: b */
    public static final pw90 f181961b = new pw90(0);

    /* JADX INFO: renamed from: c */
    public static final pw90 f181963c = new pw90(1);

    /* JADX INFO: renamed from: d */
    public static final pw90 f181965d = new pw90(2);

    /* JADX INFO: renamed from: e */
    public static final pw90 f181966e = new pw90(3);

    /* JADX INFO: renamed from: f */
    public static final pw90 f181967f = new pw90(4);

    /* JADX INFO: renamed from: g */
    public static final pw90 f181968g = new pw90(5);

    /* JADX INFO: renamed from: h */
    public static final pw90 f181969h = new pw90(6);

    /* JADX INFO: renamed from: i */
    public static final pw90 f181970i = new pw90(7);

    /* JADX INFO: renamed from: t */
    public static final pw90 f181971t = new pw90(8);

    /* JADX INFO: renamed from: X */
    public static final pw90 f181954X = new pw90(9);

    /* JADX INFO: renamed from: Y */
    public static final pw90 f181956Y = new pw90(10);

    /* JADX INFO: renamed from: Z */
    public static final pw90 f181958Z = new pw90(11);

    /* JADX INFO: renamed from: L0 */
    public static final pw90 f181942L0 = new pw90(12);

    /* JADX INFO: renamed from: M0 */
    public static final pw90 f181943M0 = new pw90(13);

    /* JADX INFO: renamed from: N0 */
    public static final pw90 f181944N0 = new pw90(14);

    /* JADX INFO: renamed from: O0 */
    public static final pw90 f181945O0 = new pw90(15);

    /* JADX INFO: renamed from: P0 */
    public static final pw90 f181946P0 = new pw90(16);

    /* JADX INFO: renamed from: Q0 */
    public static final pw90 f181947Q0 = new pw90(17);

    /* JADX INFO: renamed from: R0 */
    public static final pw90 f181948R0 = new pw90(18);

    /* JADX INFO: renamed from: S0 */
    public static final pw90 f181949S0 = new pw90(19);

    /* JADX INFO: renamed from: T0 */
    public static final pw90 f181950T0 = new pw90(20);

    /* JADX INFO: renamed from: U0 */
    public static final pw90 f181951U0 = new pw90(21);

    /* JADX INFO: renamed from: V0 */
    public static final pw90 f181952V0 = new pw90(22);

    /* JADX INFO: renamed from: W0 */
    public static final pw90 f181953W0 = new pw90(23);

    /* JADX INFO: renamed from: X0 */
    public static final pw90 f181955X0 = new pw90(24);

    /* JADX INFO: renamed from: Y0 */
    public static final pw90 f181957Y0 = new pw90(25);

    /* JADX INFO: renamed from: Z0 */
    public static final pw90 f181959Z0 = new pw90(26);

    /* JADX INFO: renamed from: a1 */
    public static final pw90 f181960a1 = new pw90(27);

    /* JADX INFO: renamed from: b1 */
    public static final pw90 f181962b1 = new pw90(28);

    /* JADX INFO: renamed from: c1 */
    public static final pw90 f181964c1 = new pw90(29);

    public /* synthetic */ pw90(int i) {
        this.f181972a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f181972a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                tnb0 tnb0Var = (tnb0) obj;
                tnb0Var.f221930b.invoke(tnb0Var.f221929a);
                break;
            case 5:
                na6.m63957e("[Puffin] Error applying filters: " + ((Throwable) obj));
                break;
            case 6:
                Logger.m3967c((Throwable) obj, "[Puffin] Error downloading filters", new Object[0]);
                break;
            case 7:
                Logger.m3966b("Collection platform failed to return a value for the entity", new Object[0]);
                break;
            case 8:
                Logger.m3967c((Throwable) obj, "Error while observing errors.", new Object[0]);
                break;
            case 9:
                Logger.m3967c((Throwable) obj, "Error during restriction media action observe.", new Object[0]);
                break;
            case 10:
                break;
            case 11:
                Logger.m3967c((Throwable) obj, "Error prefetching info", new Object[0]);
                break;
            case 12:
                Throwable th = (Throwable) obj;
                Logger.m3966b(edb.m38564m("NotificationPreferenceEnableActionImpl: Error enabling all notifications: ", th.getMessage()), th);
                break;
            case 13:
                Logger.m3970f((Throwable) obj, "Could not enter PiP", new Object[0]);
                break;
            case 14:
                Logger.m3967c((Throwable) obj, "Err loading NowPlayingFragment", new Object[0]);
                break;
            case 15:
                ((ta0) obj).toString();
                break;
            case 16:
                na6.m63957e("[Puffin] Error getting Puffin State: " + ((Throwable) obj));
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                Logger.m3967c((Throwable) obj, "Error in subscription to Product State", new Object[0]);
                break;
            case 21:
                break;
            case 22:
                Logger.m3967c((Throwable) obj, "Go: Failed to play TTS", new Object[0]);
                break;
            case 23:
                Logger.m3966b("Couldn't load user face", new Object[0]);
                break;
            case 24:
                na6.m63971s("[Puffin] Error removing optimization: " + ((Throwable) obj));
                break;
            case 25:
                Logger.m3967c((Throwable) obj, "Party session observation failed", new Object[0]);
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
    }
}
