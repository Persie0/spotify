package p204p;

import com.spotify.base.java.logging.Logger;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes4.dex */
public final class g12 extends AbstractC2561x6 implements muk {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f75513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g12(iuk iukVar, int i) {
        super(iukVar);
        this.f75513b = i;
    }

    @Override // p204p.muk
    /* JADX INFO: renamed from: p */
    public final void mo34898p(Throwable th, juk jukVar) throws Throwable {
        switch (this.f75513b) {
            case 0:
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                na6.m63959g(message, th);
                return;
            case 1:
                Logger.m3967c(th, "Failed to log out device after PIN gate approval", new Object[0]);
                return;
            case 2:
                Logger.m3967c(th, "DefaultSaveLocationSavingLauncher coroutine failed", new Object[0]);
                return;
            case 3:
                Logger.m3967c(th, "Error in EngageContinuationClusterDaemon.", new Object[0]);
                return;
            case 4:
                Logger.m3967c(th, "Error in EngageRecommendationsClusterDaemon.", new Object[0]);
                return;
            case 5:
                Logger.m3967c(th, "Error in EngageSignInRequestDaemon.", new Object[0]);
                return;
            case 6:
                na6.m63957e(th.getMessage());
                return;
            case 7:
                return;
            case 8:
                Logger.m3967c(th, "A coroutine threw an exception on IdleManagerScope: " + jukVar, new Object[0]);
                return;
            case 9:
                Logger.m3967c(th, "A coroutine threw an exception on AuditScope: " + jukVar, new Object[0]);
                return;
            case 10:
                na6.m63972t("Reachability collection failed; keeping the last cached verdict", th);
                return;
            case 11:
                na6.m63959g("[Lossless] Exception in LosslessRemoteDeviceMessageBoxPlugin", th);
                return;
            case 12:
                na6.m63972t("Error selecting media service.", th);
                return;
            case 13:
                na6.m63959g("[Puffin] Exception in PuffinDaemon", th);
                return;
            case 14:
                na6.m63972t("Reachability collection failed; keeping the last cached verdict", th);
                return;
            case 15:
                if (!(th instanceof ClosedSendChannelException)) {
                    throw th;
                }
                return;
            case 16:
                Logger.m3967c(th, "TransitionOperationLauncher coroutine failed", new Object[0]);
                return;
            default:
                Logger.m3967c(th, "Video manifest prefetch stopped unexpectedly", new Object[0]);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g12(int i) {
        super(efy.f59152X0);
        this.f75513b = i;
        switch (i) {
            case 3:
                super(efy.f59152X0);
                break;
            case 4:
            case 5:
            case 10:
            case 11:
            default:
                break;
            case 6:
                super(efy.f59152X0);
                break;
            case 7:
                super(efy.f59152X0);
                break;
            case 8:
                super(efy.f59152X0);
                break;
            case 9:
                super(efy.f59152X0);
                break;
            case 12:
                super(efy.f59152X0);
                break;
            case 13:
                super(efy.f59152X0);
                break;
            case 14:
                super(efy.f59152X0);
                break;
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m43316r(Throwable th, juk jukVar) {
    }
}
