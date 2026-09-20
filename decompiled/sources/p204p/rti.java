package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class rti implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tti f202600b;

    public /* synthetic */ rti(tti ttiVar, int i) {
        this.f202599a = i;
        this.f202600b = ttiVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f202599a) {
            case 0:
                Logger.m3966b("DevicePredictability: Error in whereToPlayFlow subscription", (Throwable) obj);
                this.f202600b.f223601M0.onNext(csd1.f41525a);
                break;
            default:
                pqm0 pqm0Var = (pqm0) obj;
                Boolean bool = (Boolean) pqm0Var.f180350a;
                boolean zBooleanValue = bool.booleanValue();
                cj11 cj11Var = (cj11) pqm0Var.f180351b;
                boolean z = cj11Var instanceof aj11;
                tti ttiVar = this.f202600b;
                if (z || zBooleanValue) {
                    ttiVar.f223608T0 = null;
                }
                ttiVar.f223604P0.onNext(bool);
                ttiVar.f223605Q0.onNext(cj11Var);
                break;
        }
    }
}
