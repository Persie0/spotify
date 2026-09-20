package com.spotify.legacyglue.widgetstate;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.music.R;
import p204p.alf1;
import p204p.e000;
import p204p.hw41;
import p204p.iw41;
import p204p.kiq;
import p204p.ojp;
import p204p.osr;
import p204p.u2u0;
import p204p.u55;
import p204p.yfs;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class StateListAnimatorButton extends u55 {

    /* JADX INFO: renamed from: d */
    public iw41 f5107d;

    /* JADX INFO: renamed from: e */
    public osr f5108e;

    public StateListAnimatorButton(Context context) {
        super(context, null);
        this.f5107d = new hw41(this);
        m12584i(null, 0);
    }

    @Override // p204p.u55, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        Drawable background;
        super.drawableStateChanged();
        osr osrVar = this.f5108e;
        if (osrVar != null) {
            StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) osrVar.f168864c;
            ojp ojpVar = (ojp) osrVar.f168865d;
            if (ojpVar.f166107a && (background = stateListAnimatorButton.getBackground()) != null) {
                yfs.m93567a(background, (ColorStateList) ojpVar.f166109c, stateListAnimatorButton.getDrawableState());
            }
        }
    }

    @Override // android.view.View
    public float getScaleX() {
        iw41 iw41Var = this.f5107d;
        return iw41Var != null ? iw41Var.mo48917c() : super.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        iw41 iw41Var = this.f5107d;
        return iw41Var != null ? iw41Var.mo48919e() : super.getScaleY();
    }

    /* JADX INFO: renamed from: i */
    public final void m12584i(AttributeSet attributeSet, int i) {
        boolean z;
        setIncludeFontPadding(false);
        alf1.m26332o(this).m72126a();
        e000.m37476b(this, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.glueFullBleed});
            try {
                z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
        }
        this.f5107d = z ? new kiq(this) : new hw41(this);
        osr osrVar = new osr(this);
        this.f5108e = osrVar;
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, u2u0.f226180b, i, 0);
        try {
            osrVar.f168863b = typedArrayObtainStyledAttributes2.getColor(2, -16777216);
            osrVar.f168862a = typedArrayObtainStyledAttributes2.getColor(3, -1);
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                ((ojp) osrVar.f168866e).f166108b = typedArrayObtainStyledAttributes2.getColor(4, -65281);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                ((ojp) osrVar.f168865d).f166108b = typedArrayObtainStyledAttributes2.getColor(1, -65281);
            }
            osrVar.m67753e();
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.f5107d.mo48916b(canvas);
    }

    @Override // p204p.u55, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        osr osrVar = this.f5108e;
        if (osrVar != null) {
            osrVar.m67753e();
        }
    }

    @Override // p204p.u55, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        osr osrVar = this.f5108e;
        if (osrVar != null) {
            osrVar.m67753e();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        iw41 iw41Var = this.f5107d;
        if (iw41Var != null) {
            iw41Var.mo48915a(f);
        } else {
            super.setScaleX(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        iw41 iw41Var = this.f5107d;
        if (iw41Var != null) {
            iw41Var.mo48918d(f);
        } else {
            super.setScaleY(f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e000.m37475a(this, i);
    }

    @Override // p204p.u55, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e000.m37475a(this, i);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5107d = new hw41(this);
        m12584i(attributeSet, 0);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5107d = new hw41(this);
        m12584i(attributeSet, i);
    }
}
