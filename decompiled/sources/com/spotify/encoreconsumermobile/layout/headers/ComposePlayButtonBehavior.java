package com.spotify.encoreconsumermobile.layout.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.eqk;
import p204p.p1b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/layout/headers/ComposePlayButtonBehavior;", "Lp/eqk;", "Landroidx/compose/ui/platform/ComposeView;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_encoreconsumermobile_layout_headers-headers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ComposePlayButtonBehavior extends eqk {

    /* JADX INFO: renamed from: a */
    public Toolbar f3779a;

    public ComposePlayButtonBehavior() {
    }

    /* JADX INFO: renamed from: t */
    public static void m9668t(ComposeView composeView, View view, Toolbar toolbar) {
        float height = toolbar.getHeight();
        float y = view.getY() + view.getHeight();
        int height2 = composeView.getHeight();
        float f = height2 / 2;
        float dimensionPixelSize = composeView.getResources().getDimensionPixelSize(R.dimen.header_play_button_header_actions_vertical_offset);
        composeView.setTranslationY(y <= (height + f) - dimensionPixelSize ? height - f : (y - height2) + dimensionPixelSize);
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public final boolean mo1550b(View view, View view2) {
        if (!(view2 instanceof AppBarLayout)) {
            return false;
        }
        if (this.f3779a == null) {
            this.f3779a = (Toolbar) view2.findViewById(R.id.toolbar);
        }
        return this.f3779a != null;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        ComposeView composeView = (ComposeView) view;
        Toolbar toolbar = this.f3779a;
        if (toolbar == null) {
            return false;
        }
        m9668t(composeView, view2, toolbar);
        return false;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View childAt;
        ComposeView composeView = (ComposeView) view;
        int i2 = 0;
        while (true) {
            if (i2 >= coordinatorLayout.getChildCount()) {
                childAt = null;
                break;
            }
            int i3 = i2 + 1;
            childAt = coordinatorLayout.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt instanceof AppBarLayout) {
                break;
            }
            i2 = i3;
        }
        View view2 = childAt;
        if (view2 != null) {
            if (this.f3779a == null) {
                this.f3779a = (Toolbar) view2.findViewById(R.id.toolbar);
            }
            Toolbar toolbar = this.f3779a;
            if (toolbar != null) {
                if (composeView.isLaidOut() && !composeView.isLayoutRequested()) {
                    m9668t(composeView, view2, toolbar);
                    return false;
                }
                composeView.addOnLayoutChangeListener(new p1b(this, composeView, view2, toolbar, 1));
            }
        }
        return false;
    }

    public ComposePlayButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
