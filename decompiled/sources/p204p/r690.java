package p204p;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r690 implements View.OnTouchListener {

    /* JADX INFO: renamed from: P0 */
    public static final int f196197P0 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: L0 */
    public boolean f196198L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f196199M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f196200N0;

    /* JADX INFO: renamed from: O0 */
    public final rhs f196201O0;

    /* JADX INFO: renamed from: X */
    public final float[] f196202X;

    /* JADX INFO: renamed from: Y */
    public boolean f196203Y;

    /* JADX INFO: renamed from: Z */
    public boolean f196204Z;

    /* JADX INFO: renamed from: a */
    public final fx7 f196205a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f196206b;

    /* JADX INFO: renamed from: c */
    public final rhs f196207c;

    /* JADX INFO: renamed from: d */
    public n10 f196208d;

    /* JADX INFO: renamed from: e */
    public final float[] f196209e;

    /* JADX INFO: renamed from: f */
    public final float[] f196210f;

    /* JADX INFO: renamed from: g */
    public final int f196211g;

    /* JADX INFO: renamed from: h */
    public final int f196212h;

    /* JADX INFO: renamed from: i */
    public final float[] f196213i;

    /* JADX INFO: renamed from: t */
    public final float[] f196214t;

    public r690(rhs rhsVar) {
        fx7 fx7Var = new fx7();
        fx7Var.f74281e = Long.MIN_VALUE;
        fx7Var.f74283g = -1L;
        fx7Var.f74282f = 0L;
        this.f196205a = fx7Var;
        this.f196206b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f196209e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f196210f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f196213i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f196214t = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f196202X = fArr5;
        this.f196207c = rhsVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f196211g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f196212h = f196197P0;
        fx7Var.f74277a = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
        fx7Var.f74278b = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
        this.f196201O0 = rhsVar;
    }

    /* JADX INFO: renamed from: b */
    public static float m74847b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m74848a(float f, float f2, float f3, int i) {
        float fM74847b;
        float interpolation;
        float fM74847b2 = m74847b(this.f196209e[i] * f2, 0.0f, this.f196210f[i]);
        float fM74849c = m74849c(f2 - f, fM74847b2) - m74849c(f, fM74847b2);
        AccelerateInterpolator accelerateInterpolator = this.f196206b;
        if (fM74849c >= 0.0f) {
            if (fM74849c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM74849c);
            } else {
                fM74847b = 0.0f;
            }
            if (fM74847b == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f196213i[i];
            float f5 = this.f196214t[i];
            float f6 = this.f196202X[i];
            float f7 = f4 * f3;
            return fM74847b > 0.0f ? m74847b(fM74847b * f7, f5, f6) : -m74847b((-fM74847b) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM74849c);
        fM74847b = m74847b(interpolation, -1.0f, 1.0f);
        if (fM74847b == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f196213i[i];
        float f9 = this.f196214t[i];
        float f10 = this.f196202X[i];
        float f11 = f8 * f3;
        if (fM74847b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m74849c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f196211g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f196199M0 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m74850d() {
        int i = 0;
        if (this.f196204Z) {
            this.f196199M0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        fx7 fx7Var = this.f196205a;
        int i2 = (int) (jCurrentAnimationTimeMillis - fx7Var.f74281e);
        int i3 = fx7Var.f74278b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        fx7Var.f74285i = i;
        fx7Var.f74284h = fx7Var.m42996a(jCurrentAnimationTimeMillis);
        fx7Var.f74283g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m74851e() {
        rhs rhsVar;
        int count;
        fx7 fx7Var = this.f196205a;
        float f = fx7Var.f74280d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(fx7Var.f74279c);
        if (iAbs != 0 && (count = (rhsVar = this.f196201O0).getCount()) != 0) {
            int childCount = rhsVar.getChildCount();
            int firstVisiblePosition = rhsVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && rhsVar.getChildAt(0).getTop() >= 0)) : !(i >= count && rhsVar.getChildAt(childCount - 1).getBottom() <= rhsVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f196200N0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m74850d();
                return false;
            }
            this.f196198L0 = true;
            this.f196203Y = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            rhs rhsVar = this.f196207c;
            float fM74848a = m74848a(x, width, rhsVar.getWidth(), 0);
            float fM74848a2 = m74848a(motionEvent.getY(), view.getHeight(), rhsVar.getHeight(), 1);
            fx7 fx7Var = this.f196205a;
            fx7Var.f74279c = fM74848a;
            fx7Var.f74280d = fM74848a2;
            if (!this.f196199M0 && m74851e()) {
                if (this.f196208d == null) {
                    this.f196208d = new n10(this, 14);
                }
                this.f196199M0 = true;
                this.f196204Z = true;
                if (this.f196203Y || (i = this.f196212h) <= 0) {
                    this.f196208d.run();
                } else {
                    n10 n10Var = this.f196208d;
                    long j = i;
                    WeakHashMap weakHashMap = mec1.f142677a;
                    rhsVar.postOnAnimationDelayed(n10Var, j);
                }
                this.f196203Y = true;
            }
        }
        return false;
    }
}
