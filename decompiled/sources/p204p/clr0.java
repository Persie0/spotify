package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class clr0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39378a;

    /* JADX INFO: renamed from: b */
    public static final clr0 f39367b = new clr0(0);

    /* JADX INFO: renamed from: c */
    public static final clr0 f39369c = new clr0(1);

    /* JADX INFO: renamed from: d */
    public static final clr0 f39371d = new clr0(2);

    /* JADX INFO: renamed from: e */
    public static final clr0 f39372e = new clr0(3);

    /* JADX INFO: renamed from: f */
    public static final clr0 f39373f = new clr0(4);

    /* JADX INFO: renamed from: g */
    public static final clr0 f39374g = new clr0(5);

    /* JADX INFO: renamed from: h */
    public static final clr0 f39375h = new clr0(6);

    /* JADX INFO: renamed from: i */
    public static final clr0 f39376i = new clr0(7);

    /* JADX INFO: renamed from: t */
    public static final clr0 f39377t = new clr0(8);

    /* JADX INFO: renamed from: X */
    public static final clr0 f39360X = new clr0(9);

    /* JADX INFO: renamed from: Y */
    public static final clr0 f39362Y = new clr0(10);

    /* JADX INFO: renamed from: Z */
    public static final clr0 f39364Z = new clr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final clr0 f39348L0 = new clr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final clr0 f39349M0 = new clr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final clr0 f39350N0 = new clr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final clr0 f39351O0 = new clr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final clr0 f39352P0 = new clr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final clr0 f39353Q0 = new clr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final clr0 f39354R0 = new clr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final clr0 f39355S0 = new clr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final clr0 f39356T0 = new clr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final clr0 f39357U0 = new clr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final clr0 f39358V0 = new clr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final clr0 f39359W0 = new clr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final clr0 f39361X0 = new clr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final clr0 f39363Y0 = new clr0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final clr0 f39365Z0 = new clr0(26);

    /* JADX INFO: renamed from: a1 */
    public static final clr0 f39366a1 = new clr0(27);

    /* JADX INFO: renamed from: b1 */
    public static final clr0 f39368b1 = new clr0(28);

    /* JADX INFO: renamed from: c1 */
    public static final clr0 f39370c1 = new clr0(29);

    public /* synthetic */ clr0(int i) {
        this.f39378a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f39378a) {
            case 0:
                break;
            case 1:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 2:
                break;
            case 3:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, th.getMessage(), new Object[0]);
                break;
            case 8:
                Throwable th2 = (Throwable) obj;
                Logger.m3967c(th2, th2.getMessage(), new Object[0]);
                break;
            case 9:
                Logger.m3967c((Throwable) obj, "Failed to accept friend request", new Object[0]);
                break;
            case 10:
                Logger.m3967c((Throwable) obj, "Failed to send friend request", new Object[0]);
                break;
            case 11:
                Logger.m3967c((Throwable) obj, "Failed adding playlist to rootlist", new Object[0]);
                break;
            case 12:
                Logger.m3967c((Throwable) obj, "Failed creating a session", new Object[0]);
                break;
            case 13:
                Logger.m3967c((Throwable) obj, "Failed calling change list", new Object[0]);
                break;
            case 14:
                Logger.m3967c((Throwable) obj, "Failed changing a playlist", new Object[0]);
                break;
            case 15:
                Logger.m3967c((Throwable) obj, "Failed getting playlist image background", new Object[0]);
                break;
            case 16:
                Logger.m3967c((Throwable) obj, "Failed setting AI curation reference ID", new Object[0]);
                break;
            case 17:
                Logger.m3967c((Throwable) obj, "Failed setting picture background", new Object[0]);
                break;
            case 18:
                Logger.m3967c((Throwable) obj, "Failed updating chat message preferences", new Object[0]);
                break;
            case 19:
                na6.m63957e("[Puffin] Error getting connect state: " + ((Throwable) obj));
                break;
            case 20:
                na6.m63959g("[Puffin] Exception in Puffin subscription", (Throwable) obj);
                break;
            case 21:
                na6.m63972t("QueuePermissionProvider: state subscription terminated", (Throwable) obj);
                break;
            case 22:
                na6.m63972t("QueuePermissionProvider: permission observable error, retrying", (Throwable) obj);
                break;
            case 23:
                na6.m63972t("QueuePermissionProvider: capping observable error", (Throwable) obj);
                break;
            case 24:
                break;
            case 25:
                Logger.m3966b("Failed to prepare transcript", new Object[0]);
                break;
            case 26:
                Logger.m3967c((Throwable) obj, "Failed to show Play Modes upsell", new Object[0]);
                break;
            case 27:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 28:
                break;
            default:
                break;
        }
    }
}
