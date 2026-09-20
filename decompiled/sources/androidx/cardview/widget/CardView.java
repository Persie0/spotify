package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p204p.d67;
import p204p.n95;
import p204p.q1u0;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f484f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g */
    public static final d67 f485g = new d67(2);

    /* JADX INFO: renamed from: a */
    public boolean f486a;

    /* JADX INFO: renamed from: b */
    public boolean f487b;

    /* JADX INFO: renamed from: c */
    public final Rect f488c;

    /* JADX INFO: renamed from: d */
    public final Rect f489d;

    /* JADX INFO: renamed from: e */
    public final n95 f490e;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f485g.m35062f(this.f490e);
    }

    public float getCardElevation() {
        return f485g.m35063g(this.f490e);
    }

    public int getContentPaddingBottom() {
        return this.f488c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f488c.left;
    }

    public int getContentPaddingRight() {
        return this.f488c.right;
    }

    public int getContentPaddingTop() {
        return this.f488c.top;
    }

    public float getMaxCardElevation() {
        return f485g.m35064h(this.f490e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f487b;
    }

    public float getRadius() {
        return f485g.m35065i(this.f490e);
    }

    public boolean getUseCompatPadding() {
        return this.f486a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f485g.m35071q(this.f490e, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f485g.m35072r(this.f490e, f);
    }

    public void setMaxCardElevation(float f) {
        f485g.m35073s(this.f490e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f487b) {
            this.f487b = z;
            f485g.m35070p(this.f490e);
        }
    }

    public void setRadius(float f) {
        f485g.m35074t(this.f490e, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f486a != z) {
            this.f486a = z;
            f485g.m35069o(this.f490e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f485g.m35071q(this.f490e, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f488c = rect;
        this.f489d = new Rect();
        n95 n95Var = new n95(this);
        this.f490e = n95Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1u0.f184409a, i, com.spotify.music.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f484f);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.spotify.music.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.spotify.music.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f486a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f487b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        f485g.m35066j(n95Var, colorStateList, dimension, dimension2, f);
    }
}
