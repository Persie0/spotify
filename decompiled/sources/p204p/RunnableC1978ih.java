package p204p;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: p.ih */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1978ih implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f102086b;

    public /* synthetic */ RunnableC1978ih(View view, int i) {
        this.f102085a = i;
        this.f102086b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f102085a) {
            case 0:
                Rect rect = new Rect();
                View view = this.f102086b;
                view.getHitRect(rect);
                int iM88767v = wqg1.m88767v(48.0f, view.getResources());
                int i = rect.bottom;
                int i2 = rect.top;
                int i3 = i - i2;
                if (iM88767v > i3) {
                    int iM38556e = edb.m38556e(iM88767v, i3, 2, 1);
                    rect.top = i2 - iM38556e;
                    rect.bottom = i + iM38556e;
                }
                int i4 = rect.right;
                int i5 = rect.left;
                int i6 = i4 - i5;
                if (iM88767v > i6) {
                    int iM38556e2 = edb.m38556e(iM88767v, i6, 2, 1);
                    rect.left = i5 - iM38556e2;
                    rect.right = i4 + iM38556e2;
                }
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
                break;
            case 1:
                this.f102086b.requestLayout();
                break;
            case 2:
                View view3 = this.f102086b;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                break;
            case 3:
                this.f102086b.setNestedScrollingEnabled(true);
                break;
            case 4:
                this.f102086b.setVisibility(8);
                break;
            default:
                View view4 = this.f102086b;
                ((InputMethodManager) view4.getContext().getSystemService("input_method")).showSoftInput(view4, 1);
                break;
        }
    }
}
