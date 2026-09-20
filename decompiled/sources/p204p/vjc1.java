package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class vjc1 extends zjc1 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f241951g;

    @Override // p204p.zjc1
    /* JADX INFO: renamed from: d */
    public final void mo85750d(View view, float f) {
        switch (this.f241951g) {
            case 0:
                view.setAlpha(m96234a(f));
                break;
            case 1:
                view.setElevation(m96234a(f));
                break;
            case 2:
                view.setRotation(m96234a(f));
                break;
            case 3:
                view.setRotationX(m96234a(f));
                break;
            case 4:
                view.setRotationY(m96234a(f));
                break;
            case 5:
                view.setScaleX(m96234a(f));
                break;
            case 6:
                view.setScaleY(m96234a(f));
                break;
            case 7:
                view.setTranslationX(m96234a(f));
                break;
            case 8:
                view.setTranslationY(m96234a(f));
                break;
            default:
                view.setTranslationZ(m96234a(f));
                break;
        }
    }
}
