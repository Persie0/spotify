package p204p;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class bgl extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f26961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgl(int i, ViewGroup viewGroup) {
        super(1);
        this.f26960a = i;
        this.f26961b = viewGroup;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f26960a) {
            case 0:
                ((xpi0) obj).m91705a(this.f26961b);
                return w2a1.f247311a;
            case 1:
                ((xpi0) obj).m91705a(this.f26961b);
                return w2a1.f247311a;
            case 2:
                ((xpi0) obj).m91705a(this.f26961b);
                return w2a1.f247311a;
            default:
                int action = ((MotionEvent) obj).getAction();
                ViewGroup viewGroup = this.f26961b;
                if (action != 0) {
                    if ((action == 1 || action == 3) && viewGroup != null) {
                        viewGroup.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                }
                return Boolean.FALSE;
        }
    }
}
