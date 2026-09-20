package androidx.car.app.dialer;

import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.dialer.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0017a implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub f416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f417c;

    public /* synthetic */ C0017a(TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub telephoneKeypadCallbackStub, int i, int i2) {
        this.f415a = i2;
        this.f416b = telephoneKeypadCallbackStub;
        this.f417c = i;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f415a) {
            case 0:
                return this.f416b.lambda$onKeyLongPress$0(this.f417c);
            case 1:
                return this.f416b.lambda$onKeyDown$1(this.f417c);
            default:
                return this.f416b.lambda$onKeyUp$2(this.f417c);
        }
    }
}
