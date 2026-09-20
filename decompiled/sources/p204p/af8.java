package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class af8 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15088a;

    /* JADX INFO: renamed from: b */
    public static final af8 f15077b = new af8(0);

    /* JADX INFO: renamed from: c */
    public static final af8 f15079c = new af8(1);

    /* JADX INFO: renamed from: d */
    public static final af8 f15081d = new af8(2);

    /* JADX INFO: renamed from: e */
    public static final af8 f15082e = new af8(3);

    /* JADX INFO: renamed from: f */
    public static final af8 f15083f = new af8(4);

    /* JADX INFO: renamed from: g */
    public static final af8 f15084g = new af8(5);

    /* JADX INFO: renamed from: h */
    public static final af8 f15085h = new af8(6);

    /* JADX INFO: renamed from: i */
    public static final af8 f15086i = new af8(7);

    /* JADX INFO: renamed from: t */
    public static final af8 f15087t = new af8(8);

    /* JADX INFO: renamed from: X */
    public static final af8 f15070X = new af8(9);

    /* JADX INFO: renamed from: Y */
    public static final af8 f15072Y = new af8(10);

    /* JADX INFO: renamed from: Z */
    public static final af8 f15074Z = new af8(11);

    /* JADX INFO: renamed from: L0 */
    public static final af8 f15058L0 = new af8(12);

    /* JADX INFO: renamed from: M0 */
    public static final af8 f15059M0 = new af8(13);

    /* JADX INFO: renamed from: N0 */
    public static final af8 f15060N0 = new af8(14);

    /* JADX INFO: renamed from: O0 */
    public static final af8 f15061O0 = new af8(15);

    /* JADX INFO: renamed from: P0 */
    public static final af8 f15062P0 = new af8(16);

    /* JADX INFO: renamed from: Q0 */
    public static final af8 f15063Q0 = new af8(17);

    /* JADX INFO: renamed from: R0 */
    public static final af8 f15064R0 = new af8(18);

    /* JADX INFO: renamed from: S0 */
    public static final af8 f15065S0 = new af8(19);

    /* JADX INFO: renamed from: T0 */
    public static final af8 f15066T0 = new af8(20);

    /* JADX INFO: renamed from: U0 */
    public static final af8 f15067U0 = new af8(21);

    /* JADX INFO: renamed from: V0 */
    public static final af8 f15068V0 = new af8(22);

    /* JADX INFO: renamed from: W0 */
    public static final af8 f15069W0 = new af8(23);

    /* JADX INFO: renamed from: X0 */
    public static final af8 f15071X0 = new af8(24);

    /* JADX INFO: renamed from: Y0 */
    public static final af8 f15073Y0 = new af8(25);

    /* JADX INFO: renamed from: Z0 */
    public static final af8 f15075Z0 = new af8(26);

    /* JADX INFO: renamed from: a1 */
    public static final af8 f15076a1 = new af8(27);

    /* JADX INFO: renamed from: b1 */
    public static final af8 f15078b1 = new af8(28);

    /* JADX INFO: renamed from: c1 */
    public static final af8 f15080c1 = new af8(29);

    public /* synthetic */ af8(int i) {
        this.f15088a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f15088a) {
            case 0:
                return;
            case 1:
                Logger.m3974j((Throwable) obj, "Error reprocessing media", new Object[0]);
                return;
            case 2:
                Logger.m3967c((Throwable) obj, "Error when trying to rename Blend", new Object[0]);
                return;
            case 3:
                return;
            case 4:
                Logger.m3967c((Throwable) obj, "BulkRedownloadCancelReceiver: cancel failed", new Object[0]);
                return;
            case 5:
                ((Throwable) obj).getMessage();
                return;
            case 6:
                Logger.m3967c((Throwable) obj, "Failed to log Canvas state", new Object[0]);
                return;
            case 7:
                Logger.m3965a("[AA-RESUME] connect-sync emitted within 1s", new Object[0]);
                return;
            case 8:
                Logger.m3967c((Throwable) obj, "Failed to add cards based on item", new Object[0]);
                return;
            case 9:
                Logger.m3973i("NotificationCategories", "Language selection load failed", (Throwable) obj);
                return;
            case 10:
                Logger.m3973i("NotificationCategories", "Categories reload failed", (Throwable) obj);
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                Logger.m3967c((Throwable) obj, "CollectionArtistEffectHandlersImpl: Shuffle state updating has failed", new Object[0]);
                return;
            case 14:
                Logger.m3974j((Throwable) obj, "Unexpected logging failure.", new Object[0]);
                return;
            case 15:
                Logger.m3967c((Throwable) obj, "Send dislike to feedback service failed", new Object[0]);
                return;
            case 16:
                Logger.m3967c((Throwable) obj, "Send remove dislike to feedback service failed", new Object[0]);
                return;
            case 17:
                Logger.m3967c((Throwable) obj, "Error fetching partner-id after %d retries", 3);
                return;
            case 18:
                Logger.m3967c((Throwable) obj, "Error updating chat message preferences", new Object[0]);
                return;
            case 19:
                Logger.m3967c((Throwable) obj, "Error on warmUp Chrome tabs", new Object[0]);
                return;
            case 20:
                Logger.m3967c((Throwable) obj, "failed to process android status", new Object[0]);
                return;
            case 21:
                CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse = (CollectionPlatformEsperantoItemsResponse) obj;
                if (collectionPlatformEsperantoItemsResponse.m6875n().m6895o() != 200) {
                    throw new IllegalStateException(collectionPlatformEsperantoItemsResponse.m6875n().m6896q().toString());
                }
                return;
            case 22:
                Logger.m3966b(((Throwable) obj).getMessage(), new Object[0]);
                return;
            case 23:
                eyl0 eyl0Var = (eyl0) obj;
                byl0 byl0Var = eyl0Var instanceof byl0 ? (byl0) eyl0Var : null;
                if (byl0Var != null) {
                    Logger.m3967c(byl0Var.f32271a, "Recoverable exception converted to Failure", new Object[0]);
                    return;
                }
                return;
            case 24:
                na6.m63972t("Unrecoverable error in DefaultOutcomeInterceptor", (Throwable) obj);
                return;
            case 25:
                ((xul0) obj).getClass();
                return;
            case 26:
                ((api) obj).getClass();
                return;
            case 27:
                na6.m63972t("Can not launch speed control fragment", (Throwable) obj);
                return;
            case 28:
                na6.m63971s("SpeedControl could not load playback speed preferences");
                return;
            default:
                pqm0 pqm0Var = (pqm0) obj;
                gaq gaqVar = (gaq) pqm0Var.f180350a;
                xul0 xul0Var = (xul0) pqm0Var.f180351b;
                if (xul0Var.mo49279c()) {
                    gaqVar.mo44180a((ContextTrack) xul0Var.mo49278b());
                    return;
                }
                return;
        }
    }
}
