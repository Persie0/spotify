package androidx.car.app.utils;

import android.graphics.Rect;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.utils.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0039c implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub f478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Rect f479c;

    public /* synthetic */ C0039c(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i) {
        this.f477a = i;
        this.f478b = remoteUtils$SurfaceCallbackStub;
        this.f479c = rect;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f477a) {
            case 0:
                return this.f478b.lambda$onVisibleAreaChanged$1(this.f479c);
            default:
                return this.f478b.lambda$onStableAreaChanged$2(this.f479c);
        }
    }
}
