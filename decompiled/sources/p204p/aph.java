package p204p;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class aph implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bph f17951a;

    public aph(bph bphVar) {
        this.f17951a = bphVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f17951a.m30120d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        bph bphVar = this.f17951a;
        bphVar.f29459f.f240312a.clear();
        i1x0 i1x0Var = bphVar.f29460g;
        synchronized (i1x0Var) {
            i1x0Var.f97616a.m81195c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        bph bphVar = this.f17951a;
        bphVar.f29459f.f240312a.clear();
        i1x0 i1x0Var = bphVar.f29460g;
        synchronized (i1x0Var) {
            i1x0Var.f97616a.m81195c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f17951a.f29472s.f74939c.setValue(Boolean.valueOf(z));
    }
}
