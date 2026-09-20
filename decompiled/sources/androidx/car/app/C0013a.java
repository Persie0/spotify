package androidx.car.app;

import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0013a implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0023j f403b;

    public /* synthetic */ C0013a(C0023j c0023j, int i) {
        this.f402a = i;
        this.f403b = c0023j;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f402a) {
            case 0:
                return AppManager$1.lambda$onBackPressed$0(this.f403b);
            case 1:
                return AppManager$1.lambda$stopLocationUpdates$2(this.f403b);
            default:
                return AppManager$1.lambda$startLocationUpdates$1(this.f403b);
        }
    }
}
