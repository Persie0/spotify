package androidx.car.app;

import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0016d implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarAppBinder f414b;

    public /* synthetic */ C0016d(CarAppBinder carAppBinder, int i) {
        this.f413a = i;
        this.f414b = carAppBinder;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f413a) {
            case 0:
                return this.f414b.lambda$onAppPause$3();
            case 1:
                return this.f414b.lambda$onAppStart$1();
            case 2:
                return this.f414b.lambda$onAppStop$4();
            default:
                return this.f414b.lambda$onAppResume$2();
        }
    }
}
