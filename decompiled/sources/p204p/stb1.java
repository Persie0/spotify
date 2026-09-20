package p204p;

import android.content.Context;
import android.widget.FrameLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class stb1 extends VideoSurfaceView {

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ utb1 f213882t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stb1(utb1 utb1Var, Context context) {
        v8k v8kVar;
        kac1 kac1Var;
        super(context);
        this.f213882t1 = utb1Var;
        int iM38547C = edb.m38547C(utb1Var.f233879b);
        if (iM38547C == 0) {
            v8kVar = v8k.STICKY_HEADER;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            v8kVar = v8k.NOW_PLAYING_BAR;
        }
        setConfiguration(v8kVar);
        int iM38547C2 = edb.m38547C(utb1Var.f233880c);
        if (iM38547C2 == 0) {
            kac1Var = kac1.LOW;
        } else if (iM38547C2 == 1) {
            kac1Var = kac1.MEDIUM;
        } else {
            if (iM38547C2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kac1Var = kac1.HIGH;
        }
        setPriority(kac1Var);
        setRenderAsOverlay(utb1Var.f233881d);
        setScaleType(mac1.ASPECT_FIT);
        setBufferingThrobberEnabled(false);
        setBackgroundColor(-16777216);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f213882t1.f233878a.m50055g(this);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        utb1 utb1Var = this.f213882t1;
        if (z) {
            utb1Var.f233878a.m50050b(this);
        } else {
            utb1Var.f233878a.m50055g(this);
        }
    }
}
