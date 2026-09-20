package com.spotify.encoreconsumermobile.layout.headers;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import p204p.cky0;
import p204p.dky0;
import p204p.eqk;
import p204p.hqk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/layout/headers/BehaviorRetainingAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/eqk;", "getBehavior", "()Lp/eqk;", "", "getReachedBottomOfScrollRange", "()Z", "reachedBottomOfScrollRange", "src_main_java_com_spotify_encoreconsumermobile_layout_headers-headers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BehaviorRetainingAppBarLayout extends AppBarLayout {

    /* JADX INFO: renamed from: T0 */
    public dky0 f3778T0;

    public BehaviorRetainingAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final boolean getReachedBottomOfScrollRange() {
        dky0 dky0Var = this.f3778T0;
        return dky0Var != null && (-dky0Var.m61963t()) == getTotalScrollRange();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, p204p.dqk
    public eqk getBehavior() {
        if (this.f3778T0 == null) {
            dky0 dky0Var = new dky0();
            dky0Var.f1947o = new cky0(dky0Var);
            this.f3778T0 = dky0Var;
        }
        return this.f3778T0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight = getMeasuredHeight();
        boolean z = measuredHeight > 0 && getReachedBottomOfScrollRange();
        super.onMeasure(i, i2);
        if (this.f3778T0 == null) {
            this.f3778T0 = (dky0) ((hqk) getLayoutParams()).f94198a;
        }
        if (!z || getMeasuredHeight() <= measuredHeight) {
            return;
        }
        m1529e(false, false, true);
    }
}
