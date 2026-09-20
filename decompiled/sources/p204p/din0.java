package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: classes9.dex */
public final class din0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49447a;

    /* JADX INFO: renamed from: b */
    public static final din0 f49436b = new din0(0);

    /* JADX INFO: renamed from: c */
    public static final din0 f49438c = new din0(1);

    /* JADX INFO: renamed from: d */
    public static final din0 f49440d = new din0(2);

    /* JADX INFO: renamed from: e */
    public static final din0 f49441e = new din0(3);

    /* JADX INFO: renamed from: f */
    public static final din0 f49442f = new din0(4);

    /* JADX INFO: renamed from: g */
    public static final din0 f49443g = new din0(5);

    /* JADX INFO: renamed from: h */
    public static final din0 f49444h = new din0(6);

    /* JADX INFO: renamed from: i */
    public static final din0 f49445i = new din0(7);

    /* JADX INFO: renamed from: t */
    public static final din0 f49446t = new din0(8);

    /* JADX INFO: renamed from: X */
    public static final din0 f49429X = new din0(9);

    /* JADX INFO: renamed from: Y */
    public static final din0 f49431Y = new din0(10);

    /* JADX INFO: renamed from: Z */
    public static final din0 f49433Z = new din0(11);

    /* JADX INFO: renamed from: L0 */
    public static final din0 f49417L0 = new din0(12);

    /* JADX INFO: renamed from: M0 */
    public static final din0 f49418M0 = new din0(13);

    /* JADX INFO: renamed from: N0 */
    public static final din0 f49419N0 = new din0(14);

    /* JADX INFO: renamed from: O0 */
    public static final din0 f49420O0 = new din0(15);

    /* JADX INFO: renamed from: P0 */
    public static final din0 f49421P0 = new din0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final din0 f49422Q0 = new din0(17);

    /* JADX INFO: renamed from: R0 */
    public static final din0 f49423R0 = new din0(18);

    /* JADX INFO: renamed from: S0 */
    public static final din0 f49424S0 = new din0(19);

    /* JADX INFO: renamed from: T0 */
    public static final din0 f49425T0 = new din0(20);

    /* JADX INFO: renamed from: U0 */
    public static final din0 f49426U0 = new din0(21);

    /* JADX INFO: renamed from: V0 */
    public static final din0 f49427V0 = new din0(22);

    /* JADX INFO: renamed from: W0 */
    public static final din0 f49428W0 = new din0(23);

    /* JADX INFO: renamed from: X0 */
    public static final din0 f49430X0 = new din0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final din0 f49432Y0 = new din0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final din0 f49434Z0 = new din0(26);

    /* JADX INFO: renamed from: a1 */
    public static final din0 f49435a1 = new din0(27);

    /* JADX INFO: renamed from: b1 */
    public static final din0 f49437b1 = new din0(28);

    /* JADX INFO: renamed from: c1 */
    public static final din0 f49439c1 = new din0(29);

    public /* synthetic */ din0(int i) {
        this.f49447a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f49447a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                Logger.m3967c((Throwable) obj, "PersonalizedShuffleListComponent: failed to set lens.", new Object[0]);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                new PublishProcessor().onNext((tny0) obj);
                break;
            case 7:
                break;
            case 8:
                Logger.m3966b("AudioDucking", "Failed to start ducking", (Throwable) obj);
                break;
            case 9:
                break;
            case 10:
                Logger.m3966b("AudioDucking", "Failed to start ducking with rampdowntime", (Throwable) obj);
                break;
            case 11:
                break;
            case 12:
                Logger.m3966b("AudioDucking", "Failed to stop ducking", (Throwable) obj);
                break;
            case 13:
                break;
            case 14:
                Logger.m3966b("AudioDucking", "Failed to stop ducking with rampuptime", (Throwable) obj);
                break;
            case 15:
                Logger.m3973i("Stall timer failed", new Object[0]);
                break;
            case 16:
                Logger.m3967c((Throwable) obj, "Couldn't get current track uri.", new Object[0]);
                break;
            case 17:
                Logger.m3967c((Throwable) obj, "Failed to change list with custom resolver", new Object[0]);
                break;
            case 18:
                Logger.m3967c((Throwable) obj, "Failed to change list", new Object[0]);
                break;
            case 19:
                Logger.m3967c((Throwable) obj, "Failed to update list items with custom resolver", new Object[0]);
                break;
            case 20:
                Logger.m3967c((Throwable) obj, "Unable to subscribe to playlist", new Object[0]);
                break;
            case 21:
                Logger.m3967c((Throwable) obj, "Failed to subscribe to preview player state", new Object[0]);
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                Logger.m3967c((Throwable) obj, "Error while fetching Playlist metadata", new Object[0]);
                break;
            case 25:
                Logger.m3967c((Throwable) obj, "Error while fetching Playlist metadata", new Object[0]);
                break;
            case 26:
                break;
            case 27:
                Logger.m3967c((Throwable) obj, "Failed to show SmartShuffle upsell", new Object[0]);
                break;
            case 28:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                break;
            default:
                break;
        }
    }
}
