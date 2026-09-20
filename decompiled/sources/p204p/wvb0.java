package p204p;

import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.Barrier;

/* JADX INFO: loaded from: classes8.dex */
public final class wvb0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f255459b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xvb0 f255460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvb0(Integer num, xvb0 xvb0Var) {
        super(num);
        this.f255459b = 0;
        this.f255460c = xvb0Var;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f255459b) {
            case 0:
                xvb0 xvb0Var = this.f255460c;
                Barrier barrier = xvb0Var.f266343a;
                int iIntValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != iIntValue) {
                    ObjectAnimator objectAnimator = xvb0Var.f266345c;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    wvb0 wvb0Var = xvb0Var.f266350h;
                    qr60 qr60Var2 = xvb0.f266342i[2];
                    tkm0 tkm0Var = (tkm0) wvb0Var.f61172a;
                    if (!((tkm0Var != null ? tkm0Var.f221185b : 0) == 2)) {
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(barrier, "margin", barrier.getMargin(), iIntValue);
                        objectAnimatorOfInt.setDuration(xvb0Var.f266344b);
                        objectAnimatorOfInt.addUpdateListener(new rx4(xvb0Var, 13));
                        objectAnimatorOfInt.start();
                        xvb0Var.f266345c = objectAnimatorOfInt;
                    } else {
                        barrier.setMargin(iIntValue);
                    }
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    this.f255460c.m92232a();
                }
                break;
            default:
                if (!wj50.m88271j((tkm0) obj, (tkm0) obj2)) {
                    this.f255460c.m92232a();
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wvb0(xvb0 xvb0Var, int i) {
        this.f255459b = i;
        switch (i) {
            case 2:
                this.f255460c = xvb0Var;
                super(null);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.f255460c = xvb0Var;
                super(bool);
                break;
        }
    }
}
