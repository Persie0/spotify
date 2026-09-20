package com.spotify.legacyglue.icons;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;
import p204p.alf1;
import p204p.mec1;
import p204p.o1u0;
import p204p.tc41;
import p204p.vc41;
import p204p.wqg1;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SpotifyIconView extends AppCompatImageView {

    /* JADX INFO: renamed from: f */
    public static final int[] f5075f = {R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius};

    /* JADX INFO: renamed from: d */
    public vc41 f5076d;

    /* JADX INFO: renamed from: e */
    public final tc41 f5077e;

    public SpotifyIconView(Context context) {
        this(context, null);
    }

    public void setColor(int i) {
        this.f5077e.m80417b(i);
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.f5077e.m80418c(colorStateList);
    }

    public void setIcon(vc41 vc41Var) {
        this.f5076d = vc41Var;
        tc41 tc41Var = this.f5077e;
        tc41Var.f219008a = vc41Var;
        tc41Var.m80421f();
        tc41Var.m80422g();
        tc41Var.invalidateSelf();
        WeakHashMap weakHashMap = mec1.f142677a;
        postInvalidateOnAnimation();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public SpotifyIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public tc41 getDrawable() {
        return this.f5077e;
    }

    @SuppressLint({"ResourceType"})
    public SpotifyIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5076d = vc41.ALBUM;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o1u0.f160863a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i2 != -1) {
            this.f5076d = vc41.f239797R7[i2];
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5075f, i, 0);
        float f = typedArrayObtainStyledAttributes2.getFloat(3, 0.0f);
        float f2 = typedArrayObtainStyledAttributes2.getFloat(1, 0.0f);
        float f3 = typedArrayObtainStyledAttributes2.getFloat(2, 0.0f);
        int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (dimension != -1.0f) {
            this.f5077e = new tc41(getContext(), this.f5076d, dimension);
        } else {
            this.f5077e = new tc41(getContext(), this.f5076d, wqg1.m88767v(32.0f, getResources()));
        }
        this.f5077e.m80418c(colorStateList == null ? ColorStateList.valueOf(-1) : colorStateList);
        setImageDrawable(this.f5077e);
        tc41 tc41Var = this.f5077e;
        tc41Var.f219014g.setShadowLayer(f, f2, f3, color);
        tc41Var.invalidateSelf();
        if (isInEditMode()) {
            return;
        }
        alf1.m26332o(this).m72126a();
    }
}
