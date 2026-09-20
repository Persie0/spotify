package com.spotify.encoreconsumermobile.layout.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.eqk;
import p204p.p1b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/layout/headers/PlayButtonBehavior;", "Lp/eqk;", "Lcom/spotify/encoreconsumermobile/elements/playbutton/PlayButtonView;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_encoreconsumermobile_layout_headers-headers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayButtonBehavior extends eqk {

    /* JADX INFO: renamed from: a */
    public Toolbar f3780a;

    public PlayButtonBehavior() {
    }

    /* JADX INFO: renamed from: t */
    public static void m9669t(PlayButtonView playButtonView, View view, Toolbar toolbar) {
        float height = toolbar.getHeight();
        float y = view.getY() + view.getHeight();
        playButtonView.setTranslationY(y <= ((float) (playButtonView.getPlayButtonHeightWithoutBadge() / 2)) + height ? height - (playButtonView.getPlayButtonHeightWithoutBadge() / 2) : y - playButtonView.getPlayButtonHeightWithoutBadge());
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public final boolean mo1550b(View view, View view2) {
        if (!(view2 instanceof AppBarLayout)) {
            return false;
        }
        if (this.f3780a == null) {
            this.f3780a = (Toolbar) view2.findViewById(R.id.toolbar);
        }
        return this.f3780a != null;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        PlayButtonView playButtonView = (PlayButtonView) view;
        Toolbar toolbar = this.f3780a;
        if (toolbar == null) {
            return false;
        }
        m9669t(playButtonView, view2, toolbar);
        return false;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View childAt;
        PlayButtonView playButtonView = (PlayButtonView) view;
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
            if (this.f3780a == null) {
                this.f3780a = (Toolbar) view2.findViewById(R.id.toolbar);
            }
            Toolbar toolbar = this.f3780a;
            if (toolbar != null) {
                if (playButtonView.isLaidOut() && !playButtonView.isLayoutRequested()) {
                    m9669t(playButtonView, view2, toolbar);
                    return false;
                }
                playButtonView.addOnLayoutChangeListener(new p1b(this, playButtonView, view2, toolbar, 7));
            }
        }
        return false;
    }

    public PlayButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
