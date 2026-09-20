package p204p;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class by1 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f32041b;

    public /* synthetic */ by1(Object obj, int i) {
        this.f32040a = i;
        this.f32041b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.f32040a) {
            case 0:
                ((s4r0) this.f32041b).invoke();
                break;
            case 1:
                ((hb11) this.f32041b).mo46962a(w2a1.f247311a);
                break;
            case 2:
                ((aue) this.f32041b).invoke();
                break;
            case 3:
                s9u0 s9u0Var = (s9u0) this.f32041b;
                ConstraintLayout constraintLayout = s9u0Var.f207067c;
                int height = constraintLayout.getHeight();
                constraintLayout.getBackground().setAlpha((int) (height != 0 ? 255.0f - ((Math.max(0, height - s9u0Var.f207069e.getScrollY()) * 255.0f) / height) : 255.0f));
                break;
            default:
                ((fpc1) this.f32041b).m42325a();
                break;
        }
    }
}
