package p204p;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class j65 extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ l65 f109222i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j65(l65 l65Var, g9k g9kVar) {
        super(g9kVar);
        this.f109222i = l65Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f109222i.m58303t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                l65 l65Var = this.f109222i;
                l65Var.m58302q(l65Var.m58307x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ihf1.m50639w(getContext(), i));
    }
}
