package p204p;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class id61 extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f100962b;

    public /* synthetic */ id61(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f100961a = i;
        this.f100962b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f100961a) {
            case 0:
                this.f100962b.setAnimationProgress(1.0f - f);
                break;
            case 1:
                SwipeRefreshLayout swipeRefreshLayout = this.f100962b;
                int iAbs = swipeRefreshLayout.f1321Y0 - Math.abs(swipeRefreshLayout.f1320X0);
                int i = swipeRefreshLayout.f1319W0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.f1317U0.getTop());
                dee deeVar = swipeRefreshLayout.f1324a1;
                float f2 = 1.0f - f;
                cee ceeVar = deeVar.f48062a;
                if (f2 != ceeVar.f37106p) {
                    ceeVar.f37106p = f2;
                }
                deeVar.invalidateSelf();
                break;
            default:
                this.f100962b.m1125h(f);
                break;
        }
    }
}
