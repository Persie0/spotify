package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class v9p implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f239011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f239012b;

    public v9p(View view, double d) {
        this.f239011a = view;
        this.f239012b = d;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int width = view.getWidth();
        View view2 = this.f239011a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = (int) (((double) width) * this.f239012b);
        view2.setLayoutParams(layoutParams);
    }
}
