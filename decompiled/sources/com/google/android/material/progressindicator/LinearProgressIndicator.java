package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.bl80;
import p204p.gl80;
import p204p.h4r;
import p204p.i09;
import p204p.mec1;
import p204p.tn40;
import p204p.vk80;
import p204p.zk80;

/* JADX INFO: loaded from: classes4.dex */
public final class LinearProgressIndicator extends i09 {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // p204p.i09
    /* JADX INFO: renamed from: a */
    public final void mo1624a(int i) {
        gl80 gl80Var = this.f97158a;
        if (gl80Var != null && gl80Var.f81019g == 0 && isIndeterminate()) {
            return;
        }
        super.mo1624a(i);
    }

    public int getIndeterminateAnimationType() {
        return this.f97158a.f81019g;
    }

    public int getIndicatorDirection() {
        return this.f97158a.f81020h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gl80 gl80Var = this.f97158a;
        boolean z2 = true;
        if (gl80Var.f81020h != 1) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if ((getLayoutDirection() != 1 || gl80Var.f81020h != 2) && (getLayoutDirection() != 0 || gl80Var.f81020h != 3)) {
                z2 = false;
            }
        }
        gl80Var.f81021i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        tn40 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h4r progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        gl80 gl80Var = this.f97158a;
        if (gl80Var.f81019g == i) {
            return;
        }
        if (m49314b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        gl80Var.f81019g = i;
        gl80Var.mo44471a();
        if (i == 0) {
            tn40 indeterminateDrawable = getIndeterminateDrawable();
            zk80 zk80Var = new zk80(gl80Var);
            indeterminateDrawable.f221882Z = zk80Var;
            zk80Var.f226861b = indeterminateDrawable;
        } else {
            tn40 indeterminateDrawable2 = getIndeterminateDrawable();
            bl80 bl80Var = new bl80(getContext(), gl80Var);
            indeterminateDrawable2.f221882Z = bl80Var;
            bl80Var.f226861b = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // p204p.i09
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.f97158a.mo44471a();
    }

    public void setIndicatorDirection(int i) {
        gl80 gl80Var = this.f97158a;
        gl80Var.f81020h = i;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if ((getLayoutDirection() != 1 || gl80Var.f81020h != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        gl80Var.f81021i = z;
        invalidate();
    }

    @Override // p204p.i09
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.f97158a.mo44471a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        gl80 gl80Var = this.f97158a;
        setIndeterminateDrawable(new tn40(context2, gl80Var, new vk80(gl80Var), gl80Var.f81019g == 0 ? new zk80(gl80Var) : new bl80(context2, gl80Var)));
        setProgressDrawable(new h4r(getContext(), gl80Var, new vk80(gl80Var)));
    }
}
