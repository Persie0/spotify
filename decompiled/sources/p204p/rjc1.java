package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class rjc1 extends EncoreTextView {

    /* JADX INFO: renamed from: L0 */
    public final kk6 f199790L0;

    /* JADX INFO: renamed from: h */
    public final int f199791h;

    /* JADX INFO: renamed from: i */
    public ViewGroup f199792i;

    /* JADX INFO: renamed from: t */
    public TouchDelegate f199793t;

    public rjc1(Context context) {
        super(context, null, 0, 6, null);
        this.f199791h = getResources().getDimensionPixelSize(R.dimen.encore_control_size_smaller);
        this.f199790L0 = new kk6(this, 28);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f199790L0);
        post(new n081(this, 10));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewGroup viewGroup;
        removeOnLayoutChangeListener(this.f199790L0);
        ViewGroup viewGroup2 = this.f199792i;
        if ((viewGroup2 != null ? viewGroup2.getTouchDelegate() : null) == this.f199793t && (viewGroup = this.f199792i) != null) {
            viewGroup.setTouchDelegate(null);
        }
        this.f199792i = null;
        this.f199793t = null;
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: t */
    public final void m75640t() {
        Object next;
        if (!isAttachedToWindow() || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        ViewGroup viewGroup = this.f199792i;
        int i = this.f199791h;
        if (viewGroup == null) {
            ViewParent parent = getParent();
            Iterator it = btz0.m30487K(parent instanceof ViewGroup ? (ViewGroup) parent : null, hhc1.f91351d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ViewGroup viewGroup2 = (ViewGroup) next;
                if (viewGroup2.getWidth() >= i && viewGroup2.getHeight() >= i && viewGroup2.getTouchDelegate() == null) {
                    break;
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) next;
            if (viewGroup3 != null) {
                this.f199792i = viewGroup3;
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                return;
            }
        }
        if (viewGroup.getTouchDelegate() == null || viewGroup.getTouchDelegate() == this.f199793t) {
            Rect rect = new Rect(0, 0, getWidth(), getHeight());
            viewGroup.offsetDescendantRectToMyCoords(this, rect);
            if (rect.width() < i) {
                int iWidth = i - rect.width();
                int i2 = iWidth / 2;
                rect.left -= i2;
                rect.right = (iWidth - i2) + rect.right;
            }
            if (rect.height() < i) {
                int iHeight = i - rect.height();
                int i3 = iHeight / 2;
                rect.top -= i3;
                rect.bottom = (iHeight - i3) + rect.bottom;
            }
            int i4 = rect.left;
            if (i4 < 0) {
                rect.offset(-i4, 0);
            }
            if (rect.right > viewGroup.getWidth()) {
                rect.offset(viewGroup.getWidth() - rect.right, 0);
            }
            int i5 = rect.top;
            if (i5 < 0) {
                rect.offset(0, -i5);
            }
            if (rect.bottom > viewGroup.getHeight()) {
                rect.offset(0, viewGroup.getHeight() - rect.bottom);
            }
            TouchDelegate touchDelegate = new TouchDelegate(rect, this);
            this.f199793t = touchDelegate;
            viewGroup.setTouchDelegate(touchDelegate);
        }
    }
}
