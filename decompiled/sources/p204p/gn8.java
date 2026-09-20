package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.view.View;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gn8 extends View {

    /* JADX INFO: renamed from: a */
    public final Path f81630a;

    /* JADX INFO: renamed from: b */
    public final Path f81631b;

    /* JADX INFO: renamed from: c */
    public final Path f81632c;

    /* JADX INFO: renamed from: d */
    public final Paint f81633d;

    /* JADX INFO: renamed from: e */
    public final Paint f81634e;

    /* JADX INFO: renamed from: f */
    public final int f81635f;

    /* JADX INFO: renamed from: g */
    public final int f81636g;

    /* JADX INFO: renamed from: h */
    public final wg61 f81637h;

    /* JADX INFO: renamed from: i */
    public Object f81638i;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f81639t;

    public gn8(Context context) {
        super(context, null, 0, 0);
        this.f81630a = new Path();
        this.f81631b = new Path();
        this.f81632c = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(context.getColor(R.color.equalizer_curve_color));
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.equalizer_stroke_width));
        this.f81633d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.f81634e = paint2;
        this.f81635f = context.getColor(R.color.equalizer_background_color_start);
        this.f81636g = context.getColor(R.color.equalizer_background_color_end);
        this.f81637h = new wg61(new so5(this, 21));
        this.f81638i = lau.f131415a;
    }

    private final long getShortDuration() {
        return ((Number) this.f81637h.getValue()).longValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final void m45292a(ArrayList arrayList, boolean z) {
        if (wj50.m88271j(this.f81638i, arrayList)) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.f81639t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            m45293b(arrayList);
        } else if (this.f81638i.isEmpty()) {
            m45293b(arrayList);
        } else {
            ?? r5 = this.f81638i;
            ValueAnimator valueAnimator2 = this.f81639t;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(getShortDuration());
            valueAnimatorOfFloat.addUpdateListener(new fn8((List) r5, arrayList, this));
            valueAnimatorOfFloat.start();
            this.f81639t = valueAnimatorOfFloat;
        }
        this.f81638i = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m45293b(ArrayList arrayList) {
        int i;
        Path path = this.f81630a;
        path.reset();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PointF pointF = (PointF) it.next();
            arrayList2.add(Float.valueOf(pointF.x));
            arrayList2.add(Float.valueOf(pointF.y));
        }
        int i2 = 0;
        arrayList2.add(0, Float.valueOf(((PointF) arrayList.get(0)).x));
        arrayList2.add(1, Float.valueOf(((PointF) arrayList.get(0)).y));
        arrayList2.add(Float.valueOf(((PointF) arrayList.get(h6f.m46714K(arrayList))).x));
        arrayList2.add(Float.valueOf(((PointF) arrayList.get(h6f.m46714K(arrayList))).y));
        ArrayList arrayList3 = new ArrayList();
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(2, arrayList2.size() - 4), 2);
        int i3 = z350VarM63411S.f278778a;
        int i4 = z350VarM63411S.f278779b;
        int i5 = z350VarM63411S.f278780c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            i = 0;
        } else {
            while (true) {
                int i6 = i2;
                while (i6 < 25) {
                    int i7 = i3 + 2;
                    float fFloatValue = (((Number) arrayList2.get(i7)).floatValue() - ((Number) arrayList2.get(i3 - 2)).floatValue()) * 0.6f;
                    float fFloatValue2 = (((Number) arrayList2.get(i3 + 4)).floatValue() - ((Number) arrayList2.get(i3)).floatValue()) * 0.6f;
                    int i8 = i3 + 3;
                    float fFloatValue3 = (((Number) arrayList2.get(i8)).floatValue() - ((Number) arrayList2.get(i3 - 1)).floatValue()) * 0.6f;
                    int i9 = i3 + 1;
                    float fFloatValue4 = (((Number) arrayList2.get(i3 + 5)).floatValue() - ((Number) arrayList2.get(i9)).floatValue()) * 0.6f;
                    double d = ((double) i6) / ((double) 24);
                    int i10 = i5;
                    int i11 = i4;
                    double d2 = 2;
                    double d3 = 3;
                    double dPow = ((Math.pow(d, 3.0d) * d2) - (Math.pow(d, 2.0d) * d3)) + 1.0d;
                    double dPow2 = (Math.pow(d, 2.0d) * d3) + (-(Math.pow(d, 3.0d) * d2));
                    double dPow3 = (Math.pow(d, 3.0d) - (Math.pow(d, 2.0d) * d2)) + d;
                    double dPow4 = Math.pow(d, 3.0d) - Math.pow(d, 2.0d);
                    arrayList3.add(new PointF((float) ((((double) fFloatValue2) * dPow4) + (((double) fFloatValue) * dPow3) + (((Number) arrayList2.get(i7)).doubleValue() * dPow2) + (((Number) arrayList2.get(i3)).doubleValue() * dPow)), (float) ((dPow4 * ((double) fFloatValue4)) + (dPow3 * ((double) fFloatValue3)) + (((Number) arrayList2.get(i8)).doubleValue() * dPow2) + (((Number) arrayList2.get(i9)).doubleValue() * dPow))));
                    i6++;
                    i5 = i10;
                    i4 = i11;
                }
                int i12 = i5;
                int i13 = i4;
                if (i3 == i13) {
                    break;
                }
                i3 += i12;
                i2 = 0;
                i4 = i13;
                i5 = i12;
            }
            i = 0;
        }
        path.moveTo(((PointF) arrayList3.get(i)).x, ((PointF) arrayList3.get(i)).y);
        int iM46714K = h6f.m46714K(arrayList3);
        for (int i14 = 1; i14 < iM46714K; i14++) {
            path.lineTo(((PointF) arrayList3.get(i14)).x, ((PointF) arrayList3.get(i14)).y);
        }
        this.f81631b.set(path);
        path.lineTo(((PointF) g6f.m43687A0(arrayList)).x, getHeight());
        path.lineTo(((PointF) g6f.m43741q0(arrayList)).x, getHeight());
        path.close();
        this.f81632c.set(path);
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f81632c, this.f81634e);
        canvas.drawPath(this.f81631b, this.f81633d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f81634e.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.f81635f, this.f81636g, Shader.TileMode.MIRROR));
    }
}
