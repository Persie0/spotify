package p204p;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* JADX INFO: loaded from: classes10.dex */
public final class e631 extends BaseTransientBottomBar$Behavior {

    /* JADX INFO: renamed from: i */
    public boolean f56532i;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, com.google.android.material.behavior.SwipeDismissBehavior, p204p.eqk
    /* JADX INFO: renamed from: g */
    public final boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zMo1562g = super.mo1562g(coordinatorLayout, view, motionEvent);
        this.f56532i = zMo1562g;
        return zMo1562g;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p204p.eqk
    /* JADX INFO: renamed from: s */
    public final boolean mo1563s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.f56532i && super.mo1563s(coordinatorLayout, view, motionEvent);
    }
}
