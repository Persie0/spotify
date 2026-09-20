package p204p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class ild1 extends WebView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103371a = 0;

    public /* synthetic */ ild1(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f103371a) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        switch (this.f103371a) {
            case 0:
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                    return;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.f103371a) {
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    public /* synthetic */ ild1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
