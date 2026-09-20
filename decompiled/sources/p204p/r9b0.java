package p204p;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r9b0 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: o1 */
    public static final boolean f196967o1;

    /* JADX INFO: renamed from: p1 */
    public static final List f196968p1;

    /* JADX INFO: renamed from: q1 */
    public static final ThreadPoolExecutor f196969q1;

    /* JADX INFO: renamed from: L0 */
    public boolean f196970L0;

    /* JADX INFO: renamed from: M0 */
    public nsh f196971M0;

    /* JADX INFO: renamed from: N0 */
    public int f196972N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f196973O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f196974P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f196975Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f196976R0;

    /* JADX INFO: renamed from: S0 */
    public ckw0 f196977S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f196978T0;

    /* JADX INFO: renamed from: U0 */
    public final Matrix f196979U0;

    /* JADX INFO: renamed from: V0 */
    public Bitmap f196980V0;

    /* JADX INFO: renamed from: W0 */
    public Canvas f196981W0;

    /* JADX INFO: renamed from: X */
    public String f196982X;

    /* JADX INFO: renamed from: X0 */
    public Rect f196983X0;

    /* JADX INFO: renamed from: Y */
    public boolean f196984Y;

    /* JADX INFO: renamed from: Y0 */
    public RectF f196985Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f196986Z;

    /* JADX INFO: renamed from: Z0 */
    public zd70 f196987Z0;

    /* JADX INFO: renamed from: a */
    public u8b0 f196988a;

    /* JADX INFO: renamed from: a1 */
    public Rect f196989a1;

    /* JADX INFO: renamed from: b */
    public final hab0 f196990b;

    /* JADX INFO: renamed from: b1 */
    public Rect f196991b1;

    /* JADX INFO: renamed from: c */
    public boolean f196992c;

    /* JADX INFO: renamed from: c1 */
    public RectF f196993c1;

    /* JADX INFO: renamed from: d */
    public boolean f196994d;

    /* JADX INFO: renamed from: d1 */
    public RectF f196995d1;

    /* JADX INFO: renamed from: e */
    public boolean f196996e;

    /* JADX INFO: renamed from: e1 */
    public Matrix f196997e1;

    /* JADX INFO: renamed from: f */
    public final ArrayList f196998f;

    /* JADX INFO: renamed from: f1 */
    public Matrix f196999f1;

    /* JADX INFO: renamed from: g */
    public ood0 f197000g;

    /* JADX INFO: renamed from: g1 */
    public boolean f197001g1;

    /* JADX INFO: renamed from: h */
    public String f197002h;

    /* JADX INFO: renamed from: h1 */
    public pn6 f197003h1;

    /* JADX INFO: renamed from: i */
    public ugz f197004i;

    /* JADX INFO: renamed from: i1 */
    public final Semaphore f197005i1;

    /* JADX INFO: renamed from: j1 */
    public Handler f197006j1;

    /* JADX INFO: renamed from: k1 */
    public ig10 f197007k1;

    /* JADX INFO: renamed from: l1 */
    public final RunnableC2364s6 f197008l1;

    /* JADX INFO: renamed from: m1 */
    public float f197009m1;

    /* JADX INFO: renamed from: n1 */
    public int f197010n1;

    /* JADX INFO: renamed from: t */
    public Map f197011t;

    static {
        f196967o1 = Build.VERSION.SDK_INT <= 25;
        f196968p1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f196969q1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new fab0());
    }

    public r9b0() {
        hab0 hab0Var = new hab0();
        hab0Var.f89178d = 1.0f;
        hab0Var.f89179e = false;
        hab0Var.f89180f = 0L;
        hab0Var.f89181g = 0.0f;
        hab0Var.f89182h = 0.0f;
        hab0Var.f89183i = 0;
        hab0Var.f89184t = -2.1474836E9f;
        hab0Var.f89175X = 2.1474836E9f;
        hab0Var.f89177Z = false;
        hab0Var.f89174L0 = false;
        this.f196990b = hab0Var;
        this.f196992c = true;
        this.f196994d = false;
        this.f196996e = false;
        this.f197010n1 = 1;
        this.f196998f = new ArrayList();
        this.f196986Z = false;
        this.f196970L0 = true;
        this.f196972N0 = 255;
        this.f196976R0 = false;
        this.f196977S0 = ckw0.f39102a;
        this.f196978T0 = false;
        this.f196979U0 = new Matrix();
        this.f197001g1 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: p.n9b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r9b0 r9b0Var = this.f151764a;
                pn6 pn6Var = r9b0Var.f197003h1;
                if (pn6Var == null) {
                    pn6Var = pn6.f179316a;
                }
                if (pn6Var == pn6.f179317b) {
                    r9b0Var.invalidateSelf();
                    return;
                }
                nsh nshVar = r9b0Var.f196971M0;
                if (nshVar != null) {
                    nshVar.mo65560r(r9b0Var.f196990b.m46923j());
                }
            }
        };
        this.f197005i1 = new Semaphore(1);
        this.f197008l1 = new RunnableC2364s6(this, 8);
        this.f197009m1 = -3.4028235E38f;
        hab0Var.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: f */
    public static void m75020f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: a */
    public final void m75021a(final lu60 lu60Var, final Object obj, final xh70 xh70Var) {
        List list;
        nsh nshVar = this.f196971M0;
        if (nshVar == null) {
            this.f196998f.add(new q9b0() { // from class: p.j9b0
                @Override // p204p.q9b0
                public final void run() {
                    this.f110134a.m75021a(lu60Var, obj, xh70Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (lu60Var == lu60.f137006c) {
            nshVar.mo25332c(obj, xh70Var);
        } else if (lu60Var.m59929c() != null) {
            lu60Var.m59929c().mo25332c(obj, xh70Var);
        } else {
            if (this.f196971M0 == null) {
                sra0.m79109c("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                this.f196971M0.mo27897f(lu60Var, 0, arrayList, new lu60(new String[0]));
                list = arrayList;
            }
            for (int i = 0; i < list.size(); i++) {
                ((lu60) list.get(i)).m59929c().mo25332c(obj, xh70Var);
            }
            zIsEmpty = true ^ list.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == bab0.f25171z) {
                m75041v(this.f196990b.m46923j());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75022b() {
        return this.f196992c || this.f196994d;
    }

    /* JADX INFO: renamed from: c */
    public final void m75023c() {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            return;
        }
        po10 po10Var = xn70.f263552a;
        Rect rect = u8b0Var.f227892k;
        List list = Collections.EMPTY_LIST;
        nsh nshVar = new nsh(this, new wn70(list, u8b0Var, "__container", -1L, 1, -1L, null, list, new ow4(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), u8b0Var.f227891j, u8b0Var);
        this.f196971M0 = nshVar;
        if (this.f196974P0) {
            nshVar.mo65559q(true);
        }
        this.f196971M0.f157806I = this.f196970L0;
    }

    /* JADX INFO: renamed from: d */
    public final void m75024d() {
        hab0 hab0Var = this.f196990b;
        if (hab0Var.f89177Z) {
            hab0Var.cancel();
            if (!isVisible()) {
                this.f197010n1 = 1;
            }
        }
        this.f196988a = null;
        this.f196971M0 = null;
        this.f197000g = null;
        this.f197009m1 = -3.4028235E38f;
        hab0Var.f89176Y = null;
        hab0Var.f89184t = -2.1474836E9f;
        hab0Var.f89175X = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        nsh nshVar = this.f196971M0;
        if (nshVar == null) {
            return;
        }
        pn6 pn6Var = this.f197003h1;
        if (pn6Var == null) {
            pn6Var = pn6.f179316a;
        }
        boolean z = pn6Var == pn6.f179317b;
        RunnableC2364s6 runnableC2364s6 = this.f197008l1;
        ThreadPoolExecutor threadPoolExecutor = f196969q1;
        hab0 hab0Var = this.f196990b;
        Semaphore semaphore = this.f197005i1;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (nshVar.f157805H == hab0Var.m46923j()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (nshVar.f157805H != hab0Var.m46923j()) {
                        threadPoolExecutor.execute(runnableC2364s6);
                    }
                }
                throw th;
            }
        }
        if (z && m75044y()) {
            m75041v(hab0Var.m46923j());
        }
        if (this.f196996e) {
            try {
                if (this.f196978T0) {
                    m75031l(canvas, nshVar);
                } else {
                    m75026g(canvas);
                }
            } catch (Throwable unused2) {
                sra0.m79108b();
            }
        } else if (this.f196978T0) {
            m75031l(canvas, nshVar);
        } else {
            m75026g(canvas);
        }
        this.f197001g1 = false;
        if (z) {
            semaphore.release();
            if (nshVar.f157805H == hab0Var.m46923j()) {
                return;
            }
            threadPoolExecutor.execute(runnableC2364s6);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m75025e() {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            return;
        }
        ckw0 ckw0Var = this.f196977S0;
        int i = Build.VERSION.SDK_INT;
        boolean z = u8b0Var.f227896o;
        int i2 = u8b0Var.f227897p;
        int iOrdinal = ckw0Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.f196978T0 = z2;
    }

    /* JADX INFO: renamed from: g */
    public final void m75026g(Canvas canvas) {
        nsh nshVar = this.f196971M0;
        u8b0 u8b0Var = this.f196988a;
        if (nshVar == null || u8b0Var == null) {
            return;
        }
        Matrix matrix = this.f196979U0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / u8b0Var.f227892k.width(), bounds.height() / u8b0Var.f227892k.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        nshVar.mo27898g(canvas, matrix, this.f196972N0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f196972N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            return -1;
        }
        return u8b0Var.f227892k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            return -1;
        }
        return u8b0Var.f227892k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m75027h() {
        this.f196998f.clear();
        hab0 hab0Var = this.f196990b;
        hab0Var.m46927q(true);
        hab0Var.m74293c(hab0Var.m46926m());
        if (isVisible()) {
            return;
        }
        this.f197010n1 = 1;
    }

    /* JADX INFO: renamed from: i */
    public final ugz m75028i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f197004i == null) {
            ugz ugzVar = new ugz(getCallback());
            this.f197004i = ugzVar;
            String str = this.f196982X;
            if (str != null) {
                ugzVar.m83085a0(str);
            }
        }
        return this.f197004i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f197001g1) {
            return;
        }
        this.f197001g1 = true;
        if ((!f196967o1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        hab0 hab0Var = this.f196990b;
        if (hab0Var == null) {
            return false;
        }
        return hab0Var.f89177Z;
    }

    /* JADX INFO: renamed from: j */
    public final void m75029j() {
        this.f196998f.clear();
        hab0 hab0Var = this.f196990b;
        hab0Var.m46927q(true);
        hab0Var.m74294d();
        if (isVisible()) {
            return;
        }
        this.f197010n1 = 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m75030k() {
        if (this.f196971M0 == null) {
            this.f196998f.add(new q9b0() { // from class: p.o9b0
                @Override // p204p.q9b0
                public final void run() {
                    this.f162996a.m75030k();
                }
            });
            return;
        }
        m75025e();
        boolean zM75022b = m75022b();
        hab0 hab0Var = this.f196990b;
        if (zM75022b || hab0Var.getRepeatCount() == 0) {
            if (isVisible()) {
                hab0Var.f89177Z = true;
                hab0Var.m74297h(hab0Var.m46926m());
                hab0Var.m46928r((int) (hab0Var.m46926m() ? hab0Var.m46924k() : hab0Var.m46925l()));
                hab0Var.f89180f = 0L;
                hab0Var.f89183i = 0;
                if (hab0Var.f89177Z) {
                    hab0Var.m46927q(false);
                    Choreographer.getInstance().postFrameCallback(hab0Var);
                }
                this.f197010n1 = 1;
            } else {
                this.f197010n1 = 2;
            }
        }
        if (m75022b()) {
            return;
        }
        Iterator it = f196968p1.iterator();
        anc0 anc0VarM82569d = null;
        while (it.hasNext()) {
            anc0VarM82569d = this.f196988a.m82569d((String) it.next());
            if (anc0VarM82569d != null) {
                break;
            }
        }
        if (anc0VarM82569d != null) {
            m75034o((int) anc0VarM82569d.f17364b);
        } else {
            m75034o((int) (hab0Var.f89178d < 0.0f ? hab0Var.m46925l() : hab0Var.m46924k()));
        }
        hab0Var.m46927q(true);
        hab0Var.m74293c(hab0Var.m46926m());
        if (isVisible()) {
            return;
        }
        this.f197010n1 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    /* JADX INFO: renamed from: l */
    public final void m75031l(Canvas canvas, nsh nshVar) {
        boolean z;
        if (this.f196988a == null || nshVar == null) {
            return;
        }
        if (this.f196981W0 == null) {
            this.f196981W0 = new Canvas();
            this.f196995d1 = new RectF();
            this.f196997e1 = new Matrix();
            this.f196999f1 = new Matrix();
            this.f196983X0 = new Rect();
            this.f196985Y0 = new RectF();
            this.f196987Z0 = new zd70();
            this.f196989a1 = new Rect();
            this.f196991b1 = new Rect();
            this.f196993c1 = new RectF();
        }
        canvas.getMatrix(this.f196997e1);
        canvas.getClipBounds(this.f196983X0);
        Rect rect = this.f196983X0;
        this.f196985Y0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f196997e1.mapRect(this.f196985Y0);
        m75020f(this.f196983X0, this.f196985Y0);
        if (this.f196970L0) {
            this.f196995d1.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            nshVar.mo25333d(this.f196995d1, null, false);
        }
        this.f196997e1.mapRect(this.f196995d1);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f196995d1;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF2 = this.f196995d1;
            Rect rect2 = this.f196983X0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f196995d1.width());
        int iCeil2 = (int) Math.ceil(this.f196995d1.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.f196980V0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f196980V0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f196980V0 = bitmapCreateBitmap;
            this.f196981W0.setBitmap(bitmapCreateBitmap);
            this.f197001g1 = true;
        } else if (this.f196980V0.getWidth() > iCeil || this.f196980V0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f196980V0, 0, 0, iCeil, iCeil2);
            this.f196980V0 = bitmapCreateBitmap2;
            this.f196981W0.setBitmap(bitmapCreateBitmap2);
            this.f197001g1 = true;
        }
        if (this.f197001g1) {
            Matrix matrix = this.f196997e1;
            Matrix matrix2 = this.f196979U0;
            matrix2.set(matrix);
            matrix2.preScale(fWidth, fHeight);
            RectF rectF3 = this.f196995d1;
            matrix2.postTranslate(-rectF3.left, -rectF3.top);
            this.f196980V0.eraseColor(0);
            nshVar.mo27898g(this.f196981W0, matrix2, this.f196972N0);
            this.f196997e1.invert(this.f196999f1);
            this.f196999f1.mapRect(this.f196993c1, this.f196995d1);
            m75020f(this.f196991b1, this.f196993c1);
        }
        this.f196989a1.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f196980V0, this.f196989a1, this.f196991b1, this.f196987Z0);
    }

    /* JADX INFO: renamed from: m */
    public final void m75032m() {
        if (this.f196971M0 == null) {
            this.f196998f.add(new q9b0() { // from class: p.m9b0
                @Override // p204p.q9b0
                public final void run() {
                    this.f141246a.m75032m();
                }
            });
            return;
        }
        m75025e();
        boolean zM75022b = m75022b();
        hab0 hab0Var = this.f196990b;
        if (zM75022b || hab0Var.getRepeatCount() == 0) {
            if (isVisible()) {
                hab0Var.f89177Z = true;
                hab0Var.m46927q(false);
                Choreographer.getInstance().postFrameCallback(hab0Var);
                hab0Var.f89180f = 0L;
                if (hab0Var.m46926m() && hab0Var.f89182h == hab0Var.m46925l()) {
                    hab0Var.m46928r(hab0Var.m46924k());
                } else if (!hab0Var.m46926m() && hab0Var.f89182h == hab0Var.m46924k()) {
                    hab0Var.m46928r(hab0Var.m46925l());
                }
                hab0Var.m74296g();
                this.f197010n1 = 1;
            } else {
                this.f197010n1 = 3;
            }
        }
        if (m75022b()) {
            return;
        }
        m75034o((int) (hab0Var.f89178d < 0.0f ? hab0Var.m46925l() : hab0Var.m46924k()));
        hab0Var.m46927q(true);
        hab0Var.m74293c(hab0Var.m46926m());
        if (isVisible()) {
            return;
        }
        this.f197010n1 = 1;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m75033n(u8b0 u8b0Var) {
        if (this.f196988a == u8b0Var) {
            return false;
        }
        this.f197001g1 = true;
        m75024d();
        this.f196988a = u8b0Var;
        m75023c();
        hab0 hab0Var = this.f196990b;
        boolean z = hab0Var.f89176Y == null;
        hab0Var.f89176Y = u8b0Var;
        if (z) {
            hab0Var.m46929s(Math.max(hab0Var.f89184t, u8b0Var.f227893l), Math.min(hab0Var.f89175X, u8b0Var.f227894m));
        } else {
            hab0Var.m46929s((int) u8b0Var.f227893l, (int) u8b0Var.f227894m);
        }
        float f = hab0Var.f89182h;
        hab0Var.f89182h = 0.0f;
        hab0Var.f89181g = 0.0f;
        hab0Var.m46928r((int) f);
        hab0Var.m74298i();
        m75041v(hab0Var.getAnimatedFraction());
        ArrayList arrayList = this.f196998f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            q9b0 q9b0Var = (q9b0) it.next();
            if (q9b0Var != null) {
                q9b0Var.run();
            }
            it.remove();
        }
        arrayList.clear();
        u8b0Var.f227882a.f263200a = this.f196973O0;
        m75025e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m75034o(int i) {
        if (this.f196988a != null) {
            this.f196990b.m46928r(i);
        } else {
            this.f196998f.add(new i9b0(this, i, 2));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m75035p(int i) {
        if (this.f196988a == null) {
            this.f196998f.add(new i9b0(this, i, 0));
        } else {
            hab0 hab0Var = this.f196990b;
            hab0Var.m46929s(hab0Var.f89184t, i + 0.99f);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m75036q(String str) {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            this.f196998f.add(new h9b0(this, str, 1));
        } else {
            anc0 anc0VarM82569d = u8b0Var.m82569d(str);
            if (anc0VarM82569d == null) {
                throw new IllegalArgumentException(s571.m77251j("Cannot find marker with name ", str, "."));
            }
            m75035p((int) (anc0VarM82569d.f17364b + anc0VarM82569d.f17365c));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m75037r(final int i, final int i2) {
        if (this.f196988a == null) {
            this.f196998f.add(new q9b0() { // from class: p.l9b0
                @Override // p204p.q9b0
                public final void run() {
                    this.f131046a.m75037r(i, i2);
                }
            });
        } else {
            this.f196990b.m46929s(i, i2 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m75038s(String str) {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            this.f196998f.add(new h9b0(this, str, 0));
            return;
        }
        anc0 anc0VarM82569d = u8b0Var.m82569d(str);
        if (anc0VarM82569d == null) {
            throw new IllegalArgumentException(s571.m77251j("Cannot find marker with name ", str, "."));
        }
        int i = (int) anc0VarM82569d.f17364b;
        m75037r(i, ((int) anc0VarM82569d.f17365c) + i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f196972N0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        sra0.m79109c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.f197010n1;
            if (i == 2) {
                m75030k();
                return visible;
            }
            if (i == 3) {
                m75032m();
                return visible;
            }
        } else {
            if (this.f196990b.f89177Z) {
                m75029j();
                this.f197010n1 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f197010n1 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m75030k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        m75027h();
    }

    /* JADX INFO: renamed from: t */
    public final void m75039t(int i) {
        if (this.f196988a == null) {
            this.f196998f.add(new i9b0(this, i, 1));
        } else {
            hab0 hab0Var = this.f196990b;
            hab0Var.m46929s(i, (int) hab0Var.f89175X);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m75040u(String str) {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            this.f196998f.add(new h9b0(this, str, 2));
        } else {
            anc0 anc0VarM82569d = u8b0Var.m82569d(str);
            if (anc0VarM82569d == null) {
                throw new IllegalArgumentException(s571.m77251j("Cannot find marker with name ", str, "."));
            }
            m75039t((int) anc0VarM82569d.f17364b);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: v */
    public final void m75041v(final float f) {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            this.f196998f.add(new q9b0() { // from class: p.p9b0
                @Override // p204p.q9b0
                public final void run() {
                    this.f175204a.m75041v(f);
                }
            });
        } else {
            this.f196990b.m46928r(eff0.m38735e(u8b0Var.f227893l, u8b0Var.f227894m, f));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m75042w(int i) {
        this.f196990b.setRepeatCount(i);
    }

    /* JADX INFO: renamed from: x */
    public final void m75043x(int i) {
        this.f196990b.setRepeatMode(i);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m75044y() {
        u8b0 u8b0Var = this.f196988a;
        if (u8b0Var == null) {
            return false;
        }
        float f = this.f197009m1;
        float fM46923j = this.f196990b.m46923j();
        this.f197009m1 = fM46923j;
        return Math.abs(fM46923j - f) * u8b0Var.m82567b() >= 50.0f;
    }
}
