package p204p;

import android.view.View;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes.dex */
public final class ihc1 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f102237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a2b1 f102238b;

    public ihc1(View view, a2b1 a2b1Var) {
        this.f102237a = view;
        this.f102238b = a2b1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        this.f102237a.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f102238b);
    }
}
