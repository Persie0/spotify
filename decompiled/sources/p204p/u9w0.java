package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u9w0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228304a;

    /* JADX INFO: renamed from: b */
    public static final u9w0 f228295b = new u9w0(0);

    /* JADX INFO: renamed from: c */
    public static final u9w0 f228296c = new u9w0(1);

    /* JADX INFO: renamed from: d */
    public static final u9w0 f228297d = new u9w0(2);

    /* JADX INFO: renamed from: e */
    public static final u9w0 f228298e = new u9w0(3);

    /* JADX INFO: renamed from: f */
    public static final u9w0 f228299f = new u9w0(4);

    /* JADX INFO: renamed from: g */
    public static final u9w0 f228300g = new u9w0(5);

    /* JADX INFO: renamed from: h */
    public static final u9w0 f228301h = new u9w0(6);

    /* JADX INFO: renamed from: i */
    public static final u9w0 f228302i = new u9w0(7);

    /* JADX INFO: renamed from: t */
    public static final u9w0 f228303t = new u9w0(8);

    /* JADX INFO: renamed from: X */
    public static final u9w0 f228292X = new u9w0(9);

    /* JADX INFO: renamed from: Y */
    public static final u9w0 f228293Y = new u9w0(10);

    /* JADX INFO: renamed from: Z */
    public static final u9w0 f228294Z = new u9w0(11);

    /* JADX INFO: renamed from: L0 */
    public static final u9w0 f228288L0 = new u9w0(12);

    /* JADX INFO: renamed from: M0 */
    public static final u9w0 f228289M0 = new u9w0(13);

    /* JADX INFO: renamed from: N0 */
    public static final u9w0 f228290N0 = new u9w0(14);

    /* JADX INFO: renamed from: O0 */
    public static final u9w0 f228291O0 = new u9w0(15);

    public /* synthetic */ u9w0(int i) {
        this.f228304a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f228304a) {
            case 0:
                Logger.m3969e("RC Properties and product state FetchResult=".concat(((qsy) obj).mo62782a()), new Object[0]);
                return;
            case 1:
                Logger.m3966b(ei6.m39073j("Received error from LoginUpdates API: ", (Throwable) obj), new Object[0]);
                return;
            case 2:
                Logger.m3969e("Fetching Unauthenticated RC properties", new Object[0]);
                return;
            case 3:
                Logger.m3966b(edb.m38564m("Resolver Async fetch attempt failed ", ((Throwable) obj).getMessage()), new Object[0]);
                return;
            case 4:
                return;
            case 5:
                Logger.m3967c((Throwable) obj, "social listening impl: Failed observing current user from session state.", new Object[0]);
                return;
            case 6:
                return;
            case 7:
                Logger.m3967c((Throwable) obj, "Failed to broadcast remote intent.", new Object[0]);
                return;
            case 8:
                Logger.m3967c((Throwable) obj, "Couldn't set Spotify cookies", new Object[0]);
                return;
            case 9:
                Logger.m3967c((Throwable) obj, "NavLoggerPageHeartBeat failed.", new Object[0]);
                return;
            case 10:
                Logger.m3967c((Throwable) obj, "Got error observing session updates.", new Object[0]);
                return;
            case 11:
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H("RCS");
                utu0Var.m83953v("Failure when fetching unauth properties", (Throwable) obj);
                return;
            case 12:
                gh00 gh00VarM63753a = ((vwc1) obj).f245457a.m63753a();
                if (gh00VarM63753a != null) {
                    gh00VarM63753a.invoke(Boolean.TRUE);
                    return;
                }
                return;
            case 13:
                ((vab) obj).getClass();
                return;
            case 14:
                Logger.m3967c((Throwable) obj, "Could not obtain access token", new Object[0]);
                return;
            case 15:
                Logger.m3966b(edb.m38564m("YourUpdatesLoggedInLifecyclePluginImpl: Refreshing Your Updates BadgingState terminated: ", ((Throwable) obj).getMessage()), new Object[0]);
                return;
            case 16:
                return;
            case 17:
                Logger.m3966b("Failed to render Marquee ad, error: %s", ((jqc0) obj).f114879b);
                return;
            case 18:
                qoh0 qoh0Var = (qoh0) obj;
                qoh0Var.f190985f.onNext(qoh0Var.f190984e);
                return;
            default:
                if (((qxr0) obj).m74147g() == 4) {
                    throw new RuntimeException() { // from class: com.spotify.profile.profilelist.ProfileListPage$FailLoadingProfileListException
                    };
                }
                return;
        }
    }

    public /* synthetic */ u9w0(Object obj, int i) {
        this.f228304a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m82653a(Object obj) {
    }
}
