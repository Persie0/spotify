package p204p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ohe0 extends FrameLayout implements pze {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f165419a;

    /* JADX WARN: Multi-variable type inference failed */
    public ohe0(View view) {
        super(view.getContext());
        this.f165419a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p204p.pze
    public final void onActionViewCollapsed() {
        this.f165419a.onActionViewCollapsed();
    }

    @Override // p204p.pze
    public final void onActionViewExpanded() {
        this.f165419a.onActionViewExpanded();
    }
}
