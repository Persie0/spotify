package p204p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class il80 {

    /* JADX INFO: renamed from: a */
    public int f103318a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f103319b;

    /* JADX INFO: renamed from: c */
    public AbstractC0110a f103320c;

    /* JADX INFO: renamed from: d */
    public boolean f103321d;

    /* JADX INFO: renamed from: e */
    public boolean f103322e;

    /* JADX INFO: renamed from: f */
    public View f103323f;

    /* JADX INFO: renamed from: g */
    public final owo f103324g;

    /* JADX INFO: renamed from: h */
    public final LinearInterpolator f103325h;

    /* JADX INFO: renamed from: i */
    public final DecelerateInterpolator f103326i;

    /* JADX INFO: renamed from: j */
    public PointF f103327j;

    /* JADX INFO: renamed from: k */
    public final DisplayMetrics f103328k;

    /* JADX INFO: renamed from: l */
    public boolean f103329l;

    /* JADX INFO: renamed from: m */
    public float f103330m;

    /* JADX INFO: renamed from: n */
    public int f103331n;

    /* JADX INFO: renamed from: o */
    public int f103332o;

    public il80(Context context) {
        owo owoVar = new owo();
        owoVar.f170745d = -1;
        owoVar.f170746e = false;
        owoVar.f170742a = 0;
        owoVar.f170743b = 0;
        owoVar.f170744c = Integer.MIN_VALUE;
        owoVar.f170747f = null;
        this.f103324g = owoVar;
        this.f103325h = new LinearInterpolator();
        this.f103326i = new DecelerateInterpolator();
        this.f103329l = false;
        this.f103331n = 0;
        this.f103332o = 0;
        this.f103328k = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public int mo43803a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public float mo34955b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: c */
    public int mo50990c(int i) {
        float fAbs = Math.abs(i);
        if (!this.f103329l) {
            this.f103330m = mo34955b(this.f103328k);
            this.f103329l = true;
        }
        return (int) Math.ceil(fAbs * this.f103330m);
    }

    /* JADX INFO: renamed from: d */
    public PointF mo43804d(int i) {
        Object obj = this.f103320c;
        if (obj instanceof yjv0) {
            return ((yjv0) obj).mo932a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final int m50991e() {
        return this.f103318a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m50992f() {
        return this.f103321d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50993g() {
        return this.f103322e;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX INFO: renamed from: h */
    public final void m50994h(int i, int i2) {
        PointF pointFMo43804d;
        RecyclerView recyclerView = this.f103319b;
        if (this.f103318a == -1 || recyclerView == null) {
            m50999m();
        }
        if (this.f103321d && this.f103323f == null && this.f103320c != null && (pointFMo43804d = mo43804d(this.f103318a)) != null) {
            float f = pointFMo43804d.x;
            if (f != 0.0f || pointFMo43804d.y != 0.0f) {
                recyclerView.m1033u0((int) Math.signum(f), (int) Math.signum(pointFMo43804d.y), null);
            }
        }
        this.f103321d = false;
        View view = this.f103323f;
        owo owoVar = this.f103324g;
        if (view != null) {
            this.f103319b.getClass();
            if (RecyclerView.m968S(view) == this.f103318a) {
                View view2 = this.f103323f;
                zjv0 zjv0Var = recyclerView.f1194F1;
                mo50996j(view2, owoVar);
                owoVar.m68176f(recyclerView);
                m50999m();
            } else {
                this.f103323f = null;
            }
        }
        if (this.f103322e) {
            zjv0 zjv0Var2 = recyclerView.f1194F1;
            if (this.f103319b.f1206O0.m1097I() == 0) {
                m50999m();
            } else {
                int i3 = this.f103331n;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f103331n = i4;
                int i5 = this.f103332o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f103332o = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFMo43804d2 = mo43804d(this.f103318a);
                    if (pointFMo43804d2 != null) {
                        float f2 = pointFMo43804d2.x;
                        if (f2 == 0.0f && pointFMo43804d2.y == 0.0f) {
                            owoVar.f170745d = this.f103318a;
                            m50999m();
                        } else {
                            float f3 = pointFMo43804d2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFMo43804d2.x / fSqrt;
                            pointFMo43804d2.x = f4;
                            float f5 = pointFMo43804d2.y / fSqrt;
                            pointFMo43804d2.y = f5;
                            this.f103327j = pointFMo43804d2;
                            this.f103331n = (int) (f4 * 10000.0f);
                            this.f103332o = (int) (f5 * 10000.0f);
                            int iMo50990c = mo50990c(10000);
                            int i7 = (int) (this.f103331n * 1.2f);
                            int i8 = (int) (this.f103332o * 1.2f);
                            owoVar.f170742a = i7;
                            owoVar.f170743b = i8;
                            owoVar.f170744c = (int) (iMo50990c * 1.2f);
                            owoVar.f170747f = this.f103325h;
                            owoVar.f170746e = true;
                        }
                    } else {
                        owoVar.f170745d = this.f103318a;
                        m50999m();
                    }
                }
            }
            boolean z = owoVar.f170745d >= 0;
            owoVar.m68176f(recyclerView);
            if (z && this.f103322e) {
                this.f103321d = true;
                recyclerView.f1191C1.m33203b();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m50995i(View view) {
        this.f103319b.getClass();
        if (RecyclerView.m968S(view) == this.f103318a) {
            this.f103323f = view;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX INFO: renamed from: j */
    public void mo50996j(View view, owo owoVar) {
        int i;
        il80 il80Var;
        int iMo43803a;
        int i2;
        PointF pointF = this.f103327j;
        int iMo43803a2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        AbstractC0110a abstractC0110a = this.f103320c;
        if (abstractC0110a == null || !abstractC0110a.mo951q()) {
            il80Var = this;
            iMo43803a = 0;
        } else {
            ojv0 ojv0Var = (ojv0) view.getLayoutParams();
            il80Var = this;
            iMo43803a = il80Var.mo43803a(AbstractC0110a.m1079M(view) - ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin, AbstractC0110a.m1081P(view) + ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin, abstractC0110a.getPaddingLeft(), abstractC0110a.f1288M0 - abstractC0110a.getPaddingRight(), i);
        }
        PointF pointF2 = il80Var.f103327j;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        } else {
            i2 = 0;
        }
        AbstractC0110a abstractC0110a2 = il80Var.f103320c;
        if (abstractC0110a2 != null && abstractC0110a2.mo953r()) {
            ojv0 ojv0Var2 = (ojv0) view.getLayoutParams();
            iMo43803a2 = il80Var.mo43803a(AbstractC0110a.m1082Q(view) - ((ViewGroup.MarginLayoutParams) ojv0Var2).topMargin, AbstractC0110a.m1078L(view) + ((ViewGroup.MarginLayoutParams) ojv0Var2).bottomMargin, abstractC0110a2.getPaddingTop(), abstractC0110a2.f1289N0 - abstractC0110a2.getPaddingBottom(), i2);
        }
        int iCeil = (int) Math.ceil(((double) mo50990c((int) Math.sqrt((iMo43803a2 * iMo43803a2) + (iMo43803a * iMo43803a)))) / 0.3356d);
        if (iCeil > 0) {
            owoVar.f170742a = -iMo43803a;
            owoVar.f170743b = -iMo43803a2;
            owoVar.f170744c = iCeil;
            owoVar.f170747f = il80Var.f103326i;
            owoVar.f170746e = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m50997k(int i) {
        this.f103318a = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m50998l(RecyclerView recyclerView, AbstractC0110a abstractC0110a) {
        ckv0 ckv0Var = recyclerView.f1191C1;
        ckv0Var.f39096g.removeCallbacks(ckv0Var);
        ckv0Var.f39092c.abortAnimation();
        this.f103319b = recyclerView;
        this.f103320c = abstractC0110a;
        int i = this.f103318a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1194F1.f283544a = i;
        this.f103322e = true;
        this.f103321d = true;
        this.f103323f = recyclerView.f1206O0.mo923D(i);
        this.f103319b.f1191C1.m33203b();
    }

    /* JADX INFO: renamed from: m */
    public final void m50999m() {
        if (this.f103322e) {
            this.f103322e = false;
            this.f103332o = 0;
            this.f103331n = 0;
            this.f103327j = null;
            this.f103319b.f1194F1.f283544a = -1;
            this.f103323f = null;
            this.f103318a = -1;
            this.f103321d = false;
            AbstractC0110a abstractC0110a = this.f103320c;
            if (abstractC0110a.f1297e == this) {
                abstractC0110a.f1297e = null;
            }
            this.f103320c = null;
            this.f103319b = null;
        }
    }
}
