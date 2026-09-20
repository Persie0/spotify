package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class tls extends mvf1 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f221516f;

    public /* synthetic */ tls(int i) {
        this.f221516f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.mvf1
    /* JADX INFO: renamed from: j */
    public final float mo43543j(h4r h4rVar) {
        switch (this.f221516f) {
            case 0:
                return ((View) h4rVar).getAlpha();
            case 1:
                return ((View) h4rVar).getScaleX();
            case 2:
                return ((View) h4rVar).getScaleY();
            case 3:
                return ((View) h4rVar).getRotation();
            case 4:
                return ((View) h4rVar).getRotationX();
            default:
                return ((View) h4rVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.mvf1
    /* JADX INFO: renamed from: n */
    public final void mo43544n(h4r h4rVar, float f) {
        switch (this.f221516f) {
            case 0:
                ((View) h4rVar).setAlpha(f);
                break;
            case 1:
                ((View) h4rVar).setScaleX(f);
                break;
            case 2:
                ((View) h4rVar).setScaleY(f);
                break;
            case 3:
                ((View) h4rVar).setRotation(f);
                break;
            case 4:
                ((View) h4rVar).setRotationX(f);
                break;
            default:
                ((View) h4rVar).setRotationY(f);
                break;
        }
    }
}
