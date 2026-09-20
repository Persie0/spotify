package p204p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dx8 extends xuc {

    /* JADX INFO: renamed from: A1 */
    public Matrix f53870A1;

    /* JADX INFO: renamed from: B1 */
    public drb0 f53871B1;

    /* JADX INFO: renamed from: C1 */
    public drb0 f53872C1;

    /* JADX INFO: renamed from: D1 */
    public float[] f53873D1;

    /* JADX INFO: renamed from: d1 */
    public int f53874d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f53875e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f53876f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f53877g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f53878h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f53879i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f53880j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f53881k1;

    /* JADX INFO: renamed from: l1 */
    public Paint f53882l1;

    /* JADX INFO: renamed from: m1 */
    public Paint f53883m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f53884n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f53885o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f53886p1;

    /* JADX INFO: renamed from: q1 */
    public float f53887q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f53888r1;

    /* JADX INFO: renamed from: s1 */
    public sie1 f53889s1;

    /* JADX INFO: renamed from: t1 */
    public sie1 f53890t1;

    /* JADX INFO: renamed from: u1 */
    public tie1 f53891u1;

    /* JADX INFO: renamed from: v1 */
    public tie1 f53892v1;

    /* JADX INFO: renamed from: w1 */
    public oyp0 f53893w1;

    /* JADX INFO: renamed from: x1 */
    public oyp0 f53894x1;

    /* JADX INFO: renamed from: y1 */
    public rfe1 f53895y1;

    /* JADX INFO: renamed from: z1 */
    public RectF f53896z1;

    @Override // p204p.xuc
    /* JADX INFO: renamed from: a */
    public final void mo37196a() {
        RectF rectF = this.f53896z1;
        pkc1 pkc1Var = this.f266054S0;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        q580 q580Var = this.f266048M0;
        if (q580Var != null) {
            int iM38547C = edb.m38547C(q580Var.f185462h);
            if (iM38547C == 0) {
                int iM38547C2 = edb.m38547C(this.f266048M0.f185461g);
                if (iM38547C2 == 0) {
                    float f = rectF.top;
                    q580 q580Var2 = this.f266048M0;
                    rectF.top = Math.min(q580Var2.f185472r, pkc1Var.f178434d * q580Var2.f185470p) + this.f266048M0.f63528b + f;
                    getXAxis().getClass();
                    if (getXAxis().f121122s) {
                        rectF.top += getXAxis().f188191B;
                    }
                } else if (iM38547C2 == 2) {
                    float f2 = rectF.bottom;
                    q580 q580Var3 = this.f266048M0;
                    rectF.bottom = Math.min(q580Var3.f185472r, pkc1Var.f178434d * q580Var3.f185470p) + this.f266048M0.f63528b + f2;
                    getXAxis().getClass();
                    if (getXAxis().f121122s) {
                        rectF.bottom += getXAxis().f188191B;
                    }
                }
            } else if (iM38547C == 1) {
                int iM38547C3 = edb.m38547C(this.f266048M0.f185460f);
                if (iM38547C3 == 0) {
                    float f3 = rectF.left;
                    q580 q580Var4 = this.f266048M0;
                    rectF.left = Math.min(q580Var4.f185471q, pkc1Var.f178433c * q580Var4.f185470p) + this.f266048M0.f63527a + f3;
                } else if (iM38547C3 == 1) {
                    int iM38547C4 = edb.m38547C(this.f266048M0.f185461g);
                    if (iM38547C4 == 0) {
                        float f4 = rectF.top;
                        q580 q580Var5 = this.f266048M0;
                        rectF.top = Math.min(q580Var5.f185472r, pkc1Var.f178434d * q580Var5.f185470p) + this.f266048M0.f63528b + f4;
                    } else if (iM38547C4 == 2) {
                        float f5 = rectF.bottom;
                        q580 q580Var6 = this.f266048M0;
                        rectF.bottom = Math.min(q580Var6.f185472r, pkc1Var.f178434d * q580Var6.f185470p) + this.f266048M0.f63528b + f5;
                    }
                } else if (iM38547C3 == 2) {
                    float f6 = rectF.right;
                    q580 q580Var7 = this.f266048M0;
                    rectF.right = Math.min(q580Var7.f185471q, pkc1Var.f178433c * q580Var7.f185470p) + this.f266048M0.f63527a + f6;
                }
            }
        }
        float fM78189d = rectF.left + 0.0f;
        float f7 = rectF.top + 0.0f;
        float fM78189d2 = rectF.right + 0.0f;
        float f8 = rectF.bottom + 0.0f;
        sie1 sie1Var = this.f53889s1;
        if (sie1Var.f121122s && sie1Var.f209479F == 1) {
            fM78189d += sie1Var.m78189d(this.f53891u1.f131594f);
        }
        sie1 sie1Var2 = this.f53890t1;
        if (sie1Var2.f121122s && sie1Var2.f209479F == 1) {
            fM78189d2 += sie1Var2.m78189d(this.f53892v1.f131594f);
        }
        qfe1 qfe1Var = this.f266073i;
        qfe1Var.getClass();
        if (qfe1Var.f121122s) {
            float f9 = qfe1Var.f188191B + qfe1Var.f63528b;
            int i = qfe1Var.f188192C;
            if (i == 2) {
                f8 += f9;
            } else if (i == 1) {
                f7 += f9;
            } else if (i == 3) {
                f8 += f9;
                f7 += f9;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f7;
        float extraRightOffset = getExtraRightOffset() + fM78189d2;
        float extraBottomOffset = getExtraBottomOffset() + f8;
        float extraLeftOffset = getExtraLeftOffset() + fM78189d;
        float fM82122c = u0b1.m82122c(this.f53887q1);
        pkc1Var.f178432b.set(Math.max(fM82122c, extraLeftOffset), Math.max(fM82122c, extraTopOffset), pkc1Var.f178433c - Math.max(fM82122c, extraRightOffset), pkc1Var.f178434d - Math.max(fM82122c, extraBottomOffset));
        if (this.f266062a) {
            pkc1Var.f178432b.toString();
        }
        oyp0 oyp0Var = this.f53894x1;
        this.f53890t1.getClass();
        oyp0Var.m68552u();
        oyp0 oyp0Var2 = this.f53893w1;
        this.f53889s1.getClass();
        oyp0Var2.m68552u();
        if (this.f266062a) {
            float f10 = this.f266073i.f121129z;
        }
        oyp0 oyp0Var3 = this.f53894x1;
        qfe1 qfe1Var2 = this.f266073i;
        float f11 = qfe1Var2.f121129z;
        float f12 = qfe1Var2.f121107A;
        sie1 sie1Var3 = this.f53890t1;
        oyp0Var3.m68553v(f11, f12, sie1Var3.f121107A, sie1Var3.f121129z);
        oyp0 oyp0Var4 = this.f53893w1;
        qfe1 qfe1Var3 = this.f266073i;
        float f13 = qfe1Var3.f121129z;
        float f14 = qfe1Var3.f121107A;
        sie1 sie1Var4 = this.f53889s1;
        oyp0Var4.m68553v(f13, f14, sie1Var4.f121107A, sie1Var4.f121129z);
    }

    @Override // android.view.View
    public final void computeScroll() {
        evc evcVar = this.f266049N0;
        if (evcVar instanceof ex8) {
            ex8 ex8Var = (ex8) evcVar;
            erb0 erb0Var = ex8Var.f63702N0;
            dx8 dx8Var = ex8Var.f63203d;
            if (erb0Var.f62074b == 0.0f && erb0Var.f62075c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            erb0Var.f62074b = dx8Var.getDragDecelerationFrictionCoef() * erb0Var.f62074b;
            float dragDecelerationFrictionCoef = dx8Var.getDragDecelerationFrictionCoef() * erb0Var.f62075c;
            erb0Var.f62075c = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - ex8Var.f63700L0) / 1000.0f;
            float f2 = erb0Var.f62074b * f;
            float f3 = dragDecelerationFrictionCoef * f;
            erb0 erb0Var2 = ex8Var.f63701M0;
            float f4 = erb0Var2.f62074b + f2;
            erb0Var2.f62074b = f4;
            float f5 = erb0Var2.f62075c + f3;
            erb0Var2.f62075c = f5;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f4, f5, 0);
            ex8Var.m40197c(motionEventObtain);
            motionEventObtain.recycle();
            pkc1 viewPortHandler = dx8Var.getViewPortHandler();
            Matrix matrix = ex8Var.f63708e;
            viewPortHandler.m70188d(matrix, dx8Var, false);
            ex8Var.f63708e = matrix;
            ex8Var.f63700L0 = jCurrentAnimationTimeMillis;
            if (Math.abs(erb0Var.f62074b) >= 0.01d || Math.abs(erb0Var.f62075c) >= 0.01d) {
                DisplayMetrics displayMetrics = u0b1.f225435a;
                dx8Var.postInvalidateOnAnimation();
            } else {
                dx8Var.mo37196a();
                dx8Var.postInvalidate();
                erb0Var.f62074b = 0.0f;
                erb0Var.f62075c = 0.0f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    @Override // p204p.xuc
    /* JADX INFO: renamed from: d */
    public final void mo37197d() {
        ArrayList arrayList;
        String str;
        float f;
        int i;
        float f2;
        int i2;
        String str2;
        if (this.f266064b == null) {
            return;
        }
        gho ghoVar = this.f266052Q0;
        if (ghoVar != null) {
            ghoVar.mo44754G1();
        }
        xw8 xw8Var = (xw8) this;
        if (xw8Var.f266612H1) {
            qfe1 qfe1Var = xw8Var.f266073i;
            zw8 zw8Var = (zw8) xw8Var.f266064b;
            float f3 = zw8Var.f286408d;
            float f4 = zw8Var.f286942j / 2.0f;
            qfe1Var.mo55935a(f3 - f4, f4 + zw8Var.f286407c);
        } else {
            qfe1 qfe1Var2 = xw8Var.f266073i;
            zw8 zw8Var2 = (zw8) xw8Var.f266064b;
            qfe1Var2.mo55935a(zw8Var2.f286408d, zw8Var2.f286407c);
        }
        int i3 = 1;
        xw8Var.f53889s1.mo55935a(((zw8) xw8Var.f266064b).m97020f(1), ((zw8) xw8Var.f266064b).m97019e(1));
        xw8Var.f53890t1.mo55935a(((zw8) xw8Var.f266064b).m97020f(2), ((zw8) xw8Var.f266064b).m97019e(2));
        tie1 tie1Var = this.f53891u1;
        sie1 sie1Var = this.f53889s1;
        tie1Var.mo58620F1(sie1Var.f121129z, sie1Var.f121128y);
        tie1 tie1Var2 = this.f53892v1;
        sie1 sie1Var2 = this.f53890t1;
        tie1Var2.mo58620F1(sie1Var2.f121129z, sie1Var2.f121128y);
        rfe1 rfe1Var = this.f53895y1;
        qfe1 qfe1Var3 = this.f266073i;
        rfe1Var.mo58620F1(qfe1Var3.f121129z, qfe1Var3.f121128y);
        if (this.f266048M0 != null) {
            s580 s580Var = this.f266051P0;
            zuc zucVar = this.f266064b;
            Paint paint = s580Var.f205747c;
            q580 q580Var = s580Var.f205749e;
            q580Var.getClass();
            ArrayList arrayList2 = s580Var.f205750f;
            arrayList2.clear();
            int i4 = 0;
            while (i4 < zucVar.m97017c()) {
                qu30 qu30VarM97016b = zucVar.m97016b(i4);
                ax8 ax8Var = (ax8) qu30VarM97016b;
                ArrayList arrayList3 = ax8Var.f20783a;
                int size = ((ax8) qu30VarM97016b).f20797o.size();
                if (qu30VarM97016b instanceof ax8) {
                    ax8 ax8Var2 = (ax8) qu30VarM97016b;
                    if (ax8Var2.f20803u > i3) {
                        String[] strArr = ax8Var2.f20807y;
                        for (int i5 = 0; i5 < arrayList3.size() && i5 < ax8Var2.f20803u; i5++) {
                            ax8 ax8Var3 = (ax8) qu30VarM97016b;
                            arrayList2.add(new r580(strArr[i5 % strArr.length], ax8Var3.f20789g, ax8Var3.f20790h, ax8Var3.f20791i, ((Integer) arrayList3.get(i5)).intValue()));
                        }
                        if (ax8Var2.f20785c != null) {
                            arrayList2.add(new r580(((ax8) qu30VarM97016b).f20785c, 1, Float.NaN, Float.NaN, 1122867));
                        }
                    } else {
                        i2 = 0;
                        while (i2 < arrayList3.size() && i2 < size) {
                            if (i2 < arrayList3.size() - i3 || i2 >= size - 1) {
                                str2 = ((ax8) zucVar.m97016b(i4)).f20785c;
                            } else {
                                str2 = null;
                            }
                            arrayList2.add(new r580(str2, ax8Var.f20789g, ax8Var.f20790h, ax8Var.f20791i, ((Integer) arrayList3.get(i2)).intValue()));
                            i2++;
                            i3 = 1;
                        }
                    }
                } else {
                    i2 = 0;
                    while (i2 < arrayList3.size()) {
                        if (i2 < arrayList3.size() - i3) {
                            str2 = ((ax8) zucVar.m97016b(i4)).f20785c;
                        } else {
                            str2 = ((ax8) zucVar.m97016b(i4)).f20785c;
                        }
                        arrayList2.add(new r580(str2, ax8Var.f20789g, ax8Var.f20790h, ax8Var.f20791i, ((Integer) arrayList3.get(i2)).intValue()));
                        i2++;
                        i3 = 1;
                    }
                }
                i4++;
                i3 = 1;
            }
            q580Var.f185459e = (r580[]) arrayList2.toArray(new r580[arrayList2.size()]);
            paint.setTextSize(q580Var.f63529c);
            paint.setColor(q580Var.f63530d);
            pkc1 pkc1Var = (pkc1) s580Var.f57320b;
            ArrayList arrayList4 = q580Var.f185474t;
            ArrayList arrayList5 = q580Var.f185473s;
            ArrayList arrayList6 = q580Var.f185475u;
            float f5 = q580Var.f185465k;
            float fM82122c = u0b1.m82122c(f5);
            float fM82122c2 = u0b1.m82122c(q580Var.f185469o);
            float f6 = q580Var.f185468n;
            float fM82122c3 = u0b1.m82122c(f6);
            float fM82122c4 = u0b1.m82122c(q580Var.f185467m);
            float fM82122c5 = u0b1.m82122c(0.0f);
            r580[] r580VarArr = q580Var.f185459e;
            int length = r580VarArr.length;
            u0b1.m82122c(f6);
            r580[] r580VarArr2 = q580Var.f185459e;
            int length2 = r580VarArr2.length;
            int i6 = 0;
            float f7 = 0.0f;
            float f8 = 0.0f;
            while (i6 < length2) {
                int i7 = length2;
                r580 r580Var = r580VarArr2[i6];
                int i8 = i6;
                float fM82122c6 = u0b1.m82122c(Float.isNaN(r580Var.f195990c) ? f5 : r580Var.f195990c);
                if (fM82122c6 > f8) {
                    f8 = fM82122c6;
                }
                String str3 = r580Var.f195988a;
                if (str3 != null) {
                    float fMeasureText = (int) paint.measureText(str3);
                    if (fMeasureText > f7) {
                        f7 = fMeasureText;
                    }
                }
                i6 = i8 + 1;
                length2 = i7;
            }
            r580[] r580VarArr3 = q580Var.f185459e;
            int length3 = r580VarArr3.length;
            int i9 = 0;
            float f9 = 0.0f;
            while (i9 < length3) {
                int i10 = i9;
                String str4 = r580VarArr3[i10].f195988a;
                if (str4 != null) {
                    float fM82120a = u0b1.m82120a(paint, str4);
                    if (fM82120a > f9) {
                        f9 = fM82120a;
                    }
                }
                i9 = i10 + 1;
            }
            int iM38547C = edb.m38547C(q580Var.f185462h);
            if (iM38547C == 0) {
                Paint.FontMetrics fontMetrics = u0b1.f225439e;
                paint.getFontMetrics(fontMetrics);
                float f10 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f11 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fM82122c5;
                pkc1Var.f178432b.width();
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                int i11 = -1;
                int i12 = 0;
                float fMax = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (i12 < length) {
                    r580 r580Var2 = r580VarArr[i12];
                    float f14 = fM82122c2;
                    int i13 = r580Var2.f195989b;
                    float f15 = f11;
                    float f16 = r580Var2.f195990c;
                    boolean z = i13 != 1;
                    float fM82122c7 = Float.isNaN(f16) ? fM82122c : u0b1.m82122c(f16);
                    String str5 = r580Var2.f195988a;
                    arrayList4.add(Boolean.FALSE);
                    float f17 = i11 == -1 ? 0.0f : f12 + f14;
                    if (str5 != null) {
                        arrayList = arrayList4;
                        arrayList5.add(u0b1.m82121b(paint, str5));
                        f = f17 + (z ? fM82122c3 + fM82122c7 : 0.0f) + ((p5y) arrayList5.get(i12)).f174253b;
                        str = str5;
                        i = -1;
                    } else {
                        arrayList = arrayList4;
                        p5y p5yVar = (p5y) p5y.f174252d.m45274b();
                        str = str5;
                        p5yVar.f174253b = 0.0f;
                        p5yVar.f174254c = 0.0f;
                        arrayList5.add(p5yVar);
                        if (!z) {
                            fM82122c7 = 0.0f;
                        }
                        f = f17 + fM82122c7;
                        i = -1;
                        if (i11 == -1) {
                            i11 = i12;
                        }
                    }
                    if (str != null || i12 == length - 1) {
                        float f18 = (f13 == 0.0f ? 0.0f : fM82122c4) + f + f13;
                        if (i12 == length - 1) {
                            p5y p5yVar2 = (p5y) p5y.f174252d.m45274b();
                            p5yVar2.f174253b = f18;
                            p5yVar2.f174254c = f10;
                            arrayList6.add(p5yVar2);
                            fMax = Math.max(fMax, f18);
                        }
                        f13 = f18;
                    }
                    if (str != null) {
                        i11 = i;
                    }
                    i12++;
                    arrayList4 = arrayList;
                    fM82122c2 = f14;
                    f12 = f;
                    f11 = f15;
                }
                float f19 = f11;
                q580Var.f185471q = fMax;
                q580Var.f185472r = (f19 * (arrayList6.size() == 0 ? 0 : arrayList6.size() - 1)) + (f10 * arrayList6.size());
            } else if (iM38547C == 1) {
                Paint.FontMetrics fontMetrics2 = u0b1.f225439e;
                paint.getFontMetrics(fontMetrics2);
                float f20 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                int i14 = 0;
                boolean z2 = false;
                while (i14 < length) {
                    r580 r580Var3 = r580VarArr[i14];
                    int i15 = r580Var3.f195989b;
                    float f23 = f20;
                    float f24 = r580Var3.f195990c;
                    boolean z3 = i15 != 1;
                    float fM82122c8 = Float.isNaN(f24) ? fM82122c : u0b1.m82122c(f24);
                    String str6 = r580Var3.f195988a;
                    if (!z2) {
                        f22 = 0.0f;
                    }
                    if (z3) {
                        if (z2) {
                            f22 += fM82122c2;
                        }
                        f22 += fM82122c8;
                    }
                    if (str6 != null) {
                        if (z3 && !z2) {
                            f2 = f22 + fM82122c3;
                        } else if (z2) {
                            fMax2 = Math.max(fMax2, f22);
                            f21 += f23 + fM82122c5;
                            f2 = 0.0f;
                            z2 = false;
                        } else {
                            f2 = f22;
                        }
                        float fMeasureText2 = f2 + ((int) paint.measureText(str6));
                        if (i14 < length - 1) {
                            f21 = f23 + fM82122c5 + f21;
                        }
                        f22 = fMeasureText2;
                    } else {
                        f22 += fM82122c8;
                        if (i14 < length - 1) {
                            f22 += fM82122c2;
                        }
                        z2 = true;
                    }
                    fMax2 = Math.max(fMax2, f22);
                    i14++;
                    f20 = f23;
                }
                q580Var.f185471q = fMax2;
                q580Var.f185472r = f21;
            }
            q580Var.f185472r += q580Var.f63528b;
            q580Var.f185471q += q580Var.f63527a;
        }
        mo37196a();
    }

    /* JADX INFO: renamed from: f */
    public final oyp0 m37198f(int i) {
        return i == 1 ? this.f53893w1 : this.f53894x1;
    }

    /* JADX INFO: renamed from: g */
    public final void m37199g(int i) {
        (i == 1 ? this.f53889s1 : this.f53890t1).getClass();
    }

    public sie1 getAxisLeft() {
        return this.f53889s1;
    }

    public sie1 getAxisRight() {
        return this.f53890t1;
    }

    @Override // p204p.xuc
    public /* bridge */ /* synthetic */ fx8 getData() {
        return (fx8) getData();
    }

    public nal0 getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        oyp0 oyp0Var = this.f53893w1;
        RectF rectF = this.f266054S0.f178432b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        drb0 drb0Var = this.f53872C1;
        oyp0Var.m68544l(f, f2, drb0Var);
        return (float) Math.min(this.f266073i.f121128y, drb0Var.f52282b);
    }

    public float getLowestVisibleX() {
        oyp0 oyp0Var = this.f53893w1;
        RectF rectF = this.f266054S0.f178432b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        drb0 drb0Var = this.f53871B1;
        oyp0Var.m68544l(f, f2, drb0Var);
        return (float) Math.max(this.f266073i.f121129z, drb0Var.f52282b);
    }

    @Override // p204p.xuc
    public int getMaxVisibleCount() {
        return this.f53874d1;
    }

    public float getMinOffset() {
        return this.f53887q1;
    }

    public tie1 getRendererLeftYAxis() {
        return this.f53891u1;
    }

    public tie1 getRendererRightYAxis() {
        return this.f53892v1;
    }

    public rfe1 getRendererXAxis() {
        return this.f53895y1;
    }

    @Override // android.view.View
    public float getScaleX() {
        pkc1 pkc1Var = this.f266054S0;
        if (pkc1Var == null) {
            return 1.0f;
        }
        return pkc1Var.f178439i;
    }

    @Override // android.view.View
    public float getScaleY() {
        pkc1 pkc1Var = this.f266054S0;
        if (pkc1Var == null) {
            return 1.0f;
        }
        return pkc1Var.f178440j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // p204p.xuc
    public float getYChartMax() {
        return Math.max(this.f53889s1.f121128y, this.f53890t1.f121128y);
    }

    @Override // p204p.xuc
    public float getYChartMin() {
        return Math.min(this.f53889s1.f121129z, this.f53890t1.f121129z);
    }

    @Override // p204p.xuc, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        float f5;
        pkc1 pkc1Var;
        float f6;
        int i3;
        Canvas canvas2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i6;
        String str;
        Canvas canvas3;
        float fMeasureText;
        float fWidth;
        bs20[] bs20VarArr;
        bx8 bx8Var;
        pkc1 pkc1Var2 = this.f266054S0;
        super.onDraw(canvas);
        if (this.f266064b == null) {
            return;
        }
        System.currentTimeMillis();
        if (this.f53884n1) {
            canvas.drawRect(pkc1Var2.f178432b, this.f53882l1);
        }
        if (this.f53885o1) {
            canvas.drawRect(pkc1Var2.f178432b, this.f53883m1);
        }
        int i7 = 1;
        if (this.f53875e1) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            fx8 fx8Var = (fx8) this.f266064b;
            Iterator it = fx8Var.f286413i.iterator();
            while (it.hasNext()) {
                ax8 ax8Var = (ax8) ((qu30) it.next());
                ArrayList arrayList4 = ax8Var.f20797o;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ax8Var.f20798p = -3.4028235E38f;
                    ax8Var.f20799q = Float.MAX_VALUE;
                    int iM27370c = ax8Var.m27370c(highestVisibleX, Float.NaN, 1);
                    for (int iM27370c2 = ax8Var.m27370c(lowestVisibleX, Float.NaN, 2); iM27370c2 <= iM27370c; iM27370c2++) {
                        lyv lyvVar = (lyv) arrayList4.get(iM27370c2);
                        if (lyvVar.mo30764c() < ax8Var.f20799q) {
                            ax8Var.f20799q = lyvVar.mo30764c();
                        }
                        if (lyvVar.mo30764c() > ax8Var.f20798p) {
                            ax8Var.f20798p = lyvVar.mo30764c();
                        }
                    }
                }
            }
            fx8Var.m97015a();
            qfe1 qfe1Var = this.f266073i;
            fx8 fx8Var2 = (fx8) this.f266064b;
            qfe1Var.mo55935a(fx8Var2.f286408d, fx8Var2.f286407c);
            sie1 sie1Var = this.f53889s1;
            sie1Var.getClass();
            sie1Var.mo55935a(((fx8) this.f266064b).m97020f(1), ((fx8) this.f266064b).m97019e(1));
            sie1 sie1Var2 = this.f53890t1;
            sie1Var2.getClass();
            sie1Var2.mo55935a(((fx8) this.f266064b).m97020f(2), ((fx8) this.f266064b).m97019e(2));
            mo37196a();
        }
        sie1 sie1Var3 = this.f53889s1;
        sie1Var3.getClass();
        this.f53891u1.mo58620F1(sie1Var3.f121129z, sie1Var3.f121128y);
        sie1 sie1Var4 = this.f53890t1;
        sie1Var4.getClass();
        this.f53892v1.mo58620F1(sie1Var4.f121129z, sie1Var4.f121128y);
        qfe1 qfe1Var2 = this.f266073i;
        qfe1Var2.getClass();
        this.f53895y1.mo58620F1(qfe1Var2.f121129z, qfe1Var2.f121128y);
        this.f53895y1.mo29291I1(canvas);
        this.f53891u1.m80920J1(canvas);
        this.f53892v1.m80920J1(canvas);
        rfe1 rfe1Var = this.f53895y1;
        Paint paint = rfe1Var.f131593e;
        kb8 kb8Var = rfe1Var.f131591c;
        pkc1 pkc1Var3 = (pkc1) rfe1Var.f57320b;
        qfe1 qfe1Var3 = rfe1Var.f198638i;
        if (qfe1Var3.f121120q) {
            int iSave = canvas.save();
            RectF rectF = rfe1Var.f198636Y;
            RectF rectF2 = pkc1Var3.f178432b;
            rectF.set(rectF2);
            rectF.inset(-kb8Var.f121110g, 0.0f);
            canvas.clipRect(rectF);
            if (rfe1Var.f198635X.length != kb8Var.f121114k * 2) {
                rfe1Var.f198635X = new float[qfe1Var3.f121114k * 2];
            }
            float[] fArr = rfe1Var.f198635X;
            for (int i8 = 0; i8 < fArr.length; i8 += 2) {
                float[] fArr2 = qfe1Var3.f121113j;
                int i9 = i8 / 2;
                fArr[i8] = fArr2[i9];
                fArr[i8 + 1] = fArr2[i9];
            }
            rfe1Var.f131592d.m68550s(fArr);
            paint.setColor(qfe1Var3.f121109f);
            paint.setStrokeWidth(qfe1Var3.f121110g);
            paint.setPathEffect(null);
            Path path = rfe1Var.f198639t;
            path.reset();
            for (int i10 = 0; i10 < fArr.length; i10 += 2) {
                float f12 = fArr[i10];
                float f13 = fArr[i10 + 1];
                path.moveTo(f12, rectF2.bottom);
                path.lineTo(f12, rectF2.top);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
        this.f53891u1.m80921K1(canvas);
        this.f53892v1.m80921K1(canvas);
        this.f266073i.getClass();
        this.f53889s1.getClass();
        this.f53890t1.getClass();
        int iSave2 = canvas.save();
        RectF rectF3 = pkc1Var2.f178432b;
        RectF rectF4 = pkc1Var2.f178432b;
        canvas.clipRect(rectF3);
        yw8 yw8Var = (yw8) this.f266052Q0;
        zw8 barData = yw8Var.f276914g.getBarData();
        for (int i11 = 0; i11 < barData.m97017c(); i11++) {
            ax8 ax8Var2 = (ax8) barData.m97016b(i11);
            if (ax8Var2.f20796n) {
                yw8Var.mo39466H1(canvas, ax8Var2, i11);
            }
        }
        bs20[] bs20VarArr2 = this.f266061Z0;
        if (bs20VarArr2 == null || bs20VarArr2.length <= 0 || bs20VarArr2[0] == null) {
            i = 1;
            i2 = 0;
            f = 2.0f;
            f2 = 1.0f;
        } else {
            yw8 yw8Var2 = (yw8) this.f266052Q0;
            yuc yucVar = yw8Var2.f79954c;
            RectF rectF5 = yw8Var2.f276915h;
            i2 = 0;
            xw8 xw8Var = yw8Var2.f276914g;
            f = 2.0f;
            zw8 barData2 = xw8Var.getBarData();
            int length = bs20VarArr2.length;
            int i12 = 0;
            f2 = 1.0f;
            while (i12 < length) {
                int i13 = i7;
                bs20 bs20Var = bs20VarArr2[i12];
                ax8 ax8Var3 = (ax8) barData2.m97016b(bs20Var.f30220e);
                if (ax8Var3 != null) {
                    ArrayList arrayList5 = ax8Var3.f20797o;
                    bs20VarArr = bs20VarArr2;
                    if (ax8Var3.f20787e && (bx8Var = (bx8) ax8Var3.m27369b(bs20Var.f30216a, bs20Var.f30217b)) != null) {
                        float fIndexOf = arrayList5.indexOf(bx8Var);
                        float size = arrayList5.size();
                        yucVar.getClass();
                        if (fIndexOf < size * 1.0f) {
                            oyp0 oyp0VarM37198f = xw8Var.m37198f(ax8Var3.f20786d);
                            yw8Var2.f79956e.setColor(ax8Var3.f20802t);
                            yw8Var2.f79956e.setAlpha(ax8Var3.f20806x);
                            float f14 = bx8Var.f138119a;
                            float f15 = bx8Var.f138121c;
                            float f16 = barData2.f286942j / 2.0f;
                            rectF5.set(f15 - f16, f14, f15 + f16, 0.0f);
                            oyp0VarM37198f.getClass();
                            rectF5.top *= 1.0f;
                            rectF5.bottom *= 1.0f;
                            ((Matrix) oyp0VarM37198f.f171832b).mapRect(rectF5);
                            ((pkc1) oyp0VarM37198f.f171834d).f178431a.mapRect(rectF5);
                            ((Matrix) oyp0VarM37198f.f171833c).mapRect(rectF5);
                            rectF5.centerX();
                            canvas.drawRect(rectF5, yw8Var2.f79956e);
                        }
                    }
                    i12++;
                    i7 = i13;
                    bs20VarArr2 = bs20VarArr;
                } else {
                    bs20VarArr = bs20VarArr2;
                }
                i12++;
                i7 = i13;
                bs20VarArr2 = bs20VarArr;
            }
            i = i7;
        }
        canvas.restoreToCount(iSave2);
        this.f266052Q0.getClass();
        this.f266073i.getClass();
        rfe1 rfe1Var2 = this.f53895y1;
        Paint paint2 = rfe1Var2.f131596h;
        pkc1 pkc1Var4 = (pkc1) rfe1Var2.f57320b;
        RectF rectF6 = rfe1Var2.f198632L0;
        ArrayList arrayList6 = rfe1Var2.f198638i.f121123t;
        if (arrayList6 != null && arrayList6.size() > 0) {
            float[] fArr3 = rfe1Var2.f198637Z;
            fArr3[i2] = 0.0f;
            fArr3[i] = 0.0f;
            int i14 = i2;
            while (i14 < arrayList6.size()) {
                oi80 oi80Var = (oi80) arrayList6.get(i14);
                oi80Var.getClass();
                int iSave3 = canvas.save();
                RectF rectF7 = pkc1Var4.f178432b;
                rectF6.set(rectF7);
                rectF6.inset(-oi80Var.f165728f, 0.0f);
                canvas.clipRect(rectF6);
                fArr3[i2] = oi80Var.f165727e;
                fArr3[i] = 0.0f;
                rfe1Var2.f131592d.m68550s(fArr3);
                float[] fArr4 = rfe1Var2.f198633M0;
                fArr4[i2] = fArr3[i2];
                fArr4[i] = rectF7.top;
                fArr4[r8] = fArr3[i2];
                pkc1 pkc1Var5 = pkc1Var4;
                fArr4[3] = rectF7.bottom;
                Path path2 = rfe1Var2.f198634N0;
                path2.reset();
                rfe1 rfe1Var3 = rfe1Var2;
                path2.moveTo(fArr4[i2], fArr4[i]);
                path2.lineTo(fArr4[r8], fArr4[3]);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(oi80Var.f165729g);
                paint2.setStrokeWidth(oi80Var.f165728f);
                paint2.setPathEffect(null);
                canvas.drawPath(path2, paint2);
                float f17 = oi80Var.f63528b + f;
                String str2 = oi80Var.f165731i;
                if (str2 != null && !str2.equals("")) {
                    paint2.setStyle(oi80Var.f165730h);
                    paint2.setPathEffect(null);
                    paint2.setColor(oi80Var.f63530d);
                    paint2.setStrokeWidth(0.5f);
                    paint2.setTextSize(oi80Var.f63529c);
                    float f18 = oi80Var.f165728f + oi80Var.f63527a;
                    int i15 = oi80Var.f165732j;
                    if (i15 == 3) {
                        float fM82120a = u0b1.m82120a(paint2, str2);
                        paint2.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str2, fArr3[i2] + f18, rectF7.top + f17 + fM82120a, paint2);
                    } else if (i15 == 4) {
                        paint2.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str2, fArr3[i2] + f18, rectF7.bottom - f17, paint2);
                    } else if (i15 == i) {
                        paint2.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str2, fArr3[i2] - f18, rectF7.top + f17 + u0b1.m82120a(paint2, str2), paint2);
                    } else {
                        paint2.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str2, fArr3[i2] - f18, rectF7.bottom - f17, paint2);
                    }
                }
                canvas.restoreToCount(iSave3);
                i14++;
                pkc1Var4 = pkc1Var5;
                rfe1Var2 = rfe1Var3;
                i = 1;
            }
        }
        this.f53889s1.getClass();
        this.f53891u1.m80922L1(canvas);
        this.f53890t1.getClass();
        this.f53892v1.m80922L1(canvas);
        rfe1 rfe1Var4 = this.f53895y1;
        Paint paint3 = rfe1Var4.f131594f;
        pkc1 pkc1Var6 = (pkc1) rfe1Var4.f57320b;
        qfe1 qfe1Var4 = rfe1Var4.f198638i;
        qfe1Var4.getClass();
        if (qfe1Var4.f121122s) {
            float f19 = qfe1Var4.f63528b;
            paint3.setTypeface(null);
            paint3.setTextSize(qfe1Var4.f63529c);
            paint3.setColor(qfe1Var4.f63530d);
            erb0 erb0VarM39774b = erb0.m39774b(0.0f, 0.0f);
            int i16 = qfe1Var4.f188192C;
            if (i16 == 1) {
                erb0VarM39774b.f62074b = 0.5f;
                erb0VarM39774b.f62075c = f2;
                rfe1Var4.m75425H1(canvas, pkc1Var6.f178432b.top - f19, erb0VarM39774b);
            } else {
                float f20 = f2;
                if (i16 == 4) {
                    erb0VarM39774b.f62074b = 0.5f;
                    erb0VarM39774b.f62075c = f20;
                    rfe1Var4.m75425H1(canvas, pkc1Var6.f178432b.top + f19 + qfe1Var4.f188191B, erb0VarM39774b);
                } else if (i16 == 2) {
                    erb0VarM39774b.f62074b = 0.5f;
                    erb0VarM39774b.f62075c = 0.0f;
                    rfe1Var4.m75425H1(canvas, pkc1Var6.f178432b.bottom + f19, erb0VarM39774b);
                } else if (i16 == 5) {
                    erb0VarM39774b.f62074b = 0.5f;
                    erb0VarM39774b.f62075c = 0.0f;
                    rfe1Var4.m75425H1(canvas, (pkc1Var6.f178432b.bottom - f19) - qfe1Var4.f188191B, erb0VarM39774b);
                } else {
                    erb0VarM39774b.f62074b = 0.5f;
                    erb0VarM39774b.f62075c = 1.0f;
                    rfe1Var4.m75425H1(canvas, pkc1Var6.f178432b.top - f19, erb0VarM39774b);
                    erb0VarM39774b.f62074b = 0.5f;
                    erb0VarM39774b.f62075c = 0.0f;
                    rfe1Var4.m75425H1(canvas, pkc1Var6.f178432b.bottom + f19, erb0VarM39774b);
                }
            }
            erb0.f62073d.m45275c(erb0VarM39774b);
        }
        this.f53891u1.m80919I1(canvas);
        this.f53892v1.m80919I1(canvas);
        if (this.f53886p1) {
            int iSave4 = canvas.save();
            canvas.clipRect(rectF4);
            this.f266052Q0.mo44753F1(canvas);
            canvas.restoreToCount(iSave4);
        } else {
            this.f266052Q0.mo44753F1(canvas);
        }
        s580 s580Var = this.f266051P0;
        Paint.FontMetrics fontMetrics = s580Var.f205751g;
        Paint paint4 = s580Var.f205747c;
        pkc1 pkc1Var7 = (pkc1) s580Var.f57320b;
        q580 q580Var = s580Var.f205749e;
        q580Var.getClass();
        paint4.setTextSize(q580Var.f63529c);
        paint4.setColor(q580Var.f63530d);
        DisplayMetrics displayMetrics = u0b1.f225435a;
        paint4.getFontMetrics(fontMetrics);
        float f21 = fontMetrics.descent - fontMetrics.ascent;
        paint4.getFontMetrics(fontMetrics);
        float fM82122c = u0b1.m82122c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
        float fM82120a2 = f21 - (u0b1.m82120a(paint4, "ABC") / f);
        r580[] r580VarArr = q580Var.f185459e;
        float fM82122c2 = u0b1.m82122c(q580Var.f185468n);
        float fM82122c3 = u0b1.m82122c(q580Var.f185467m);
        int i17 = q580Var.f185462h;
        int i18 = q580Var.f185460f;
        int i19 = q580Var.f185461g;
        int i20 = q580Var.f185463i;
        float fM82122c4 = u0b1.m82122c(q580Var.f185465k);
        float fM82122c5 = u0b1.m82122c(q580Var.f185469o);
        float f22 = q580Var.f63528b;
        float f23 = q580Var.f63527a;
        int iM38547C = edb.m38547C(i18);
        if (iM38547C != 0) {
            f3 = fM82120a2;
            if (iM38547C == 1) {
                if (i17 == 2) {
                    fWidth = pkc1Var7.f178433c / f;
                } else {
                    RectF rectF8 = pkc1Var7.f178432b;
                    fWidth = (rectF8.width() / f) + rectF8.left;
                }
                f4 = fWidth + (i20 == 1 ? f23 : -f23);
                if (i17 == 2) {
                    f4 = (float) (((double) f4) + (i20 == 1 ? (((double) (-q580Var.f185471q)) / 2.0d) + ((double) f23) : (((double) q580Var.f185471q) / 2.0d) - ((double) f23)));
                }
            } else if (iM38547C != 2) {
                f4 = 0.0f;
            } else {
                f4 = (i17 == 2 ? pkc1Var7.f178433c : pkc1Var7.f178432b.right) - f23;
                if (i20 == 1) {
                    f4 -= q580Var.f185471q;
                }
            }
        } else {
            f3 = fM82120a2;
            if (i17 != 2) {
                f23 = pkc1Var7.f178432b.left + f23;
            }
            f4 = i20 == 2 ? q580Var.f185471q + f23 : f23;
        }
        int iM38547C2 = edb.m38547C(i17);
        if (iM38547C2 != 0) {
            if (iM38547C2 == 1) {
                int iM38547C3 = edb.m38547C(i19);
                if (iM38547C3 == 0) {
                    f8 = (i18 == 2 ? 0.0f : pkc1Var7.f178432b.top) + f22;
                } else if (iM38547C3 == 1) {
                    f8 = ((pkc1Var7.f178434d / f) - (q580Var.f185472r / f)) + q580Var.f63528b;
                } else if (iM38547C3 != 2) {
                    f8 = 0.0f;
                } else {
                    f8 = (i18 == 2 ? pkc1Var7.f178434d : pkc1Var7.f178432b.bottom) - (q580Var.f185472r + f22);
                }
                float f24 = f8;
                int i21 = i2;
                int i22 = i21;
                float f25 = 0.0f;
                while (i21 < r580VarArr.length) {
                    r580 r580Var = r580VarArr[i21];
                    int i23 = r580Var.f195989b;
                    float f26 = r580Var.f195990c;
                    String str3 = r580Var.f195988a;
                    float f27 = f4;
                    int i24 = i23 != 1 ? 1 : i2;
                    float fM82122c6 = Float.isNaN(f26) ? fM82122c4 : u0b1.m82122c(f26);
                    if (i24 != 0) {
                        fMeasureText = i20 == 1 ? f27 + f25 : f27 - (fM82122c6 - f25);
                        f10 = f25;
                        str = str3;
                        f9 = f24;
                        f11 = fM82122c5;
                        i6 = i21;
                        canvas3 = canvas;
                        s580Var.m77256F1(canvas3, fMeasureText, f24 + f3, r580Var, s580Var.f205749e);
                        if (i20 == 1) {
                            fMeasureText += fM82122c6;
                        }
                    } else {
                        f9 = f24;
                        f10 = f25;
                        f11 = fM82122c5;
                        i6 = i21;
                        str = str3;
                        canvas3 = canvas;
                        fMeasureText = f27;
                    }
                    if (str != null) {
                        if (i24 != 0 && i22 == 0) {
                            fMeasureText += i20 == 1 ? fM82122c2 : -fM82122c2;
                        } else if (i22 != 0) {
                            fMeasureText = f27;
                        }
                        if (i20 == 2) {
                            fMeasureText -= (int) paint4.measureText(str);
                        }
                        if (i22 == 0) {
                            canvas3.drawText(str, fMeasureText, f9 + f21, paint4);
                        } else {
                            float f28 = f21 + fM82122c + f9;
                            canvas3.drawText(str, fMeasureText, f28 + f21, paint4);
                            f9 = f28;
                        }
                        f9 = f21 + fM82122c + f9;
                        f25 = 0.0f;
                    } else {
                        f25 = fM82122c6 + f11 + f10;
                        i22 = 1;
                    }
                    i21 = i6 + 1;
                    fM82122c5 = f11;
                    f4 = f27;
                    f24 = f9;
                }
            }
            pkc1Var = pkc1Var2;
        } else {
            float f29 = f4;
            ArrayList arrayList7 = q580Var.f185475u;
            ArrayList arrayList8 = q580Var.f185473s;
            ArrayList arrayList9 = q580Var.f185474t;
            int iM38547C4 = edb.m38547C(i19);
            if (iM38547C4 != 0) {
                arrayList = arrayList8;
                f5 = iM38547C4 != 1 ? iM38547C4 != 2 ? 0.0f : (pkc1Var7.f178434d - f22) - q580Var.f185472r : ((pkc1Var7.f178434d - q580Var.f185472r) / f) + f22;
            } else {
                arrayList = arrayList8;
                f5 = f22;
            }
            int length2 = r580VarArr.length;
            float f30 = f5;
            int i25 = i2;
            int i26 = i25;
            float f31 = f29;
            while (i26 < length2) {
                float f32 = f31;
                r580 r580Var2 = r580VarArr[i26];
                int i27 = length2;
                int i28 = r580Var2.f195989b;
                r580[] r580VarArr2 = r580VarArr;
                String str4 = r580Var2.f195988a;
                pkc1 pkc1Var8 = pkc1Var2;
                float f33 = r580Var2.f195990c;
                int i29 = i28 != 1 ? 1 : i2;
                float fM82122c7 = Float.isNaN(f33) ? fM82122c4 : u0b1.m82122c(f33);
                if (i26 >= arrayList9.size() || !((Boolean) arrayList9.get(i26)).booleanValue()) {
                    f6 = f32;
                } else {
                    f30 = f21 + fM82122c + f30;
                    f6 = f29;
                }
                if (f6 == f29 && i18 == 2) {
                    i3 = i26;
                    if (i25 < arrayList7.size()) {
                        f6 += (i20 == 2 ? ((p5y) arrayList7.get(i25)).f174253b : -((p5y) arrayList7.get(i25)).f174253b) / f;
                        i25++;
                    }
                } else {
                    i3 = i26;
                }
                int i30 = i25;
                int i31 = str4 == null ? 1 : i2;
                if (i29 != 0) {
                    if (i20 == 2) {
                        f6 -= fM82122c7;
                    }
                    float f34 = f6;
                    arrayList2 = arrayList9;
                    i4 = i3;
                    float f35 = fM82122c7;
                    arrayList3 = arrayList;
                    i5 = i18;
                    canvas2 = canvas;
                    s580Var.m77256F1(canvas2, f34, f30 + f3, r580Var2, s580Var.f205749e);
                    f6 = i20 == 1 ? f34 + f35 : f34;
                } else {
                    canvas2 = canvas;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList;
                    i4 = i3;
                    i5 = i18;
                }
                if (i31 == 0) {
                    if (i29 != 0) {
                        f6 += i20 == 2 ? -fM82122c2 : fM82122c2;
                    }
                    if (i20 == 2) {
                        f6 -= ((p5y) arrayList3.get(i4)).f174253b;
                    }
                    canvas2.drawText(str4, f6, f30 + f21, paint4);
                    if (i20 == 1) {
                        f6 += ((p5y) arrayList3.get(i4)).f174253b;
                    }
                    f7 = i20 == 2 ? -fM82122c3 : fM82122c3;
                } else {
                    f7 = i20 == 2 ? -fM82122c5 : fM82122c5;
                }
                f31 = f6 + f7;
                i26 = i4 + 1;
                i18 = i5;
                length2 = i27;
                r580VarArr = r580VarArr2;
                arrayList9 = arrayList2;
                i25 = i30;
                arrayList = arrayList3;
                pkc1Var2 = pkc1Var8;
            }
            pkc1Var = pkc1Var2;
        }
        if (this.f266047L0 != null) {
            this.f266071g.setTypeface(null);
            this.f266071g.setTextSize(this.f266047L0.f63529c);
            this.f266071g.setColor(this.f266047L0.f63530d);
            this.f266071g.setTextAlign(this.f266047L0.f63050f);
            pkc1 pkc1Var9 = pkc1Var;
            float width = (getWidth() - (pkc1Var9.f178433c - rectF4.right)) - this.f266047L0.f63527a;
            float height = getHeight() - (pkc1Var9.f178434d - rectF4.bottom);
            euq euqVar = this.f266047L0;
            canvas.drawText(euqVar.f63049e, width, height - euqVar.f63528b, this.f266071g);
        }
        if (this.f266062a) {
            System.currentTimeMillis();
        }
    }

    @Override // p204p.xuc, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        pkc1 pkc1Var = this.f266054S0;
        float[] fArr = this.f53873D1;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.f53888r1) {
            RectF rectF = pkc1Var.f178432b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.f53893w1.m68549r(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.f53888r1) {
            pkc1Var.m70188d(pkc1Var.f178431a, this, true);
            return;
        }
        this.f53893w1.m68550s(fArr);
        Matrix matrix = pkc1Var.f178444n;
        matrix.reset();
        matrix.set(pkc1Var.f178431a);
        float f = fArr[0];
        RectF rectF2 = pkc1Var.f178432b;
        matrix.postTranslate(-(f - rectF2.left), -(fArr[1] - rectF2.top));
        pkc1Var.m70188d(matrix, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        evc evcVar = this.f266049N0;
        if (evcVar == null || this.f266064b == null || !this.f266074t) {
            return false;
        }
        return ((ex8) evcVar).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.f53875e1 = z;
    }

    public void setBorderColor(int i) {
        this.f53883m1.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f53883m1.setStrokeWidth(u0b1.m82122c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.f53886p1 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.f53877g1 = z;
    }

    public void setDragEnabled(boolean z) {
        this.f53879i1 = z;
    }

    public void setDragOffsetX(float f) {
        pkc1 pkc1Var = this.f266054S0;
        pkc1Var.getClass();
        pkc1Var.f178442l = u0b1.m82122c(f);
    }

    public void setDragOffsetY(float f) {
        pkc1 pkc1Var = this.f266054S0;
        pkc1Var.getClass();
        pkc1Var.f178443m = u0b1.m82122c(f);
    }

    public void setDrawBorders(boolean z) {
        this.f53885o1 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.f53884n1 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.f53882l1.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.f53878h1 = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.f53888r1 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f53874d1 = i;
    }

    public void setMinOffset(float f) {
        this.f53887q1 = f;
    }

    public void setPinchZoom(boolean z) {
        this.f53876f1 = z;
    }

    public void setRendererLeftYAxis(tie1 tie1Var) {
        this.f53891u1 = tie1Var;
    }

    public void setRendererRightYAxis(tie1 tie1Var) {
        this.f53892v1 = tie1Var;
    }

    public void setScaleEnabled(boolean z) {
        this.f53880j1 = z;
        this.f53881k1 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.f53880j1 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.f53881k1 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.f266073i.f121107A / f;
        pkc1 pkc1Var = this.f266054S0;
        pkc1Var.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        pkc1Var.f178437g = f2;
        pkc1Var.m70187c(pkc1Var.f178431a, pkc1Var.f178432b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.f266073i.f121107A / f;
        pkc1 pkc1Var = this.f266054S0;
        pkc1Var.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        pkc1Var.f178438h = f2;
        pkc1Var.m70187c(pkc1Var.f178431a, pkc1Var.f178432b);
    }

    public void setXAxisRenderer(rfe1 rfe1Var) {
        this.f53895y1 = rfe1Var;
    }

    public void setOnDrawListener(nal0 nal0Var) {
    }
}
