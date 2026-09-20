package com.spotify.encoreconsumermobile.elements.chronometerlabel;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.jce;
import p204p.kce;
import p204p.lce;
import p204p.oqs;
import p204p.u1u0;
import p204p.wy3;
import p204p.xre;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/chronometerlabel/ChronometerLabelView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/xre;", "clock", "(Landroid/content/Context;Lp/xre;)V", "src_main_java_com_spotify_encoreconsumermobile_elements_chronometerlabel-chronometerlabel"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ChronometerLabelView extends FrameLayout implements oqs {

    /* JADX INFO: renamed from: a */
    public final xre f3631a;

    /* JADX INFO: renamed from: b */
    public final Chronometer f3632b;

    public ChronometerLabelView(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m9605a(AttributeSet attributeSet, int i) {
        float dimension = getResources().getDimension(R.dimen.chronometer_label_default_text_size);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u1u0.f225921a, i, 0);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(0, dimension);
        typedArrayObtainStyledAttributes.recycle();
        Chronometer chronometer = this.f3632b;
        chronometer.setTextSize(0, dimension2);
        chronometer.setMaxLines(1);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(lce lceVar) {
        boolean zEquals = lceVar.equals(kce.f121457a);
        Chronometer chronometer = this.f3632b;
        if (zEquals) {
            chronometer.stop();
            chronometer.setText("");
        } else {
            if (!(lceVar instanceof jce)) {
                throw new NoWhenBranchMatchedException();
            }
            ((wy3) this.f3631a).getClass();
            chronometer.setBase(SystemClock.elapsedRealtime() - (System.currentTimeMillis() - ((jce) lceVar).f111105a));
            chronometer.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Chronometer chronometer = this.f3632b;
        chronometer.stop();
        chronometer.setText("");
    }

    public ChronometerLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChronometerLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Chronometer chronometer = new Chronometer(getContext());
        this.f3632b = chronometer;
        addView(chronometer);
        this.f3631a = new wy3();
        m9605a(attributeSet, i);
    }

    public ChronometerLabelView(Context context, xre xreVar) {
        super(context);
        Chronometer chronometer = new Chronometer(getContext());
        this.f3632b = chronometer;
        addView(chronometer);
        this.f3631a = xreVar;
        m9605a(null, 0);
    }
}
