package p204p;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class ahb extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final edr0 f15658a;

    public ahb(Context context) {
        super(context);
        edr0 edr0Var = new edr0(context);
        this.f15658a = edr0Var;
        edr0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        edr0Var.setScaleType(cdr0.FILL_CENTER);
        addView(edr0Var);
    }

    public d4r0 getSurfaceProvider() {
        return this.f15658a.getSurfaceProvider();
    }
}
