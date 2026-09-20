package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.o5t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/QueueInteractionLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/w2a1;", "Z0", "Lp/eh00;", "getOnUserInteraction", "()Lp/eh00;", "setOnUserInteraction", "(Lp/eh00;)V", "onUserInteraction", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QueueInteractionLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public eh00 onUserInteraction;

    public QueueInteractionLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.onUserInteraction.invoke();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final eh00 getOnUserInteraction() {
        return this.onUserInteraction;
    }

    public final void setOnUserInteraction(eh00 eh00Var) {
        this.onUserInteraction = eh00Var;
    }

    public QueueInteractionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QueueInteractionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onUserInteraction = o5t0.f162086d;
    }

    public /* synthetic */ QueueInteractionLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
