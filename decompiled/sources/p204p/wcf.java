package p204p;

import android.graphics.Rect;
import android.view.View;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;

/* JADX INFO: loaded from: classes4.dex */
public final class wcf implements FlowableOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final View f250032a;

    public /* synthetic */ wcf(View view) {
        this.f250032a = view;
    }

    @Override // io.reactivex.rxjava3.core.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
        Rect rect = new Rect();
        View view = this.f250032a;
        khc1 khc1Var = new khc1(view, rect, flowableEmitter);
        if (view.isLaidOut()) {
            khc1Var.onScrollChanged();
        }
        inl0.m51135a(view, new vpa1(4, view, khc1Var));
        view.getViewTreeObserver().addOnScrollChangedListener(khc1Var);
        flowableEmitter.setCancellable(new gr5(13, view, khc1Var));
    }
}
