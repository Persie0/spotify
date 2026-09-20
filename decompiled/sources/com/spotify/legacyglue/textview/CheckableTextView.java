package com.spotify.legacyglue.textview;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.textview.MaterialTextView;
import p204p.g000;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class CheckableTextView extends MaterialTextView implements Checkable {

    /* JADX INFO: renamed from: i */
    public static final int[] f5095i = {R.attr.state_checked};

    /* JADX INFO: renamed from: h */
    public boolean f5096h;

    public CheckableTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5096h;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f5096h) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5095i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f5096h = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5096h);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g000.m43251a(this, context);
    }
}
