package p204p;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vwe implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public m3x f245478a;

    /* JADX INFO: renamed from: b */
    public WeakReference f245479b;

    /* JADX INFO: renamed from: c */
    public WeakReference f245480c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f245481d;

    /* JADX INFO: renamed from: e */
    public boolean f245482e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f245481d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.f245480c.get();
            View view3 = (View) this.f245479b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            xwe.m92282b(this.f245478a, view2, view3);
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
