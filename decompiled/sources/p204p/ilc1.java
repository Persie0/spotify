package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ilc1 extends mlc1 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f103355f;

    @Override // p204p.mlc1
    /* JADX INFO: renamed from: c */
    public final void mo51010c(View view, float f) {
        switch (this.f103355f) {
            case 0:
                view.setAlpha(m62203a(f));
                break;
            case 1:
                view.setElevation(m62203a(f));
                break;
            case 2:
                view.setPivotX(m62203a(f));
                break;
            case 3:
                view.setPivotY(m62203a(f));
                break;
            case 4:
                view.setRotation(m62203a(f));
                break;
            case 5:
                view.setRotationX(m62203a(f));
                break;
            case 6:
                view.setRotationY(m62203a(f));
                break;
            case 7:
                view.setScaleX(m62203a(f));
                break;
            case 8:
                view.setScaleY(m62203a(f));
                break;
            case 9:
                view.setTranslationX(m62203a(f));
                break;
            case 10:
                view.setTranslationY(m62203a(f));
                break;
            default:
                view.setTranslationZ(m62203a(f));
                break;
        }
    }
}
