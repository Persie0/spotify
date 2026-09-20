package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class vnc1 extends znc1 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f243059k;

    @Override // p204p.znc1
    /* JADX INFO: renamed from: d */
    public final boolean mo86039d(float f, long j, View view, iew0 iew0Var) {
        switch (this.f243059k) {
            case 0:
                view.setAlpha(m96589b(f, j, view, iew0Var));
                break;
            case 1:
                view.setElevation(m96589b(f, j, view, iew0Var));
                break;
            case 2:
                view.setRotation(m96589b(f, j, view, iew0Var));
                break;
            case 3:
                view.setRotationX(m96589b(f, j, view, iew0Var));
                break;
            case 4:
                view.setRotationY(m96589b(f, j, view, iew0Var));
                break;
            case 5:
                view.setScaleX(m96589b(f, j, view, iew0Var));
                break;
            case 6:
                view.setScaleY(m96589b(f, j, view, iew0Var));
                break;
            case 7:
                view.setTranslationX(m96589b(f, j, view, iew0Var));
                break;
            case 8:
                view.setTranslationY(m96589b(f, j, view, iew0Var));
                break;
            default:
                view.setTranslationZ(m96589b(f, j, view, iew0Var));
                break;
        }
        return this.f284475h;
    }
}
