package p204p;

import android.content.Intent;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes2.dex */
public final class vu10 implements evb0 {

    /* JADX INFO: renamed from: a */
    public final Observer f244811a;

    public vu10(Observer observer) {
        this.f244811a = observer;
    }

    @Override // p204p.evb0
    /* JADX INFO: renamed from: a */
    public final void mo37838a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString == null || dataString.equals("null") || wl51.m88496t0(dataString, "graduation", false)) {
            return;
        }
        this.f244811a.onNext(su10.f213974a);
    }
}
