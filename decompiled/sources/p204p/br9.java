package p204p;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class br9 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br9(Context context, int i) {
        super(context);
        this.f30022a = i;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f30022a) {
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30022a) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
