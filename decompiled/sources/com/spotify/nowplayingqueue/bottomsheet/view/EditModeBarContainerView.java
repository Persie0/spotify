package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.spotify.music.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.h6f;
import p204p.mec1;
import p204p.v8s;
import p204p.xdc1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/EditModeBarContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Landroid/view/View;", "buttons", "Lp/w2a1;", "setEditModeBarButtons", "(Ljava/util/List;)V", "Lkotlin/Function0;", "a", "Lp/eh00;", "getOnAnimationEnd", "()Lp/eh00;", "setOnAnimationEnd", "(Lp/eh00;)V", "onAnimationEnd", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EditModeBarContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public eh00 onAnimationEnd;

    public EditModeBarContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final eh00 getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    public final void setEditModeBarButtons(List<? extends View> buttons) {
        removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spacer_8);
        int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            View view = (View) obj;
            if (i > 0 && i < buttons.size()) {
                addView(new Space(getContext()), new LinearLayout.LayoutParams(dimensionPixelSize, 0));
            }
            addView(view, new LinearLayout.LayoutParams(-2, -2));
            i = i2;
        }
    }

    public final void setOnAnimationEnd(eh00 eh00Var) {
        this.onAnimationEnd = eh00Var;
    }

    public EditModeBarContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EditModeBarContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAnimationEnd = v8s.f238664Y;
        setFocusable(false);
        setGravity(8388627);
        setOrientation(0);
        WeakHashMap weakHashMap = mec1.f142677a;
        new xdc1().m77106j(this, Boolean.TRUE);
    }

    public /* synthetic */ EditModeBarContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
