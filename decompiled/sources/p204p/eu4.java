package p204p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class eu4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hu4 f62868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu4(hu4 hu4Var, int i) {
        super(1);
        this.f62867a = i;
        this.f62868b = hu4Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f62867a) {
            case 0:
                this.f62868b.f95262R0 = (gh00) obj;
                return w2a1.f247311a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                hu4 hu4Var = this.f62868b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = hu4Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = hu4Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
