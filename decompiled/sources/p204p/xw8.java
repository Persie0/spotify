package p204p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class xw8 extends dx8 {

    /* JADX INFO: renamed from: E1 */
    public boolean f266609E1;

    /* JADX INFO: renamed from: F1 */
    public boolean f266610F1;

    /* JADX INFO: renamed from: G1 */
    public boolean f266611G1;

    /* JADX INFO: renamed from: H1 */
    public boolean f266612H1;

    public xw8(Context context) {
        super(context);
        this.f266062a = false;
        this.f266064b = null;
        this.f266066c = true;
        this.f266068d = true;
        this.f266069e = 0.9f;
        this.f266070f = new t5p(0);
        this.f266074t = true;
        this.f266050O0 = "No chart data available.";
        pkc1 pkc1Var = new pkc1();
        this.f266054S0 = pkc1Var;
        this.f266056U0 = 0.0f;
        this.f266057V0 = 0.0f;
        this.f266058W0 = 0.0f;
        this.f266059X0 = 0.0f;
        this.f266060Y0 = false;
        this.f266063a1 = 0.0f;
        this.f266065b1 = new ArrayList();
        this.f266067c1 = false;
        setWillNotDraw(false);
        this.f266055T0 = new yuc();
        Context context2 = getContext();
        DisplayMetrics displayMetrics = u0b1.f225435a;
        if (context2 == null) {
            u0b1.f225436b = ViewConfiguration.getMinimumFlingVelocity();
            u0b1.f225437c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
            u0b1.f225436b = viewConfiguration.getScaledMinimumFlingVelocity();
            u0b1.f225437c = viewConfiguration.getScaledMaximumFlingVelocity();
            u0b1.f225435a = context2.getResources().getDisplayMetrics();
        }
        this.f266063a1 = u0b1.m82122c(500.0f);
        euq euqVar = new euq();
        euqVar.f63049e = "Description Label";
        euqVar.f63050f = Paint.Align.RIGHT;
        euqVar.f63529c = u0b1.m82122c(8.0f);
        this.f266047L0 = euqVar;
        q580 q580Var = new q580();
        q580Var.f185459e = new r580[0];
        q580Var.f185460f = 1;
        q580Var.f185461g = 3;
        q580Var.f185462h = 1;
        q580Var.f185463i = 1;
        q580Var.f185464j = 4;
        q580Var.f185465k = 8.0f;
        q580Var.f185466l = 3.0f;
        q580Var.f185467m = 6.0f;
        q580Var.f185468n = 5.0f;
        q580Var.f185469o = 3.0f;
        q580Var.f185470p = 0.95f;
        q580Var.f185471q = 0.0f;
        q580Var.f185472r = 0.0f;
        q580Var.f185473s = new ArrayList(16);
        q580Var.f185474t = new ArrayList(16);
        q580Var.f185475u = new ArrayList(16);
        q580Var.f63529c = u0b1.m82122c(10.0f);
        q580Var.f63527a = u0b1.m82122c(5.0f);
        q580Var.f63528b = u0b1.m82122c(3.0f);
        this.f266048M0 = q580Var;
        s580 s580Var = new s580(pkc1Var, 14);
        s580Var.f205750f = new ArrayList(16);
        s580Var.f205751g = new Paint.FontMetrics();
        s580Var.f205752h = new Path();
        s580Var.f205749e = q580Var;
        Paint paint = new Paint(1);
        s580Var.f205747c = paint;
        paint.setTextSize(u0b1.m82122c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        s580Var.f205748d = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f266051P0 = s580Var;
        qfe1 qfe1Var = new qfe1();
        qfe1Var.f188191B = 1;
        qfe1Var.f188192C = 1;
        qfe1Var.f63528b = u0b1.m82122c(4.0f);
        this.f266073i = qfe1Var;
        this.f266071g = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f266072h = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.f266072h.setTextAlign(Paint.Align.CENTER);
        this.f266072h.setTextSize(u0b1.m82122c(12.0f));
        this.f53889s1 = new sie1(1);
        this.f53890t1 = new sie1(2);
        this.f53893w1 = new oyp0(pkc1Var);
        this.f53894x1 = new oyp0(pkc1Var);
        this.f53891u1 = new tie1(pkc1Var, this.f53889s1, this.f53893w1);
        this.f53892v1 = new tie1(pkc1Var, this.f53890t1, this.f53894x1);
        this.f53895y1 = new rfe1(pkc1Var, this.f266073i, this.f53893w1);
        setHighlighter(new cvc(this));
        ex8 ex8Var = new ex8();
        ex8Var.f63200a = 0;
        ex8Var.f63203d = this;
        ex8Var.f63202c = new GestureDetector(getContext(), ex8Var);
        ex8Var.f63708e = new Matrix();
        ex8Var.f63709f = new Matrix();
        ex8Var.f63710g = erb0.m39774b(0.0f, 0.0f);
        ex8Var.f63711h = erb0.m39774b(0.0f, 0.0f);
        ex8Var.f63712i = 1.0f;
        ex8Var.f63713t = 1.0f;
        ex8Var.f63705X = 1.0f;
        ex8Var.f63700L0 = 0L;
        ex8Var.f63701M0 = erb0.m39774b(0.0f, 0.0f);
        ex8Var.f63702N0 = erb0.m39774b(0.0f, 0.0f);
        ex8Var.f63708e = pkc1Var.f178431a;
        ex8Var.f63703O0 = u0b1.m82122c(3.0f);
        ex8Var.f63704P0 = u0b1.m82122c(3.5f);
        this.f266049N0 = ex8Var;
        Paint paint4 = new Paint();
        this.f53882l1 = paint4;
        paint4.setStyle(style);
        this.f53882l1.setColor(Color.rgb(240, 240, 240));
        Paint paint5 = new Paint();
        this.f53883m1 = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f53883m1.setColor(-16777216);
        this.f53883m1.setStrokeWidth(u0b1.m82122c(1.0f));
        this.f266052Q0 = new yw8(this, this.f266055T0, pkc1Var);
        setHighlighter(new cx8(this));
        getXAxis().f121124u = 0.5f;
        getXAxis().f121125v = 0.5f;
        this.f53874d1 = 100;
        this.f53875e1 = false;
        this.f53876f1 = false;
        this.f53877g1 = true;
        this.f53878h1 = true;
        this.f53879i1 = true;
        this.f53880j1 = true;
        this.f53881k1 = true;
        this.f53884n1 = false;
        this.f53885o1 = false;
        this.f53886p1 = false;
        this.f53887q1 = 15.0f;
        this.f53888r1 = false;
        this.f53896z1 = new RectF();
        this.f53870A1 = new Matrix();
        new Matrix();
        gmk0 gmk0Var = drb0.f52281d;
        drb0 drb0Var = (drb0) gmk0Var.m45274b();
        drb0Var.f52282b = 0.0d;
        drb0Var.f52283c = 0.0d;
        this.f53871B1 = drb0Var;
        drb0 drb0Var2 = (drb0) gmk0Var.m45274b();
        drb0Var2.f52282b = 0.0d;
        drb0Var2.f52283c = 0.0d;
        this.f53872C1 = drb0Var2;
        this.f53873D1 = new float[2];
        this.f266609E1 = false;
        this.f266610F1 = true;
        this.f266611G1 = false;
        this.f266612H1 = false;
    }

    @Override // p204p.xuc
    /* JADX INFO: renamed from: b */
    public final bs20 mo92132b(float f, float f2) {
        if (this.f266064b == null) {
            return null;
        }
        bs20 bs20VarMo34027a = getHighlighter().mo34027a(f, f2);
        return (bs20VarMo34027a == null || !this.f266609E1) ? bs20VarMo34027a : new bs20(bs20VarMo34027a.f30216a, bs20VarMo34027a.f30217b, bs20VarMo34027a.f30218c, bs20VarMo34027a.f30219d, bs20VarMo34027a.f30220e, bs20VarMo34027a.f30221f);
    }

    public zw8 getBarData() {
        return (zw8) this.f266064b;
    }

    public void setDrawBarShadow(boolean z) {
        this.f266611G1 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f266610F1 = z;
    }

    public void setFitBars(boolean z) {
        this.f266612H1 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f266609E1 = z;
    }
}
