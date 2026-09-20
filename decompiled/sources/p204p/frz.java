package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class frz implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72714a;

    /* JADX INFO: renamed from: b */
    public static final frz f72703b = new frz(0);

    /* JADX INFO: renamed from: c */
    public static final frz f72705c = new frz(1);

    /* JADX INFO: renamed from: d */
    public static final frz f72707d = new frz(2);

    /* JADX INFO: renamed from: e */
    public static final frz f72708e = new frz(3);

    /* JADX INFO: renamed from: f */
    public static final frz f72709f = new frz(4);

    /* JADX INFO: renamed from: g */
    public static final frz f72710g = new frz(5);

    /* JADX INFO: renamed from: h */
    public static final frz f72711h = new frz(6);

    /* JADX INFO: renamed from: i */
    public static final frz f72712i = new frz(7);

    /* JADX INFO: renamed from: t */
    public static final frz f72713t = new frz(8);

    /* JADX INFO: renamed from: X */
    public static final frz f72696X = new frz(9);

    /* JADX INFO: renamed from: Y */
    public static final frz f72698Y = new frz(10);

    /* JADX INFO: renamed from: Z */
    public static final frz f72700Z = new frz(11);

    /* JADX INFO: renamed from: L0 */
    public static final frz f72684L0 = new frz(12);

    /* JADX INFO: renamed from: M0 */
    public static final frz f72685M0 = new frz(13);

    /* JADX INFO: renamed from: N0 */
    public static final frz f72686N0 = new frz(14);

    /* JADX INFO: renamed from: O0 */
    public static final frz f72687O0 = new frz(15);

    /* JADX INFO: renamed from: P0 */
    public static final frz f72688P0 = new frz(16);

    /* JADX INFO: renamed from: Q0 */
    public static final frz f72689Q0 = new frz(17);

    /* JADX INFO: renamed from: R0 */
    public static final frz f72690R0 = new frz(18);

    /* JADX INFO: renamed from: S0 */
    public static final frz f72691S0 = new frz(19);

    /* JADX INFO: renamed from: T0 */
    public static final frz f72692T0 = new frz(20);

    /* JADX INFO: renamed from: U0 */
    public static final frz f72693U0 = new frz(21);

    /* JADX INFO: renamed from: V0 */
    public static final frz f72694V0 = new frz(22);

    /* JADX INFO: renamed from: W0 */
    public static final frz f72695W0 = new frz(23);

    /* JADX INFO: renamed from: X0 */
    public static final frz f72697X0 = new frz(24);

    /* JADX INFO: renamed from: Y0 */
    public static final frz f72699Y0 = new frz(25);

    /* JADX INFO: renamed from: Z0 */
    public static final frz f72701Z0 = new frz(26);

    /* JADX INFO: renamed from: a1 */
    public static final frz f72702a1 = new frz(27);

    /* JADX INFO: renamed from: b1 */
    public static final frz f72704b1 = new frz(28);

    /* JADX INFO: renamed from: c1 */
    public static final frz f72706c1 = new frz(29);

    public /* synthetic */ frz(int i) {
        this.f72714a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f72714a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Logger.m3967c((Throwable) obj, "Failed to get followed state using FollowEndpoint", new Object[0]);
                break;
            case 6:
                Logger.m3966b("Error subscribing to page identifier.", new Object[0]);
                break;
            case 7:
                Logger.m3967c((Throwable) obj, "FreeEmployeeDayActivityPlugin: failed to check the conditions and/or send in-app message trigger", new Object[0]);
                break;
            case 8:
                Logger.m3967c((Throwable) obj, "Product state monitoring has failed", new Object[0]);
                break;
            case 9:
                Logger.m3967c((Throwable) obj, "FullScreenQRCodeView: QR Code could not be generated", new Object[0]);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, th.getMessage(), new Object[0]);
                break;
            case 13:
                Logger.m3965a("[LiveSharing] Terminating live-sharing session.", new Object[0]);
                break;
            case 14:
                Logger.m3966b("[Puffin] Core returned error: " + ((Notification) obj), new Object[0]);
                break;
            case 15:
                Logger.m3967c((Throwable) obj, "Failed to get username", new Object[0]);
                break;
            case 16:
                Logger.m3967c((Throwable) obj, "Failed to observe player state for internal reports", new Object[0]);
                break;
            case 17:
                na6.m63957e(((Throwable) obj).toString());
                break;
            case 18:
                Logger.m3966b("Failed to prepare transcript", new Object[0]);
                break;
            case 19:
                ((MessageResponse) obj).toString();
                break;
            case 20:
                Logger.m3966b("Failed to save language selection", new Object[0]);
                break;
            case 21:
                break;
            case 22:
                Throwable th2 = (Throwable) obj;
                Logger.m3967c(th2, th2.getMessage(), new Object[0]);
                break;
            case 23:
                Logger.m3966b("EIS: Error in list entity observable", (Throwable) obj);
                break;
            case 24:
                ((qu80) obj).f192598d.size();
                break;
            case 25:
                Logger.m3966b("EIS: Couldn't load list, error: %s", ((Throwable) obj).getMessage());
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
