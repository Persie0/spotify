package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ntb implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f158041a;

    public /* synthetic */ ntb(int i) {
        this.f158041a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m65612a(Object obj) {
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f158041a) {
            case 0:
                na6.m63959g("Cannot receive value from RxFlags", (Throwable) obj);
                break;
            case 1:
                break;
            case 2:
                Logger.m3967c((Throwable) obj, "Couldn't subscribe to NavigationContext", new Object[0]);
                break;
            case 3:
                Logger.m3967c((Throwable) obj, "Couldn't subscribe to player and radio state", new Object[0]);
                break;
            case 4:
                Logger.m3967c((Throwable) obj, "Error subscribing to user data", new Object[0]);
                break;
            case 5:
                break;
            case 6:
                Logger.m3967c((Throwable) obj, "Failed to add track to queue", new Object[0]);
                break;
            case 7:
                Logger.m3967c((Throwable) obj, "Failed to observe on product observer", new Object[0]);
                break;
            case 8:
                Logger.m3966b("EIS: Couldn't load list, error: %s", ((Throwable) obj).getMessage());
                break;
            case 9:
                Logger.m3966b("EIS: Couldn't load list, error: %s", ((Throwable) obj).getMessage());
                break;
            case 10:
                Logger.m3967c((Throwable) obj, "Failed to retrieve view model", new Object[0]);
                break;
            case 11:
                int i = a3o0.f12008U1;
                break;
            case 12:
                break;
            case 13:
                Logger.m3967c((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 14:
                Logger.m3967c((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 15:
                break;
            case 16:
                ((Throwable) obj).getMessage();
                break;
            case 17:
                Logger.m3973i(edb.m38564m("Fetching FCM token failed with error ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
            case 18:
                ((Throwable) obj).getMessage();
                break;
            case 19:
                ((Throwable) obj).getMessage();
                break;
            case 20:
                Throwable th = (Throwable) obj;
                th.getCause();
                th.getMessage();
                break;
            case 21:
                Logger.m3967c((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 22:
                Logger.m3967c((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 23:
                Logger.m3967c((Throwable) obj, "Couldn't subscribe to RxSessionSatate", new Object[0]);
                break;
            case 24:
                Logger.m3967c((Throwable) obj, "Failed to get auth response", new Object[0]);
                break;
            default:
                Logger.m3967c((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
        }
    }
}
