package com.spotify.encoreconsumermobile.elements.playprogressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.d5a0;
import p204p.h6j;
import p204p.hmm0;
import p204p.mqo0;
import p204p.nqo0;
import p204p.oqo0;
import p204p.oqs;
import p204p.vie1;
import p204p.vqg1;
import p204p.wg61;
import p204p.wir;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "S0", "Lp/fr70;", "getFullProgressWidth", "()I", "fullProgressWidth", "T0", "getMinProgressWidth", "minProgressWidth", "src_main_java_com_spotify_encoreconsumermobile_elements_playprogressbar-playprogressbar"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayProgressBarView extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final d5a0 f3714R0;

    /* JADX INFO: renamed from: S0 */
    public final wg61 f3715S0;

    /* JADX INFO: renamed from: T0 */
    public final wg61 f3716T0;

    /* JADX INFO: renamed from: U0 */
    public final wir f3717U0;

    public PlayProgressBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getFullProgressWidth() {
        return ((Number) this.f3715S0.getValue()).intValue();
    }

    private final int getMinProgressWidth() {
        return ((Number) this.f3716T0.getValue()).intValue();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        d5a0 d5a0Var = this.f3714R0;
        ProgressBar progressBar = (ProgressBar) d5a0Var.f45382d;
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        ((ViewGroup.MarginLayoutParams) h6jVar).width = getFullProgressWidth();
        progressBar.setLayoutParams(h6jVar);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == 0 || measuredWidth <= size) {
            return;
        }
        int fullProgressWidth = size - (measuredWidth - getFullProgressWidth());
        int minProgressWidth = getMinProgressWidth();
        if (fullProgressWidth < minProgressWidth) {
            fullProgressWidth = minProgressWidth;
        }
        int fullProgressWidth2 = getFullProgressWidth();
        if (fullProgressWidth > fullProgressWidth2) {
            fullProgressWidth = fullProgressWidth2;
        }
        ProgressBar progressBar2 = (ProgressBar) d5a0Var.f45382d;
        ViewGroup.LayoutParams layoutParams2 = progressBar2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar2 = (h6j) layoutParams2;
        ((ViewGroup.MarginLayoutParams) h6jVar2).width = fullProgressWidth;
        progressBar2.setLayoutParams(h6jVar2);
        super.onMeasure(i, i2);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(mqo0 mqo0Var) {
        this.f3717U0.m88218a(mqo0Var);
    }

    public PlayProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.play_progress_bar_view, this);
        int i2 = R.id.check_play_icon;
        IconCheckAltFill iconCheckAltFill = (IconCheckAltFill) vie1.m85629k(this, R.id.check_play_icon);
        if (iconCheckAltFill != null) {
            i2 = R.id.play_progress;
            ProgressBar progressBar = (ProgressBar) vie1.m85629k(this, R.id.play_progress);
            if (progressBar != null) {
                i2 = R.id.played_text;
                EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(this, R.id.played_text);
                if (encoreTextView != null) {
                    d5a0 d5a0Var = new d5a0(this, iconCheckAltFill, progressBar, encoreTextView, 23);
                    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    progressBar.setMax(100);
                    this.f3714R0 = d5a0Var;
                    this.f3715S0 = new wg61(new oqo0(this, 0));
                    this.f3716T0 = new wg61(new oqo0(this, 1));
                    int i3 = 0;
                    int i4 = 1;
                    int i5 = 0;
                    this.f3717U0 = vqg1.m86248z(vqg1.m86247y(new hmm0(i4, this, PlayProgressBarView.class, "renderProgress", "renderProgress(Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBar$Model;)V", i5, i3, 7)), vqg1.m86216A(nqo0.f157305h, vqg1.m86247y(new hmm0(i4, this, PlayProgressBarView.class, "renderCheckIcon", "renderCheckIcon(Z)V", i5, i3, 8))), vqg1.m86247y(new hmm0(i4, this, PlayProgressBarView.class, "renderText", "renderText(Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBar$Model;)V", i5, i3, 9)));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ PlayProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
