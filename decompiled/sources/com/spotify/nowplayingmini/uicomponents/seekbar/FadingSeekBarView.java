package com.spotify.nowplayingmini.uicomponents.seekbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.by7;
import p204p.dqs;
import p204p.lqb;
import p204p.o891;
import p204p.qqm0;
import p204p.wbz0;
import p204p.x09;
import p204p.xbz0;
import p204p.z9y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/nowplayingmini/uicomponents/seekbar/FadingSeekBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/xbz0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "positionMs", "Lp/w2a1;", "setPosition", "(I)V", "durationMs", "setDuration", "setPositionText", "", x09.f256832d, "setSeekingEnabled", "(Z)V", "visible", "setTimestampsVisible", "Lp/wbz0;", "listener", "setListener", "(Lp/wbz0;)V", "src_main_java_com_spotify_nowplayingmini_uicomponents-uicomponents"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FadingSeekBarView extends ConstraintLayout implements xbz0 {

    /* JADX INFO: renamed from: R0 */
    public qqm0 f6335R0;

    /* JADX INFO: renamed from: S0 */
    public final CancellableSeekBar f6336S0;

    /* JADX INFO: renamed from: T0 */
    public final TextView f6337T0;

    /* JADX INFO: renamed from: U0 */
    public final TextView f6338U0;

    /* JADX INFO: renamed from: V0 */
    public wbz0 f6339V0;

    /* JADX INFO: renamed from: W0 */
    public final by7 f6340W0;

    /* JADX INFO: renamed from: X0 */
    public final by7 f6341X0;

    public FadingSeekBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        setTimestampsVisible(false);
    }

    @Override // p204p.xbz0
    public void setDuration(int durationMs) {
        TextView textView = this.f6338U0;
        if (textView != null) {
            textView.setText(m16004x(durationMs));
        }
        this.f6336S0.setMax(durationMs);
    }

    @Override // p204p.xbz0
    public void setListener(wbz0 listener) {
        this.f6339V0 = listener;
    }

    @Override // p204p.xbz0
    public void setPosition(int positionMs) {
        this.f6336S0.setProgress(positionMs);
    }

    @Override // p204p.xbz0
    public void setPositionText(int positionMs) {
        TextView textView = this.f6337T0;
        if (textView != null) {
            textView.setText(m16004x(positionMs));
        }
    }

    @Override // p204p.xbz0
    public void setSeekingEnabled(boolean enabled) {
        this.f6336S0.setEnabled(enabled);
    }

    public void setTimestampsVisible(boolean visible) {
        TextView textView;
        TextView textView2 = this.f6338U0;
        if (textView2 == null || (textView = this.f6337T0) == null) {
            return;
        }
        int i = visible ? 0 : 4;
        o891.m66422b(this);
        o891.m66421a(this, visible ? this.f6340W0 : this.f6341X0);
        textView.setVisibility(i);
        textView2.setVisibility(i);
    }

    /* JADX INFO: renamed from: x */
    public final String m16004x(int i) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(Math.max(0, i));
        Integer num = (Integer) this.f6335R0.f191620a;
        if (num == null || num.intValue() != seconds) {
            this.f6335R0 = new qqm0(Integer.valueOf(seconds), String.format(Locale.ROOT, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) TimeUnit.SECONDS.toMinutes(seconds)), Integer.valueOf(seconds % 60)}, 2)));
        }
        return (String) this.f6335R0.f191621b;
    }

    public FadingSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FadingSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6335R0 = new qqm0(0, "0:00");
        by7 by7Var = new by7();
        by7Var.mo55879L(150L);
        by7Var.mo55881N(dqs.f52079e);
        this.f6340W0 = by7Var;
        by7 by7Var2 = new by7();
        by7Var2.mo55879L(1500L);
        by7Var2.mo55881N(dqs.f52075a);
        this.f6341X0 = by7Var2;
        View.inflate(context, R.layout.nowplayingmini_seek_bar, this);
        CancellableSeekBar cancellableSeekBar = (CancellableSeekBar) findViewById(R.id.seek_bar);
        this.f6336S0 = cancellableSeekBar;
        this.f6337T0 = (TextView) findViewById(R.id.position);
        this.f6338U0 = (TextView) findViewById(R.id.duration);
        cancellableSeekBar.setOnSeekBarChangeListener((lqb) new z9y(this));
    }

    public /* synthetic */ FadingSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
