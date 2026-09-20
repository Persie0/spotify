package p204p;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class jz3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oz3 f117568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz3(oz3 oz3Var, int i) {
        super(0);
        this.f117567a = i;
        this.f117568b = oz3Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int actionMasked;
        switch (this.f117567a) {
            case 0:
                Boolean bool = (Boolean) this.f117568b.f171997R0.getValue();
                bool.getClass();
                return bool;
            case 1:
                oz3 oz3Var = this.f117568b;
                MotionEvent motionEvent = oz3Var.f172004U1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    oz3Var.f172006V1 = SystemClock.uptimeMillis();
                    oz3Var.post(oz3Var.f172017a2);
                }
                return w2a1.f247311a;
            default:
                this.f117568b.get_viewTreeOwners();
                return null;
        }
    }
}
