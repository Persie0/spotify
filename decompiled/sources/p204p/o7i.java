package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class o7i implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162572a = 0;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f162573b;

    public o7i(ConstraintLayout constraintLayout) {
        this.f162573b = constraintLayout;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f162572a) {
            case 0:
                break;
        }
        return this.f162573b;
    }

    public o7i(ComposeView composeView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f162573b = constraintLayout;
    }
}
