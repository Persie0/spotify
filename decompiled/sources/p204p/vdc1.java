package p204p;

import android.view.View;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class vdc1 extends MainThreadDisposable implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final View f240388b;

    /* JADX INFO: renamed from: c */
    public final Observer f240389c;

    public vdc1(View view, Observer observer) {
        this.f240388b = view;
        this.f240389c = observer;
    }

    @Override // io.reactivex.rxjava3.android.MainThreadDisposable
    /* JADX INFO: renamed from: a */
    public final void mo23278a() {
        this.f240388b.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (isDisposed()) {
            return;
        }
        this.f240389c.onNext(w2a1.f247311a);
    }
}
