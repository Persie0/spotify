package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class o2c1 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d6m0 f161020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d6m0 f161021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rlv0 f161022c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rlv0 f161023d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f161024e;

    public o2c1(d6m0 d6m0Var, rlv0 rlv0Var, rlv0 rlv0Var2, View view) {
        this.f161021b = d6m0Var;
        this.f161022c = rlv0Var;
        this.f161023d = rlv0Var2;
        this.f161024e = view;
        this.f161020a = d6m0Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        gb80 lifecycle;
        this.f161021b.onDestroy(hc80Var);
        hc80 hc80Var2 = (hc80) this.f161022c.f200373a;
        if (hc80Var2 != null && (lifecycle = hc80Var2.getLifecycle()) != null) {
            lifecycle.mo31988d(this);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) this.f161023d.f200373a;
        if (onAttachStateChangeListener != null) {
            this.f161024e.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f161020a.onPause(hc80Var);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        this.f161020a.onResume(hc80Var);
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
    }
}
