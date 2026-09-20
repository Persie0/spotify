package p204p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class z31 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f278738b;

    public /* synthetic */ z31(Intent intent, int i) {
        this.f278737a = i;
        this.f278738b = intent;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f278737a) {
            case 0:
                return this.f278738b;
            default:
                na6.m63959g("Error obtaining Euterpe state for " + this.f278738b.getDataString(), (Throwable) obj);
                return p1j0.f173119a;
        }
    }
}
