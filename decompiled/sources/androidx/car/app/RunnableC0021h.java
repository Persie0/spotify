package androidx.car.app;

import p204p.edl0;

/* JADX INFO: renamed from: androidx.car.app.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0021h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f428c;

    public /* synthetic */ RunnableC0021h(int i, Object obj, Object obj2) {
        this.f426a = i;
        this.f427b = obj;
        this.f428c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f426a) {
            case 0:
                AbstractServiceC0022i abstractServiceC0022i = (AbstractServiceC0022i) this.f427b;
                SessionInfo sessionInfo = (SessionInfo) this.f428c;
                synchronized (abstractServiceC0022i.f429a) {
                    try {
                        CarAppBinder carAppBinder = (CarAppBinder) abstractServiceC0022i.f429a.remove(sessionInfo);
                        if (carAppBinder != null) {
                            carAppBinder.onDestroyLifecycle();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((edl0) null).m38601a();
                return;
        }
    }
}
