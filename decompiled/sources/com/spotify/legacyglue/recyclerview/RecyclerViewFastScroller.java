package com.spotify.legacyglue.recyclerview;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p204p.aug1;
import p204p.cjs0;
import p204p.iq6;
import p204p.lz8;
import p204p.mec1;
import p204p.u2u0;
import p204p.uqg1;
import p204p.wqg1;
import p204p.z10;

/* JADX INFO: loaded from: classes7.dex */
public class RecyclerViewFastScroller extends View {

    /* JADX INFO: renamed from: L0 */
    public final Handler f5079L0;

    /* JADX INFO: renamed from: M0 */
    public final cjs0 f5080M0;

    /* JADX INFO: renamed from: N0 */
    public final iq6 f5081N0;

    /* JADX INFO: renamed from: O0 */
    public final Rect f5082O0;

    /* JADX INFO: renamed from: P0 */
    public int f5083P0;

    /* JADX INFO: renamed from: Q0 */
    public ObjectAnimator f5084Q0;

    /* JADX INFO: renamed from: a */
    public RecyclerView f5085a;

    /* JADX INFO: renamed from: b */
    public final Drawable f5086b;

    /* JADX INFO: renamed from: c */
    public final int f5087c;

    /* JADX INFO: renamed from: d */
    public final int f5088d;

    /* JADX INFO: renamed from: e */
    public boolean f5089e;

    /* JADX INFO: renamed from: f */
    public final int f5090f;

    /* JADX INFO: renamed from: g */
    public LinearLayoutManager f5091g;

    /* JADX INFO: renamed from: h */
    public final lz8 f5092h;

    /* JADX INFO: renamed from: i */
    public final Paint f5093i;

    /* JADX INFO: renamed from: t */
    public boolean f5094t;

    public RecyclerViewFastScroller(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m12575b() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, uqg1.m83801y(this) ? -getMeasuredWidth() : getMeasuredWidth()));
        this.f5084Q0 = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        this.f5084Q0.setInterpolator(aug1.m27190m(this.f5085a.getContext()));
        this.f5084Q0.addListener(new z10(this, 14));
        this.f5084Q0.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m12576c() {
        Handler handler = this.f5079L0;
        cjs0 cjs0Var = this.f5080M0;
        handler.removeCallbacks(cjs0Var);
        handler.postDelayed(cjs0Var, this.f5090f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f5079L0.removeCallbacks(this.f5080M0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int i;
        lz8 lz8Var = this.f5092h;
        canvas.drawRect((Rect) lz8Var.f138284b, this.f5093i);
        Drawable drawable = this.f5086b;
        Rect rect = this.f5082O0;
        drawable.getPadding(rect);
        Rect rect2 = (Rect) lz8Var.f138285c;
        int iCenterY = rect2.centerY();
        int intrinsicHeight = iCenterY - (drawable.getIntrinsicHeight() / 2);
        int intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2) + iCenterY;
        if (uqg1.m83801y(this)) {
            i = rect2.left + rect.right;
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
        } else {
            int intrinsicWidth2 = rect2.right - drawable.getIntrinsicWidth();
            int i2 = rect.right;
            int i3 = intrinsicWidth2 - i2;
            intrinsicWidth = rect2.right - i2;
            i = i3;
        }
        drawable.setBounds(i, intrinsicHeight, intrinsicWidth, intrinsicHeight2);
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f5088d, 1073741824), i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        lz8 lz8Var = this.f5092h;
        ((Rect) lz8Var.f138284b).set(0, 0, measuredWidth, measuredHeight);
        Rect rect = (Rect) lz8Var.f138285c;
        rect.set(0, 0, measuredWidth, this.f5087c);
        rect.offsetTo(0, Math.round((((Rect) lz8Var.f138284b).height() - ((RecyclerViewFastScroller) lz8Var.f138286d).f5087c) * lz8Var.f138283a));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.f5094t;
        Drawable drawable = this.f5086b;
        lz8 lz8Var = this.f5092h;
        if (z && motionEvent.getAction() == 0 && ((Rect) lz8Var.f138285c).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.f5089e = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            drawable.setState(new int[]{R.attr.state_pressed});
            m12576c();
            return true;
        }
        if (motionEvent.getAction() != 2 || !this.f5089e) {
            if (!this.f5089e || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3)) {
                return super.onTouchEvent(motionEvent);
            }
            m12576c();
            drawable.setState(new int[0]);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f5089e = false;
            return true;
        }
        m12576c();
        lz8Var.getClass();
        lz8Var.m60294b((motionEvent.getY() - (((Rect) lz8Var.f138285c).height() / 2.0f)) / ((Rect) lz8Var.f138284b).height());
        if (!(this.f5085a.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Must be instance of LinearLayoutManager!");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f5085a.getLayoutManager();
        this.f5091g = linearLayoutManager;
        int iM1104R = (int) (linearLayoutManager.m1104R() * lz8Var.f138283a);
        if (iM1104R != 0) {
            this.f5091g.mo924I0(iM1104R);
        } else {
            this.f5091g.mo962x1(iM1104R, -this.f5083P0);
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        boolean z2 = this.f5094t;
        this.f5094t = false;
        this.f5079L0.removeCallbacks(this.f5080M0);
        if (z2) {
            m12575b();
        }
    }

    public void setFirstItemDecorationHeight(int i) {
        this.f5083P0 = i;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5085a;
        iq6 iq6Var = this.f5081N0;
        if (recyclerView2 != null) {
            recyclerView2.m1026q0(iq6Var);
            this.f5091g = null;
        }
        this.f5085a = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1018m(iq6Var);
        }
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.pasteRecyclerFastScrollerStyle);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5092h = new lz8(this);
        Paint paint = new Paint();
        this.f5093i = paint;
        this.f5079L0 = new Handler();
        this.f5080M0 = new cjs0(this, 7);
        this.f5081N0 = new iq6(this, 14);
        this.f5082O0 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u2u0.f226182d, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f5086b = drawable;
        this.f5087c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, wqg1.m88767v(72.0f, getResources()));
        this.f5088d = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, wqg1.m88767v(32.0f, getResources()));
        this.f5090f = typedArrayObtainStyledAttributes.getInt(0, 1000);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        drawable.getClass();
        paint.setColor(color);
        setVisibility(4);
    }
}
