package p204p;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q8b0 implements x9b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186281a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f186282b;

    public q8b0(LottieAnimationView lottieAnimationView, int i) {
        this.f186281a = i;
        switch (i) {
            case 1:
                this.f186282b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f186282b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // p204p.x9b0
    public final void onResult(Object obj) {
        switch (this.f186281a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f186282b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.f1476g;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    x9b0 x9b0Var = lottieAnimationView.f1475f;
                    if (x9b0Var == null) {
                        x9b0Var = LottieAnimationView.f1466R0;
                    }
                    x9b0Var.onResult(th);
                    break;
                }
                break;
            default:
                u8b0 u8b0Var = (u8b0) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f186282b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(u8b0Var);
                    break;
                }
                break;
        }
    }
}
