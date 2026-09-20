package p204p;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ggu extends MaterialCardView {

    /* JADX INFO: renamed from: P0 */
    public String f79746P0;

    public ggu(Context context, AttributeSet attributeSet, int i) throws C1889g9 {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2u0.f76009a, i, 0);
        this.f79746P0 = typedArrayObtainStyledAttributes.getString(1);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getDisabledStateReason() {
        return this.f79746P0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !isEnabled() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        StateListAnimator stateListAnimator = getStateListAnimator();
        if (stateListAnimator != null) {
            stateListAnimator.jumpToCurrentState();
        }
    }

    public final void setDisabledStateReason(String str) {
        this.f79746P0 = str;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) throws C1889g9 {
        String str;
        if (!z && ((str = this.f79746P0) == null || wl51.m88460J0(str))) {
            throw new C1889g9(4);
        }
        super.setEnabled(z);
        if (Build.VERSION.SDK_INT >= 30) {
            setStateDescription(!isEnabled() ? this.f79746P0 : "");
        }
        Iterator it = new ek5(this, 8).iterator();
        while (true) {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                break;
            } else {
                ((View) c2042k7.next()).setImportantForAccessibility(isEnabled() ? 1 : 4);
            }
        }
        setDescendantFocusability(z ? 131072 : 393216);
    }
}
