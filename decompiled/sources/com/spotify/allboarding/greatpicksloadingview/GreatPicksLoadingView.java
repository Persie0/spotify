package com.spotify.allboarding.greatpicksloadingview;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.mec1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/allboarding/greatpicksloadingview/GreatPicksLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_allboarding_greatpicksloadingview-greatpicksloadingview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class GreatPicksLoadingView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public final ThreeDotsLoaderView f2909R0;

    /* JADX INFO: renamed from: S0 */
    public final ContentStackView f2910S0;

    /* JADX INFO: renamed from: T0 */
    public final FacePileView f2911T0;

    /* JADX INFO: renamed from: U0 */
    public final TextView f2912U0;

    /* JADX INFO: renamed from: V0 */
    public final TextView f2913V0;

    /* JADX INFO: renamed from: W0 */
    public final AnimatorSet f2914W0;

    public GreatPicksLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2914W0.cancel();
    }

    public GreatPicksLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GreatPicksLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2914W0 = new AnimatorSet();
        View.inflate(context, R.layout.great_picks_loading_view, this);
        this.f2909R0 = (ThreeDotsLoaderView) mec1.m61562n(this, R.id.dot_animation);
        this.f2910S0 = (ContentStackView) mec1.m61562n(this, R.id.content_stack_view);
        this.f2911T0 = (FacePileView) mec1.m61562n(this, R.id.great_picks_facepile);
        this.f2912U0 = (TextView) mec1.m61562n(this, R.id.placeholder_text);
        this.f2913V0 = (TextView) mec1.m61562n(this, R.id.remote_loading_text);
    }

    public /* synthetic */ GreatPicksLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
