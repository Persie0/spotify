package com.spotify.legacyglue.viewgroup;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p204p.job;
import p204p.re0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class PasteLinearLayout extends LinearLayout implements re0, job {

    /* JADX INFO: renamed from: c */
    public static final int[] f5103c = {R.attr.state_active};

    /* JADX INFO: renamed from: d */
    public static final int[] f5104d = {-16842910};

    /* JADX INFO: renamed from: a */
    public boolean f5105a;

    /* JADX INFO: renamed from: b */
    public boolean f5106b;

    public PasteLinearLayout(Context context) {
        this(context, null);
    }

    @Override // p204p.job
    /* JADX INFO: renamed from: a */
    public final boolean mo12577a() {
        return this.f5106b;
    }

    @Override // p204p.re0
    public final boolean isActive() {
        return this.f5105a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f5105a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5103c);
        }
        if (this.f5106b) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5104d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p204p.re0
    public void setActive(boolean z) {
        this.f5105a = z;
        refreshDrawableState();
    }

    @Override // p204p.job
    public void setAppearsDisabled(boolean z) {
        this.f5106b = z;
        refreshDrawableState();
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
