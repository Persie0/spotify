package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p204p.bwt0;
import p204p.gl8;
import p204p.j19;
import p204p.o19;

/* JADX INFO: loaded from: classes4.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final gl8 f2161h;

    public BaseTransientBottomBar$Behavior() {
        gl8 gl8Var = new gl8(1);
        this.f2001e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2002f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2000d = 0;
        this.f2161h = gl8Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p204p.eqk
    /* JADX INFO: renamed from: g */
    public boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        gl8 gl8Var = this.f2161h;
        gl8Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                bwt0.m30706t().m30711F((j19) gl8Var.f81018b);
            }
        } else if (coordinatorLayout.m376q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            bwt0.m30706t().m30709D((j19) gl8Var.f81018b);
        }
        return super.mo1562g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: t */
    public final boolean mo1564t(View view) {
        this.f2161h.getClass();
        return view instanceof o19;
    }
}
