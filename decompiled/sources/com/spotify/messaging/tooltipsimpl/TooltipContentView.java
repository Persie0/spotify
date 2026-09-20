package com.spotify.messaging.tooltipsimpl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.k12;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/messaging/tooltipsimpl/TooltipContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/w2a1;", "listener", "setOnSwipeDownListener", "(Lp/eh00;)V", "p/k12", "src_main_java_com_spotify_messaging_tooltipsimpl-tooltipsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TooltipContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public eh00 f5527R0;

    /* JADX INFO: renamed from: S0 */
    public final GestureDetector f5528S0;

    public TooltipContentView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f5528S0.onTouchEvent(motionEvent);
    }

    public final void setOnSwipeDownListener(eh00 listener) {
        this.f5527R0 = listener;
    }

    public TooltipContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TooltipContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5528S0 = new GestureDetector(context, new k12(this, 2));
    }

    public /* synthetic */ TooltipContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
