package p204p;

import android.app.Activity;
import com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver;
import com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class xen implements v94, nr90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260745a;

    /* JADX INFO: renamed from: b */
    public final son f260746b;

    public /* synthetic */ xen(son sonVar, int i) {
        this.f260745a = i;
        this.f260746b = sonVar;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        switch (this.f260745a) {
            case 1:
                ((DynamicUpsellLoggerService) obj).f6505a = (ie41) this.f260746b.f211729T2.get();
                break;
            case 5:
                a3o0 a3o0Var = (a3o0) obj;
                son sonVar = this.f260746b;
                a3o0Var.f12009Q1 = new mab0((jyx0) sonVar.f212294ni.get(), 15);
                a3o0Var.f12010R1 = (Scheduler) sonVar.f212489v1.get();
                break;
            case 6:
                ((ctw0) obj).f41993Q1 = (jyx0) this.f260746b.f212294ni.get();
                break;
            default:
                ((WazeWakeUpReceiver) obj).f3278b = this.f260746b.m78785j2();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public hr70 m90441a(Activity activity) {
        activity.getClass();
        return new bdn(this.f260746b, activity);
    }

    @Override // p204p.nr90
    /* JADX INFO: renamed from: c */
    public or90 mo65470c(mbk0 mbk0Var) {
        mbk0Var.getClass();
        return new nfn(this.f260746b);
    }

    public /* synthetic */ xen(son sonVar, v94 v94Var, int i) {
        this.f260745a = i;
        this.f260746b = sonVar;
    }
}
