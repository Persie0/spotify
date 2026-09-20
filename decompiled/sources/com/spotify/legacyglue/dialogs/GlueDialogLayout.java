package com.spotify.legacyglue.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.spotify.music.R;
import p204p.q2u0;
import p204p.wqg1;

/* JADX INFO: loaded from: classes7.dex */
public class GlueDialogLayout extends LinearLayout {

    /* JADX INFO: renamed from: L0 */
    public Button f5031L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f5032M0;

    /* JADX INFO: renamed from: N0 */
    public final Paint f5033N0;

    /* JADX INFO: renamed from: a */
    public final int f5034a;

    /* JADX INFO: renamed from: b */
    public final int f5035b;

    /* JADX INFO: renamed from: c */
    public final int f5036c;

    /* JADX INFO: renamed from: d */
    public final int f5037d;

    /* JADX INFO: renamed from: e */
    public final int f5038e;

    /* JADX INFO: renamed from: f */
    public final int f5039f;

    /* JADX INFO: renamed from: g */
    public final int f5040g;

    /* JADX INFO: renamed from: h */
    public final int f5041h;

    /* JADX INFO: renamed from: i */
    public ScrollView f5042i;

    /* JADX INFO: renamed from: t */
    public Button f5043t;

    public GlueDialogLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static int m12560a(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + measuredHeight;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.f5032M0 || view != this.f5042i) {
            return super.drawChild(canvas, view, j);
        }
        super.drawChild(canvas, view, j);
        canvas.save();
        float left = view.getLeft();
        int bottom = view.getBottom();
        int i = this.f5038e;
        canvas.translate(left, bottom - i);
        canvas.scale(1.0f, i);
        canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), 1.0f, this.f5033N0);
        canvas.restore();
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5042i = (ScrollView) findViewById(R.id.content);
        this.f5043t = (Button) findViewById(R.id.button_positive);
        this.f5031L0 = (Button) findViewById(R.id.button_negative);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(getResources().getDisplayMetrics().widthPixels - (this.f5036c * 2), this.f5034a);
        ScrollView scrollView = this.f5042i;
        if (scrollView == null || scrollView.getChildAt(0) == null) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
            return;
        }
        int iMin2 = Math.min(getResources().getDisplayMetrics().heightPixels - (this.f5037d * 2), this.f5035b);
        View childAt = this.f5042i.getChildAt(0);
        childAt.measure(View.MeasureSpec.makeMeasureSpec((iMin - this.f5042i.getPaddingLeft()) - this.f5042i.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = childAt.getMeasuredHeight();
        Button button = this.f5043t;
        boolean z = button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
        int i3 = this.f5040g;
        if (z) {
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = i3;
        }
        measureChildWithMargins(this.f5043t, i, 0, i2, 0);
        measureChildWithMargins(this.f5031L0, i, 0, i2, 0);
        int iM12560a = m12560a(this.f5031L0);
        int iM12560a2 = m12560a(this.f5043t) + measuredHeight + iM12560a;
        if (iM12560a2 <= iMin2) {
            this.f5032M0 = false;
            this.f5042i.getLayoutParams().height = measuredHeight;
        } else {
            this.f5032M0 = true;
            Button button2 = this.f5043t;
            boolean z2 = button2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
            int i4 = this.f5041h;
            if (z2) {
                ((ViewGroup.MarginLayoutParams) button2.getLayoutParams()).topMargin = i4;
            }
            int i5 = iM12560a2 - iMin2;
            int i6 = i3 - i4;
            this.f5042i.getLayoutParams().height = (iMin2 - m12560a(this.f5043t)) - iM12560a;
            if (i5 <= i6) {
                this.f5042i.getLayoutParams().height -= i6;
            }
            ScrollView scrollView2 = this.f5042i;
            scrollView2.setPadding(scrollView2.getPaddingLeft(), 0, this.f5042i.getPaddingRight(), this.f5039f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f5033N0 = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2u0.f184716a, i, 0);
        try {
            this.f5034a = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, wqg1.m88767v(312.0f, getResources()));
            this.f5035b = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, wqg1.m88767v(520.0f, getResources()));
            this.f5036c = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, wqg1.m88767v(24.0f, getResources()));
            this.f5037d = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, wqg1.m88767v(24.0f, getResources()));
            this.f5038e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, wqg1.m88767v(48.0f, getResources()));
            this.f5040g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, wqg1.m88767v(48.0f, getResources()));
            this.f5041h = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, wqg1.m88767v(32.0f, getResources()));
            this.f5039f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, wqg1.m88767v(40.0f, getResources()));
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, typedArrayObtainStyledAttributes.getColor(2, -1), Shader.TileMode.CLAMP));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
