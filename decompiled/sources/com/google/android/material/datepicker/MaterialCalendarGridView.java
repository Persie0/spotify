package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p204p.gyh0;
import p204p.k3d0;
import p204p.kza1;
import p204p.mec1;
import p204p.usa;

/* JADX INFO: loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f2115a;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final gyh0 m1616a() {
        return (gyh0) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (gyh0) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((gyh0) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gyh0 gyh0Var = (gyh0) super.getAdapter();
        gyh0Var.getClass();
        int iMax = Math.max(gyh0Var.f85631a.m43106j(), getFirstVisiblePosition());
        int iMin = Math.min(gyh0Var.m46163b(), getLastVisiblePosition());
        gyh0Var.getItem(iMax);
        gyh0Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((gyh0) super.getAdapter()).m46163b());
        } else if (i == 130) {
            setSelection(((gyh0) super.getAdapter()).f85631a.m43106j());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((gyh0) super.getAdapter()).f85631a.m43106j()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((gyh0) super.getAdapter()).f85631a.m43106j());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f2115a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((gyh0) super.getAdapter()).f85631a.m43106j()) {
            super.setSelection(((gyh0) super.getAdapter()).f85631a.m43106j());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (gyh0) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof gyh0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), gyh0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kza1.m57748c(null);
        if (k3d0.m55238t1(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.spotify.music.R.id.cancel_button);
            setNextFocusRightId(com.spotify.music.R.id.confirm_button);
        }
        this.f2115a = k3d0.m55238t1(getContext(), com.spotify.music.R.attr.nestedScrollable);
        mec1.m61564p(this, new usa(14));
    }
}
