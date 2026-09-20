package p204p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f11517b;

    public /* synthetic */ a20(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f11516a = i;
        this.f11517b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11516a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11517b;
                actionBarOverlayLayout.m87d();
                actionBarOverlayLayout.f137X0 = actionBarOverlayLayout.f145d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f138Y0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11517b;
                actionBarOverlayLayout2.m87d();
                actionBarOverlayLayout2.f137X0 = actionBarOverlayLayout2.f145d.animate().translationY(-actionBarOverlayLayout2.f145d.getHeight()).setListener(actionBarOverlayLayout2.f138Y0);
                break;
        }
    }
}
