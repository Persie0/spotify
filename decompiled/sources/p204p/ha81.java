package p204p;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ha81 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, zvl0 {

    /* JADX INFO: renamed from: c */
    public final x541 f89156c;

    /* JADX INFO: renamed from: e */
    public final GestureDetector f89158e;

    /* JADX INFO: renamed from: a */
    public final PointF f89154a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f89155b = new PointF();

    /* JADX INFO: renamed from: d */
    public final float f89157d = 25.0f;

    /* JADX INFO: renamed from: f */
    public volatile float f89159f = 3.1415927f;

    public ha81(Context context, x541 x541Var) {
        this.f89156c = x541Var;
        this.f89158e = new GestureDetector(context, this);
    }

    @Override // p204p.zvl0
    /* JADX INFO: renamed from: a */
    public final void mo46922a(float f, float[] fArr) {
        this.f89159f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f89154a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f89154a.x) / this.f89157d;
        float y = motionEvent2.getY();
        PointF pointF = this.f89154a;
        float f3 = (y - pointF.y) / this.f89157d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f89159f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f89155b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        x541 x541Var = this.f89156c;
        PointF pointF3 = this.f89155b;
        synchronized (x541Var) {
            float f5 = pointF3.y;
            x541Var.f258291g = f5;
            Matrix.setRotateM(x541Var.f258289e, 0, -f5, (float) Math.cos(x541Var.f258292h), (float) Math.sin(x541Var.f258292h), 0.0f);
            Matrix.setRotateM(x541Var.f258290f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f89156c.f258284X.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f89158e.onTouchEvent(motionEvent);
    }
}
