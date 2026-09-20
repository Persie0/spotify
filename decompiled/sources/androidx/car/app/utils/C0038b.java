package androidx.car.app.utils;

import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.utils.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0038b implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f475c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f476d;

    public /* synthetic */ C0038b(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, int i) {
        this.f473a = i;
        this.f474b = remoteUtils$SurfaceCallbackStub;
        this.f475c = f;
        this.f476d = f2;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f473a) {
            case 0:
                return this.f474b.lambda$onClick$7(this.f475c, this.f476d);
            case 1:
                return this.f474b.lambda$onScroll$4(this.f475c, this.f476d);
            default:
                return this.f474b.lambda$onFling$5(this.f475c, this.f476d);
        }
    }
}
