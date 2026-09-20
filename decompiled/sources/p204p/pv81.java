package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class pv81 extends Drawable implements Runnable {

    /* JADX INFO: renamed from: L0 */
    public final Paint f181645L0;

    /* JADX INFO: renamed from: M0 */
    public final Matrix f181646M0;

    /* JADX INFO: renamed from: N0 */
    public final RectF f181647N0;

    /* JADX INFO: renamed from: O0 */
    public rv81 f181648O0;

    /* JADX INFO: renamed from: P0 */
    public long f181649P0;

    /* JADX INFO: renamed from: Q0 */
    public int f181650Q0;

    /* JADX INFO: renamed from: R0 */
    public int f181651R0;

    /* JADX INFO: renamed from: S0 */
    public int f181652S0;

    /* JADX INFO: renamed from: T0 */
    public float f181653T0;

    /* JADX INFO: renamed from: U0 */
    public long f181654U0;

    /* JADX INFO: renamed from: V0 */
    public long f181655V0;

    /* JADX INFO: renamed from: W0 */
    public final LightingColorFilter f181656W0;

    /* JADX INFO: renamed from: X0 */
    public int f181658X0;

    /* JADX INFO: renamed from: Z */
    public final BitmapShader f181660Z;

    /* JADX INFO: renamed from: a */
    public Bitmap f181661a;

    /* JADX INFO: renamed from: b */
    public int f181662b;

    /* JADX INFO: renamed from: c */
    public int f181663c;

    /* JADX INFO: renamed from: d */
    public final int f181664d;

    /* JADX INFO: renamed from: e */
    public final tc41 f181665e;

    /* JADX INFO: renamed from: f */
    public final tc41 f181666f;

    /* JADX INFO: renamed from: g */
    public final float f181667g;

    /* JADX INFO: renamed from: h */
    public final xre f181668h;

    /* JADX INFO: renamed from: i */
    public final Paint f181669i = new Paint();

    /* JADX INFO: renamed from: t */
    public final Rect f181670t = new Rect();

    /* JADX INFO: renamed from: X */
    public final RectF f181657X = new RectF();

    /* JADX INFO: renamed from: Y */
    public final RectF f181659Y = new RectF();

    public pv81(Bitmap bitmap, int i, int i2, int i3, tc41 tc41Var, tc41 tc41Var2, float f, xre xreVar) {
        this.f181661a = bitmap;
        this.f181662b = i;
        this.f181663c = i2;
        this.f181664d = i3;
        this.f181665e = tc41Var;
        this.f181666f = tc41Var2;
        this.f181667g = f;
        this.f181668h = xreVar;
        Bitmap bitmap2 = this.f181661a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.f181660Z = bitmapShader;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.f181645L0 = paint;
        this.f181646M0 = new Matrix();
        this.f181647N0 = new RectF();
        this.f181649P0 = Long.MAX_VALUE;
        this.f181650Q0 = 255;
        this.f181651R0 = 255;
        int iM72083N = q3d0.m72083N(204.0f);
        this.f181656W0 = new LightingColorFilter(Color.rgb(iM72083N, iM72083N, iM72083N), 0);
        this.f181658X0 = 1;
        m71113b();
    }

    /* JADX INFO: renamed from: a */
    public final void m71112a(tc41 tc41Var, Canvas canvas, int i) {
        int iMo57072j = tc41Var.f219021n.mo57072j();
        int iMo57071h = tc41Var.f219021n.mo57071h();
        int i2 = (this.f181662b - iMo57072j) / 2;
        int i3 = (this.f181663c - iMo57071h) / 2;
        tc41Var.setBounds(i2, i3, iMo57072j + i2, iMo57071h + i3);
        tc41Var.setAlpha(i);
        tc41Var.f219021n.mo57069c(canvas);
    }

    /* JADX INFO: renamed from: b */
    public final void m71113b() {
        int iRound;
        this.f181657X.set(0.0f, 0.0f, this.f181662b, this.f181663c);
        int width = this.f181661a.getWidth();
        int height = this.f181661a.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int i = this.f181662b;
        int i2 = this.f181663c;
        int iRound2 = 0;
        if (f3 > i / i2) {
            iRound2 = Math.round((f - (i * (f2 / i2))) / 2.0f);
            iRound = 0;
        } else {
            iRound = Math.round((f2 - (i2 * (f / i))) / 2.0f);
        }
        this.f181670t.set(iRound2, iRound, width - iRound2, height - iRound);
        float fMo57072j = (this.f181662b - (this.f181665e.f219021n.mo57072j() * 2.0f)) / 2.0f;
        this.f181659Y.set(fMo57072j, fMo57072j, this.f181662b - fMo57072j, this.f181663c - fMo57072j);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX INFO: renamed from: c */
    public final void m71114c() {
        long j;
        long jMax;
        long j2;
        float fCurrentTimeMillis;
        wy3 wy3Var = (wy3) this.f181668h;
        wy3Var.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f181658X0 == 1) {
            if (this.f181651R0 < 255) {
                this.f181651R0 = Math.max(0, Math.min((((int) (jUptimeMillis - this.f181654U0)) * 255) / 200, 255));
                j = jUptimeMillis;
            } else {
                j = Long.MAX_VALUE;
            }
        } else if (this.f181651R0 > 0) {
            this.f181651R0 = 255 - Math.max(0, Math.min((((int) (jUptimeMillis - this.f181654U0)) * 255) / 200, 255));
            j = jUptimeMillis;
        } else {
            j = Long.MAX_VALUE;
        }
        if (this.f181658X0 != 2) {
            if (this.f181652S0 > 0) {
                this.f181652S0 = 255 - Math.max(0, Math.min((((int) (jUptimeMillis - this.f181655V0)) * 255) / 300, 255));
            }
            jMax = Math.max(j, jUptimeMillis + ((long) 16));
            j2 = this.f181649P0;
            if (j2 != Long.MAX_VALUE && jMax != Long.MAX_VALUE) {
                scheduleSelf(this, jMax);
            } else if (jMax < j2) {
                unscheduleSelf(this);
                scheduleSelf(this, jMax);
            }
            this.f181649P0 = jMax;
        }
        if (this.f181652S0 < 255) {
            this.f181652S0 = Math.max(0, Math.min((((int) (jUptimeMillis - this.f181655V0)) * 255) / 300, 255));
        }
        rv81 rv81Var = this.f181648O0;
        if (rv81Var != null) {
            long j3 = rv81Var.f203022a;
            wy3Var.getClass();
            fCurrentTimeMillis = ((System.currentTimeMillis() + j3) - rv81Var.f203024c) / rv81Var.f203023b;
        } else {
            fCurrentTimeMillis = 0.0f;
        }
        this.f181653T0 = fCurrentTimeMillis;
        j = jUptimeMillis;
        jMax = Math.max(j, jUptimeMillis + ((long) 16));
        j2 = this.f181649P0;
        if (j2 != Long.MAX_VALUE) {
            if (jMax < j2) {
                unscheduleSelf(this);
                scheduleSelf(this, jMax);
            }
        } else if (jMax < j2) {
            unscheduleSelf(this);
            scheduleSelf(this, jMax);
        }
        this.f181649P0 = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        m71114c();
        int i = (this.f181651R0 * this.f181650Q0) / 255;
        if (i > 0) {
            Rect bounds = getBounds();
            Matrix matrix = this.f181646M0;
            matrix.reset();
            matrix.setScale(bounds.width() / this.f181661a.getWidth(), bounds.height() / this.f181661a.getHeight());
            this.f181660Z.setLocalMatrix(matrix);
            Paint paint = this.f181645L0;
            paint.setAlpha(i);
            paint.setColorFilter(this.f181656W0);
            RectF rectF = this.f181647N0;
            rectF.set(bounds);
            float f = this.f181664d;
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setColorFilter(null);
            m71112a(this.f181665e, canvas, i);
        }
        int i2 = (this.f181652S0 * this.f181650Q0) / 255;
        if (i2 > 0) {
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.f181669i;
            paint2.setStyle(style);
            paint2.setColor(m9f.m61224l(-1, i2));
            paint2.setStrokeWidth(this.f181667g);
            paint2.setAntiAlias(true);
            canvas.drawArc(this.f181659Y, -90.0f, this.f181653T0 * 360.0f, false, paint2);
            m71112a(this.f181666f, canvas, i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f181662b = rect.width();
        this.f181663c = rect.height();
        m71113b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        invalidateSelf();
        long j = this.f181649P0;
        if (j != Long.MAX_VALUE) {
            scheduleSelf(this, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f181650Q0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
