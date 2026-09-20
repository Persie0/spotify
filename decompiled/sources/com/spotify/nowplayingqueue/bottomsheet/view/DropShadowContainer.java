package com.spotify.nowplayingqueue.bottomsheet.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.hqk;
import p204p.u1x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/DropShadowContainer;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DropShadowContainer extends CoordinatorLayout {
    public DropShadowContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public DropShadowContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DropShadowContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hqk hqkVar = new hqk(-1, getResources().getDimensionPixelSize(R.dimen.drop_shadow_bottom_height));
        hqkVar.f94200c = 80;
        View view = new View(getContext());
        view.setLayoutParams(hqkVar);
        Resources resources = view.getContext().getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal threadLocal = u1x0.f225931a;
        view.setBackground(resources.getDrawable(R.drawable.drop_shadow_bottom, theme));
        addView(view);
    }

    public /* synthetic */ DropShadowContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
