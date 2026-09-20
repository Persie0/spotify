package p204p;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class nr21 {

    /* JADX INFO: renamed from: g */
    public static final C2109m f157427g = new C2109m(26);

    /* JADX INFO: renamed from: h */
    public static final C2109m f157428h = new C2109m(27);

    /* JADX INFO: renamed from: a */
    public final ArrayList f157429a;

    /* JADX INFO: renamed from: b */
    public int f157430b;

    /* JADX INFO: renamed from: c */
    public int f157431c;

    /* JADX INFO: renamed from: d */
    public int f157432d;

    /* JADX INFO: renamed from: e */
    public int f157433e;

    /* JADX INFO: renamed from: f */
    public final Object f157434f;

    public nr21() {
        this.f157434f = new mr21[5];
        this.f157429a = new ArrayList();
        this.f157430b = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m65458a(float f, int i) {
        mr21 mr21Var;
        mr21[] mr21VarArr = (mr21[]) this.f157434f;
        int i2 = this.f157430b;
        ArrayList arrayList = this.f157429a;
        if (i2 != 1) {
            Collections.sort(arrayList, f157427g);
            this.f157430b = 1;
        }
        int i3 = this.f157433e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f157433e = i4;
            mr21Var = mr21VarArr[i4];
        } else {
            mr21Var = new mr21();
        }
        int i5 = this.f157431c;
        this.f157431c = i5 + 1;
        mr21Var.f146408a = i5;
        mr21Var.f146409b = i;
        mr21Var.f146410c = f;
        arrayList.add(mr21Var);
        this.f157432d += i;
        while (true) {
            int i6 = this.f157432d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            mr21 mr21Var2 = (mr21) arrayList.get(0);
            int i8 = mr21Var2.f146409b;
            if (i8 <= i7) {
                this.f157432d -= i8;
                arrayList.remove(0);
                int i9 = this.f157433e;
                if (i9 < 5) {
                    this.f157433e = i9 + 1;
                    mr21VarArr[i9] = mr21Var2;
                }
            } else {
                mr21Var2.f146409b = i8 - i7;
                this.f157432d -= i7;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m65459b() {
        View view = (View) edb.m38559h(1, this.f157429a);
        rh41 rh41Var = (rh41) view.getLayoutParams();
        this.f157431c = ((StaggeredGridLayoutManager) this.f157434f).f1267Q0.mo34595d(view);
        rh41Var.getClass();
    }

    /* JADX INFO: renamed from: c */
    public void m65460c() {
        this.f157429a.clear();
        this.f157430b = Integer.MIN_VALUE;
        this.f157431c = Integer.MIN_VALUE;
        this.f157432d = 0;
    }

    /* JADX INFO: renamed from: d */
    public int m65461d() {
        boolean z = ((StaggeredGridLayoutManager) this.f157434f).f1272V0;
        ArrayList arrayList = this.f157429a;
        return z ? m65463f(arrayList.size() - 1, -1, false, true) : m65463f(0, arrayList.size(), false, true);
    }

    /* JADX INFO: renamed from: e */
    public int m65462e() {
        boolean z = ((StaggeredGridLayoutManager) this.f157434f).f1272V0;
        ArrayList arrayList = this.f157429a;
        return z ? m65463f(0, arrayList.size(), false, true) : m65463f(arrayList.size() - 1, -1, false, true);
    }

    /* JADX INFO: renamed from: f */
    public int m65463f(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f157434f;
        int iMo34604m = staggeredGridLayoutManager.f1267Q0.mo34604m();
        int iMo34600i = staggeredGridLayoutManager.f1267Q0.mo34600i();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f157429a.get(i);
            int iMo34598g = staggeredGridLayoutManager.f1267Q0.mo34598g(view);
            int iMo34595d = staggeredGridLayoutManager.f1267Q0.mo34595d(view);
            boolean z3 = false;
            boolean z4 = !z2 ? iMo34598g >= iMo34600i : iMo34598g > iMo34600i;
            if (!z2 ? iMo34595d > iMo34604m : iMo34595d >= iMo34604m) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return AbstractC0110a.m1083V(view);
                }
                if (iMo34598g < iMo34604m || iMo34595d > iMo34600i) {
                    return AbstractC0110a.m1083V(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m65464g(int i) {
        int i2 = this.f157431c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f157429a.size() == 0) {
            return i;
        }
        m65459b();
        return this.f157431c;
    }

    /* JADX INFO: renamed from: h */
    public View m65465h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f157434f;
        ArrayList arrayList = this.f157429a;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1272V0 && AbstractC0110a.m1083V(view2) >= i) || ((!staggeredGridLayoutManager.f1272V0 && AbstractC0110a.m1083V(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f1272V0 && AbstractC0110a.m1083V(view3) <= i) || ((!staggeredGridLayoutManager.f1272V0 && AbstractC0110a.m1083V(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: i */
    public float m65466i() {
        int i = this.f157430b;
        ArrayList arrayList = this.f157429a;
        if (i != 0) {
            Collections.sort(arrayList, f157428h);
            this.f157430b = 0;
        }
        float f = 0.5f * this.f157432d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mr21 mr21Var = (mr21) arrayList.get(i3);
            i2 += mr21Var.f146409b;
            if (i2 >= f) {
                return mr21Var.f146410c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((mr21) edb.m38559h(1, arrayList)).f146410c;
    }

    /* JADX INFO: renamed from: j */
    public int m65467j(int i) {
        int i2 = this.f157430b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f157429a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        rh41 rh41Var = (rh41) view.getLayoutParams();
        this.f157430b = ((StaggeredGridLayoutManager) this.f157434f).f1267Q0.mo34598g(view);
        rh41Var.getClass();
        return this.f157430b;
    }

    public nr21(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f157434f = staggeredGridLayoutManager;
        this.f157429a = new ArrayList();
        this.f157430b = Integer.MIN_VALUE;
        this.f157431c = Integer.MIN_VALUE;
        this.f157432d = 0;
        this.f157433e = i;
    }
}
