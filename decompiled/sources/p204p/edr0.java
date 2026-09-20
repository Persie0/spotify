package p204p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class edr0 extends FrameLayout {

    /* JADX INFO: renamed from: L0 */
    public final ycr0 f58566L0;

    /* JADX INFO: renamed from: M0 */
    public final zcr0 f58567M0;

    /* JADX INFO: renamed from: a */
    public bdr0 f58568a;

    /* JADX INFO: renamed from: b */
    public fdr0 f58569b;

    /* JADX INFO: renamed from: c */
    public final tiy0 f58570c;

    /* JADX INFO: renamed from: d */
    public final wcr0 f58571d;

    /* JADX INFO: renamed from: e */
    public boolean f58572e;

    /* JADX INFO: renamed from: f */
    public final xoi0 f58573f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f58574g;

    /* JADX INFO: renamed from: h */
    public final gdr0 f58575h;

    /* JADX INFO: renamed from: i */
    public gfb f58576i;

    /* JADX INFO: renamed from: t */
    public final adr0 f58577t;

    /* JADX WARN: Type inference failed for: r1v6, types: [p.ycr0] */
    public edr0(Context context) {
        super(context, null, 0, 0);
        this.f58568a = bdr0.PERFORMANCE;
        wcr0 wcr0Var = new wcr0();
        wcr0Var.f250095h = cdr0.FILL_CENTER;
        this.f58571d = wcr0Var;
        this.f58572e = true;
        this.f58573f = new xoi0(ddr0.f47855a);
        this.f58574g = new AtomicReference();
        this.f58575h = new gdr0(wcr0Var);
        this.f58577t = new adr0(this);
        this.f58566L0 = new View.OnLayoutChangeListener() { // from class: p.ycr0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                edr0 edr0Var = this.f271551a;
                edr0Var.m38620a();
                hxg1.m49006s();
                edr0Var.getViewPort();
            }
        };
        this.f58567M0 = new zcr0(this);
        hxg1.m49006s();
        Resources.Theme theme = context.getTheme();
        int[] iArr = f1u0.f64964a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        mec1.m61563o(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, wcr0Var.f250095h.f36937a);
            for (cdr0 cdr0Var : cdr0.values()) {
                if (cdr0Var.f36937a == integer) {
                    setScaleType(cdr0Var);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (bdr0 bdr0Var : bdr0.values()) {
                        if (bdr0Var.f26198a == integer2) {
                            setImplementationMode(bdr0Var);
                            typedArrayObtainStyledAttributes.recycle();
                            new wuk0(23);
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            new GestureDetector(context, new k12(new nrc1(), 3));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            tiy0 tiy0Var = new tiy0(context, null, 0, 0);
                            tiy0Var.setBackgroundColor(-1);
                            tiy0Var.setAlpha(0.0f);
                            tiy0Var.setElevation(Float.MAX_VALUE);
                            this.f58570c = tiy0Var;
                            tiy0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m38619b(s861 s861Var, bdr0 bdr0Var) {
        boolean zEquals = s861Var.f206579d.mo50329g().mo44597i().equals("androidx.camera.camera2.legacy");
        boolean z = (qbr.f187161a.m76583e(SurfaceViewStretchedQuirk.class) == null && qbr.f187161a.m76583e(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = bdr0Var.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + bdr0Var);
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private q440 getScreenFlashInternal() {
        return this.f58570c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(q440 q440Var) {
        vie1.m85624f("PreviewView");
    }

    /* JADX INFO: renamed from: a */
    public final void m38620a() {
        Rect rect;
        Display display;
        gfb gfbVar;
        hxg1.m49006s();
        if (this.f58569b != null) {
            if (this.f58572e && (display = getDisplay()) != null && (gfbVar = this.f58576i) != null) {
                wcr0 wcr0Var = this.f58571d;
                int iMo44598j = gfbVar.mo44598j(display.getRotation());
                int rotation = display.getRotation();
                if (wcr0Var.f250094g) {
                    wcr0Var.f250090c = iMo44598j;
                    wcr0Var.f250092e = rotation;
                }
            }
            this.f58569b.m41377f();
        }
        gdr0 gdr0Var = this.f58575h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        gdr0Var.getClass();
        hxg1.m49006s();
        synchronized (gdr0Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = gdr0Var.f78929b) != null) {
                    gdr0Var.f78928a.m87752a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        hxg1.m49006s();
        fdr0 fdr0Var = this.f58569b;
        if (fdr0Var == null) {
            return null;
        }
        FrameLayout frameLayout = fdr0Var.f68547b;
        Bitmap bitmapMo29052b = fdr0Var.mo29052b();
        if (bitmapMo29052b == null) {
            return null;
        }
        wcr0 wcr0Var = fdr0Var.f68548c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!wcr0Var.m87757f()) {
            return bitmapMo29052b;
        }
        Matrix matrixM87755d = wcr0Var.m87755d();
        RectF rectFM87756e = wcr0Var.m87756e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapMo29052b.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM87755d);
        matrix.postScale(rectFM87756e.width() / wcr0Var.f250088a.getWidth(), rectFM87756e.height() / wcr0Var.f250088a.getHeight());
        matrix.postTranslate(rectFM87756e.left, rectFM87756e.top);
        canvas.drawBitmap(bitmapMo29052b, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public web getController() {
        hxg1.m49006s();
        return null;
    }

    public bdr0 getImplementationMode() {
        hxg1.m49006s();
        return this.f58568a;
    }

    public mbf0 getMeteringPointFactory() {
        hxg1.m49006s();
        return this.f58575h;
    }

    public mzl0 getOutputTransform() {
        Matrix matrixM87754c;
        wcr0 wcr0Var = this.f58571d;
        hxg1.m49006s();
        try {
            matrixM87754c = wcr0Var.m87754c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM87754c = null;
        }
        Rect rect = wcr0Var.f250089b;
        if (matrixM87754c == null || rect == null) {
            vie1.m85624f("PreviewView");
            return null;
        }
        RectF rectF = j591.f108921a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(j591.f108921a, rectF2, Matrix.ScaleToFit.FILL);
        matrixM87754c.preConcat(matrix);
        if (this.f58569b instanceof bg71) {
            matrixM87754c.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            vie1.m85617F("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new mzl0();
    }

    public ck90 getPreviewStreamState() {
        return this.f58573f;
    }

    public cdr0 getScaleType() {
        hxg1.m49006s();
        return this.f58571d.f250095h;
    }

    public q440 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        hxg1.m49006s();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        wcr0 wcr0Var = this.f58571d;
        if (!wcr0Var.m87757f()) {
            return null;
        }
        Matrix matrix = new Matrix(wcr0Var.f250091d);
        matrix.postConcat(wcr0Var.m87754c(size, layoutDirection));
        return matrix;
    }

    public d4r0 getSurfaceProvider() {
        hxg1.m49006s();
        return this.f58567M0;
    }

    public okc1 getViewPort() {
        hxg1.m49006s();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        hxg1.m49006s();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new okc1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f58577t, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f58566L0);
        fdr0 fdr0Var = this.f58569b;
        if (fdr0Var != null) {
            fdr0Var.mo29053c();
        }
        hxg1.m49006s();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f58566L0);
        fdr0 fdr0Var = this.f58569b;
        if (fdr0Var != null) {
            fdr0Var.mo29054d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f58577t);
    }

    public void setController(web webVar) {
        hxg1.m49006s();
        hxg1.m49006s();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(bdr0 bdr0Var) {
        hxg1.m49006s();
        this.f58568a = bdr0Var;
    }

    public void setScaleType(cdr0 cdr0Var) {
        hxg1.m49006s();
        this.f58571d.f250095h = cdr0Var;
        m38620a();
        hxg1.m49006s();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f58570c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        hxg1.m49006s();
        this.f58570c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
