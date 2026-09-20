package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import p204p.C2569xe;
import p204p.mec1;
import p204p.nyd;

/* JADX INFO: loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f2143g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f2144d;

    /* JADX INFO: renamed from: e */
    public boolean f2145e;

    /* JADX INFO: renamed from: f */
    public boolean f2146f;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2144d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f2144d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2143g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nyd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nyd nydVar = (nyd) parcelable;
        super.onRestoreInstanceState(nydVar.f161807a);
        setChecked(nydVar.f159780c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        nyd nydVar = new nyd(super.onSaveInstanceState());
        nydVar.f159780c = this.f2144d;
        return nydVar;
    }

    public void setCheckable(boolean z) {
        if (this.f2145e != z) {
            this.f2145e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f2145e || this.f2144d == z) {
            return;
        }
        this.f2144d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f2146f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f2146f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2144d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2145e = true;
        this.f2146f = true;
        mec1.m61564p(this, new C2569xe(this, 4));
    }
}
