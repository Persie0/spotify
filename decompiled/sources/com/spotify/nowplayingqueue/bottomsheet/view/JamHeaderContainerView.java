package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.wv30;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/JamHeaderContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/w2a1;", "a", "Lp/eh00;", "getOnAnimationEnd", "()Lp/eh00;", "setOnAnimationEnd", "(Lp/eh00;)V", "onAnimationEnd", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JamHeaderContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public eh00 onAnimationEnd;

    public JamHeaderContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final eh00 getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    public final void setOnAnimationEnd(eh00 eh00Var) {
        this.onAnimationEnd = eh00Var;
    }

    public JamHeaderContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public JamHeaderContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAnimationEnd = wv30.f255364R0;
    }

    public /* synthetic */ JamHeaderContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
