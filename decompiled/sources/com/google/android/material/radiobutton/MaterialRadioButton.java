package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p204p.bcg1;
import p204p.h1u0;
import p204p.vgg1;
import p204p.vtg1;
import p204p.wtg1;
import p204p.x65;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialRadioButton extends x65 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f2158g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f2159e;

    /* JADX INFO: renamed from: f */
    public boolean f2160f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2159e == null) {
            int iM86387n = vtg1.m86387n(this, com.spotify.music.R.attr.colorControlActivated);
            int iM86387n2 = vtg1.m86387n(this, com.spotify.music.R.attr.colorOnSurface);
            int iM86387n3 = vtg1.m86387n(this, com.spotify.music.R.attr.colorSurface);
            this.f2159e = new ColorStateList(f2158g, new int[]{vtg1.m86393t(iM86387n3, iM86387n, 1.0f), vtg1.m86393t(iM86387n3, iM86387n2, 0.54f), vtg1.m86393t(iM86387n3, iM86387n2, 0.38f), vtg1.m86393t(iM86387n3, iM86387n2, 0.38f)});
        }
        return this.f2159e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2160f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f2160f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM28739t = bcg1.m28739t(context2, attributeSet, h1u0.f86712A, i, com.spotify.music.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM28739t.hasValue(0)) {
            setButtonTintList(wtg1.m88942q(context2, typedArrayM28739t, 0));
        }
        this.f2160f = typedArrayM28739t.getBoolean(1, false);
        typedArrayM28739t.recycle();
    }
}
