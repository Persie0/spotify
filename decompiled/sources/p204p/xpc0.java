package p204p;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes8.dex */
public final class xpc0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f264599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f264600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f264601c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f264602d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f264603e;

    public xpc0(Context context, View view, View view2, ImageView imageView, View view3) {
        this.f264599a = context;
        this.f264600b = view;
        this.f264601c = view2;
        this.f264602d = imageView;
        this.f264603e = view3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Context context = this.f264599a;
        if (context.getResources().getConfiguration().orientation != 1) {
            return;
        }
        int iM72083N = q3d0.m72083N(context.getResources().getDisplayMetrics().density * 24.0f);
        int top = this.f264600b.getTop();
        int bottom = i4 - this.f264601c.getBottom();
        int iMax = Math.max(top < iM72083N ? Math.abs(iM72083N - top) : 0, bottom < iM72083N ? Math.abs(iM72083N - bottom) : 0);
        ImageView imageView = this.f264602d;
        h6j h6jVar = (h6j) imageView.getLayoutParams();
        h6jVar.setMarginStart(h6jVar.getMarginStart() + iMax);
        h6jVar.setMarginEnd(h6jVar.getMarginEnd() + iMax);
        imageView.setLayoutParams(h6jVar);
        this.f264603e.removeOnLayoutChangeListener(this);
    }
}
