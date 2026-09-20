package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class k081 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public int f117932a;

    /* JADX INFO: renamed from: b */
    public int f117933b;

    public k081(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117932a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87322b);
        this.f117932a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f117933b = 0;
    }

    public k081() {
        super(-2, -2);
        this.f117933b = 0;
        this.f117932a = 8388627;
    }

    public k081(k081 k081Var, Object obj) {
        super((ViewGroup.MarginLayoutParams) k081Var);
        this.f117932a = 0;
        this.f117932a = k081Var.f117932a;
    }

    public k081(ViewGroup.LayoutParams layoutParams, int i) {
        super(layoutParams);
        this.f117932a = 0;
    }

    public k081(k081 k081Var) {
        this(k081Var, (Object) null);
        this.f117933b = 0;
        this.f117933b = k081Var.f117933b;
    }

    public k081(k081 k081Var, int i) {
        this(k081Var, (Object) null);
        this.f117933b = 0;
    }

    public k081(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this(marginLayoutParams, 0);
        this.f117933b = 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public k081(ViewGroup.LayoutParams layoutParams) {
        this(layoutParams, 0);
        this.f117933b = 0;
    }
}
