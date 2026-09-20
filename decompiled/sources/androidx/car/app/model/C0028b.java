package androidx.car.app.model;

import android.os.Binder;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.model.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0028b implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Binder f450c;

    public /* synthetic */ C0028b(Binder binder, int i, int i2) {
        this.f448a = i2;
        this.f450c = binder;
        this.f449b = i;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f448a) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) this.f450c).lambda$onAlertCancelled$0(this.f449b);
            default:
                return ((OnSelectedDelegateImpl.OnSelectedListenerStub) this.f450c).lambda$onSelected$0(this.f449b);
        }
    }
}
