package p204p;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class agl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15425a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f15425a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    float width = (imageView.getWidth() - (drawable.getIntrinsicWidth() * 2.0f)) / 2.0f;
                    float height = (imageView.getHeight() - (drawable.getIntrinsicHeight() * 2.0f)) / 2.0f;
                    Matrix matrix = new Matrix();
                    matrix.setScale(2.0f, 2.0f);
                    matrix.postTranslate(width, height);
                    imageView.setImageMatrix(matrix);
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                View viewFindViewWithTag = view.findViewWithTag("appBarLayout");
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setFocusable(false);
                    viewFindViewWithTag.setFocusableInTouchMode(false);
                }
                View viewFindViewWithTag2 = view.findViewWithTag("backButton");
                View viewFindViewWithTag3 = view.findViewWithTag("find");
                View viewFindViewWithTag4 = view.findViewWithTag("headerTitle");
                View viewFindViewWithTag5 = view.findViewWithTag("tabsContainer");
                View viewFindViewWithTag6 = view.findViewWithTag("lastHeaderAction");
                if (viewFindViewWithTag2 != null) {
                    viewFindViewWithTag2.setNextFocusForwardId(viewFindViewWithTag3 != null ? viewFindViewWithTag3.getId() : viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
                }
                if (viewFindViewWithTag3 != null) {
                    viewFindViewWithTag3.setNextFocusForwardId(viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
                }
                if (viewFindViewWithTag6 != null) {
                    viewFindViewWithTag6.setNextFocusForwardId(viewFindViewWithTag5 != null ? viewFindViewWithTag5.getId() : -1);
                }
                if (viewFindViewWithTag2 != null) {
                    viewFindViewWithTag2.requestFocus();
                }
                break;
        }
    }
}
