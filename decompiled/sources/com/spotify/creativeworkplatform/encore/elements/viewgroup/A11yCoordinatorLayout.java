package com.spotify.creativeworkplatform.encore.elements.viewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/viewgroup/A11yCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_creativeworkplatform_encore_elements_viewgroup-A11yCoordinatorLayout"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class A11yCoordinatorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: Z0 */
    public int f3550Z0;

    public A11yCoordinatorLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 61) {
            int i = this.f3550Z0;
            if (i != -1) {
                findViewById(i).requestFocus();
                this.f3550Z0 = -1;
                return true;
            }
            View viewFindFocus = findFocus();
            ViewParent parent = viewFindFocus != null ? viewFindFocus.getParent() : null;
            ComposeView composeView = parent instanceof ComposeView ? (ComposeView) parent : null;
            Integer numValueOf = Integer.valueOf(composeView != null ? composeView.getNextFocusForwardId() : viewFindFocus.getNextFocusForwardId());
            Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
            if (num != null) {
                this.f3550Z0 = num.intValue();
            }
        } else {
            this.f3550Z0 = -1;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public A11yCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public A11yCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3550Z0 = -1;
    }

    public /* synthetic */ A11yCoordinatorLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
