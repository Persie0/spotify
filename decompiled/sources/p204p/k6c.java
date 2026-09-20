package p204p;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class k6c {

    /* JADX INFO: renamed from: a */
    public final View f119714a;

    /* JADX INFO: renamed from: b */
    public boolean f119715b;

    /* JADX INFO: renamed from: c */
    public l1m0 f119716c = l1m0.f128757c;

    /* JADX INFO: renamed from: d */
    public final int f119717d;

    /* JADX INFO: renamed from: e */
    public final int f119718e;

    public k6c(View view, ComposeView composeView) {
        this.f119714a = composeView;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.survey_ad_min_top_vertical_margin);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.survey_ad_min_bottom_vertical_margin);
        int i = dimensionPixelSize + dimensionPixelSize2;
        this.f119717d = (mec1.m61562n(view, R.id.carousel_item_safe_barrier_bottom).getTop() - mec1.m61562n(view, R.id.carousel_item_safe_barrier_top).getBottom()) - i;
        View viewM61562n = mec1.m61562n(view, R.id.carousel_item_safe_barrier_top);
        View viewM61562n2 = mec1.m61562n(view, R.id.player_overlay_footer);
        this.f119718e = ((viewM61562n2.getBottom() - viewM61562n.getBottom()) - mec1.m61562n(view, R.id.track_seekbar).getBottom()) - i;
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m55595a(View view, int i, int i2, long j, long j2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new j6c(view, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.setStartDelay(j2);
        animatorSet.setInterpolator(dqs.f52077c);
        animatorSet.play(valueAnimatorOfInt);
        animatorSet.addListener(new z10(this, 2));
        return animatorSet;
    }
}
