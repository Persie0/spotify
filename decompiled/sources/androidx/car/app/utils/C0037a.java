package androidx.car.app.utils;

import p204p.pra;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.utils.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0037a implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pra f472c;

    public /* synthetic */ C0037a(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, pra praVar, int i) {
        this.f470a = i;
        this.f471b = remoteUtils$SurfaceCallbackStub;
        this.f472c = praVar;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f470a) {
            case 0:
                return this.f471b.lambda$onSurfaceDestroyed$3(this.f472c);
            default:
                return this.f471b.lambda$onSurfaceAvailable$0(this.f472c);
        }
    }
}
