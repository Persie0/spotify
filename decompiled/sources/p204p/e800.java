package p204p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e800 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f57031b;

    public /* synthetic */ e800(View view, int i) {
        this.f57030a = i;
        this.f57031b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f57030a) {
            case 0:
                View view2 = this.f57031b;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = mec1.f142677a;
                aec1.m25717c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f57030a) {
            case 0:
                break;
            default:
                ((AbstractC2441u6) this.f57031b).m82425g();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m38071a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m38072b(View view) {
    }
}
