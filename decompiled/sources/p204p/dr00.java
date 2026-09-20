package p204p;

import android.os.Trace;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dr00 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f52127e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final kxy f52128f = new kxy(2);

    /* JADX INFO: renamed from: a */
    public ArrayList f52129a;

    /* JADX INFO: renamed from: b */
    public long f52130b;

    /* JADX INFO: renamed from: c */
    public long f52131c;

    /* JADX INFO: renamed from: d */
    public ArrayList f52132d;

    /* JADX INFO: renamed from: c */
    public static dkv0 m36689c(RecyclerView recyclerView, int i, long j) {
        int iM44966e = recyclerView.f1239f.f205269a.m44966e();
        for (int i2 = 0; i2 < iM44966e; i2++) {
            dkv0 dkv0VarM969U = RecyclerView.m969U(recyclerView.f1239f.f205269a.m44965d(i2));
            if (dkv0VarM969U.f50041c == i && !dkv0VarM969U.m36328r()) {
                return null;
            }
        }
        vjv0 vjv0Var = recyclerView.f1233c;
        try {
            recyclerView.m1005d0();
            dkv0 dkv0VarM85790m = vjv0Var.m85790m(i, j);
            if (dkv0VarM85790m != null) {
                if (!dkv0VarM85790m.m36327q() || dkv0VarM85790m.m36328r()) {
                    vjv0Var.m85778a(dkv0VarM85790m, false);
                } else {
                    vjv0Var.m85786i(dkv0VarM85790m.f50039a);
                }
            }
            return dkv0VarM85790m;
        } finally {
            recyclerView.m1006e0(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36690a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1216T0) {
            if (RecyclerView.f1179Z1 && !this.f52129a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f52130b == 0) {
                this.f52130b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f1193E1.m46039m(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX INFO: renamed from: b */
    public final void m36691b(long j) {
        cr00 cr00Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        cr00 cr00Var2;
        ArrayList arrayList = this.f52132d;
        ArrayList arrayList2 = this.f52129a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            gx8 gx8Var = recyclerView3.f1193E1;
            if (windowVisibility == 0) {
                gx8Var.m46031e(recyclerView3, false);
                i += gx8Var.f85220d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                gx8 gx8Var2 = recyclerView4.f1193E1;
                int iAbs = Math.abs(gx8Var2.f85219c) + Math.abs(gx8Var2.f85218b);
                for (int i5 = 0; i5 < gx8Var2.f85220d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        cr00Var2 = new cr00();
                        arrayList.add(cr00Var2);
                    } else {
                        cr00Var2 = (cr00) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) gx8Var2.f85221e;
                    int i6 = iArr[i5 + 1];
                    cr00Var2.f41133a = i6 <= iAbs;
                    cr00Var2.f41134b = iAbs;
                    cr00Var2.f41135c = i6;
                    cr00Var2.f41136d = recyclerView4;
                    cr00Var2.f41137e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f52128f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (cr00Var = (cr00) arrayList.get(i7)).f41136d) != null; i7++) {
            dkv0 dkv0VarM36689c = m36689c(recyclerView, cr00Var.f41137e, cr00Var.f41133a ? Long.MAX_VALUE : j);
            if (dkv0VarM36689c != null && dkv0VarM36689c.f50040b != null && dkv0VarM36689c.m36327q() && !dkv0VarM36689c.m36328r() && (recyclerView2 = (RecyclerView) dkv0VarM36689c.f50040b.get()) != null) {
                if (recyclerView2.f1238e1 && recyclerView2.f1239f.f205269a.m44966e() != 0) {
                    vjv0 vjv0Var = recyclerView2.f1233c;
                    mjv0 mjv0Var = recyclerView2.f1251n1;
                    if (mjv0Var != null) {
                        mjv0Var.mo33396g();
                    }
                    AbstractC0110a abstractC0110a = recyclerView2.f1206O0;
                    if (abstractC0110a != null) {
                        abstractC0110a.m1091C0(vjv0Var);
                        recyclerView2.f1206O0.m1092D0(vjv0Var);
                    }
                    vjv0Var.f242060a.clear();
                    vjv0Var.m85784g();
                }
                gx8 gx8Var3 = recyclerView2.f1193E1;
                gx8Var3.m46031e(recyclerView2, true);
                if (gx8Var3.f85220d != 0) {
                    try {
                        int i8 = sa81.f207158a;
                        Trace.beginSection("RV Nested Prefetch");
                        zjv0 zjv0Var = recyclerView2.f1194F1;
                        hjv0 hjv0Var = recyclerView2.f1204N0;
                        zjv0Var.f283547d = 1;
                        zjv0Var.f283548e = hjv0Var.mo1617e();
                        zjv0Var.f283550g = false;
                        zjv0Var.f283551h = false;
                        zjv0Var.f283552i = false;
                        for (int i9 = 0; i9 < gx8Var3.f85220d * 2; i9 += 2) {
                            m36689c(recyclerView2, ((int[]) gx8Var3.f85221e)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = sa81.f207158a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cr00Var.m33698a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f52129a;
        try {
            int i = sa81.f207158a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m36691b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f52131c);
                }
            }
            this.f52130b = 0L;
        } finally {
            this.f52130b = 0L;
            int i3 = sa81.f207158a;
            Trace.endSection();
        }
    }
}
