package p204p;

import android.app.ApplicationExitInfo;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.spotify.mobius.MobiusHooks;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zfs implements rwf, egy, MobiusHooks.ErrorHandler, njq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282396a;

    public /* synthetic */ zfs(int i) {
        this.f282396a = i;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m96037d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    @Override // com.spotify.mobius.MobiusHooks.ErrorHandler
    /* JADX INFO: renamed from: a */
    public void mo15599a(RuntimeException runtimeException) {
        MobiusHooks.f5581a.mo27136g(runtimeException, "Uncaught error");
    }

    @Override // p204p.njq
    /* JADX INFO: renamed from: e */
    public void mo40111e(j4t0 j4t0Var) {
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        switch (this.f282396a) {
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2390a.get();
            case 5:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2392c.get();
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2391b.get();
            case 7:
                gr70 gr70Var = ExecutorsRegistrar.f2390a;
                return nx91.f159417a;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(sef0Var);
            case 18:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sef0Var);
            case 19:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(sef0Var);
            case 20:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(sef0Var);
            case 21:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(sef0Var);
            case 22:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(sef0Var);
            case 23:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(sef0Var);
            case 24:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(sef0Var);
        }
    }

    @Override // p204p.egy
    /* JADX INFO: renamed from: i */
    public void mo25404i(boolean z) {
        switch (this.f282396a) {
            case 9:
                if (z) {
                    gxf1.m46084n();
                }
                break;
            case 10:
                if (z) {
                    s95.m77563m();
                }
                break;
            case 11:
                if (z) {
                    p8y.f175093n = true;
                }
                break;
            case 12:
                if (z) {
                    p8y.f175094o = true;
                }
                break;
            default:
                if (z) {
                    p8y.f175095p = true;
                }
                break;
        }
    }
}
