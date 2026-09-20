package androidx.car.app.model;

import android.os.Binder;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.model.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0027a implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Binder f447b;

    public /* synthetic */ C0027a(Binder binder, int i) {
        this.f446a = i;
        this.f447b = binder;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f446a) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) this.f447b).lambda$onAlertDismissed$1();
            case 1:
                return ((OnClickDelegateImpl.OnClickListenerStub) this.f447b).lambda$onClick$0();
            default:
                return ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) this.f447b).lambda$onContentRefreshRequested$0();
        }
    }
}
