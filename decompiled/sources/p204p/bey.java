package p204p;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bey extends njv0 implements rjv0 {

    /* JADX INFO: renamed from: a1 */
    public static final int[] f26465a1 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b1 */
    public static final int[] f26466b1 = new int[0];

    /* JADX INFO: renamed from: L0 */
    public int f26467L0;

    /* JADX INFO: renamed from: M0 */
    public int f26468M0;

    /* JADX INFO: renamed from: N0 */
    public float f26469N0;

    /* JADX INFO: renamed from: Q0 */
    public final RecyclerView f26472Q0;

    /* JADX INFO: renamed from: X */
    public int f26479X;

    /* JADX INFO: renamed from: X0 */
    public final ValueAnimator f26480X0;

    /* JADX INFO: renamed from: Y */
    public int f26481Y;

    /* JADX INFO: renamed from: Y0 */
    public int f26482Y0;

    /* JADX INFO: renamed from: Z */
    public float f26483Z;

    /* JADX INFO: renamed from: Z0 */
    public final eph f26484Z0;

    /* JADX INFO: renamed from: a */
    public final int f26485a;

    /* JADX INFO: renamed from: b */
    public final int f26486b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f26487c;

    /* JADX INFO: renamed from: d */
    public final Drawable f26488d;

    /* JADX INFO: renamed from: e */
    public final int f26489e;

    /* JADX INFO: renamed from: f */
    public final int f26490f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f26491g;

    /* JADX INFO: renamed from: h */
    public final Drawable f26492h;

    /* JADX INFO: renamed from: i */
    public final int f26493i;

    /* JADX INFO: renamed from: t */
    public final int f26494t;

    /* JADX INFO: renamed from: O0 */
    public int f26470O0 = 0;

    /* JADX INFO: renamed from: P0 */
    public int f26471P0 = 0;

    /* JADX INFO: renamed from: R0 */
    public boolean f26473R0 = false;

    /* JADX INFO: renamed from: S0 */
    public boolean f26474S0 = false;

    /* JADX INFO: renamed from: T0 */
    public int f26475T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public int f26476U0 = 0;

    /* JADX INFO: renamed from: V0 */
    public final int[] f26477V0 = new int[2];

    /* JADX INFO: renamed from: W0 */
    public final int[] f26478W0 = new int[2];

    public bey(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26480X0 = valueAnimatorOfFloat;
        this.f26482Y0 = 0;
        eph ephVar = new eph(this, 25);
        this.f26484Z0 = ephVar;
        iq6 iq6Var = new iq6(this, 5);
        this.f26487c = stateListDrawable;
        this.f26488d = drawable;
        this.f26491g = stateListDrawable2;
        this.f26492h = drawable2;
        this.f26489e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f26490f = Math.max(i, drawable.getIntrinsicWidth());
        this.f26493i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f26494t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f26485a = i2;
        this.f26486b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new aey(this));
        valueAnimatorOfFloat.addUpdateListener(new rx4(this, 11));
        RecyclerView recyclerView2 = this.f26472Q0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m1022o0(this);
            RecyclerView recyclerView3 = this.f26472Q0;
            recyclerView3.f1212R0.remove(this);
            if (recyclerView3.f1214S0 == this) {
                recyclerView3.f1214S0 = null;
            }
            this.f26472Q0.m1026q0(iq6Var);
            this.f26472Q0.removeCallbacks(ephVar);
        }
        this.f26472Q0 = recyclerView;
        recyclerView.m1011i(this);
        this.f26472Q0.m1015k(this);
        this.f26472Q0.m1018m(iq6Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m28970k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: c */
    public final boolean mo28971c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f26475T0;
        if (i != 1) {
            return i == 2;
        }
        boolean zM28976j = m28976j(motionEvent.getX(), motionEvent.getY());
        boolean zM28975i = m28975i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM28976j && !zM28975i) {
            return false;
        }
        if (zM28975i) {
            this.f26476U0 = 1;
            this.f26469N0 = (int) motionEvent.getX();
        } else if (zM28976j) {
            this.f26476U0 = 2;
            this.f26483Z = (int) motionEvent.getY();
        }
        m28977l(2);
        return true;
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: e */
    public final void mo28973e(MotionEvent motionEvent) {
        if (this.f26475T0 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM28976j = m28976j(motionEvent.getX(), motionEvent.getY());
            boolean zM28975i = m28975i(motionEvent.getX(), motionEvent.getY());
            if (zM28976j || zM28975i) {
                if (zM28975i) {
                    this.f26476U0 = 1;
                    this.f26469N0 = (int) motionEvent.getX();
                } else if (zM28976j) {
                    this.f26476U0 = 2;
                    this.f26483Z = (int) motionEvent.getY();
                }
                m28977l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f26475T0 == 2) {
            this.f26483Z = 0.0f;
            this.f26469N0 = 0.0f;
            m28977l(1);
            this.f26476U0 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f26475T0 == 2) {
            m28978m();
            int i = this.f26476U0;
            int i2 = this.f26486b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f26478W0;
                iArr[0] = i2;
                int i3 = this.f26470O0 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f26468M0 - fMax) >= 2.0f) {
                    int iM28970k = m28970k(this.f26469N0, fMax, iArr, this.f26472Q0.computeHorizontalScrollRange(), this.f26472Q0.computeHorizontalScrollOffset(), this.f26470O0);
                    if (iM28970k != 0) {
                        this.f26472Q0.scrollBy(iM28970k, 0);
                    }
                    this.f26469N0 = fMax;
                }
            }
            if (this.f26476U0 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f26477V0;
                iArr2[0] = i2;
                int i4 = this.f26471P0 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f26481Y - fMax2) < 2.0f) {
                    return;
                }
                int iM28970k2 = m28970k(this.f26483Z, fMax2, iArr2, this.f26472Q0.computeVerticalScrollRange(), this.f26472Q0.computeVerticalScrollOffset(), this.f26471P0);
                if (iM28970k2 != 0) {
                    this.f26472Q0.scrollBy(0, iM28970k2);
                }
                this.f26483Z = fMax2;
            }
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: h */
    public final void mo28974h(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        int i = this.f26470O0;
        RecyclerView recyclerView2 = this.f26472Q0;
        if (i != recyclerView2.getWidth() || this.f26471P0 != recyclerView2.getHeight()) {
            this.f26470O0 = recyclerView2.getWidth();
            this.f26471P0 = recyclerView2.getHeight();
            m28977l(0);
            return;
        }
        if (this.f26482Y0 != 0) {
            if (this.f26473R0) {
                int i2 = this.f26470O0;
                int i3 = this.f26489e;
                int i4 = i2 - i3;
                int i5 = this.f26481Y;
                int i6 = this.f26479X;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f26487c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f26490f;
                int i9 = this.f26471P0;
                Drawable drawable = this.f26488d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = mec1.f142677a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f26474S0) {
                int i10 = this.f26471P0;
                int i11 = this.f26493i;
                int i12 = i10 - i11;
                int i13 = this.f26468M0;
                int i14 = this.f26467L0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f26491g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f26470O0;
                int i17 = this.f26494t;
                Drawable drawable2 = this.f26492h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28975i(float f, float f2) {
        if (f2 < this.f26471P0 - this.f26493i) {
            return false;
        }
        int i = this.f26468M0;
        int i2 = this.f26467L0;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m28976j(float f, float f2) {
        WeakHashMap weakHashMap = mec1.f142677a;
        int layoutDirection = this.f26472Q0.getLayoutDirection();
        int i = this.f26489e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f26470O0 - i) {
            return false;
        }
        int i2 = this.f26481Y;
        int i3 = this.f26479X / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: l */
    public final void m28977l(int i) {
        eph ephVar = this.f26484Z0;
        StateListDrawable stateListDrawable = this.f26487c;
        if (i == 2 && this.f26475T0 != 2) {
            stateListDrawable.setState(f26465a1);
            this.f26472Q0.removeCallbacks(ephVar);
        }
        if (i == 0) {
            this.f26472Q0.invalidate();
        } else {
            m28978m();
        }
        if (this.f26475T0 == 2 && i != 2) {
            stateListDrawable.setState(f26466b1);
            this.f26472Q0.removeCallbacks(ephVar);
            this.f26472Q0.postDelayed(ephVar, 1200);
        } else if (i == 1) {
            this.f26472Q0.removeCallbacks(ephVar);
            this.f26472Q0.postDelayed(ephVar, 1500);
        }
        this.f26475T0 = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m28978m() {
        int i = this.f26482Y0;
        ValueAnimator valueAnimator = this.f26480X0;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f26482Y0 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: d */
    public final void mo28972d(boolean z) {
    }
}
