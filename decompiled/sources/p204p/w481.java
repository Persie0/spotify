package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class w481 extends FrameLayout {

    /* JADX INFO: renamed from: L0 */
    public boolean f247742L0;

    /* JADX INFO: renamed from: M0 */
    public float f247743M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f247744N0;

    /* JADX INFO: renamed from: O0 */
    public xul0 f247745O0;

    /* JADX INFO: renamed from: P0 */
    public final FrameLayout f247746P0;

    /* JADX INFO: renamed from: Q0 */
    public final RectF f247747Q0;

    /* JADX INFO: renamed from: R0 */
    public final RectF f247748R0;

    /* JADX INFO: renamed from: a */
    public final Paint f247749a;

    /* JADX INFO: renamed from: b */
    public v481 f247750b;

    /* JADX INFO: renamed from: c */
    public int f247751c;

    /* JADX INFO: renamed from: d */
    public int f247752d;

    /* JADX INFO: renamed from: e */
    public int f247753e;

    /* JADX INFO: renamed from: f */
    public int f247754f;

    /* JADX INFO: renamed from: g */
    public final int f247755g;

    /* JADX INFO: renamed from: h */
    public final float f247756h;

    /* JADX INFO: renamed from: i */
    public float f247757i;

    /* JADX INFO: renamed from: t */
    public int f247758t;

    public w481(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f247749a = paint;
        this.f247745O0 = C2244p5.f174033a;
        this.f247747Q0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f247748R0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        setId(R.id.tooltip_view);
        setWillNotDraw(false);
        Resources resources = getResources();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(lzj.m60386v(getContext(), R.color.blue_light));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_height);
        this.f247755g = dimensionPixelSize;
        this.f247756h = dimensionPixelSize / ((float) Math.sqrt(2.0d));
        this.f247746P0 = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.tooltip_configuration_frame, (ViewGroup) this, true).findViewById(R.id.tinkerbell_configuration_container);
    }

    /* JADX INFO: renamed from: a */
    public static void m87167a(w481 w481Var, float f) {
        int i = w481Var.f247754f;
        float f2 = ((1.0f - f) * i) / 2.0f;
        RectF rectF = w481Var.f247747Q0;
        rectF.left = w481Var.f247751c;
        int i2 = w481Var.f247752d;
        rectF.top = i2 + f2;
        rectF.right = w481Var.f247753e;
        rectF.bottom = (i2 + i) - f2;
    }

    public xul0 getConfiguration() {
        return this.f247745O0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.f247757i;
        RectF rectF = this.f247747Q0;
        Paint paint = this.f247749a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (this.f247742L0) {
            canvas.save();
            if (this.f247744N0) {
                canvas.translate(this.f247743M0, rectF.bottom);
            } else {
                canvas.translate(this.f247743M0, rectF.top);
            }
            canvas.rotate(45.0f);
            canvas.drawRect(this.f247748R0, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setAbove(boolean z) {
        if (this.f247744N0 != z) {
            this.f247744N0 = z;
            invalidate();
        }
    }

    public void setAnimationListener(v481 v481Var) {
        this.f247750b = v481Var;
    }

    public void setArrowOffset(int i) {
        this.f247743M0 = i;
    }

    public void setConfiguration(z281 z281Var) {
        this.f247745O0 = xul0.m92201d(z281Var);
        ((n09) z281Var).m63299c(LayoutInflater.from(getContext()), this.f247746P0);
    }

    public void setCornerRadius(float f) {
        this.f247757i = f;
    }

    public void setDrawArrowEnabled(boolean z) {
        this.f247742L0 = z;
    }

    public void setHidden(boolean z) {
        if (!z) {
            setVisibility(4);
            return;
        }
        setVisibility(8);
        if (this.f247745O0.mo49279c()) {
            ((n09) ((z281) this.f247745O0.mo49278b())).m63302f(this.f247746P0);
            this.f247745O0 = C2244p5.f174033a;
        }
    }

    public void setSideMargin(int i) {
        this.f247758t = i;
        FrameLayout frameLayout = this.f247746P0;
        frameLayout.setPadding(i, frameLayout.getPaddingTop(), i, this.f247746P0.getPaddingBottom());
    }
}
