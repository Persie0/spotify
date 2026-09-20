package p204p;

import com.spotify.interapp.service.service.AppProtocolRemoteService;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ad5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppProtocolRemoteService f14523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b6q f14524c;

    public /* synthetic */ ad5(AppProtocolRemoteService appProtocolRemoteService, b6q b6qVar, int i) {
        this.f14522a = i;
        this.f14523b = appProtocolRemoteService;
        this.f14524c = b6qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14522a) {
            case 0:
                AppProtocolRemoteService appProtocolRemoteService = this.f14523b;
                b6q b6qVar = this.f14524c;
                int i = AppProtocolRemoteService.f4610c1;
                if (b6qVar.f24016l != 2) {
                    b6qVar.m28303b("wamp.error.system_shutdown");
                    m401 m401Var = b6qVar.f24011g;
                    m401Var.getClass();
                    int i2 = b6qVar.f24009e;
                    ConcurrentHashMap concurrentHashMap = m401Var.f139788a;
                    concurrentHashMap.remove(Integer.valueOf(i2));
                    m401Var.f139789b.onNext(new ArrayList(concurrentHashMap.values()));
                }
                appProtocolRemoteService.f4630a1.remove(b6qVar);
                break;
            case 1:
                AppProtocolRemoteService appProtocolRemoteService2 = this.f14523b;
                appProtocolRemoteService2.f4630a1.remove(this.f14524c);
                break;
            default:
                AppProtocolRemoteService appProtocolRemoteService3 = this.f14523b;
                appProtocolRemoteService3.f4630a1.remove(this.f14524c);
                break;
        }
    }
}
