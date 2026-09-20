package p204p;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: p.u5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2440u5 implements ug5, zd10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226860a;

    /* JADX INFO: renamed from: b */
    public Object f226861b;

    /* JADX INFO: renamed from: c */
    public Object f226862c;

    /* JADX INFO: renamed from: d */
    public Object f226863d;

    public AbstractC2440u5(String str, Rect rect, List list, String str2, Matrix matrix) {
        this.f226860a = 5;
        this.f226861b = str;
        Rect rect2 = new Rect(rect);
        if (matrix != null) {
            RectF rectF = new RectF(rect2);
            matrix.mapRect(rectF);
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.f226862c = rect2;
        int size = list.size();
        Point[] pointArr = new Point[size];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        if (matrix != null) {
            float[] fArr = new float[size + size];
            for (int i2 = 0; i2 < size; i2++) {
                Point point = pointArr[i2];
                int i3 = i2 + i2;
                fArr[i3] = point.x;
                fArr[i3 + 1] = point.y;
            }
            matrix.mapPoints(fArr);
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = i4 + i4;
                pointArr[i4].set((int) fArr[i5], (int) fArr[i5 + 1]);
            }
        }
        this.f226863d = str2;
    }

    /* JADX INFO: renamed from: B */
    public static void m82369B(int i, int i2, int i3, List list) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = list.subList(i, i3 + i);
            ArrayList arrayList = new ArrayList(listSubList);
            listSubList.clear();
            list.addAll(i4, arrayList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo44367A();

    /* JADX INFO: renamed from: C */
    public abstract void mo53942C();

    /* JADX INFO: renamed from: D */
    public abstract AbstractC2205o8 mo57976D(fva fvaVar);

    /* JADX INFO: renamed from: E */
    public void mo50694E(Bitmap bitmap, m900 m900Var, h5j h5jVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: F */
    public void mo82370F(int i, long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo29743G(h09 h09Var);

    /* JADX INFO: renamed from: H */
    public void mo72134H(m900 m900Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo44368I();

    /* JADX INFO: renamed from: K */
    public abstract void mo29744K();

    /* JADX INFO: renamed from: L */
    public abstract Object mo44369L(cw40 cw40Var);

    /* JADX INFO: renamed from: N */
    public void mo82371N(jci0 jci0Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo50695O(e6q e6qVar);

    /* JADX INFO: renamed from: P */
    public abstract void mo50696P();

    /* JADX INFO: renamed from: Q */
    public abstract void mo29745Q();

    /* JADX INFO: renamed from: R */
    public Set m82372R() {
        return ((Map) this.f226862c).keySet();
    }

    /* JADX INFO: renamed from: S */
    public abstract void mo29746S();

    /* JADX INFO: renamed from: T */
    public abstract void mo57977T(AbstractC2205o8 abstractC2205o8);

    @Override // p204p.ug5
    /* JADX INFO: renamed from: a */
    public Object mo67761a() {
        return this.f226862c;
    }

    /* JADX INFO: renamed from: c */
    public y7h1 m82373c(Executor executor, Callable callable, c4d1 c4d1Var) {
        ig31.m50471A(((AtomicInteger) this.f226862c).get() > 0);
        if (((y7h1) c4d1Var.f33927b).mo1517i()) {
            y7h1 y7h1Var = new y7h1();
            y7h1Var.m92997r();
            return y7h1Var;
        }
        px0 px0Var = new px0(20);
        ev61 ev61Var = new ev61((c4d1) px0Var.f182174b);
        ((s831) this.f226861b).m77457f(new qxj(this, c4d1Var, px0Var, callable, ev61Var, 5), new by81(executor, c4d1Var, px0Var, ev61Var));
        return ev61Var.f63172a;
    }

    @Override // p204p.ug5
    public void clear() {
        ((ArrayList) this.f226863d).clear();
        this.f226862c = this.f226861b;
        mo53942C();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo29747d();

    /* JADX INFO: renamed from: e */
    public abstract y400 mo27973e();

    /* JADX INFO: renamed from: k */
    public Class m82374k() {
        return (Class) this.f226863d;
    }

    /* JADX INFO: renamed from: l */
    public void mo50698l() {
        synchronized (this.f226861b) {
            try {
                sxb1 sxb1Var = (sxb1) this.f226863d;
                if (sxb1Var != null) {
                    ((txb1) this.f226862c).m81906g(sxb1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public Surface mo72140m() {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: o */
    public void mo67763o(Object obj) {
        ((ArrayList) this.f226863d).add(this.f226862c);
        this.f226862c = obj;
    }

    @Override // p204p.zd10
    public void onFlush() {
        ((txb1) this.f226862c).m81905f(new hgq(this, 3), true);
    }

    /* JADX INFO: renamed from: q */
    public abstract String mo57978q();

    /* JADX INFO: renamed from: r */
    public abstract int mo50699r();

    /* JADX INFO: renamed from: s */
    public Object m82375s(AbstractC2205o8 abstractC2205o8, Class cls) {
        yu60 yu60Var = (yu60) ((Map) this.f226862c).get(cls);
        if (yu60Var != null) {
            return yu60Var.mo52247a(abstractC2205o8);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* JADX INFO: renamed from: t */
    public Object m82376t() {
        return this.f226861b;
    }

    public String toString() {
        switch (this.f226860a) {
            case 4:
                return getClass().getSimpleName() + ": " + mo27973e();
            default:
                return super.toString();
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: u */
    public void mo67764u() {
        this.f226862c = zn91.m96554h0((ArrayList) this.f226863d);
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo29748x();

    /* JADX INFO: renamed from: y */
    public abstract AbstractC1806e9 mo57979y();

    /* JADX INFO: renamed from: z */
    public abstract cu60 mo57980z();

    public AbstractC2440u5(s831 s831Var) {
        this.f226860a = 3;
        this.f226862c = new AtomicInteger(0);
        this.f226863d = new AtomicBoolean(false);
        this.f226861b = s831Var;
    }

    public AbstractC2440u5(pui0 pui0Var, ayz ayzVar, du31 du31Var) {
        this.f226860a = 4;
        this.f226861b = pui0Var;
        this.f226862c = ayzVar;
        this.f226863d = du31Var;
    }

    public AbstractC2440u5(int i) {
        this.f226860a = 1;
        this.f226862c = new float[i * 2];
        this.f226863d = new int[i];
    }

    public AbstractC2440u5(txb1 txb1Var) {
        this.f226860a = 6;
        this.f226862c = txb1Var;
        this.f226861b = new Object();
    }

    /* JADX INFO: renamed from: J */
    public void mo72135J() {
    }

    /* JADX INFO: renamed from: h */
    public void mo72139h() {
    }

    public AbstractC2440u5(Class cls, yu60[] yu60VarArr) {
        this.f226860a = 2;
        this.f226861b = cls;
        HashMap map = new HashMap();
        for (yu60 yu60Var : yu60VarArr) {
            Class cls2 = yu60Var.f276278a;
            if (!map.containsKey(cls2)) {
                map.put(cls2, yu60Var);
            } else {
                throw new IllegalArgumentException(dq60.m36611k(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (yu60VarArr.length > 0) {
            this.f226863d = yu60VarArr[0].f276278a;
        } else {
            this.f226863d = Void.class;
        }
        this.f226862c = Collections.unmodifiableMap(map);
    }

    public AbstractC2440u5(Object obj) {
        this.f226860a = 0;
        this.f226861b = obj;
        this.f226863d = new ArrayList();
        this.f226862c = obj;
    }

    /* JADX INFO: renamed from: M */
    public void mo72136M(m900 m900Var, boolean z) {
    }
}
