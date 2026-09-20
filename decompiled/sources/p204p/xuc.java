package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xuc extends ViewGroup {

    /* JADX INFO: renamed from: L0 */
    public euq f266047L0;

    /* JADX INFO: renamed from: M0 */
    public q580 f266048M0;

    /* JADX INFO: renamed from: N0 */
    public evc f266049N0;

    /* JADX INFO: renamed from: O0 */
    public String f266050O0;

    /* JADX INFO: renamed from: P0 */
    public s580 f266051P0;

    /* JADX INFO: renamed from: Q0 */
    public gho f266052Q0;

    /* JADX INFO: renamed from: R0 */
    public cvc f266053R0;

    /* JADX INFO: renamed from: S0 */
    public pkc1 f266054S0;

    /* JADX INFO: renamed from: T0 */
    public yuc f266055T0;

    /* JADX INFO: renamed from: U0 */
    public float f266056U0;

    /* JADX INFO: renamed from: V0 */
    public float f266057V0;

    /* JADX INFO: renamed from: W0 */
    public float f266058W0;

    /* JADX INFO: renamed from: X0 */
    public float f266059X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f266060Y0;

    /* JADX INFO: renamed from: Z0 */
    public bs20[] f266061Z0;

    /* JADX INFO: renamed from: a */
    public boolean f266062a;

    /* JADX INFO: renamed from: a1 */
    public float f266063a1;

    /* JADX INFO: renamed from: b */
    public zuc f266064b;

    /* JADX INFO: renamed from: b1 */
    public ArrayList f266065b1;

    /* JADX INFO: renamed from: c */
    public boolean f266066c;

    /* JADX INFO: renamed from: c1 */
    public boolean f266067c1;

    /* JADX INFO: renamed from: d */
    public boolean f266068d;

    /* JADX INFO: renamed from: e */
    public float f266069e;

    /* JADX INFO: renamed from: f */
    public t5p f266070f;

    /* JADX INFO: renamed from: g */
    public Paint f266071g;

    /* JADX INFO: renamed from: h */
    public Paint f266072h;

    /* JADX INFO: renamed from: i */
    public qfe1 f266073i;

    /* JADX INFO: renamed from: t */
    public boolean f266074t;

    /* JADX INFO: renamed from: e */
    public static void m92131e(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                m92131e(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo37196a();

    /* JADX INFO: renamed from: b */
    public abstract bs20 mo92132b(float f, float f2);

    /* JADX INFO: renamed from: c */
    public final void m92133c(bs20 bs20Var) {
        lyv lyvVarM27369b;
        if (bs20Var == null) {
            this.f266061Z0 = null;
        } else {
            int i = bs20Var.f30220e;
            if (this.f266062a) {
                bs20Var.toString();
            }
            zuc zucVar = this.f266064b;
            zucVar.getClass();
            ArrayList arrayList = zucVar.f286413i;
            if (i >= arrayList.size()) {
                lyvVarM27369b = null;
            } else {
                lyvVarM27369b = ((ax8) ((qu30) arrayList.get(i))).m27369b(bs20Var.f30216a, bs20Var.f30217b);
            }
            if (lyvVarM27369b == null) {
                this.f266061Z0 = null;
            } else {
                this.f266061Z0 = new bs20[]{bs20Var};
            }
        }
        setLastHighlighted(this.f266061Z0);
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo37197d();

    public yuc getAnimator() {
        return this.f266055T0;
    }

    public erb0 getCenter() {
        return erb0.m39774b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public erb0 getCenterOfView() {
        return getCenter();
    }

    public erb0 getCenterOffsets() {
        RectF rectF = this.f266054S0.f178432b;
        return erb0.m39774b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.f266054S0.f178432b;
    }

    public zuc getData() {
        return this.f266064b;
    }

    public ly30 getDefaultValueFormatter() {
        return this.f266070f;
    }

    public euq getDescription() {
        return this.f266047L0;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f266069e;
    }

    public float getExtraBottomOffset() {
        return this.f266058W0;
    }

    public float getExtraLeftOffset() {
        return this.f266059X0;
    }

    public float getExtraRightOffset() {
        return this.f266057V0;
    }

    public float getExtraTopOffset() {
        return this.f266056U0;
    }

    public bs20[] getHighlighted() {
        return this.f266061Z0;
    }

    public yu30 getHighlighter() {
        return this.f266053R0;
    }

    public ArrayList<Runnable> getJobs() {
        return this.f266065b1;
    }

    public q580 getLegend() {
        return this.f266048M0;
    }

    public s580 getLegendRenderer() {
        return this.f266051P0;
    }

    public bv30 getMarker() {
        return null;
    }

    @Deprecated
    public bv30 getMarkerView() {
        getMarker();
        return null;
    }

    public float getMaxHighlightDistance() {
        return this.f266063a1;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public m7l0 getOnChartGestureListener() {
        return null;
    }

    public evc getOnTouchListener() {
        return this.f266049N0;
    }

    public gho getRenderer() {
        return this.f266052Q0;
    }

    public pkc1 getViewPortHandler() {
        return this.f266054S0;
    }

    public qfe1 getXAxis() {
        return this.f266073i;
    }

    public float getXChartMax() {
        return this.f266073i.f121128y;
    }

    public float getXChartMin() {
        return this.f266073i.f121129z;
    }

    public float getXRange() {
        return this.f266073i.f121107A;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f266064b.f286405a;
    }

    public float getYMin() {
        return this.f266064b.f286406b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f266067c1) {
            m92131e(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f266064b == null) {
            if (TextUtils.isEmpty(this.f266050O0)) {
                return;
            }
            erb0 center = getCenter();
            canvas.drawText(this.f266050O0, center.f62074b, center.f62075c, this.f266072h);
            return;
        }
        if (this.f266060Y0) {
            return;
        }
        mo37196a();
        this.f266060Y0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iM82122c = (int) u0b1.m82122c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iM82122c, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iM82122c, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.f266065b1;
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            pkc1 pkc1Var = this.f266054S0;
            float f = i;
            float f2 = i2;
            RectF rectF = pkc1Var.f178432b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = pkc1Var.f178433c - rectF.right;
            float f6 = pkc1Var.f178434d - rectF.bottom;
            pkc1Var.f178434d = f2;
            pkc1Var.f178433c = f;
            rectF.set(f3, f4, f - f5, f2 - f6);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                post((Runnable) it.next());
            }
            arrayList.clear();
        }
        mo37197d();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(zuc zucVar) {
        t5p t5pVar = this.f266070f;
        this.f266064b = zucVar;
        this.f266060Y0 = false;
        if (zucVar == null) {
            return;
        }
        float f = zucVar.f286406b;
        float f2 = zucVar.f286405a;
        float fM82123d = u0b1.m82123d(zucVar.m97018d() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        t5pVar.m80125f(Float.isInfinite(fM82123d) ? 0 : ((int) Math.ceil(-Math.log10(fM82123d))) + 2);
        Iterator it = this.f266064b.f286413i.iterator();
        while (it.hasNext()) {
            ax8 ax8Var = (ax8) ((qu30) it.next());
            Object obj = ax8Var.f20788f;
            if (obj != null) {
                if (obj == null) {
                    obj = u0b1.f225441g;
                }
                if (obj == t5pVar) {
                }
            }
            ax8Var.f20788f = t5pVar;
        }
        mo37197d();
    }

    public void setDescription(euq euqVar) {
        this.f266047L0 = euqVar;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.f266068d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.f266069e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setExtraBottomOffset(float f) {
        this.f266058W0 = u0b1.m82122c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.f266059X0 = u0b1.m82122c(f);
    }

    public void setExtraRightOffset(float f) {
        this.f266057V0 = u0b1.m82122c(f);
    }

    public void setExtraTopOffset(float f) {
        this.f266056U0 = u0b1.m82122c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.f266066c = z;
    }

    public void setHighlighter(cvc cvcVar) {
        this.f266053R0 = cvcVar;
    }

    public void setLastHighlighted(bs20[] bs20VarArr) {
        bs20 bs20Var;
        if (bs20VarArr == null || bs20VarArr.length <= 0 || (bs20Var = bs20VarArr[0]) == null) {
            this.f266049N0.f63201b = null;
        } else {
            this.f266049N0.f63201b = bs20Var;
        }
    }

    public void setLogEnabled(boolean z) {
        this.f266062a = z;
    }

    @Deprecated
    public void setMarkerView(bv30 bv30Var) {
        setMarker(bv30Var);
    }

    public void setMaxHighlightDistance(float f) {
        this.f266063a1 = u0b1.m82122c(f);
    }

    public void setNoDataText(String str) {
        this.f266050O0 = str;
    }

    public void setNoDataTextColor(int i) {
        this.f266072h.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f266072h.setTypeface(typeface);
    }

    public void setOnTouchListener(evc evcVar) {
        this.f266049N0 = evcVar;
    }

    public void setRenderer(gho ghoVar) {
        if (ghoVar != null) {
            this.f266052Q0 = ghoVar;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f266074t = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.f266067c1 = z;
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setMarker(bv30 bv30Var) {
    }

    public void setOnChartGestureListener(m7l0 m7l0Var) {
    }

    public void setOnChartValueSelectedListener(n7l0 n7l0Var) {
    }
}
