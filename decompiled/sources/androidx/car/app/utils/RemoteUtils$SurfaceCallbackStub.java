package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import p204p.gb80;
import p204p.mpd0;
import p204p.n761;
import p204p.pra;
import p204p.sew0;
import p204p.zg71;

/* JADX INFO: loaded from: classes3.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f469a = 0;
    private final gb80 mLifecycle;
    private n761 mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(gb80 gb80Var, n761 n761Var) {
        this.mLifecycle = gb80Var;
        gb80Var.mo31986a(new C0041e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(pra praVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(pra praVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        return null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        zg71.m96050b(new mpd0(this.mLifecycle, new C0038b(this, f, f2, 0), "onClick"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        zg71.m96050b(new mpd0(this.mLifecycle, new C0038b(this, f, f2, 2), "onFling"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        zg71.m96050b(new mpd0(this.mLifecycle, new sew0() { // from class: androidx.car.app.utils.d
            @Override // p204p.sew0
            /* JADX INFO: renamed from: b */
            public final Object mo205b() {
                return this.f480a.lambda$onScale$6(f, f2, f3);
            }
        }, "onScale"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        zg71.m96050b(new mpd0(this.mLifecycle, new C0038b(this, f, f2, 1), "onScroll"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new C0039c(this, rect, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(pra praVar, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new C0037a(this, praVar, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(pra praVar, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new C0037a(this, praVar, 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new C0039c(this, rect, 0));
    }
}
