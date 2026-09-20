package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.reactivex.rxjava3.core.FlowableEmitter;

/* JADX INFO: loaded from: classes4.dex */
public final class khc1 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f122607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Rect f122608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowableEmitter f122609c;

    public khc1(View view, Rect rect, FlowableEmitter flowableEmitter) {
        this.f122607a = view;
        this.f122608b = rect;
        this.f122609c = flowableEmitter;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view = this.f122607a;
        Rect rect = this.f122608b;
        this.f122609c.onNext(new pqm0(Integer.valueOf(view.getGlobalVisibleRect(rect) ? rect.height() : 0), Integer.valueOf(view.getMeasuredHeight())));
    }
}
