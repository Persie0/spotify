package p204p;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes8.dex */
public final class bzp implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f32549b;

    public /* synthetic */ bzp(Object obj, int i) {
        this.f32548a = i;
        this.f32549b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f32548a) {
            case 0:
                ((ybq) this.f32549b).invoke();
                break;
            default:
                ((yhe0) this.f32549b).mo92784c();
                break;
        }
    }
}
